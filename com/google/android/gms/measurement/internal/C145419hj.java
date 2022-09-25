package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;
import java.net.URL;

/* renamed from: com.google.android.gms.measurement.internal.hj */
/* compiled from: PG */
final class C145419hj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145420hk f393159a;

    /* renamed from: b */
    public final C145359fd f393160b;

    /* renamed from: c */
    private final URL f393161c;

    public C145419hj(C145420hk hkVar, String str, URL url, C145359fd fdVar) {
        this.f393159a = hkVar;
        C143919bh.m233969l(str);
        this.f393161c = url;
        this.f393160b = fdVar;
    }

    /* renamed from: a */
    private final void m236337a(int i, Exception exc, byte[] bArr) {
        this.f393159a.f393011w.mo120966as().mo120960h(new C145418hi(this, i, exc, bArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069 A[SYNTHETIC, Splitter:B:29:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.hk r0 = r8.f393159a
            r0.mo121001I()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.hk r2 = r8.f393159a     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            java.net.URL r3 = r8.f393161c     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            if (r4 == 0) goto L_0x0075
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            r3.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            com.google.android.gms.measurement.internal.ff r4 = r2.f393011w     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            com.google.android.gms.measurement.internal.ab r4 = r4.f392937g     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            com.google.android.gms.measurement.internal.ab r2 = r2.f392937g     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0073, all -> 0x0071 }
            r3.getHeaderFields()     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0065 }
            r4.<init>()     // Catch:{ all -> 0x0065 }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ all -> 0x0065 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0063 }
        L_0x0047:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x0063 }
            if (r7 <= 0) goto L_0x0051
            r4.write(r6, r0, r7)     // Catch:{ all -> 0x0063 }
            goto L_0x0047
        L_0x0051:
            byte[] r0 = r4.toByteArray()     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x005a
            r5.close()     // Catch:{ IOException -> 0x006f, all -> 0x006d }
        L_0x005a:
            if (r3 == 0) goto L_0x005f
            r3.disconnect()
        L_0x005f:
            r8.m236337a(r2, r1, r0)
            return
        L_0x0063:
            r0 = move-exception
            goto L_0x0067
        L_0x0065:
            r0 = move-exception
            r5 = r1
        L_0x0067:
            if (r5 == 0) goto L_0x006c
            r5.close()     // Catch:{ IOException -> 0x006f, all -> 0x006d }
        L_0x006c:
            throw r0     // Catch:{ IOException -> 0x006f, all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            goto L_0x0081
        L_0x006f:
            r0 = move-exception
            goto L_0x008e
        L_0x0071:
            r2 = move-exception
            goto L_0x007f
        L_0x0073:
            r2 = move-exception
            goto L_0x008c
        L_0x0075:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x008a, all -> 0x007d }
            throw r2     // Catch:{ IOException -> 0x008a, all -> 0x007d }
        L_0x007d:
            r2 = move-exception
            r3 = r1
        L_0x007f:
            r0 = r2
            r2 = 0
        L_0x0081:
            if (r3 == 0) goto L_0x0086
            r3.disconnect()
        L_0x0086:
            r8.m236337a(r2, r1, r1)
            throw r0
        L_0x008a:
            r2 = move-exception
            r3 = r1
        L_0x008c:
            r0 = r2
            r2 = 0
        L_0x008e:
            if (r3 == 0) goto L_0x0093
            r3.disconnect()
        L_0x0093:
            r8.m236337a(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145419hj.run():void");
    }
}
