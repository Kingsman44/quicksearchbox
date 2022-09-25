package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;
import com.google.common.p4535g.C59203do;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.dm */
/* compiled from: PG */
public abstract class C60899dm {

    /* renamed from: a */
    private final C60898dl f164999a;

    /* renamed from: b */
    private volatile Object f165000b;

    public C60899dm(C60898dl dlVar) {
        this.f164999a = dlVar;
    }

    /* renamed from: b */
    public static C60899dm m93001b(double d, C60898dl dlVar) {
        C60905ds dsVar = new C60905ds(dlVar);
        boolean z = false;
        double d2 = C59203do.f157270a;
        if (d > C59203do.f157270a && !Double.isNaN(d)) {
            z = true;
        }
        C58838bb.m90869d(z, "rate must be positive");
        synchronized (dsVar.mo57406f()) {
            dsVar.mo57408h(dsVar.f164999a.mo57393a());
            double micros = (double) TimeUnit.SECONDS.toMicros(1);
            Double.isNaN(micros);
            dsVar.f165013c = micros / d;
            double d3 = dsVar.f165012b;
            dsVar.f165012b = d;
            if (d3 == Double.POSITIVE_INFINITY) {
                dsVar.f165011a = d;
            } else {
                if (d3 != C59203do.f157270a) {
                    d2 = (dsVar.f165011a * d) / d3;
                }
                dsVar.f165011a = d2;
            }
        }
        return dsVar;
    }

    /* renamed from: f */
    private final Object mo57406f() {
        Object obj = this.f165000b;
        if (obj == null) {
            synchronized (this) {
                obj = this.f165000b;
                if (obj == null) {
                    obj = new Object();
                    this.f165000b = obj;
                }
            }
        }
        return obj;
    }

    /* renamed from: a */
    public abstract double mo57394a();

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1 = java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r4 = java.lang.System.nanoTime() + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r0 = r1;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r3 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r4 <= 0) goto L_0x0062;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo57395c() {
        /*
            r9 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            r1 = 0
            long r3 = r0.toMicros(r1)
            long r3 = java.lang.Math.max(r3, r1)
            java.lang.Object r0 = r9.mo57406f()
            monitor-enter(r0)
            com.google.common.util.concurrent.dl r5 = r9.f164999a     // Catch:{ all -> 0x0066 }
            long r5 = r5.mo57393a()     // Catch:{ all -> 0x0066 }
            long r7 = r9.mo57396d()     // Catch:{ all -> 0x0066 }
            long r7 = r7 - r3
            r3 = 0
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0064
            long r7 = r9.mo57397e(r5)     // Catch:{ all -> 0x0066 }
            long r7 = r7 - r5
            long r4 = java.lang.Math.max(r7, r1)     // Catch:{ all -> 0x0066 }
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            r0 = 1
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0062
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r1 = r1.toNanos(r4)     // Catch:{ all -> 0x004b }
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004b }
            long r4 = r4 + r1
        L_0x003b:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x004d }
            r6.sleep(r1)     // Catch:{ InterruptedException -> 0x004d }
            if (r3 != 0) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            return r0
        L_0x004b:
            r0 = move-exception
            goto L_0x0058
        L_0x004d:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0055 }
            long r1 = r4 - r1
            r3 = 1
            goto L_0x003b
        L_0x0055:
            r1 = move-exception
            r0 = r1
            r3 = 1
        L_0x0058:
            if (r3 == 0) goto L_0x0061
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0061:
            throw r0
        L_0x0062:
            r3 = 1
            goto L_0x0065
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
        L_0x0065:
            return r3
        L_0x0066:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r1
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60899dm.mo57395c():boolean");
    }

    /* renamed from: d */
    public abstract long mo57396d();

    /* renamed from: e */
    public abstract long mo57397e(long j);

    public final String toString() {
        double a;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[1];
        synchronized (mo57406f()) {
            a = mo57394a();
        }
        objArr[0] = Double.valueOf(a);
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", objArr);
    }
}
