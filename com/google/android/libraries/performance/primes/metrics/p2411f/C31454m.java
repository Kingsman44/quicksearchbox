package com.google.android.libraries.performance.primes.metrics.p2411f;

import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.performance.primes.metrics.f.m */
/* compiled from: PG */
public final /* synthetic */ class C31454m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31455n f84699a;

    /* renamed from: b */
    public final /* synthetic */ C31447f f84700b;

    public /* synthetic */ C31454m(C31455n nVar, C31447f fVar) {
        this.f84699a = nVar;
        this.f84700b = fVar;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r8 = this;
            com.google.android.libraries.performance.primes.metrics.f.n r0 = r8.f84699a
            com.google.android.libraries.performance.primes.metrics.f.f r1 = r8.f84700b
            android.app.Application r2 = r0.f84703b     // Catch:{ all -> 0x009c }
            r3 = 0
            j.a.i.b.a.ct r4 = com.google.android.libraries.performance.primes.p2399d.C31231b.m58233a(r3, r2)     // Catch:{ all -> 0x009c }
            r1.f84676l = r4     // Catch:{ all -> 0x009c }
            r4 = -1
            java.lang.String r5 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r5)     // Catch:{ SecurityException -> 0x0023 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ SecurityException -> 0x0023 }
            if (r2 == 0) goto L_0x0032
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0023 }
            if (r2 == 0) goto L_0x0032
            int r4 = r2.getType()     // Catch:{ SecurityException -> 0x0023 }
            goto L_0x0032
        L_0x0023:
            r2 = move-exception
            com.google.common.f.e r5 = com.google.android.libraries.performance.primes.metrics.p2411f.C31444c.f84664a     // Catch:{ all -> 0x009c }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml"
            r7 = 50404(0xc4e4, float:7.0631E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r2)).mo56372aa(r7)).mo56386p(r6)     // Catch:{ all -> 0x009c }
        L_0x0032:
            int r2 = p5535j.p5536a.p5562i.p5568b.p5569a.C71230bm.m103941a(r4)     // Catch:{ all -> 0x009c }
            if (r2 != 0) goto L_0x0039
            r2 = 1
        L_0x0039:
            r1.f84684t = r2     // Catch:{ all -> 0x009c }
            dagger.a r2 = r0.f84704c     // Catch:{ all -> 0x009c }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x009c }
            com.google.android.libraries.performance.primes.metrics.f.e r2 = (com.google.android.libraries.performance.primes.metrics.p2411f.C31446e) r2     // Catch:{ all -> 0x009c }
            int r2 = r2.mo37134c()     // Catch:{ all -> 0x009c }
            java.lang.Object r4 = r0.f84705d     // Catch:{ all -> 0x009c }
            monitor-enter(r4)     // Catch:{ all -> 0x009c }
            java.util.ArrayList r5 = r0.f84707f     // Catch:{ all -> 0x0099 }
            r5.ensureCapacity(r2)     // Catch:{ all -> 0x0099 }
            java.util.ArrayList r5 = r0.f84707f     // Catch:{ all -> 0x0099 }
            r5.add(r1)     // Catch:{ all -> 0x0099 }
            java.util.ArrayList r1 = r0.f84707f     // Catch:{ all -> 0x0099 }
            int r1 = r1.size()     // Catch:{ all -> 0x0099 }
            if (r1 < r2) goto L_0x0070
            java.util.ArrayList r1 = r0.f84707f     // Catch:{ all -> 0x0099 }
            int r2 = r1.size()     // Catch:{ all -> 0x0099 }
            com.google.android.libraries.performance.primes.metrics.f.f[] r2 = new com.google.android.libraries.performance.primes.metrics.p2411f.C31447f[r2]     // Catch:{ all -> 0x0099 }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0099 }
            r3 = r1
            com.google.android.libraries.performance.primes.metrics.f.f[] r3 = (com.google.android.libraries.performance.primes.metrics.p2411f.C31447f[]) r3     // Catch:{ all -> 0x0099 }
            java.util.ArrayList r1 = r0.f84707f     // Catch:{ all -> 0x0099 }
            r1.clear()     // Catch:{ all -> 0x0099 }
        L_0x0070:
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            if (r3 != 0) goto L_0x0076
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x009c }
            goto L_0x0093
        L_0x0076:
            com.google.android.libraries.performance.primes.metrics.b.m r1 = r0.f84702a     // Catch:{ all -> 0x009c }
            com.google.android.libraries.performance.primes.metrics.b.d r2 = com.google.android.libraries.performance.primes.metrics.p2404b.C31302e.m58363j()     // Catch:{ all -> 0x009c }
            dagger.a r4 = r0.f84706e     // Catch:{ all -> 0x009c }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x009c }
            com.google.android.libraries.performance.primes.metrics.f.g r4 = (com.google.android.libraries.performance.primes.metrics.p2411f.C31448g) r4     // Catch:{ all -> 0x009c }
            j.a.i.b.a.ej r3 = r4.mo37143d(r3)     // Catch:{ all -> 0x009c }
            r2.mo37004e(r3)     // Catch:{ all -> 0x009c }
            com.google.android.libraries.performance.primes.metrics.b.e r2 = r2.mo37000a()     // Catch:{ all -> 0x009c }
            com.google.common.util.concurrent.cx r1 = r1.mo37023b(r2)     // Catch:{ all -> 0x009c }
        L_0x0093:
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f84708g
            r0.decrementAndGet()
            return r1
        L_0x0099:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f84708g
            r0.decrementAndGet()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2411f.C31454m.mo18058a():com.google.common.util.concurrent.cx");
    }
}
