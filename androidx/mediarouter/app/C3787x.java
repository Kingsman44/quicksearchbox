package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.core.p097i.C1968c;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: androidx.mediarouter.app.x */
/* compiled from: PG */
final class C3787x extends AsyncTask {

    /* renamed from: a */
    public final Bitmap f12209a;

    /* renamed from: b */
    public final Uri f12210b;

    /* renamed from: c */
    final /* synthetic */ C3758ad f12211c;

    /* renamed from: d */
    private int f12212d;

    /* renamed from: e */
    private long f12213e;

    public C3787x(C3758ad adVar) {
        Bitmap bitmap;
        this.f12211c = adVar;
        MediaDescriptionCompat mediaDescriptionCompat = adVar.f12090G;
        Uri uri = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f936e;
        }
        if (C3758ad.m10899x(bitmap)) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.f12209a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = adVar.f12090G;
        this.f12210b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f937f : uri;
    }

    /* renamed from: a */
    private final InputStream m10950a(Uri uri) {
        InputStream inputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStream = this.f12211c.f12126g.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(C3758ad.f12083d);
            openConnection.setReadTimeout(C3758ad.f12083d);
            inputStream = openConnection.getInputStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStream);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|(2:18|65)|21|(1:(1:66))(4:26|27|(2:29|30)|32)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[Catch:{ IOException -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae A[SYNTHETIC, Splitter:B:41:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6 A[SYNTHETIC, Splitter:B:45:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Unable to open: "
            java.lang.Void[] r10 = (java.lang.Void[]) r10
            android.graphics.Bitmap r10 = r9.f12209a
            r1 = 0
            r2 = 1
            java.lang.String r3 = "MediaRouteCtrlDialog"
            r4 = 0
            if (r10 != 0) goto L_0x00bb
            android.net.Uri r10 = r9.f12210b
            if (r10 == 0) goto L_0x00ba
            java.io.InputStream r10 = r9.m10950a(r10)     // Catch:{ IOException -> 0x0099, all -> 0x0097 }
            if (r10 != 0) goto L_0x002a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x005f }
            android.net.Uri r6 = r9.f12210b     // Catch:{ IOException -> 0x005f }
            r5.append(r6)     // Catch:{ IOException -> 0x005f }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x005f }
            android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x005f }
            goto L_0x010c
        L_0x002a:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x005f }
            r5.<init>()     // Catch:{ IOException -> 0x005f }
            r5.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x005f }
            android.graphics.BitmapFactory.decodeStream(r10, r4, r5)     // Catch:{ IOException -> 0x005f }
            int r6 = r5.outWidth     // Catch:{ IOException -> 0x005f }
            if (r6 == 0) goto L_0x0082
            int r6 = r5.outHeight     // Catch:{ IOException -> 0x005f }
            if (r6 != 0) goto L_0x003d
            goto L_0x0082
        L_0x003d:
            r10.reset()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0061
        L_0x0041:
            r10.close()     // Catch:{ IOException -> 0x005f }
            android.net.Uri r6 = r9.f12210b     // Catch:{ IOException -> 0x005f }
            java.io.InputStream r10 = r9.m10950a(r6)     // Catch:{ IOException -> 0x005f }
            if (r10 != 0) goto L_0x0061
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x005f }
            android.net.Uri r6 = r9.f12210b     // Catch:{ IOException -> 0x005f }
            r5.append(r6)     // Catch:{ IOException -> 0x005f }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x005f }
            android.util.Log.w(r3, r5)     // Catch:{ IOException -> 0x005f }
            goto L_0x010c
        L_0x005f:
            r5 = move-exception
            goto L_0x009b
        L_0x0061:
            r5.inJustDecodeBounds = r1     // Catch:{ IOException -> 0x005f }
            androidx.mediarouter.app.ad r6 = r9.f12211c     // Catch:{ IOException -> 0x005f }
            int r7 = r5.outWidth     // Catch:{ IOException -> 0x005f }
            int r8 = r5.outHeight     // Catch:{ IOException -> 0x005f }
            int r6 = r6.mo7959g(r7, r8)     // Catch:{ IOException -> 0x005f }
            int r7 = r5.outHeight     // Catch:{ IOException -> 0x005f }
            int r7 = r7 / r6
            int r6 = java.lang.Integer.highestOneBit(r7)     // Catch:{ IOException -> 0x005f }
            int r6 = java.lang.Math.max(r2, r6)     // Catch:{ IOException -> 0x005f }
            r5.inSampleSize = r6     // Catch:{ IOException -> 0x005f }
            boolean r6 = r9.isCancelled()     // Catch:{ IOException -> 0x005f }
            if (r6 == 0) goto L_0x0087
            if (r10 == 0) goto L_0x010c
        L_0x0082:
            r10.close()     // Catch:{ IOException -> 0x010c }
            goto L_0x010c
        L_0x0087:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r10, r4, r5)     // Catch:{ IOException -> 0x005f }
            if (r10 == 0) goto L_0x0092
            r10.close()     // Catch:{ IOException -> 0x0091 }
            goto L_0x0092
        L_0x0091:
        L_0x0092:
            r10 = r0
            goto L_0x00bb
        L_0x0094:
            r0 = move-exception
            r4 = r10
            goto L_0x00b4
        L_0x0097:
            r0 = move-exception
            goto L_0x00b4
        L_0x0099:
            r5 = move-exception
            r10 = r4
        L_0x009b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r6.<init>(r0)     // Catch:{ all -> 0x0094 }
            android.net.Uri r0 = r9.f12210b     // Catch:{ all -> 0x0094 }
            r6.append(r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0094 }
            android.util.Log.w(r3, r0, r5)     // Catch:{ all -> 0x0094 }
            if (r10 == 0) goto L_0x00ba
            r10.close()     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00ba
        L_0x00b2:
            goto L_0x00ba
        L_0x00b4:
            if (r4 == 0) goto L_0x00b9
            r4.close()     // Catch:{ IOException -> 0x00b9 }
        L_0x00b9:
            throw r0
        L_0x00ba:
            r10 = r4
        L_0x00bb:
            boolean r0 = androidx.mediarouter.app.C3758ad.m10899x(r10)
            if (r0 == 0) goto L_0x00d7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't use recycled bitmap: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r1.concat(r10)
            android.util.Log.w(r3, r10)
            goto L_0x010c
        L_0x00d7:
            if (r10 == 0) goto L_0x010b
            int r0 = r10.getWidth()
            int r3 = r10.getHeight()
            if (r0 >= r3) goto L_0x010b
            androidx.n.a.f r0 = new androidx.n.a.f
            r0.<init>(r10)
            r0.f12234a = r2
            androidx.n.a.i r0 = r0.mo8023a()
            java.util.List r2 = r0.f12248a
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00fb
            goto L_0x0109
        L_0x00fb:
            java.util.List r0 = r0.f12248a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r0 = r0.get(r1)
            androidx.n.a.h r0 = (androidx.p176n.p177a.C3797h) r0
            int r1 = r0.f12238a
        L_0x0109:
            r9.f12212d = r1
        L_0x010b:
            r4 = r10
        L_0x010c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C3787x.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C3758ad adVar = this.f12211c;
        adVar.f12091H = null;
        if (!C1968c.m5305b(adVar.f12092I, this.f12209a) || !C1968c.m5305b(this.f12211c.f12093J, this.f12210b)) {
            C3758ad adVar2 = this.f12211c;
            adVar2.f12092I = this.f12209a;
            adVar2.f12095L = bitmap;
            adVar2.f12093J = this.f12210b;
            adVar2.f12096M = this.f12212d;
            boolean z = true;
            adVar2.f12094K = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.f12213e;
            C3758ad adVar3 = this.f12211c;
            if (uptimeMillis - j <= 120) {
                z = false;
            }
            adVar3.mo7968q(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        this.f12213e = SystemClock.uptimeMillis();
        this.f12211c.mo7963k();
    }
}
