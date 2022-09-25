package com.android.p261d.p262a;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import com.android.launcher3.NycWallpaperUtils;
import com.android.launcher3.Utilities;
import com.google.android.googlequicksearchbox.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.android.d.a.c */
/* compiled from: PG */
public class C5039c extends AsyncTask {
    Context mContext;
    public RectF mCropBounds;
    public Bitmap mCroppedBitmap;
    byte[] mInImageBytes;
    final int mInResId;
    final Uri mInUri;
    public boolean mNoCrop;
    public C5037a mOnBitmapCroppedHandler;
    public C5038b mOnEndCropHandler;
    int mOutHeight;
    int mOutWidth;
    Resources mResources;
    int mRotation;
    boolean mSaveCroppedBitmap;
    boolean mSetWallpaper;

    public C5039c(Context context, Resources resources, int i, RectF rectF, int i2, int i3, int i4, boolean z, boolean z2, C5038b bVar) {
        this.mInUri = null;
        this.mCropBounds = null;
        this.mContext = context;
        this.mInResId = i;
        this.mResources = resources;
        init(rectF, i2, i3, i4, z, z2, bVar);
    }

    private final void init(RectF rectF, int i, int i2, int i3, boolean z, boolean z2, C5038b bVar) {
        this.mCropBounds = rectF;
        this.mRotation = i;
        this.mOutWidth = i2;
        this.mOutHeight = i3;
        this.mSetWallpaper = z;
        this.mSaveCroppedBitmap = z2;
        this.mOnEndCropHandler = bVar;
    }

    private final void setWallpaper(InputStream inputStream, Rect rect, int i) {
        if (!Utilities.ATLEAST_NOUGAT) {
            WallpaperManager.getInstance(this.mContext.getApplicationContext()).setStream(inputStream);
        } else {
            NycWallpaperUtils.setStream$ar$ds(this.mContext, inputStream, rect, i);
        }
    }

    /* access modifiers changed from: protected */
    public Boolean doInBackground(Integer... numArr) {
        return Boolean.valueOf(cropBitmap(numArr.length == 0 ? 1 : numArr[0].intValue()));
    }

