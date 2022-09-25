package com.google.android.libraries.p1963i.p1968d;

import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.i.d.d */
/* compiled from: PG */
public final class C23891d {

    /* renamed from: a */
    private static final C59071e f65368a = C59071e.m91332i("com.google.android.libraries.i.d.d");

    /* JADX WARNING: Can't wrap try/catch for region: R(2:49|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r10 == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r11 != 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r12 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r11 != 1) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0096 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.libraries.p1963i.p1968d.C23892e m44463a(java.io.File r19) {
        /*
            boolean r0 = r19.isDirectory()
            if (r0 == 0) goto L_0x0009
            com.google.android.libraries.i.d.e r0 = com.google.android.libraries.p1963i.p1968d.C23892e.f65369d
            return r0
        L_0x0009:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            r0 = 62
            byte[] r2 = new byte[r0]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x009f, ParseException -> 0x009d }
            r4 = r19
            r3.<init>(r4)     // Catch:{ IOException -> 0x0099, ParseException -> 0x0097 }
            r5 = 1
            r6 = 0
            int r0 = com.google.common.p4541l.C59332o.m92210a(r3, r2, r6, r0)     // Catch:{ all -> 0x0079 }
            r9 = -1
            r12 = r9
            r14 = r12
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0025:
            r16 = 0
        L_0x0027:
            if (r9 >= r0) goto L_0x0061
            int r18 = r9 + 1
            byte r9 = r2[r9]     // Catch:{ all -> 0x0079 }
            r7 = 32
            if (r9 != r7) goto L_0x0042
            if (r10 == 0) goto L_0x0061
            if (r11 != 0) goto L_0x0038
            r12 = r16
            goto L_0x003c
        L_0x0038:
            if (r11 != r5) goto L_0x0061
            r14 = r16
        L_0x003c:
            int r11 = r11 + 1
            r9 = r18
            r10 = 0
            goto L_0x0025
        L_0x0042:
            r7 = 48
            if (r9 < r7) goto L_0x0061
            r7 = 57
            if (r9 <= r7) goto L_0x004b
            goto L_0x0061
        L_0x004b:
            r7 = 922337203685477580(0xccccccccccccccc, double:5.1488004017107686E-247)
            int r10 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0061
            r7 = 10
            long r16 = r16 * r7
            int r9 = r9 + -48
            long r7 = (long) r9     // Catch:{ all -> 0x0079 }
            long r16 = r16 + r7
            r9 = r18
            r10 = 1
            goto L_0x0027
        L_0x0061:
            r0 = 2
            if (r11 != r0) goto L_0x0071
            com.google.android.libraries.i.d.a r0 = new com.google.android.libraries.i.d.a     // Catch:{ all -> 0x0079 }
            r11 = r0
            r11.<init>(r12, r14, r16)     // Catch:{ all -> 0x0079 }
            r3.close()     // Catch:{ IOException -> 0x0099, ParseException -> 0x0097 }
            android.os.StrictMode.setThreadPolicy(r1)
            return r0
        L_0x0071:
            java.text.ParseException r0 = new java.text.ParseException     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "Failed to parse SchedStat"
            r0.<init>(r2, r11)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            r2 = r0
            r3.close()     // Catch:{ all -> 0x007f }
            goto L_0x0096
        L_0x007f:
            r0 = move-exception
            r3 = r0
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0096 }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            r0[r6] = r7     // Catch:{ Exception -> 0x0096 }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r8, r0)     // Catch:{ Exception -> 0x0096 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0096 }
            r5[r6] = r3     // Catch:{ Exception -> 0x0096 }
            r0.invoke(r2, r5)     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            throw r2     // Catch:{ IOException -> 0x0099, ParseException -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            goto L_0x00a2
        L_0x0099:
            r0 = move-exception
            goto L_0x00a2
        L_0x009b:
            r0 = move-exception
            goto L_0x00c8
        L_0x009d:
            r0 = move-exception
            goto L_0x00a0
        L_0x009f:
            r0 = move-exception
        L_0x00a0:
            r4 = r19
        L_0x00a2:
            com.google.common.f.e r2 = f65368a     // Catch:{ all -> 0x009b }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x009b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x009b }
            com.google.common.f.x r0 = r2.mo56382g(r0)     // Catch:{ all -> 0x009b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x009b }
            r2 = 47942(0xbb46, float:6.7181E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x009b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "Failed to read SchedStat for thread %s"
            java.lang.String r3 = r19.getName()     // Catch:{ all -> 0x009b }
            r0.mo56389s(r2, r3)     // Catch:{ all -> 0x009b }
            com.google.android.libraries.i.d.e r0 = com.google.android.libraries.p1963i.p1968d.C23892e.f65369d     // Catch:{ all -> 0x009b }
            android.os.StrictMode.setThreadPolicy(r1)
            return r0
        L_0x00c8:
            android.os.StrictMode.setThreadPolicy(r1)
            goto L_0x00cd
        L_0x00cc:
            throw r0
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1963i.p1968d.C23891d.m44463a(java.io.File):com.google.android.libraries.i.d.e");
    }
}
