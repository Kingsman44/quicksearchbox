package com.android.launcher3;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.android.launcher3.FastBitmapDrawable;
import com.android.launcher3.Workspace;
import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.model.PackageItemInfo;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.SQLiteCacheHelper;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;

/* compiled from: PG */
public final class IconCache {
    static final Object ICON_UPDATE_TOKEN = new Object();
    private final int mActivityBgColor;
    private final HashMap mCache = new HashMap(50);
    public final Context mContext;
    private final HashMap mDefaultIcons = new HashMap();
    final IconDB mIconDb;
    public final int mIconDpi;
    public final LauncherAppsCompat mLauncherApps;
    private Bitmap mLowResBitmap;
    private Canvas mLowResCanvas;
    private final BitmapFactory.Options mLowResOptions;
    private Paint mLowResPaint;
    final MainThreadExecutor mMainThreadExecutor = new MainThreadExecutor();
    private final int mPackageBgColor;
    public final PackageManager mPackageManager;
    public String mSystemState;
    final UserManagerCompat mUserManager;
    final Handler mWorkerHandler;

    /* compiled from: PG */
    final class CacheEntry {
        public CharSequence contentDescription = BuildConfig.FLAVOR;
        public Bitmap icon;
        public boolean isLowResIcon;
        public CharSequence title = BuildConfig.FLAVOR;
    }

    /* compiled from: PG */
    final class IconDB extends SQLiteCacheHelper {
        public IconDB(Context context, int i) {
            super(context, "app_icons.db", i + 524288, "icons");
        }

        /* access modifiers changed from: protected */
        public final void onCreateTable(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS icons (componentName TEXT NOT NULL, profileId INTEGER NOT NULL, lastUpdated INTEGER NOT NULL DEFAULT 0, version INTEGER NOT NULL DEFAULT 0, icon BLOB, icon_low_res BLOB, label TEXT, system_state TEXT, PRIMARY KEY (componentName, profileId) );");
        }
    }

    /* compiled from: PG */
    public final class IconLoadRequest {
        public final Handler mHandler;
        public final Runnable mRunnable;

        public IconLoadRequest(Runnable runnable, Handler handler) {
            this.mRunnable = runnable;
            this.mHandler = handler;
        }
    }

    /* compiled from: PG */
    final class SerializedIconUpdateTask implements Runnable {
        private final Stack mAppsToAdd;
        private final Stack mAppsToUpdate;
        private final HashMap mPkgInfoMap;
        private final HashSet mUpdatedPackages = new HashSet();
        private final long mUserSerial;

