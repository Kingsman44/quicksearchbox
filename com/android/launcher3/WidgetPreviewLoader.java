package com.android.launcher3;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import android.util.LongSparseArray;
import com.android.launcher3.compat.AppWidgetManagerCompat;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.SQLiteCacheHelper;
import com.android.launcher3.widget.WidgetCell;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public final class WidgetPreviewLoader {
    public final Context mContext;
    public final CacheDb mDb;
    public final IconCache mIconCache;
    private final MainThreadExecutor mMainThreadExecutor = new MainThreadExecutor();
    private final HashMap mPackageVersions = new HashMap();
    private final int mProfileBadgeMargin;
    final Set mUnusedBitmaps = Collections.newSetFromMap(new WeakHashMap());
    public final UserManagerCompat mUserManager;
    public final AppWidgetManagerCompat mWidgetManager;
    public final Handler mWorkerHandler;

    /* compiled from: PG */
    final class CacheDb extends SQLiteCacheHelper {
        public CacheDb(Context context) {
            super(context, "widgetpreviews.db", 4, "shortcut_and_widget_previews");
        }

        public final void onCreateTable(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS shortcut_and_widget_previews (componentName TEXT NOT NULL, profileId INTEGER NOT NULL, size TEXT NOT NULL, packageName TEXT NOT NULL, lastUpdated INTEGER NOT NULL DEFAULT 0, version INTEGER NOT NULL DEFAULT 0, preview_bitmap BLOB, PRIMARY KEY (componentName, profileId, size) );");
        }
    }

    /* compiled from: PG */
    public final class PreviewLoadRequest {
        public final PreviewLoadTask mTask;

        public PreviewLoadRequest(PreviewLoadTask previewLoadTask) {
            this.mTask = previewLoadTask;
        }
    }

    /* compiled from: PG */
    public final class PreviewLoadTask extends AsyncTask {
        public Bitmap mBitmapToRecycle;
        private final WidgetCell mCaller;
        private final Object mInfo;
        final WidgetCacheKey mKey;
        private final int mPreviewHeight;
        private final int mPreviewWidth;
        long[] mVersions;

        public PreviewLoadTask(WidgetCacheKey widgetCacheKey, Object obj, int i, int i2, WidgetCell widgetCell) {
            this.mKey = widgetCacheKey;
            this.mInfo = obj;
            this.mPreviewHeight = i2;
            this.mPreviewWidth = i;
            this.mCaller = widgetCell;
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            Bitmap bitmap;
            long[] jArr;
            Void[] voidArr = (Void[]) objArr;
            if (isCancelled()) {
                return null;
            }
            synchronized (WidgetPreviewLoader.this.mUnusedBitmaps) {
                Iterator it = WidgetPreviewLoader.this.mUnusedBitmaps.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bitmap = null;
                        break;
                    }
                    bitmap = (Bitmap) it.next();
                    if (bitmap != null && bitmap.isMutable() && bitmap.getWidth() == this.mPreviewWidth && bitmap.getHeight() == this.mPreviewHeight) {
                        WidgetPreviewLoader.this.mUnusedBitmaps.remove(bitmap);
                        break;
                    }
                }
            }
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.mPreviewWidth, this.mPreviewHeight, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            if (!isCancelled()) {
                Bitmap readFromDb = WidgetPreviewLoader.this.readFromDb(this.mKey, bitmap2, this);
                if (isCancelled() || readFromDb != null) {
                    return readFromDb;
                }
                Object obj = this.mInfo;
                if (!(obj instanceof ShortcutConfigActivityInfo) || ((ShortcutConfigActivityInfo) obj).isPersistable()) {
                    jArr = WidgetPreviewLoader.this.getPackageVersion(this.mKey.componentName.getPackageName());
                } else {
                    jArr = null;
                }
                this.mVersions = jArr;
                BaseActivity fromContext = BaseActivity.fromContext(this.mCaller.getContext());
                WidgetPreviewLoader widgetPreviewLoader = WidgetPreviewLoader.this;
                Object obj2 = this.mInfo;
                int i = this.mPreviewWidth;
                int i2 = this.mPreviewHeight;
                if (obj2 instanceof LauncherAppWidgetProviderInfo) {
                    return widgetPreviewLoader.generateWidgetPreview(fromContext, (LauncherAppWidgetProviderInfo) obj2, i, bitmap2, (int[]) null);
                }
                ShortcutConfigActivityInfo shortcutConfigActivityInfo = (ShortcutConfigActivityInfo) obj2;
                Canvas canvas = new Canvas();
                if (bitmap2 == null) {
                    bitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    canvas.setBitmap(bitmap2);
                } else if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2) {
                    canvas.setBitmap(bitmap2);
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    throw new RuntimeException("Improperly sized bitmap passed as argument");
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(Utilities.createBadgedIconBitmap(widgetPreviewLoader.mutateOnMainThread(shortcutConfigActivityInfo.getFullResIcon(widgetPreviewLoader.mIconCache)), shortcutConfigActivityInfo.getUser(), widgetPreviewLoader.mContext));
                bitmapDrawable.setFilterBitmap(true);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                bitmapDrawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                bitmapDrawable.setAlpha(15);
                Resources resources = widgetPreviewLoader.mContext.getResources();
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.shortcut_preview_padding_top);
                int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.shortcut_preview_padding_left);
                int dimensionPixelOffset3 = (i - dimensionPixelOffset2) - resources.getDimensionPixelOffset(R.dimen.shortcut_preview_padding_right);
                bitmapDrawable.setBounds(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2 + dimensionPixelOffset3, dimensionPixelOffset3 + dimensionPixelOffset);
                bitmapDrawable.draw(canvas);
                int i3 = fromContext.mDeviceProfile.iconSizePx;
                bitmapDrawable.setAlpha(PrivateKeyType.INVALID);
                bitmapDrawable.setColorFilter((ColorFilter) null);
                bitmapDrawable.setBounds(0, 0, i3, i3);
                bitmapDrawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
            }
            return bitmap2;
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
            final Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                WidgetPreviewLoader.this.mWorkerHandler.post(new Runnable() {
                    public final void run() {
                        synchronized (WidgetPreviewLoader.this.mUnusedBitmaps) {
                            WidgetPreviewLoader.this.mUnusedBitmaps.add(bitmap);
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            final Bitmap bitmap = (Bitmap) obj;
            this.mCaller.applyPreview(bitmap);
            if (this.mVersions != null) {
                WidgetPreviewLoader.this.mWorkerHandler.post(new Runnable() {
                    public final void run() {
                        if (!PreviewLoadTask.this.isCancelled()) {
                            PreviewLoadTask previewLoadTask = PreviewLoadTask.this;
                            WidgetPreviewLoader widgetPreviewLoader = WidgetPreviewLoader.this;
                            WidgetCacheKey widgetCacheKey = previewLoadTask.mKey;
                            long[] jArr = previewLoadTask.mVersions;
                            Bitmap bitmap = bitmap;
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("componentName", widgetCacheKey.componentName.flattenToShortString());
                            contentValues.put("profileId", Long.valueOf(widgetPreviewLoader.mUserManager.getSerialNumberForUser(widgetCacheKey.user)));
                            contentValues.put("size", widgetCacheKey.size);
                            contentValues.put("packageName", widgetCacheKey.componentName.getPackageName());
                            contentValues.put("version", Long.valueOf(jArr[0]));
                            contentValues.put("lastUpdated", Long.valueOf(jArr[1]));
                            contentValues.put("preview_bitmap", Utilities.flattenBitmap(bitmap));
                            widgetPreviewLoader.mDb.insertOrReplace(contentValues);
                            PreviewLoadTask.this.mBitmapToRecycle = bitmap;
                            return;
                        }
                        synchronized (WidgetPreviewLoader.this.mUnusedBitmaps) {
                            WidgetPreviewLoader.this.mUnusedBitmaps.add(bitmap);
                        }
                    }
                });
            } else {
                this.mBitmapToRecycle = bitmap;
            }
        }
    }

    /* compiled from: PG */
    public final class WidgetCacheKey extends ComponentKey {
        final String size;

        public WidgetCacheKey(ComponentName componentName, UserHandleCompat userHandleCompat, String str) {
            super(componentName, userHandleCompat);
            this.size = str;
        }

        public final boolean equals(Object obj) {
            return super.equals(obj) && ((WidgetCacheKey) obj).size.equals(this.size);
        }

        public final int hashCode() {
            return this.mHashCode ^ this.size.hashCode();
        }
    }

    public WidgetPreviewLoader(Context context, IconCache iconCache) {
        this.mContext = context;
        this.mIconCache = iconCache;
        this.mWidgetManager = AppWidgetManagerCompat.getInstance(context);
        this.mUserManager = UserManagerCompat.getInstance(context);
        this.mDb = new CacheDb(context);
        this.mWorkerHandler = new Handler(LauncherModel.sWorkerThread.getLooper());
        this.mProfileBadgeMargin = context.getResources().getDimensionPixelSize(R.dimen.profile_badge_margin);
    }

    private final void removePackage$ar$ds(String str, long j) {
        synchronized (this.mPackageVersions) {
            this.mPackageVersions.remove(str);
        }
        this.mDb.delete("packageName = ? AND profileId = ?", new String[]{str, Long.toString(j)});
    }

    public final Bitmap generateWidgetPreview(BaseActivity baseActivity, LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, int i, Bitmap bitmap, int[] iArr) {
        Drawable drawable;
        int i2;
        Bitmap bitmap2;
        int i3;
        float f;
        Bitmap bitmap3;
        LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo2;
        WidgetPreviewLoader widgetPreviewLoader;
        LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo3 = launcherAppWidgetProviderInfo;
        Bitmap bitmap4 = bitmap;
        int i4 = i < 0 ? Integer.MAX_VALUE : i;
        if (launcherAppWidgetProviderInfo3.previewImage != 0) {
            drawable = this.mWidgetManager.loadPreview(launcherAppWidgetProviderInfo3);
            if (drawable != null) {
                drawable = mutateOnMainThread(drawable);
            } else {
                String hexString = Integer.toHexString(launcherAppWidgetProviderInfo3.previewImage);
                String valueOf = String.valueOf(launcherAppWidgetProviderInfo3.provider);
                Log.w("WidgetPreviewLoader", "Can't load widget preview drawable 0x" + hexString + " for provider: " + valueOf);
            }
        } else {
            drawable = null;
        }
        boolean z = drawable != null;
        int i5 = launcherAppWidgetProviderInfo3.spanX;
        int i6 = launcherAppWidgetProviderInfo3.spanY;
        if (z) {
            i3 = drawable.getIntrinsicWidth();
            i2 = drawable.getIntrinsicHeight();
            bitmap2 = null;
        } else {
            Bitmap bitmap5 = ((BitmapDrawable) this.mContext.getResources().getDrawable(R.drawable.widget_tile)).getBitmap();
            i2 = bitmap5.getHeight() * i6;
            bitmap2 = bitmap5;
            i3 = bitmap5.getWidth() * i5;
        }
        if (iArr != null) {
            iArr[0] = i3;
        }
        if (i3 > i4) {
            int i7 = this.mProfileBadgeMargin;
            f = ((float) (i4 - (i7 + i7))) / ((float) i3);
        } else {
            f = 1.0f;
        }
        if (f != 1.0f) {
            i3 = (int) (((float) i3) * f);
            i2 = (int) (((float) i2) * f);
        }
        Canvas canvas = new Canvas();
        if (bitmap4 == null) {
            bitmap4 = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            canvas.setBitmap(bitmap4);
        } else {
            canvas.setBitmap(bitmap4);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        int width = (bitmap4.getWidth() - i3) / 2;
        if (z) {
            drawable.setBounds(width, 0, width + i3, i2);
            drawable.draw(canvas);
            widgetPreviewLoader = this;
            launcherAppWidgetProviderInfo2 = launcherAppWidgetProviderInfo3;
            bitmap3 = bitmap4;
        } else {
            Paint paint = new Paint();
            paint.setFilterBitmap(true);
            int i8 = baseActivity.mDeviceProfile.iconSizePx;
            bitmap3 = bitmap4;
            Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            float width2 = ((float) bitmap2.getWidth()) * f;
            float height = ((float) bitmap2.getHeight()) * f;
            RectF rectF = new RectF(0.0f, 0.0f, width2, height);
            float f2 = (float) width;
            int i9 = width;
            int i10 = 0;
            while (i10 < i5) {
                int i11 = i5;
                float f3 = 0.0f;
                int i12 = 0;
                while (i12 < i6) {
                    rectF.offsetTo(f2, f3);
                    canvas.drawBitmap(bitmap2, rect, rectF, paint);
                    i12++;
                    f3 += height;
                }
                i10++;
                f2 += width2;
                i5 = i11;
            }
            float f4 = (float) i8;
            int i13 = (int) (0.25f * f4);
            float min = Math.min(((float) Math.min(i3, i2)) / ((float) (i8 + (i13 + i13))), f);
            widgetPreviewLoader = this;
            try {
                launcherAppWidgetProviderInfo2 = launcherAppWidgetProviderInfo;
                try {
                    Drawable loadIcon = widgetPreviewLoader.mWidgetManager.loadIcon(launcherAppWidgetProviderInfo2, widgetPreviewLoader.mIconCache);
                    if (loadIcon != null) {
                        Drawable mutateOnMainThread = widgetPreviewLoader.mutateOnMainThread(loadIcon);
                        float f5 = f4 * min;
                        int i14 = ((int) ((width2 - f5) / 2.0f)) + i9;
                        int i15 = (int) ((height - f5) / 2.0f);
                        int i16 = (int) f5;
                        mutateOnMainThread.setBounds(i14, i15, i14 + i16, i16 + i15);
                        mutateOnMainThread.draw(canvas);
                    }
                } catch (Resources.NotFoundException unused) {
                }
            } catch (Resources.NotFoundException unused2) {
                launcherAppWidgetProviderInfo2 = launcherAppWidgetProviderInfo;
            }
            canvas.setBitmap((Bitmap) null);
        }
        return widgetPreviewLoader.mWidgetManager.getBadgeBitmap(launcherAppWidgetProviderInfo2, bitmap3, Math.min(bitmap3.getWidth(), i3 + widgetPreviewLoader.mProfileBadgeMargin), Math.min(bitmap3.getHeight(), i2 + widgetPreviewLoader.mProfileBadgeMargin));
    }

    /* access modifiers changed from: package-private */
    public final long[] getPackageVersion(String str) {
        long[] jArr;
        synchronized (this.mPackageVersions) {
            jArr = (long[]) this.mPackageVersions.get(str);
            if (jArr == null) {
                jArr = new long[2];
                try {
                    PackageInfo packageInfo = this.mContext.getPackageManager().getPackageInfo(str, 0);
                    jArr[0] = (long) packageInfo.versionCode;
                    jArr[1] = packageInfo.lastUpdateTime;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("WidgetPreviewLoader", "PackageInfo not found", e);
                }
                this.mPackageVersions.put(str, jArr);
            }
        }
        return jArr;
    }

    public final Drawable mutateOnMainThread(final Drawable drawable) {
        try {
            return (Drawable) this.mMainThreadExecutor.submit(new Callable() {
                public final /* synthetic */ Object call() {
                    return drawable.mutate();
                }
            }).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r9 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r9 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap readFromDb(com.android.launcher3.WidgetPreviewLoader.WidgetCacheKey r9, android.graphics.Bitmap r10, com.android.launcher3.WidgetPreviewLoader.PreviewLoadTask r11) {
        /*
            r8 = this;
            r0 = 0
            com.android.launcher3.WidgetPreviewLoader$CacheDb r1 = r8.mDb     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            java.lang.String r4 = "preview_bitmap"
            r5 = 0
            r3[r5] = r4     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            android.content.ComponentName r6 = r9.componentName     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            java.lang.String r6 = r6.flattenToString()     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            r4[r5] = r6     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            com.android.launcher3.compat.UserManagerCompat r6 = r8.mUserManager     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            com.android.launcher3.compat.UserHandleCompat r7 = r9.user     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            long r6 = r6.getSerialNumberForUser(r7)     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            java.lang.String r6 = java.lang.Long.toString(r6)     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            r4[r2] = r6     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            java.lang.String r9 = r9.size     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            r2 = 2
            r4[r2] = r9     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            java.lang.String r9 = "componentName = ? AND profileId = ? AND size = ?"
            android.database.Cursor r9 = r1.query(r3, r9, r4)     // Catch:{ SQLException -> 0x006c, all -> 0x0069 }
            boolean r1 = r11.isCancelled()     // Catch:{ SQLException -> 0x0067 }
            if (r1 == 0) goto L_0x003b
            if (r9 == 0) goto L_0x003a
            r9.close()
        L_0x003a:
            return r0
        L_0x003b:
            boolean r1 = r9.moveToNext()     // Catch:{ SQLException -> 0x0067 }
            if (r1 == 0) goto L_0x0064
            byte[] r1 = r9.getBlob(r5)     // Catch:{ SQLException -> 0x0067 }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ SQLException -> 0x0067 }
            r2.<init>()     // Catch:{ SQLException -> 0x0067 }
            r2.inBitmap = r10     // Catch:{ SQLException -> 0x0067 }
            boolean r10 = r11.isCancelled()     // Catch:{ Exception -> 0x005d }
            if (r10 != 0) goto L_0x0064
            int r10 = r1.length     // Catch:{ Exception -> 0x005d }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeByteArray(r1, r5, r10, r2)     // Catch:{ Exception -> 0x005d }
            if (r9 == 0) goto L_0x005c
            r9.close()
        L_0x005c:
            return r10
        L_0x005d:
            if (r9 == 0) goto L_0x0063
            r9.close()
        L_0x0063:
            return r0
        L_0x0064:
            if (r9 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0067:
            r10 = move-exception
            goto L_0x006f
        L_0x0069:
            r9 = move-exception
            r10 = r9
            goto L_0x007e
        L_0x006c:
            r9 = move-exception
            r10 = r9
            r9 = r0
        L_0x006f:
            java.lang.String r11 = "WidgetPreviewLoader"
            java.lang.String r1 = "Error loading preview from DB"
            android.util.Log.w(r11, r1, r10)     // Catch:{ all -> 0x007c }
            if (r9 == 0) goto L_0x007b
        L_0x0078:
            r9.close()
        L_0x007b:
            return r0
        L_0x007c:
            r10 = move-exception
            r0 = r9
        L_0x007e:
            if (r0 == 0) goto L_0x0083
            r0.close()
        L_0x0083:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.WidgetPreviewLoader.readFromDb(com.android.launcher3.WidgetPreviewLoader$WidgetCacheKey, android.graphics.Bitmap, com.android.launcher3.WidgetPreviewLoader$PreviewLoadTask):android.graphics.Bitmap");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String, java.lang.String[], android.database.Cursor] */
    public final void removeObsoletePreviews(ArrayList arrayList) {
        UserHandleCompat userHandleCompat;
        String str;
        boolean z = Utilities.ATLEAST_O;
        LongSparseArray longSparseArray = new LongSparseArray();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof ShortcutConfigActivityInfo) {
                ShortcutConfigActivityInfo shortcutConfigActivityInfo = (ShortcutConfigActivityInfo) obj;
                userHandleCompat = shortcutConfigActivityInfo.getUser();
                str = shortcutConfigActivityInfo.getComponent().getPackageName();
            } else {
                LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo = (LauncherAppWidgetProviderInfo) obj;
                userHandleCompat = this.mWidgetManager.getUser(launcherAppWidgetProviderInfo);
                str = launcherAppWidgetProviderInfo.provider.getPackageName();
            }
            long serialNumberForUser = this.mUserManager.getSerialNumberForUser(userHandleCompat);
            HashSet hashSet = (HashSet) longSparseArray.get(serialNumberForUser);
            if (hashSet == null) {
                hashSet = new HashSet();
                longSparseArray.put(serialNumberForUser, hashSet);
            }
            hashSet.add(str);
        }
        LongSparseArray longSparseArray2 = new LongSparseArray();
        ? r4 = 0;
        try {
            Cursor query = this.mDb.query(new String[]{"profileId", "packageName", "lastUpdated", "version"}, r4, r4);
            while (query.moveToNext()) {
                long j = query.getLong(0);
                String string = query.getString(1);
                long j2 = query.getLong(2);
                long j3 = query.getLong(3);
                HashSet hashSet2 = (HashSet) longSparseArray.get(j);
                if (hashSet2 != null && hashSet2.contains(string)) {
                    long[] packageVersion = getPackageVersion(string);
                    if (packageVersion[0] == j3 && packageVersion[1] == j2) {
                    }
                }
                HashSet hashSet3 = (HashSet) longSparseArray2.get(j);
                if (hashSet3 == null) {
                    hashSet3 = new HashSet();
                    longSparseArray2.put(j, hashSet3);
                }
                hashSet3.add(string);
            }
            for (int i2 = 0; i2 < longSparseArray2.size(); i2++) {
                long keyAt = longSparseArray2.keyAt(i2);
                this.mUserManager.getUserForSerialNumber(keyAt);
                Iterator it = ((HashSet) longSparseArray2.valueAt(i2)).iterator();
                while (it.hasNext()) {
                    removePackage$ar$ds((String) it.next(), keyAt);
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (SQLException e) {
            Log.e("WidgetPreviewLoader", "Error updating widget previews", e);
            if (r4 != 0) {
                r4.close();
            }
        } catch (Throwable th) {
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
    }

    public final void removePackage(String str, UserHandleCompat userHandleCompat) {
        removePackage$ar$ds(str, this.mUserManager.getSerialNumberForUser(userHandleCompat));
    }
}