    public final Point getImageBounds() {
        InputStream regenerateInputStream = regenerateInputStream();
        if (regenerateInputStream != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(regenerateInputStream, (Rect) null, options);
            C5041e.m13845d(regenerateInputStream);
            if (!(options.outWidth == 0 || options.outHeight == 0)) {
                return new Point(options.outWidth, options.outHeight);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            Toast.makeText(this.mContext, R.string.wallpaper_set_fail, 0).show();
        }
        C5038b bVar = this.mOnEndCropHandler;
        if (bVar != null) {
            bVar.run(bool.booleanValue());
        }
    }

    public C5039c(Context context, Uri uri, RectF rectF, int i, int i2, int i3, boolean z, boolean z2, C5038b bVar) {
        this.mInResId = 0;
        this.mCropBounds = null;
        this.mContext = context;
        this.mInUri = uri;
        init(rectF, i, i2, i3, z, z2, bVar);
    }

    public C5039c(byte[] bArr, int i, int i2, int i3) {
        this.mInUri = null;
        this.mInResId = 0;
        this.mCropBounds = null;
        this.mInImageBytes = bArr;
        init((RectF) null, i, i2, i3, false, true, (C5038b) null);
    }

    private final InputStream regenerateInputStream() {
        Uri uri = this.mInUri;
        if (uri == null && this.mInResId == 0 && this.mInImageBytes == null) {
            Log.w("BitmapCropTask", "cannot read original file, no input URI, resource ID, or image byte array given");
            return null;
        } else if (uri != null) {
            try {
                return new BufferedInputStream(this.mContext.getContentResolver().openInputStream(this.mInUri));
            } catch (FileNotFoundException e) {
                Log.w("BitmapCropTask", "cannot read file: ".concat(String.valueOf(this.mInUri.toString())), e);
                return null;
            }
        } else {
            byte[] bArr = this.mInImageBytes;
            if (bArr != null) {
                return new BufferedInputStream(new ByteArrayInputStream(bArr));
            }
            return new BufferedInputStream(this.mResources.openRawResource(this.mInResId));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0246  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cropBitmap(int r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            boolean r0 = r1.mSetWallpaper
            java.lang.String r3 = "cannot write stream to wallpaper"
            java.lang.String r4 = "BitmapCropTask"
            r5 = 0
            r6 = 1
            r7 = 0
            java.lang.String r8 = "cannot open region decoder for file: "
            java.lang.String r9 = "cannot get input stream for uri="
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r1.mNoCrop
            if (r0 == 0) goto L_0x0028
            java.io.InputStream r0 = r16.regenerateInputStream()     // Catch:{ IOException -> 0x0022 }
            r1.setWallpaper(r0, r5, r2)     // Catch:{ IOException -> 0x0022 }
            com.android.p261d.p262a.C5041e.m13845d(r0)     // Catch:{ IOException -> 0x0022 }
            goto L_0x0027
        L_0x0022:
            r0 = move-exception
            android.util.Log.w(r4, r3, r0)
            r6 = 0
        L_0x0027:
            return r6
        L_0x0028:
            boolean r0 = com.android.launcher3.Utilities.ATLEAST_NOUGAT
            if (r0 == 0) goto L_0x00a1
            int r0 = r1.mRotation
            if (r0 != 0) goto L_0x00a1
            int r0 = r1.mOutWidth
            if (r0 <= 0) goto L_0x00a1
            int r0 = r1.mOutHeight
            if (r0 <= 0) goto L_0x00a1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.RectF r3 = r1.mCropBounds
            r3.roundOut(r0)
            java.io.InputStream r3 = r16.regenerateInputStream()     // Catch:{ IOException -> 0x0082 }
            if (r3 != 0) goto L_0x005e
            android.net.Uri r0 = r1.mInUri     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            r2.<init>(r9)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            r2.append(r0)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            android.util.Log.w(r4, r0)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            return r7
        L_0x005e:
            android.content.Context r7 = r1.mContext     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            android.app.WallpaperManager r7 = android.app.WallpaperManager.getInstance(r7)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            int r9 = r1.mOutWidth     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            int r10 = r1.mOutHeight     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            r7.suggestDesiredDimensions(r9, r10)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            r1.setWallpaper(r3, r0, r2)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            com.android.d.a.a r2 = r1.mOnBitmapCroppedHandler     // Catch:{ IOException -> 0x007d, all -> 0x007a }
            if (r2 == 0) goto L_0x0075
            r2.onBitmapCropped(r5, r0)     // Catch:{ IOException -> 0x007d, all -> 0x007a }
        L_0x0075:
            com.android.p261d.p262a.C5041e.m13845d(r3)
            goto L_0x0385
        L_0x007a:
            r0 = move-exception
            r5 = r3
            goto L_0x009d
        L_0x007d:
            r0 = move-exception
            r5 = r3
            goto L_0x0083
        L_0x0080:
            r0 = move-exception
            goto L_0x009d
        L_0x0082:
            r0 = move-exception
        L_0x0083:
            android.net.Uri r2 = r1.mInUri     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r3.<init>(r8)     // Catch:{ all -> 0x0080 }
            r3.append(r2)     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0080 }
            android.util.Log.w(r4, r2, r0)     // Catch:{ all -> 0x0080 }
            com.android.p261d.p262a.C5041e.m13845d(r5)
            goto L_0x0385
        L_0x009d:
            com.android.p261d.p262a.C5041e.m13845d(r5)
            throw r0
        L_0x00a1:
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.Point r12 = r16.getImageBounds()
            int r13 = r1.mRotation
            r14 = 2
            r15 = 1073741824(0x40000000, float:2.0)
            if (r13 <= 0) goto L_0x0116
            float r13 = (float) r13
            r11.setRotate(r13)
            int r13 = r1.mRotation
            int r13 = -r13
            float r13 = (float) r13
            r0.setRotate(r13)
            android.graphics.RectF r13 = r1.mCropBounds
            r13.roundOut(r10)
            android.graphics.RectF r13 = new android.graphics.RectF
            r13.<init>(r10)
            r1.mCropBounds = r13
            if (r12 != 0) goto L_0x00da
            java.lang.String r0 = "cannot get bounds for image"
            android.util.Log.w(r4, r0)
            return r7
        L_0x00da:
            float[] r13 = new float[r14]
            int r5 = r12.x
            float r5 = (float) r5
            r13[r7] = r5
            int r5 = r12.y
            float r5 = (float) r5
            r13[r6] = r5
            r11.mapPoints(r13)
            r5 = r13[r7]
            float r5 = java.lang.Math.abs(r5)
            r13[r7] = r5
            r5 = r13[r6]
            float r5 = java.lang.Math.abs(r5)
            r13[r6] = r5
            android.graphics.RectF r6 = r1.mCropBounds
            r13 = r13[r7]
            float r13 = -r13
            float r13 = r13 / r15
            float r5 = -r5
            float r5 = r5 / r15
            r6.offset(r13, r5)
            android.graphics.RectF r5 = r1.mCropBounds
            r0.mapRect(r5)
            android.graphics.RectF r0 = r1.mCropBounds
            int r5 = r12.x
            int r5 = r5 / r14
            float r5 = (float) r5
            int r6 = r12.y
            int r6 = r6 / r14
            float r6 = (float) r6
            r0.offset(r5, r6)
        L_0x0116:
            android.graphics.RectF r0 = r1.mCropBounds
            r0.roundOut(r10)
            int r0 = r10.width()
            if (r0 <= 0) goto L_0x038a
            int r0 = r10.height()
            if (r0 > 0) goto L_0x0129
            goto L_0x038a
        L_0x0129:
            int r0 = r10.width()
            int r5 = r1.mOutWidth
            int r0 = r0 / r5
            int r5 = r10.height()
            int r6 = r1.mOutHeight
            int r5 = r5 / r6
            int r0 = java.lang.Math.min(r0, r5)
            r5 = 1
            int r6 = java.lang.Math.max(r5, r0)
            java.io.InputStream r5 = r16.regenerateInputStream()     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            if (r5 != 0) goto L_0x015c
            android.net.Uri r0 = r1.mInUri     // Catch:{ IOException -> 0x016c }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x016c }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016c }
            r13.<init>(r9)     // Catch:{ IOException -> 0x016c }
            r13.append(r0)     // Catch:{ IOException -> 0x016c }
            java.lang.String r0 = r13.toString()     // Catch:{ IOException -> 0x016c }
            android.util.Log.w(r4, r0)     // Catch:{ IOException -> 0x016c }
            return r7
        L_0x015c:
            android.graphics.BitmapRegionDecoder r9 = android.graphics.BitmapRegionDecoder.newInstance(r5, r7)     // Catch:{ IOException -> 0x016c }
            com.android.p261d.p262a.C5041e.m13845d(r5)     // Catch:{ IOException -> 0x0167 }
        L_0x0163:
            com.android.p261d.p262a.C5041e.m13845d(r5)
            goto L_0x018b
        L_0x0167:
            r0 = move-exception
            goto L_0x0175
        L_0x0169:
            r0 = move-exception
            goto L_0x0386
        L_0x016c:
            r0 = move-exception
            goto L_0x0174
        L_0x016e:
            r0 = move-exception
            r5 = 0
            goto L_0x0386
        L_0x0172:
            r0 = move-exception
            r5 = 0
        L_0x0174:
            r9 = 0
        L_0x0175:
            android.net.Uri r13 = r1.mInUri     // Catch:{ all -> 0x0169 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0169 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r15.<init>(r8)     // Catch:{ all -> 0x0169 }
            r15.append(r13)     // Catch:{ all -> 0x0169 }
            java.lang.String r8 = r15.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.w(r4, r8, r0)     // Catch:{ all -> 0x0169 }
            goto L_0x0163
        L_0x018b:
            if (r9 == 0) goto L_0x019f
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r5 = 1
            if (r6 <= r5) goto L_0x0197
            r0.inSampleSize = r6
        L_0x0197:
            android.graphics.Bitmap r0 = r9.decodeRegion(r10, r0)
            r9.recycle()
            goto L_0x01a0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            if (r0 != 0) goto L_0x0244
            java.io.InputStream r5 = r16.regenerateInputStream()
            if (r5 == 0) goto L_0x01bc
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r9 = 1
            if (r6 <= r9) goto L_0x01b2
            r8.inSampleSize = r6
        L_0x01b2:
            r6 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r5, r6, r8)
            com.android.p261d.p262a.C5041e.m13845d(r5)
            r6 = r8
            goto L_0x01bd
        L_0x01bc:
            r6 = 0
        L_0x01bd:
            if (r6 == 0) goto L_0x0244
            int r0 = r12.x
            int r5 = r6.getWidth()
            int r0 = r0 / r5
            android.graphics.RectF r5 = r1.mCropBounds
            float r0 = (float) r0
            float r8 = r5.left
            float r8 = r8 / r0
            r5.left = r8
            android.graphics.RectF r5 = r1.mCropBounds
            float r8 = r5.top
            float r8 = r8 / r0
            r5.top = r8
            android.graphics.RectF r5 = r1.mCropBounds
            float r8 = r5.bottom
            float r8 = r8 / r0
            r5.bottom = r8
            android.graphics.RectF r5 = r1.mCropBounds
            float r8 = r5.right
            float r8 = r8 / r0
            r5.right = r8
            android.graphics.RectF r0 = r1.mCropBounds
            r0.roundOut(r10)
            int r0 = r10.width()
            int r5 = r6.getWidth()
            if (r0 <= r5) goto L_0x01fb
            int r0 = r10.left
            int r5 = r6.getWidth()
            int r0 = r0 + r5
            r10.right = r0
        L_0x01fb:
            int r0 = r10.right
            int r5 = r6.getWidth()
            if (r0 <= r5) goto L_0x020e
            int r0 = r10.right
            int r5 = r6.getWidth()
            int r0 = r0 - r5
            int r0 = -r0
            r10.offset(r0, r7)
        L_0x020e:
            int r0 = r10.height()
            int r5 = r6.getHeight()
            if (r0 <= r5) goto L_0x0221
            int r0 = r10.top
            int r5 = r6.getHeight()
            int r0 = r0 + r5
            r10.bottom = r0
        L_0x0221:
            int r0 = r10.bottom
            int r5 = r6.getHeight()
            if (r0 <= r5) goto L_0x0234
            int r0 = r10.bottom
            int r5 = r6.getHeight()
            int r0 = r0 - r5
            int r0 = -r0
            r10.offset(r7, r0)
        L_0x0234:
            int r0 = r10.left
            int r5 = r10.top
            int r8 = r10.width()
            int r9 = r10.height()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r6, r0, r5, r8, r9)
        L_0x0244:
            if (r0 != 0) goto L_0x025a
            android.net.Uri r0 = r1.mInUri
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "cannot decode file: "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.w(r4, r0)
            return r7
        L_0x025a:
            int r5 = r1.mOutWidth
            if (r5 <= 0) goto L_0x0262
            int r5 = r1.mOutHeight
            if (r5 > 0) goto L_0x0266
        L_0x0262:
            int r5 = r1.mRotation
            if (r5 <= 0) goto L_0x033a
        L_0x0266:
            float[] r5 = new float[r14]
            int r6 = r0.getWidth()
            float r6 = (float) r6
            r5[r7] = r6
            int r6 = r0.getHeight()
            float r6 = (float) r6
            r8 = 1
            r5[r8] = r6
            r11.mapPoints(r5)
            r6 = r5[r7]
            float r6 = java.lang.Math.abs(r6)
            r5[r7] = r6
            r6 = r5[r8]
            float r6 = java.lang.Math.abs(r6)
            r5[r8] = r6
            int r6 = r1.mOutWidth
            if (r6 <= 0) goto L_0x0292
            int r6 = r1.mOutHeight
            if (r6 > 0) goto L_0x02a2
        L_0x0292:
            r6 = r5[r7]
            int r6 = java.lang.Math.round(r6)
            r1.mOutWidth = r6
            r6 = r5[r8]
            int r6 = java.lang.Math.round(r6)
            r1.mOutHeight = r6
        L_0x02a2:
            android.graphics.RectF r6 = new android.graphics.RectF
            r9 = r5[r7]
            r10 = r5[r8]
            r8 = 0
            r6.<init>(r8, r8, r9, r10)
            android.graphics.RectF r9 = new android.graphics.RectF
            int r10 = r1.mOutWidth
            float r10 = (float) r10
            int r11 = r1.mOutHeight
            float r11 = (float) r11
            r9.<init>(r8, r8, r10, r11)
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            int r10 = r1.mRotation
            if (r10 != 0) goto L_0x02c6
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.FILL
            r8.setRectToRect(r6, r9, r5)
            goto L_0x0315
        L_0x02c6:
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            int r11 = r0.getWidth()
            int r11 = -r11
            float r11 = (float) r11
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            int r13 = r0.getHeight()
            int r13 = -r13
            float r13 = (float) r13
            float r13 = r13 / r12
            r10.setTranslate(r11, r13)
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            int r13 = r1.mRotation
            float r13 = (float) r13
            r11.setRotate(r13)
            android.graphics.Matrix r13 = new android.graphics.Matrix
            r13.<init>()
            r14 = r5[r7]
            float r14 = r14 / r12
            r15 = 1
            r5 = r5[r15]
            float r5 = r5 / r12
            r13.setTranslate(r14, r5)
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            android.graphics.Matrix$ScaleToFit r12 = android.graphics.Matrix.ScaleToFit.FILL
            r5.setRectToRect(r6, r9, r12)
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            r6.setConcat(r11, r10)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r10.setConcat(r5, r13)
            r8.setConcat(r10, r6)
        L_0x0315:
            float r5 = r9.width()
            int r5 = (int) r5
            float r6 = r9.height()
            int r6 = (int) r6
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r9)
            if (r5 == 0) goto L_0x033a
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r5)
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r10 = 1
            r9.setFilterBitmap(r10)
            r6.drawBitmap(r0, r8, r9)
            r0 = r5
            goto L_0x033b
        L_0x033a:
            r10 = 1
        L_0x033b:
            boolean r5 = r1.mSaveCroppedBitmap
            if (r5 == 0) goto L_0x0341
            r1.mCroppedBitmap = r0
        L_0x0341:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r6 = 2048(0x800, float:2.87E-42)
            r5.<init>(r6)
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG
            r8 = 90
            boolean r6 = r0.compress(r6, r8, r5)
            if (r6 == 0) goto L_0x037f
            boolean r6 = r1.mSetWallpaper
            if (r6 == 0) goto L_0x037d
            byte[] r5 = r5.toByteArray()     // Catch:{ IOException -> 0x0378 }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0378 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0378 }
            r8 = 0
            r1.setWallpaper(r6, r8, r2)     // Catch:{ IOException -> 0x0378 }
            com.android.d.a.a r2 = r1.mOnBitmapCroppedHandler     // Catch:{ IOException -> 0x0378 }
            if (r2 == 0) goto L_0x037d
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ IOException -> 0x0378 }
            int r8 = r0.getWidth()     // Catch:{ IOException -> 0x0378 }
            int r0 = r0.getHeight()     // Catch:{ IOException -> 0x0378 }
            r6.<init>(r7, r7, r8, r0)     // Catch:{ IOException -> 0x0378 }
            r2.onBitmapCropped(r5, r6)     // Catch:{ IOException -> 0x0378 }
            goto L_0x037d
        L_0x0378:
            r0 = move-exception
            android.util.Log.w(r4, r3, r0)
            goto L_0x0384
        L_0x037d:
            r6 = 1
            goto L_0x0385
        L_0x037f:
            java.lang.String r0 = "cannot compress bitmap"
            android.util.Log.w(r4, r0)
        L_0x0384:
            r6 = 0
        L_0x0385:
            return r6
        L_0x0386:
            com.android.p261d.p262a.C5041e.m13845d(r5)
            throw r0
        L_0x038a:
            java.lang.String r0 = "crop has bad values for full size image"
            android.util.Log.w(r4, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p261d.p262a.C5039c.cropBitmap(int):boolean");
    }
}
