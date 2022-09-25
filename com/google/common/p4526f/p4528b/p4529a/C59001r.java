package com.google.common.p4526f.p4528b.p4529a;

/* renamed from: com.google.common.f.b.a.r */
/* compiled from: PG */
public final /* synthetic */ class C59001r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C59002s f156869a;

    /* renamed from: b */
    public final /* synthetic */ String f156870b;

    public /* synthetic */ C59001r(C59002s sVar, String str) {
        this.f156869a = sVar;
        this.f156870b = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:14|(2:16|17)|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.common.f.b.a.s r0 = r11.f156869a
            java.lang.String r1 = r11.f156870b
            com.google.common.p4526f.p4528b.p4529a.C59002s.m91192c()
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r3 = new android.os.StrictMode$ThreadPolicy$Builder
            r3.<init>(r2)
            android.os.StrictMode$ThreadPolicy$Builder r3 = r3.permitUnbufferedIo()
            android.os.StrictMode$ThreadPolicy r3 = r3.build()
            android.os.StrictMode.setThreadPolicy(r3)
            byte[] r3 = r1.getBytes()     // Catch:{ IOException -> 0x0083 }
            int r3 = r3.length     // Catch:{ IOException -> 0x0083 }
            long r3 = (long) r3     // Catch:{ IOException -> 0x0083 }
            long r5 = r0.f156876f     // Catch:{ IOException -> 0x0083 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0076
            com.google.common.p4526f.p4528b.p4529a.C59002s.m91192c()     // Catch:{ IOException -> 0x0083 }
            com.google.common.base.cr r5 = r0.f156874d     // Catch:{ IOException -> 0x0083 }
            java.lang.Object r5 = r5.mo6453a()     // Catch:{ IOException -> 0x0083 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ IOException -> 0x0083 }
            java.io.PrintWriter r6 = r0.f156878h     // Catch:{ IOException -> 0x0083 }
            if (r6 != 0) goto L_0x0050
            boolean r6 = r5.exists()     // Catch:{ IOException -> 0x0083 }
            if (r6 == 0) goto L_0x004a
            long r6 = r5.length()     // Catch:{ IOException -> 0x0083 }
            long r6 = r6 + r3
            long r8 = r0.f156876f     // Catch:{ IOException -> 0x0083 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x004a
            r0.mo56269d()     // Catch:{ IOException -> 0x0083 }
        L_0x004a:
            java.io.PrintWriter r6 = r0.mo56268b()     // Catch:{ IOException -> 0x0083 }
            r0.f156878h = r6     // Catch:{ IOException -> 0x0083 }
        L_0x0050:
            long r5 = r5.length()     // Catch:{ IOException -> 0x0083 }
            long r5 = r5 + r3
            long r3 = r0.f156876f     // Catch:{ IOException -> 0x0083 }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x006b
            java.io.PrintWriter r3 = r0.f156878h     // Catch:{ IOException -> 0x0083 }
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            r0.mo56269d()     // Catch:{ IOException -> 0x0083 }
            java.io.PrintWriter r3 = r0.mo56268b()     // Catch:{ IOException -> 0x0083 }
            r0.f156878h = r3     // Catch:{ IOException -> 0x0083 }
        L_0x006b:
            java.io.PrintWriter r3 = r0.f156878h     // Catch:{ IOException -> 0x0083 }
            r3.println(r1)     // Catch:{ IOException -> 0x0083 }
            java.io.PrintWriter r0 = r0.f156878h     // Catch:{ IOException -> 0x0083 }
            r0.flush()     // Catch:{ IOException -> 0x0083 }
            goto L_0x007d
        L_0x0076:
            java.lang.String r0 = com.google.common.p4526f.p4528b.p4529a.C59002s.f156871a     // Catch:{ IOException -> 0x0083 }
            java.lang.String r1 = "The message is too large to log internally."
            android.util.Log.w(r0, r1)     // Catch:{ IOException -> 0x0083 }
        L_0x007d:
            android.os.StrictMode.setThreadPolicy(r2)
            return
        L_0x0081:
            r0 = move-exception
            goto L_0x008f
        L_0x0083:
            r0 = move-exception
            java.lang.String r1 = com.google.common.p4526f.p4528b.p4529a.C59002s.f156871a     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "Unable to write to file log."
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0081 }
            android.os.StrictMode.setThreadPolicy(r2)
            return
        L_0x008f:
            android.os.StrictMode.setThreadPolicy(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4526f.p4528b.p4529a.C59001r.run():void");
    }
}
