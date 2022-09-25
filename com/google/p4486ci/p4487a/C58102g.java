package com.google.p4486ci.p4487a;

import java.util.concurrent.Callable;

/* renamed from: com.google.ci.a.g */
/* compiled from: PG */
public final /* synthetic */ class C58102g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58103h f155305a;

    public /* synthetic */ C58102g(C58103h hVar) {
        this.f155305a = hVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:23|24|25|26|27|28|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r1 = r0.mo54659b();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r11 = this;
            com.google.ci.a.h r0 = r11.f155305a
            monitor-enter(r0)     // Catch:{ u -> 0x009d }
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            r0.mo54661d()     // Catch:{ u -> 0x009d }
            r1 = 0
            java.net.HttpURLConnection r2 = r0.f155306a     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0072 }
            java.io.OutputStream r2 = r2.getOutputStream()     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0072 }
            java.net.HttpURLConnection r3 = r0.f155306a     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0072 }
            r3.connect()     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0072 }
            com.google.ci.a.b r3 = r0.f155307b     // Catch:{ u -> 0x009d }
            if (r3 != 0) goto L_0x001c
            com.google.ci.a.f r1 = r0.mo54659b()     // Catch:{ u -> 0x009d }
            goto L_0x0077
        L_0x001c:
            java.lang.System.currentTimeMillis()     // Catch:{ u -> 0x009d }
            r3 = 0
        L_0x0020:
            r4 = 0
        L_0x0021:
            boolean r5 = r0.mo54662e()     // Catch:{ u -> 0x009d }
            if (r5 == 0) goto L_0x006d
            r0.mo54661d()     // Catch:{ u -> 0x009d }
            r5 = 0
        L_0x002b:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r5 >= r6) goto L_0x005b
            boolean r7 = r0.mo54662e()     // Catch:{ u -> 0x009d }
            if (r7 == 0) goto L_0x005b
            com.google.ci.a.b r7 = r0.f155307b     // Catch:{ IOException -> 0x0052 }
            byte[] r8 = r0.f155308c     // Catch:{ IOException -> 0x0052 }
            int r6 = r6 - r5
            int r6 = r7.mo54639a(r8, r5, r6)     // Catch:{ IOException -> 0x0052 }
            long r7 = r0.f155309d     // Catch:{ IOException -> 0x0052 }
            long r9 = (long) r6     // Catch:{ IOException -> 0x0052 }
            long r7 = r7 + r9
            r0.f155309d = r7     // Catch:{ IOException -> 0x0052 }
            int r5 = r5 + r6
            byte[] r7 = r0.f155308c     // Catch:{ IOException -> 0x004d }
            int r8 = r5 - r6
            r2.write(r7, r8, r6)     // Catch:{ IOException -> 0x004d }
            goto L_0x002b
        L_0x004d:
            com.google.ci.a.f r1 = r0.mo54659b()     // Catch:{ u -> 0x009d }
            goto L_0x0077
        L_0x0052:
            r2 = move-exception
            com.google.ci.a.u r3 = new com.google.ci.a.u     // Catch:{ u -> 0x009d }
            com.google.ci.a.t r4 = com.google.p4486ci.p4487a.C58115t.REQUEST_BODY_READ_ERROR     // Catch:{ u -> 0x009d }
            r3.<init>(r4, r1, r2)     // Catch:{ u -> 0x009d }
            throw r3     // Catch:{ u -> 0x009d }
        L_0x005b:
            int r4 = r4 + r5
            int r5 = r0.f155311f     // Catch:{ u -> 0x009d }
            if (r4 < r5) goto L_0x0021
            monitor-enter(r0)     // Catch:{ u -> 0x009d }
            com.google.ci.a.w r4 = r0.f155310e     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0068
            r4.mo54665c()     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            goto L_0x0020
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            throw r1     // Catch:{ u -> 0x009d }
        L_0x006d:
            com.google.ci.a.f r1 = r0.mo54659b()     // Catch:{ u -> 0x009d }
            goto L_0x0077
        L_0x0072:
            r2 = move-exception
            com.google.ci.a.f r1 = r0.mo54659b()     // Catch:{ u -> 0x0089 }
        L_0x0077:
            monitor-enter(r0)     // Catch:{ u -> 0x009d }
            com.google.ci.a.w r2 = r0.f155310e     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x007f
            r2.mo23081b(r1)     // Catch:{ all -> 0x0086 }
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            com.google.ci.a.v r2 = new com.google.ci.a.v     // Catch:{ u -> 0x009d }
            r2.<init>((com.google.p4486ci.p4487a.C58101f) r1)     // Catch:{ u -> 0x009d }
            goto L_0x00ac
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            throw r1     // Catch:{ u -> 0x009d }
        L_0x0089:
            com.google.ci.a.u r3 = new com.google.ci.a.u     // Catch:{ u -> 0x009d }
            com.google.ci.a.t r4 = com.google.p4486ci.p4487a.C58115t.CONNECTION_ERROR     // Catch:{ u -> 0x009d }
            r3.<init>(r4, r1, r2)     // Catch:{ u -> 0x009d }
            throw r3     // Catch:{ u -> 0x009d }
        L_0x0091:
            r2 = move-exception
            com.google.ci.a.u r3 = new com.google.ci.a.u     // Catch:{ u -> 0x009d }
            com.google.ci.a.t r4 = com.google.p4486ci.p4487a.C58115t.BAD_URL     // Catch:{ u -> 0x009d }
            r3.<init>(r4, r1, r2)     // Catch:{ u -> 0x009d }
            throw r3     // Catch:{ u -> 0x009d }
        L_0x009a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            throw r1     // Catch:{ u -> 0x009d }
        L_0x009d:
            r1 = move-exception
            monitor-enter(r0)
            com.google.ci.a.w r2 = r0.f155310e     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x00a6
            r2.mo23080a(r0, r1)     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            com.google.ci.a.v r2 = new com.google.ci.a.v
            r2.<init>((com.google.p4486ci.p4487a.C58116u) r1)
        L_0x00ac:
            return r2
        L_0x00ad:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            goto L_0x00b1
        L_0x00b0:
            throw r1
        L_0x00b1:
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4486ci.p4487a.C58102g.call():java.lang.Object");
    }
}