        public SerializedIconUpdateTask(long j, HashMap hashMap, Stack stack, Stack stack2) {
            this.mUserSerial = j;
            this.mPkgInfoMap = hashMap;
            this.mAppsToAdd = stack;
            this.mAppsToUpdate = stack2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
            r8 = (com.android.launcher3.ShortcutInfo) r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                java.util.Stack r0 = r13.mAppsToUpdate
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0101
                java.util.Stack r0 = r13.mAppsToUpdate
                java.lang.Object r0 = r0.pop()
                com.android.launcher3.compat.LauncherActivityInfoCompat r0 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r0
                android.content.ComponentName r1 = r0.getComponentName()
                java.lang.String r1 = r1.flattenToString()
                com.android.launcher3.IconCache r2 = com.android.launcher3.IconCache.this
                r3 = 1
                android.content.ContentValues r2 = r2.updateCacheAndGetContentValues(r0, r3)
                com.android.launcher3.IconCache r4 = com.android.launcher3.IconCache.this
                com.android.launcher3.IconCache$IconDB r4 = r4.mIconDb
                r5 = 2
                java.lang.String[] r5 = new java.lang.String[r5]
                r6 = 0
                r5[r6] = r1
                long r7 = r13.mUserSerial
                java.lang.String r1 = java.lang.Long.toString(r7)
                r5[r3] = r1
                r4.update$ar$ds(r2, r5)
                java.util.HashSet r1 = r13.mUpdatedPackages
                android.content.ComponentName r0 = r0.getComponentName()
                java.lang.String r0 = r0.getPackageName()
                r1.add(r0)
                java.util.Stack r0 = r13.mAppsToUpdate
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x00fd
                java.util.HashSet r0 = r13.mUpdatedPackages
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x00fd
                com.android.launcher3.LauncherAppState r0 = com.android.launcher3.LauncherAppState.getInstance()
                com.android.launcher3.LauncherModel r0 = r0.mModel
                java.util.HashSet r1 = r13.mUpdatedPackages
                com.android.launcher3.IconCache r2 = com.android.launcher3.IconCache.this
                com.android.launcher3.compat.UserManagerCompat r2 = r2.mUserManager
                long r3 = r13.mUserSerial
                com.android.launcher3.compat.UserHandleCompat r2 = r2.getUserForSerialNumber(r3)
                com.android.launcher3.LauncherModel$Callbacks r3 = r0.getCallback()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.lang.Object r7 = com.android.launcher3.LauncherModel.sBgLock
                monitor-enter(r7)
                com.android.launcher3.util.LongArrayMap r8 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ all -> 0x00fa }
                com.android.launcher3.util.LongArrayMap$ValueIterator r9 = new com.android.launcher3.util.LongArrayMap$ValueIterator     // Catch:{ all -> 0x00fa }
                r9.<init>()     // Catch:{ all -> 0x00fa }
            L_0x007b:
                boolean r8 = r9.hasNext()     // Catch:{ all -> 0x00fa }
                if (r8 == 0) goto L_0x00b6
                java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x00fa }
                com.android.launcher3.ItemInfo r8 = (com.android.launcher3.ItemInfo) r8     // Catch:{ all -> 0x00fa }
                boolean r10 = r8 instanceof com.android.launcher3.ShortcutInfo     // Catch:{ all -> 0x00fa }
                if (r10 == 0) goto L_0x007b
                com.android.launcher3.compat.UserHandleCompat r10 = r8.user     // Catch:{ all -> 0x00fa }
                boolean r10 = r2.equals(r10)     // Catch:{ all -> 0x00fa }
                if (r10 == 0) goto L_0x007b
                int r10 = r8.itemType     // Catch:{ all -> 0x00fa }
                if (r10 != 0) goto L_0x007b
                com.android.launcher3.ShortcutInfo r8 = (com.android.launcher3.ShortcutInfo) r8     // Catch:{ all -> 0x00fa }
                android.content.ComponentName r10 = r8.getTargetComponent()     // Catch:{ all -> 0x00fa }
                if (r10 == 0) goto L_0x007b
                java.lang.String r10 = r10.getPackageName()     // Catch:{ all -> 0x00fa }
                boolean r10 = r1.contains(r10)     // Catch:{ all -> 0x00fa }
                if (r10 == 0) goto L_0x007b
                com.android.launcher3.IconCache r10 = r0.mIconCache     // Catch:{ all -> 0x00fa }
                boolean r11 = r8.shouldUseLowResIcon()     // Catch:{ all -> 0x00fa }
                r8.updateIcon(r10, r11)     // Catch:{ all -> 0x00fa }
                r5.add(r8)     // Catch:{ all -> 0x00fa }
                goto L_0x007b
            L_0x00b6:
                com.android.launcher3.AllAppsList r8 = r0.mBgAllAppsList     // Catch:{ all -> 0x00fa }
                java.util.ArrayList r9 = r8.data     // Catch:{ all -> 0x00fa }
                int r10 = r9.size()     // Catch:{ all -> 0x00fa }
            L_0x00be:
                if (r6 >= r10) goto L_0x00e5
                java.lang.Object r11 = r9.get(r6)     // Catch:{ all -> 0x00fa }
                com.android.launcher3.AppInfo r11 = (com.android.launcher3.AppInfo) r11     // Catch:{ all -> 0x00fa }
                com.android.launcher3.compat.UserHandleCompat r12 = r11.user     // Catch:{ all -> 0x00fa }
                boolean r12 = r12.equals(r2)     // Catch:{ all -> 0x00fa }
                if (r12 == 0) goto L_0x00e2
                android.content.ComponentName r12 = r11.componentName     // Catch:{ all -> 0x00fa }
                java.lang.String r12 = r12.getPackageName()     // Catch:{ all -> 0x00fa }
                boolean r12 = r1.contains(r12)     // Catch:{ all -> 0x00fa }
                if (r12 == 0) goto L_0x00e2
                com.android.launcher3.IconCache r12 = r8.mIconCache     // Catch:{ all -> 0x00fa }
                r12.updateTitleAndIcon(r11)     // Catch:{ all -> 0x00fa }
                r4.add(r11)     // Catch:{ all -> 0x00fa }
            L_0x00e2:
                int r6 = r6 + 1
                goto L_0x00be
            L_0x00e5:
                monitor-exit(r7)     // Catch:{ all -> 0x00fa }
                r0.bindUpdatedShortcuts(r5, r2)
                boolean r1 = r4.isEmpty()
                if (r1 != 0) goto L_0x00fd
                com.android.launcher3.DeferredHandler r1 = r0.mHandler
                com.android.launcher3.LauncherModel$16 r2 = new com.android.launcher3.LauncherModel$16
                r2.<init>(r3, r4)
                r1.post(r2)
                goto L_0x00fd
            L_0x00fa:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x00fa }
                throw r0
            L_0x00fd:
                r13.scheduleNext()
                return
            L_0x0101:
                java.util.Stack r0 = r13.mAppsToAdd
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x013d
                java.util.Stack r0 = r13.mAppsToAdd
                java.lang.Object r0 = r0.pop()
                com.android.launcher3.compat.LauncherActivityInfoCompat r0 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r0
                java.util.HashMap r1 = r13.mPkgInfoMap
                android.content.ComponentName r2 = r0.getComponentName()
                java.lang.String r2 = r2.getPackageName()
                java.lang.Object r1 = r1.get(r2)
                android.content.pm.PackageInfo r1 = (android.content.pm.PackageInfo) r1
                if (r1 == 0) goto L_0x0132
                com.android.launcher3.IconCache r2 = com.android.launcher3.IconCache.this
                monitor-enter(r2)
                com.android.launcher3.IconCache r3 = com.android.launcher3.IconCache.this     // Catch:{ all -> 0x012f }
                long r4 = r13.mUserSerial     // Catch:{ all -> 0x012f }
                r3.addIconToDBAndMemCache(r0, r1, r4)     // Catch:{ all -> 0x012f }
                monitor-exit(r2)     // Catch:{ all -> 0x012f }
                goto L_0x0132
            L_0x012f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x012f }
                throw r0
            L_0x0132:
                java.util.Stack r0 = r13.mAppsToAdd
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x013d
                r13.scheduleNext()
            L_0x013d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.IconCache.SerializedIconUpdateTask.run():void");
        }

        public final void scheduleNext() {
            IconCache.this.mWorkerHandler.postAtTime(this, IconCache.ICON_UPDATE_TOKEN, SystemClock.uptimeMillis() + 1);
        }
    }

    public IconCache(Context context, InvariantDeviceProfile invariantDeviceProfile) {
        this.mContext = context;
        this.mPackageManager = context.getPackageManager();
        this.mUserManager = UserManagerCompat.getInstance(context);
        this.mLauncherApps = LauncherAppsCompat.getInstance(context);
        this.mIconDpi = invariantDeviceProfile.fillResIconDpi;
        this.mIconDb = new IconDB(context, invariantDeviceProfile.iconBitmapSize);
        this.mWorkerHandler = new Handler(LauncherModel.sWorkerThread.getLooper());
        this.mActivityBgColor = context.getResources().getColor(R.color.quantum_panel_bg_color);
        this.mPackageBgColor = context.getResources().getColor(R.color.quantum_panel_bg_color_dark);
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.mLowResOptions = options;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        updateSystemStateString();
    }

    private final void addIconToDB(ContentValues contentValues, ComponentName componentName, PackageInfo packageInfo, long j) {
        contentValues.put("componentName", componentName.flattenToString());
        contentValues.put("profileId", Long.valueOf(j));
        contentValues.put("lastUpdated", Long.valueOf(packageInfo.lastUpdateTime));
        contentValues.put("version", Integer.valueOf(packageInfo.versionCode));
        this.mIconDb.insertOrReplace(contentValues);
    }

    private final CacheEntry cacheLocked(ComponentName componentName, LauncherActivityInfoCompat launcherActivityInfoCompat, UserHandleCompat userHandleCompat, boolean z, boolean z2) {
        ComponentKey componentKey = new ComponentKey(componentName, userHandleCompat);
        CacheEntry cacheEntry = (CacheEntry) this.mCache.get(componentKey);
        if (cacheEntry != null) {
            if (cacheEntry.isLowResIcon && !z2) {
                z2 = false;
            }
            return cacheEntry;
        }
        cacheEntry = new CacheEntry();
        this.mCache.put(componentKey, cacheEntry);
        if (!getEntryFromDB(componentKey, cacheEntry, z2)) {
            if (launcherActivityInfoCompat != null) {
                cacheEntry.icon = Utilities.createBadgedIconBitmap(launcherActivityInfoCompat.getIcon(this.mIconDpi), launcherActivityInfoCompat.getUser(), this.mContext);
            } else {
                if (z) {
                    CacheEntry entryForPackageLocked = getEntryForPackageLocked(componentName.getPackageName(), userHandleCompat, false);
                    cacheEntry.icon = entryForPackageLocked.icon;
                    cacheEntry.title = entryForPackageLocked.title;
                    cacheEntry.contentDescription = entryForPackageLocked.contentDescription;
                }
                if (cacheEntry.icon == null) {
                    cacheEntry.icon = getDefaultIcon(userHandleCompat);
                }
            }
        }
        if (TextUtils.isEmpty(cacheEntry.title) && launcherActivityInfoCompat != null) {
            cacheEntry.title = launcherActivityInfoCompat.getLabel();
            cacheEntry.contentDescription = this.mUserManager.getBadgedLabelForUser(cacheEntry.title, userHandleCompat);
        }
        return cacheEntry;
    }

    private final CacheEntry getEntryForPackageLocked(String str, UserHandleCompat userHandleCompat, boolean z) {
        ComponentKey packageKey = getPackageKey(str, userHandleCompat);
        CacheEntry cacheEntry = (CacheEntry) this.mCache.get(packageKey);
        if (cacheEntry != null) {
            if (cacheEntry.isLowResIcon && !z) {
                z = false;
            }
            return cacheEntry;
        }
        cacheEntry = new CacheEntry();
        if (!getEntryFromDB(packageKey, cacheEntry, z)) {
            try {
                PackageInfo packageInfo = this.mPackageManager.getPackageInfo(str, true != UserHandleCompat.myUserHandle().equals(userHandleCompat) ? 8192 : 0);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    cacheEntry.icon = Utilities.createBadgedIconBitmap(applicationInfo.loadIcon(this.mPackageManager), userHandleCompat, this.mContext);
                    cacheEntry.title = applicationInfo.loadLabel(this.mPackageManager);
                    cacheEntry.contentDescription = this.mUserManager.getBadgedLabelForUser(cacheEntry.title, userHandleCompat);
                    cacheEntry.isLowResIcon = false;
                    addIconToDB(newContentValues(cacheEntry.icon, cacheEntry.title.toString(), this.mPackageBgColor), packageKey.componentName, packageInfo, this.mUserManager.getSerialNumberForUser(userHandleCompat));
                } else {
                    throw new PackageManager.NameNotFoundException("ApplicationInfo is null");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.mCache.put(packageKey, cacheEntry);
        return cacheEntry;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean getEntryFromDB(com.android.launcher3.util.ComponentKey r10, com.android.launcher3.IconCache.CacheEntry r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            com.android.launcher3.IconCache$IconDB r3 = r9.mIconDb     // Catch:{ SQLiteException -> 0x007b }
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x007b }
            r6 = 1
            if (r6 == r12) goto L_0x000f
            java.lang.String r7 = "icon"
            goto L_0x0011
        L_0x000f:
            java.lang.String r7 = "icon_low_res"
        L_0x0011:
            r5[r2] = r7     // Catch:{ SQLiteException -> 0x007b }
            java.lang.String r7 = "label"
            r5[r6] = r7     // Catch:{ SQLiteException -> 0x007b }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x007b }
            android.content.ComponentName r7 = r10.componentName     // Catch:{ SQLiteException -> 0x007b }
            java.lang.String r7 = r7.flattenToString()     // Catch:{ SQLiteException -> 0x007b }
            r4[r2] = r7     // Catch:{ SQLiteException -> 0x007b }
            com.android.launcher3.compat.UserManagerCompat r7 = r9.mUserManager     // Catch:{ SQLiteException -> 0x007b }
            com.android.launcher3.compat.UserHandleCompat r8 = r10.user     // Catch:{ SQLiteException -> 0x007b }
            long r7 = r7.getSerialNumberForUser(r8)     // Catch:{ SQLiteException -> 0x007b }
            java.lang.String r7 = java.lang.Long.toString(r7)     // Catch:{ SQLiteException -> 0x007b }
            r4[r6] = r7     // Catch:{ SQLiteException -> 0x007b }
            java.lang.String r7 = "componentName = ? AND profileId = ?"
            android.database.Cursor r3 = r3.query(r5, r7, r4)     // Catch:{ SQLiteException -> 0x007b }
            boolean r4 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            if (r4 == 0) goto L_0x006d
            if (r12 == 0) goto L_0x0040
            android.graphics.BitmapFactory$Options r4 = r9.mLowResOptions     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            goto L_0x0041
        L_0x0040:
            r4 = r1
        L_0x0041:
            byte[] r5 = r3.getBlob(r2)     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            int r7 = r5.length     // Catch:{ Exception -> 0x004a, all -> 0x0073 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r5, r2, r7, r4)     // Catch:{ Exception -> 0x004a, all -> 0x0073 }
        L_0x004a:
            r11.icon = r1     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            r11.isLowResIcon = r12     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            java.lang.String r12 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            r11.title = r12     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            java.lang.CharSequence r12 = r11.title     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            if (r12 != 0) goto L_0x005d
            r11.title = r0     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            r11.contentDescription = r0     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            goto L_0x0067
        L_0x005d:
            com.android.launcher3.compat.UserManagerCompat r0 = r9.mUserManager     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            com.android.launcher3.compat.UserHandleCompat r10 = r10.user     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            java.lang.CharSequence r10 = r0.getBadgedLabelForUser(r12, r10)     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            r11.contentDescription = r10     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
        L_0x0067:
            if (r3 == 0) goto L_0x006c
            r3.close()
        L_0x006c:
            return r6
        L_0x006d:
            if (r3 == 0) goto L_0x0088
            r3.close()
            goto L_0x0088
        L_0x0073:
            r10 = move-exception
            r1 = r3
            goto L_0x0089
        L_0x0076:
            r10 = move-exception
            r1 = r3
            goto L_0x007c
        L_0x0079:
            r10 = move-exception
            goto L_0x0089
        L_0x007b:
            r10 = move-exception
        L_0x007c:
            java.lang.String r11 = "Launcher.IconCache"
            java.lang.String r12 = "Error reading icon cache"
            android.util.Log.d(r11, r12, r10)     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0088
            r1.close()
        L_0x0088:
            return r2
        L_0x0089:
            if (r1 == 0) goto L_0x008e
            r1.close()
        L_0x008e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.IconCache.getEntryFromDB(com.android.launcher3.util.ComponentKey, com.android.launcher3.IconCache$CacheEntry, boolean):boolean");
    }

    private final Bitmap getNonNullIcon(CacheEntry cacheEntry, UserHandleCompat userHandleCompat) {
        Bitmap bitmap = cacheEntry.icon;
        return bitmap == null ? getDefaultIcon(userHandleCompat) : bitmap;
    }

    private static ComponentKey getPackageKey(String str, UserHandleCompat userHandleCompat) {
        return new ComponentKey(new ComponentName(str, String.valueOf(str).concat(".")), userHandleCompat);
    }

    private final ContentValues newContentValues(Bitmap bitmap, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("icon", Utilities.flattenBitmap(bitmap));
        contentValues.put("label", str);
        contentValues.put("system_state", this.mSystemState);
        if (i == 0) {
            contentValues.put("icon_low_res", Utilities.flattenBitmap(Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 5, bitmap.getHeight() / 5, true)));
        } else {
            synchronized (this) {
                if (this.mLowResBitmap == null) {
                    this.mLowResBitmap = Bitmap.createBitmap(bitmap.getWidth() / 5, bitmap.getHeight() / 5, Bitmap.Config.RGB_565);
                    this.mLowResCanvas = new Canvas(this.mLowResBitmap);
                    this.mLowResPaint = new Paint(3);
                }
                this.mLowResCanvas.drawColor(i);
                this.mLowResCanvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, this.mLowResBitmap.getWidth(), this.mLowResBitmap.getHeight()), this.mLowResPaint);
                contentValues.put("icon_low_res", Utilities.flattenBitmap(this.mLowResBitmap));
            }
        }
        return contentValues;
    }

    private final void removeFromMemCacheLocked(String str, UserHandleCompat userHandleCompat) {
        HashSet hashSet = new HashSet();
        for (ComponentKey componentKey : this.mCache.keySet()) {
            if (componentKey.componentName.getPackageName().equals(str) && componentKey.user.equals(userHandleCompat)) {
                hashSet.add(componentKey);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.mCache.remove((ComponentKey) it.next());
        }
    }

    /* access modifiers changed from: package-private */
    public final void addIconToDBAndMemCache(LauncherActivityInfoCompat launcherActivityInfoCompat, PackageInfo packageInfo, long j) {
        addIconToDB(updateCacheAndGetContentValues(launcherActivityInfoCompat, false), launcherActivityInfoCompat.getComponentName(), packageInfo, j);
    }

    public final synchronized void cachePackageInstallInfo(String str, UserHandleCompat userHandleCompat, Bitmap bitmap, CharSequence charSequence) {
        removeFromMemCacheLocked(str, userHandleCompat);
        ComponentKey packageKey = getPackageKey(str, userHandleCompat);
        CacheEntry cacheEntry = (CacheEntry) this.mCache.get(packageKey);
        if (cacheEntry == null) {
            cacheEntry = new CacheEntry();
            this.mCache.put(packageKey, cacheEntry);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            cacheEntry.title = charSequence;
        }
        if (bitmap != null) {
            cacheEntry.icon = Utilities.createIconBitmap(bitmap, this.mContext);
        }
    }

    public final synchronized Bitmap getDefaultIcon(UserHandleCompat userHandleCompat) {
        if (!this.mDefaultIcons.containsKey(userHandleCompat)) {
            this.mDefaultIcons.put(userHandleCompat, Utilities.createBadgedIconBitmap(getFullResDefaultActivityIcon(), userHandleCompat, this.mContext));
        }
        return (Bitmap) this.mDefaultIcons.get(userHandleCompat);
    }

    public final Drawable getFullResDefaultActivityIcon() {
        return getFullResIcon(Resources.getSystem(), 17629184);
    }

    public final Drawable getFullResIcon(Resources resources, int i) {
        Drawable drawable;
        try {
            drawable = resources.getDrawableForDensity(i, this.mIconDpi);
        } catch (Resources.NotFoundException unused) {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return getFullResDefaultActivityIcon();
    }

    public final synchronized Bitmap getIcon(Intent intent, UserHandleCompat userHandleCompat) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            return getDefaultIcon(userHandleCompat);
        }
        return cacheLocked(component, this.mLauncherApps.resolveActivity(intent, userHandleCompat), userHandleCompat, true, false).icon;
    }

    public final synchronized void getTitleAndIcon(AppInfo appInfo, LauncherActivityInfoCompat launcherActivityInfoCompat, boolean z) {
        UserHandleCompat user = launcherActivityInfoCompat == null ? appInfo.user : launcherActivityInfoCompat.getUser();
        CacheEntry cacheLocked = cacheLocked(appInfo.componentName, launcherActivityInfoCompat, user, false, z);
        appInfo.title = Utilities.trim(cacheLocked.title);
        appInfo.iconBitmap = getNonNullIcon(cacheLocked, user);
        appInfo.contentDescription = cacheLocked.contentDescription;
        appInfo.usingLowResIcon = cacheLocked.isLowResIcon;
    }

    public final synchronized void getTitleAndIconForApp(String str, UserHandleCompat userHandleCompat, boolean z, PackageItemInfo packageItemInfo) {
        CacheEntry entryForPackageLocked = getEntryForPackageLocked(str, userHandleCompat, z);
        packageItemInfo.iconBitmap = getNonNullIcon(entryForPackageLocked, userHandleCompat);
        packageItemInfo.title = Utilities.trim(entryForPackageLocked.title);
        packageItemInfo.usingLowResIcon = entryForPackageLocked.isLowResIcon;
        packageItemInfo.contentDescription = entryForPackageLocked.contentDescription;
    }

    public final boolean isDefaultIcon(Bitmap bitmap, UserHandleCompat userHandleCompat) {
        return this.mDefaultIcons.get(userHandleCompat) == bitmap;
    }

    public final void preloadIcon$ar$ds(ComponentName componentName, Bitmap bitmap, String str, long j, InvariantDeviceProfile invariantDeviceProfile) {
        try {
            this.mContext.getPackageManager().getActivityIcon(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            int i = invariantDeviceProfile.iconBitmapSize;
            ContentValues newContentValues = newContentValues(Bitmap.createScaledBitmap(bitmap, i, i, true), str, 0);
            newContentValues.put("componentName", componentName.flattenToString());
            newContentValues.put("profileId", Long.valueOf(j));
            this.mIconDb.insertOrReplace(newContentValues);
        }
    }

    public final synchronized void remove(ComponentName componentName, UserHandleCompat userHandleCompat) {
        this.mCache.remove(new ComponentKey(componentName, userHandleCompat));
    }

    public final synchronized void removeIconsForPkg(String str, UserHandleCompat userHandleCompat) {
        removeFromMemCacheLocked(str, userHandleCompat);
        long serialNumberForUser = this.mUserManager.getSerialNumberForUser(userHandleCompat);
        this.mIconDb.delete("componentName LIKE ? AND profileId = ?", new String[]{String.valueOf(str).concat("/%"), Long.toString(serialNumberForUser)});
    }

    /* access modifiers changed from: package-private */
    public final ContentValues updateCacheAndGetContentValues(LauncherActivityInfoCompat launcherActivityInfoCompat, boolean z) {
        CacheEntry cacheEntry;
        ComponentKey componentKey = new ComponentKey(launcherActivityInfoCompat.getComponentName(), launcherActivityInfoCompat.getUser());
        CacheEntry cacheEntry2 = null;
        if (!z && (cacheEntry = (CacheEntry) this.mCache.get(componentKey)) != null && !cacheEntry.isLowResIcon && cacheEntry.icon != null) {
            cacheEntry2 = cacheEntry;
        }
        if (cacheEntry2 == null) {
            cacheEntry2 = new CacheEntry();
            cacheEntry2.icon = Utilities.createBadgedIconBitmap(launcherActivityInfoCompat.getIcon(this.mIconDpi), launcherActivityInfoCompat.getUser(), this.mContext);
        }
        cacheEntry2.title = launcherActivityInfoCompat.getLabel();
        cacheEntry2.contentDescription = this.mUserManager.getBadgedLabelForUser(cacheEntry2.title, launcherActivityInfoCompat.getUser());
        this.mCache.put(new ComponentKey(launcherActivityInfoCompat.getComponentName(), launcherActivityInfoCompat.getUser()), cacheEntry2);
        return newContentValues(cacheEntry2.icon, cacheEntry2.title.toString(), this.mActivityBgColor);
    }

    public final IconLoadRequest updateIconInBackground(final BubbleTextView bubbleTextView, final ItemInfo itemInfo) {
        C52671 r0 = new Runnable() {
            public final void run() {
                ItemInfo itemInfo = itemInfo;
                if (itemInfo instanceof AppInfo) {
                    IconCache.this.getTitleAndIcon((AppInfo) itemInfo, (LauncherActivityInfoCompat) null, false);
                } else if (itemInfo instanceof ShortcutInfo) {
                    ShortcutInfo shortcutInfo = (ShortcutInfo) itemInfo;
                    IconCache iconCache = IconCache.this;
                    Intent intent = shortcutInfo.promisedIntent;
                    if (intent == null) {
                        intent = shortcutInfo.intent;
                    }
                    iconCache.getTitleAndIcon(shortcutInfo, intent, shortcutInfo.user, false);
                } else if (itemInfo instanceof PackageItemInfo) {
                    PackageItemInfo packageItemInfo = (PackageItemInfo) itemInfo;
                    IconCache.this.getTitleAndIconForApp(packageItemInfo.packageName, packageItemInfo.user, false, packageItemInfo);
                }
                IconCache.this.mMainThreadExecutor.execute(new Runnable() {
                    public final void run() {
                        View firstMatch;
                        C52671 r0 = C52671.this;
                        BubbleTextView bubbleTextView = bubbleTextView;
                        ItemInfo itemInfo = itemInfo;
                        if (bubbleTextView.getTag() == itemInfo) {
                            FastBitmapDrawable.State state = FastBitmapDrawable.State.NORMAL;
                            Drawable drawable = bubbleTextView.mIcon;
                            if (drawable instanceof FastBitmapDrawable) {
                                state = ((FastBitmapDrawable) drawable).mState;
                            }
                            bubbleTextView.mIconLoadRequest = null;
                            bubbleTextView.mDisableRelayout = true;
                            if (itemInfo instanceof AppInfo) {
                                bubbleTextView.applyFromApplicationInfo((AppInfo) itemInfo);
                            } else if (itemInfo instanceof ShortcutInfo) {
                                bubbleTextView.applyFromShortcutInfo((ShortcutInfo) itemInfo, LauncherAppState.getInstance().mIconCache, false);
                                if (itemInfo.rank < 3) {
                                    long j = itemInfo.container;
                                    if (j >= 0 && (firstMatch = bubbleTextView.mLauncher.mWorkspace.getFirstMatch(new Workspace.ItemOperator(j) {
                                        final /* synthetic */ long val$id;

                                        {
                                            this.val$id = r1;
                                        }

                                        public final boolean evaluate(ItemInfo itemInfo, View view, View view2) {
                                            return itemInfo != null && itemInfo.f16556id == this.val$id;
                                        }
                                    })) != null) {
                                        firstMatch.invalidate();
                                    }
                                }
                            } else if (itemInfo instanceof PackageItemInfo) {
                                bubbleTextView.applyFromPackageItemInfo((PackageItemInfo) itemInfo);
                            }
                            Drawable drawable2 = bubbleTextView.mIcon;
                            if (drawable2 instanceof FastBitmapDrawable) {
                                ((FastBitmapDrawable) drawable2).setState(state);
                            }
                            bubbleTextView.mDisableRelayout = false;
                        }
                    }
                });
            }
        };
        this.mWorkerHandler.post(r0);
        return new IconLoadRequest(r0, this.mWorkerHandler);
    }

    public final synchronized void updateIconsForPkg(String str, UserHandleCompat userHandleCompat) {
        removeIconsForPkg(str, userHandleCompat);
        try {
            PackageInfo packageInfo = this.mPackageManager.getPackageInfo(str, 8192);
            long serialNumberForUser = this.mUserManager.getSerialNumberForUser(userHandleCompat);
            for (LauncherActivityInfoCompat addIconToDBAndMemCache : this.mLauncherApps.getActivityList(str, userHandleCompat)) {
                addIconToDBAndMemCache(addIconToDBAndMemCache, packageInfo, serialNumberForUser);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("Launcher.IconCache", "Package not found", e);
        }
    }

    public final void updateSystemStateString() {
        String locale = Locale.getDefault().toString();
        int i = Build.VERSION.SDK_INT;
        this.mSystemState = locale + "," + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void updateTitleAndIcon(com.android.launcher3.AppInfo r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            android.content.ComponentName r1 = r7.componentName     // Catch:{ all -> 0x0032 }
            r2 = 0
            com.android.launcher3.compat.UserHandleCompat r3 = r7.user     // Catch:{ all -> 0x0032 }
            r4 = 0
            boolean r5 = r7.usingLowResIcon     // Catch:{ all -> 0x0032 }
            r0 = r6
            com.android.launcher3.IconCache$CacheEntry r0 = r0.cacheLocked(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0032 }
            android.graphics.Bitmap r1 = r0.icon     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            com.android.launcher3.compat.UserHandleCompat r2 = r7.user     // Catch:{ all -> 0x0032 }
            boolean r1 = r6.isDefaultIcon(r1, r2)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
            java.lang.CharSequence r1 = r0.title     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = com.android.launcher3.Utilities.trim(r1)     // Catch:{ all -> 0x0032 }
            r7.title = r1     // Catch:{ all -> 0x0032 }
            android.graphics.Bitmap r1 = r0.icon     // Catch:{ all -> 0x0032 }
            r7.iconBitmap = r1     // Catch:{ all -> 0x0032 }
            java.lang.CharSequence r1 = r0.contentDescription     // Catch:{ all -> 0x0032 }
            r7.contentDescription = r1     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.isLowResIcon     // Catch:{ all -> 0x0032 }
            r7.usingLowResIcon = r0     // Catch:{ all -> 0x0032 }
            monitor-exit(r6)
            return
        L_0x0030:
            monitor-exit(r6)
            return
        L_0x0032:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.IconCache.updateTitleAndIcon(com.android.launcher3.AppInfo):void");
    }

    public final Drawable getFullResIcon(String str, int i) {
        Resources resources;
        try {
            resources = this.mPackageManager.getResourcesForApplication(str);
        } catch (PackageManager.NameNotFoundException unused) {
            resources = null;
        }
        if (resources == null || i == 0) {
            return getFullResDefaultActivityIcon();
        }
        return getFullResIcon(resources, i);
    }

    public final synchronized void getTitleAndIcon(ShortcutInfo shortcutInfo, ComponentName componentName, LauncherActivityInfoCompat launcherActivityInfoCompat, UserHandleCompat userHandleCompat, boolean z, boolean z2) {
        CacheEntry cacheLocked = cacheLocked(componentName, launcherActivityInfoCompat, userHandleCompat, z, z2);
        shortcutInfo.mIcon = getNonNullIcon(cacheLocked, userHandleCompat);
        shortcutInfo.title = Utilities.trim(cacheLocked.title);
        shortcutInfo.usingFallbackIcon = isDefaultIcon(cacheLocked.icon, userHandleCompat);
        shortcutInfo.usingLowResIcon = cacheLocked.isLowResIcon;
    }

    public final synchronized void getTitleAndIcon(ShortcutInfo shortcutInfo, Intent intent, UserHandleCompat userHandleCompat, boolean z) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            shortcutInfo.mIcon = getDefaultIcon(userHandleCompat);
            shortcutInfo.title = BuildConfig.FLAVOR;
            shortcutInfo.usingFallbackIcon = true;
            shortcutInfo.usingLowResIcon = false;
            return;
        }
        getTitleAndIcon(shortcutInfo, component, this.mLauncherApps.resolveActivity(intent, userHandleCompat), userHandleCompat, true, z);
    }
}
