package com.google.firebase.installations.p4617c;

import com.google.firebase.installations.C61264p;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.installations.c.h */
/* compiled from: PG */
final class C61248h {

    /* renamed from: a */
    private static final long f165676a = TimeUnit.HOURS.toMillis(24);

    /* renamed from: b */
    private static final long f165677b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    private long f165678c;

    /* renamed from: d */
    private int f165679d;

    public C61248h() {
        C61264p.m93745b();
    }

    /* renamed from: d */
    private final synchronized void m93709d() {
        this.f165679d = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo57859b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f165679d     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0013
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0016 }
            long r2 = r5.f165678c     // Catch:{ all -> 0x0016 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            monitor-exit(r5)
            r0 = 0
            return r0
        L_0x0013:
            monitor-exit(r5)
            r0 = 1
            return r0
        L_0x0016:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4617c.C61248h.mo57859b():boolean");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0012=Splitter:B:11:0x0012, B:7:0x000e=Splitter:B:7:0x000e} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long m93708c(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 == r0) goto L_0x0012
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L_0x000e
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L_0x000e
            goto L_0x0012
        L_0x000e:
            long r0 = f165676a     // Catch:{ all -> 0x0036 }
            monitor-exit(r6)
            return r0
        L_0x0012:
            int r7 = r6.f165679d     // Catch:{ all -> 0x0036 }
            double r0 = (double) r7     // Catch:{ all -> 0x0036 }
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x0036 }
            double r2 = java.lang.Math.random()     // Catch:{ all -> 0x0036 }
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r2 = (long) r2
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r0 = r0 + r2
            long r2 = f165677b     // Catch:{ all -> 0x0036 }
            double r2 = (double) r2     // Catch:{ all -> 0x0036 }
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0036 }
            long r0 = (long) r0
            monitor-exit(r6)
            return r0
        L_0x0036:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4617c.C61248h.m93708c(int):long");
    }

    /* renamed from: a */
    public final synchronized void mo57858a(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            m93709d();
            return;
        }
        this.f165679d++;
        this.f165678c = System.currentTimeMillis() + m93708c(i);
    }
}
