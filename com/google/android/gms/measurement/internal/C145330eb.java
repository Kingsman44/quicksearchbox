package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.eb */
/* compiled from: PG */
final class C145330eb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145331ec f392815a;

    /* renamed from: b */
    private final URL f392816b;

    /* renamed from: c */
    private final byte[] f392817c;

    /* renamed from: d */
    private final C145327dz f392818d;

    /* renamed from: e */
    private final String f392819e;

    /* renamed from: f */
    private final Map f392820f;

    public C145330eb(C145331ec ecVar, String str, URL url, byte[] bArr, Map map, C145327dz dzVar) {
        this.f392815a = ecVar;
        C143919bh.m233969l(str);
        C143919bh.m233958a(dzVar);
        this.f392816b = url;
        this.f392817c = bArr;
        this.f392818d = dzVar;
        this.f392819e = str;
        this.f392820f = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f3 A[SYNTHETIC, Splitter:B:46:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0123 A[SYNTHETIC, Splitter:B:68:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0160 A[SYNTHETIC, Splitter:B:81:0x0160] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.ec r1 = r13.f392815a
            r1.mo121001I()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.ec r3 = r13.f392815a     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            java.net.URL r4 = r13.f392816b     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            if (r5 == 0) goto L_0x0114
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            com.google.android.gms.measurement.internal.ff r5 = r3.f393011w     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            com.google.android.gms.measurement.internal.ab r5 = r5.f392937g     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            com.google.android.gms.measurement.internal.ab r3 = r3.f392937g     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            java.util.Map r5 = r13.f392820f     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r5 == 0) goto L_0x005d
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
        L_0x0041:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r6 == 0) goto L_0x005d
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            goto L_0x0041
        L_0x005d:
            byte[] r5 = r13.f392817c     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r5 == 0) goto L_0x00a9
            com.google.android.gms.measurement.internal.ec r5 = r13.f392815a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.jy r5 = r5.f393327l     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.ka r5 = r5.f393359g     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r5)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            byte[] r6 = r13.f392817c     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            byte[] r5 = r5.mo121245w(r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.ec r6 = r13.f392815a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.ff r6 = r6.f393011w     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.dx r6 = r6.mo120965ar()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.dv r6 = r6.f392803k     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            int r7 = r5.length     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r8 = "Uploading data. size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r6.mo120895b(r8, r9)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.setFixedLengthStreamingMode(r7)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.connect()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r3.write(r5)     // Catch:{ IOException -> 0x00a4, all -> 0x009f }
            r3.close()     // Catch:{ IOException -> 0x00a4, all -> 0x009f }
            goto L_0x00a9
        L_0x009f:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x0120
        L_0x00a4:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x015c
        L_0x00a9:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x0107, all -> 0x0103 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00ef }
            r3.<init>()     // Catch:{ all -> 0x00ef }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00ef }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00ed }
        L_0x00be:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00ed }
            if (r7 <= 0) goto L_0x00c8
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00ed }
            goto L_0x00be
        L_0x00c8:
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00ed }
            if (r5 == 0) goto L_0x00d1
            r5.close()     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
        L_0x00d1:
            if (r4 == 0) goto L_0x00d6
            r4.disconnect()
        L_0x00d6:
            com.google.android.gms.measurement.internal.ec r0 = r13.f392815a
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()
            com.google.android.gms.measurement.internal.ea r1 = new com.google.android.gms.measurement.internal.ea
            java.lang.String r6 = r13.f392819e
            com.google.android.gms.measurement.internal.dz r7 = r13.f392818d
            r9 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00e9:
            r0.mo120960h(r1)
            return
        L_0x00ed:
            r1 = move-exception
            goto L_0x00f1
        L_0x00ef:
            r1 = move-exception
            r5 = r2
        L_0x00f1:
            if (r5 == 0) goto L_0x00f6
            r5.close()     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
        L_0x00f6:
            throw r1     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
        L_0x00f7:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x0121
        L_0x00fc:
            r1 = move-exception
            r5 = r1
            r10 = r5
            r9 = r8
            r12 = r11
            goto L_0x015e
        L_0x0103:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x0121
        L_0x0107:
            r5 = move-exception
            r12 = r2
            r10 = r5
            r9 = r8
            goto L_0x015e
        L_0x010c:
            r3 = move-exception
            r12 = r2
            r5 = r3
            goto L_0x0120
        L_0x0110:
            r3 = move-exception
            r12 = r2
            r10 = r3
            goto L_0x015d
        L_0x0114:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0158, all -> 0x011c }
            throw r3     // Catch:{ IOException -> 0x0158, all -> 0x011c }
        L_0x011c:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x0120:
            r9 = 0
        L_0x0121:
            if (r2 == 0) goto L_0x013b
            r2.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x013b
        L_0x0127:
            r1 = move-exception
            com.google.android.gms.measurement.internal.ec r2 = r13.f392815a
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c
            java.lang.String r3 = r13.f392819e
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)
            r2.mo120896c(r0, r3, r1)
        L_0x013b:
            if (r4 == 0) goto L_0x0140
            r4.disconnect()
        L_0x0140:
            com.google.android.gms.measurement.internal.ec r0 = r13.f392815a
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()
            com.google.android.gms.measurement.internal.ea r1 = new com.google.android.gms.measurement.internal.ea
            java.lang.String r7 = r13.f392819e
            com.google.android.gms.measurement.internal.dz r8 = r13.f392818d
            r10 = 0
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.mo120960h(r1)
            throw r5
        L_0x0158:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x015c:
            r10 = r5
        L_0x015d:
            r9 = 0
        L_0x015e:
            if (r2 == 0) goto L_0x0178
            r2.close()     // Catch:{ IOException -> 0x0164 }
            goto L_0x0178
        L_0x0164:
            r1 = move-exception
            com.google.android.gms.measurement.internal.ec r2 = r13.f392815a
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c
            java.lang.String r3 = r13.f392819e
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)
            r2.mo120896c(r0, r3, r1)
        L_0x0178:
            if (r4 == 0) goto L_0x017d
            r4.disconnect()
        L_0x017d:
            com.google.android.gms.measurement.internal.ec r0 = r13.f392815a
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w
            com.google.android.gms.measurement.internal.fc r0 = r0.mo120966as()
            com.google.android.gms.measurement.internal.ea r1 = new com.google.android.gms.measurement.internal.ea
            java.lang.String r7 = r13.f392819e
            com.google.android.gms.measurement.internal.dz r8 = r13.f392818d
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145330eb.run():void");
    }
}
