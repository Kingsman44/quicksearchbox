package com.google.common.p4526f;

import com.google.common.p4526f.p4528b.C59011af;
import com.google.common.p4526f.p4533e.C59074b;
import com.google.common.p4526f.p4533e.C59076d;
import java.util.logging.Level;

/* renamed from: com.google.common.f.b */
/* compiled from: PG */
public abstract class C58980b extends C59092l implements C59104x {
    protected C58980b(Level level, boolean z) {
        super(level, z, C59011af.m91224b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C59076d mo56244a() {
        return C59074b.f157038a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c5, code lost:
        if (r10 == 0) goto L_0x00c9;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo56245b(com.google.common.p4526f.C59096p r15) {
        /*
            r14 = this;
            com.google.common.f.b.l r0 = r14.mo56305h()
            int r1 = r0.mo56310b()
            r2 = 0
            r3 = 0
        L_0x000a:
            if (r3 >= r1) goto L_0x0031
            com.google.common.f.aa r4 = r0.mo56311c(r3)
            java.lang.String r4 = r4.f156827a
            java.lang.String r5 = "eye3tag"
            if (r4 != r5) goto L_0x002e
            com.google.common.f.aa r1 = com.google.common.p4526f.C59090j.f157047a
            java.lang.Object r1 = r0.mo56312d(r1)
            if (r1 != 0) goto L_0x0031
            com.google.common.f.aa r1 = com.google.common.p4526f.C59090j.f157053g
            java.lang.Object r0 = r0.mo56312d(r1)
            if (r0 != 0) goto L_0x0031
            com.google.common.f.aa r0 = com.google.common.p4526f.C59090j.f157053g
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.SMALL
            r14.mo56383m(r0, r1)
            goto L_0x0031
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0031:
            com.google.common.f.k r0 = r14.f157058c
            r1 = 1
            if (r0 == 0) goto L_0x014a
            r3 = 0
            if (r15 == 0) goto L_0x00e0
            com.google.common.f.aa r4 = com.google.common.p4526f.C59090j.f157048b
            java.lang.Object r0 = r0.mo56312d(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.google.common.f.k r4 = r14.f157058c
            com.google.common.f.aa r5 = com.google.common.p4526f.C59090j.f157049c
            java.lang.Object r4 = r4.mo56312d(r5)
            com.google.common.f.u r4 = (com.google.common.p4526f.C59101u) r4
            com.google.common.f.k r5 = r14.f157058c
            com.google.common.f.r r6 = com.google.common.p4526f.C59102v.f157075a
            j$.util.concurrent.ConcurrentHashMap r7 = r6.f157071a
            java.lang.Object r7 = r7.get(r15)
            if (r7 == 0) goto L_0x0058
            goto L_0x0091
        L_0x0058:
            com.google.common.f.v r7 = new com.google.common.f.v
            r7.<init>()
            j$.util.concurrent.ConcurrentHashMap r8 = r6.f157071a
            java.lang.Object r8 = r8.putIfAbsent(r15, r7)
            if (r8 == 0) goto L_0x0067
            r7 = r8
            goto L_0x0091
        L_0x0067:
            int r8 = r5.f157055b
            r10 = r3
            r9 = 0
        L_0x006b:
            if (r9 >= r8) goto L_0x0091
            com.google.common.f.aa r11 = com.google.common.p4526f.C59090j.f157050d
            com.google.common.f.aa r12 = r5.mo56311c(r9)
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x007a
            goto L_0x008e
        L_0x007a:
            java.lang.Object r11 = r5.mo56313e(r9)
            boolean r12 = r11 instanceof com.google.common.p4526f.C59105y
            if (r12 == 0) goto L_0x008e
            if (r10 != 0) goto L_0x0089
            com.google.common.f.q r10 = new com.google.common.f.q
            r10.<init>(r6, r15)
        L_0x0089:
            com.google.common.f.y r11 = (com.google.common.p4526f.C59105y) r11
            r11.mo56405a()
        L_0x008e:
            int r9 = r9 + 1
            goto L_0x006b
        L_0x0091:
            com.google.common.f.v r7 = (com.google.common.p4526f.C59102v) r7
            r5 = 0
            if (r0 == 0) goto L_0x00a7
            int r15 = r0.intValue()
            java.util.concurrent.atomic.AtomicLong r0 = r7.f157076b
            long r8 = r0.getAndIncrement()
            long r10 = (long) r15
            long r8 = r8 % r10
            int r15 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x014b
        L_0x00a7:
            if (r4 == 0) goto L_0x00e0
            long r8 = r14.f157057b
            java.util.concurrent.atomic.AtomicLong r15 = r7.f157077c
            long r10 = r15.get()
            java.util.concurrent.TimeUnit r15 = r4.f157073b
            int r0 = r4.f157072a
            long r12 = (long) r0
            long r12 = r15.toNanos(r12)
            long r12 = r12 + r10
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 < 0) goto L_0x00da
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x00c8
            int r15 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x00da
            goto L_0x00c9
        L_0x00c8:
            r5 = r10
        L_0x00c9:
            java.util.concurrent.atomic.AtomicLong r15 = r7.f157077c
            boolean r15 = r15.compareAndSet(r5, r8)
            if (r15 == 0) goto L_0x00da
            java.util.concurrent.atomic.AtomicInteger r15 = r7.f157078d
            int r15 = r15.getAndSet(r2)
            r4.f157074c = r15
            goto L_0x00e0
        L_0x00da:
            java.util.concurrent.atomic.AtomicInteger r15 = r7.f157078d
            r15.incrementAndGet()
            goto L_0x014b
        L_0x00e0:
            com.google.common.f.k r15 = r14.f157058c
            com.google.common.f.aa r0 = com.google.common.p4526f.C59090j.f157053g
            java.lang.Object r15 = r15.mo56312d(r0)
            com.google.common.f.ad r15 = (com.google.common.p4526f.C58979ad) r15
            if (r15 == 0) goto L_0x014a
            com.google.common.f.aa r0 = com.google.common.p4526f.C59090j.f157053g
            com.google.common.f.k r2 = r14.f157058c
            if (r2 == 0) goto L_0x012c
            int r4 = r2.mo56346a(r0)
            if (r4 < 0) goto L_0x012c
            int r4 = r4 + r4
            int r5 = r4 + 2
        L_0x00fb:
            int r6 = r2.f157055b
            int r7 = r6 + r6
            if (r5 >= r7) goto L_0x011c
            java.lang.Object[] r6 = r2.f157054a
            r6 = r6[r5]
            boolean r7 = r6.equals(r0)
            if (r7 != 0) goto L_0x0119
            java.lang.Object[] r7 = r2.f157054a
            r7[r4] = r6
            int r6 = r4 + 1
            int r8 = r5 + 1
            r8 = r7[r8]
            r7[r6] = r8
            int r4 = r4 + 2
        L_0x0119:
            int r5 = r5 + 2
            goto L_0x00fb
        L_0x011c:
            int r0 = r5 - r4
            int r0 = r0 >> r1
            int r6 = r6 - r0
            r2.f157055b = r6
        L_0x0122:
            if (r4 >= r5) goto L_0x012c
            int r0 = r4 + 1
            java.lang.Object[] r6 = r2.f157054a
            r6[r4] = r3
            r4 = r0
            goto L_0x0122
        L_0x012c:
            com.google.common.f.s r0 = new com.google.common.f.s
            com.google.common.f.b.l r2 = r14.mo56305h()
            com.google.common.f.aa r3 = com.google.common.p4526f.C59090j.f157047a
            java.lang.Object r2 = r2.mo56312d(r3)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Class<com.google.common.f.l> r3 = com.google.common.p4526f.C59092l.class
            int r4 = r15.f156841f
            java.lang.StackTraceElement[] r3 = com.google.common.p4526f.p4534f.C59080a.m91348b(r3, r4, r1)
            r0.<init>(r2, r15, r3)
            com.google.common.f.aa r15 = com.google.common.p4526f.C59090j.f157047a
            r14.mo56383m(r15, r0)
        L_0x014a:
            r2 = 1
        L_0x014b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4526f.C58980b.mo56245b(com.google.common.f.p):boolean");
    }
}
