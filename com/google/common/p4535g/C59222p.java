package com.google.common.p4535g;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.g.p */
/* compiled from: PG */
public final class C59222p {

    /* renamed from: a */
    public static final double f157309a = (1.0d / Math.sqrt(2.0d));

    /* renamed from: b */
    public static final double f157310b = Math.sqrt(2.0d);

    /* renamed from: c */
    public static final double f157311c;

    /* renamed from: d */
    public static final C59136bb f157312d = new C59136bb(-0.00999946643502502d, 0.002592454260932412d, 0.999946643502502d);

    /* renamed from: e */
    public static final int[][] f157313e = {new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};

    /* renamed from: f */
    public static final int[][] f157314f = {new int[]{0, 1, 3, 2}, new int[]{0, 3, 1, 2}, new int[]{2, 3, 1, 0}, new int[]{2, 1, 3, 0}};

    /* renamed from: g */
    private static final int[] f157315g = {1, 0, 0, 3};

    /* renamed from: h */
    private static final C59136bb[] f157316h = {new C59136bb(1.0d, 0.0053d, 0.00457d), new C59136bb(0.012d, 1.0d, 0.00457d), new C59136bb(0.012d, 0.0053d, 1.0d)};

    static {
        double d = 1.0d;
        do {
            d /= 2.0d;
        } while ((d / 2.0d) + 1.0d != 1.0d);
        f157311c = d;
    }

    /* renamed from: a */
    public static double m91895a(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return f157311c * 9.73d * d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0073, code lost:
        if (r12 < (((5.0E-15d + r0) * 0.1d) * r10)) goto L_0x00ad;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double m91896b(com.google.common.p4535g.C59136bb r21, com.google.common.p4535g.C59136bb r22, com.google.common.p4535g.C59136bb r23) {
        /*
            r0 = r21
            r1 = r23
            int r2 = com.google.common.p4535g.C59148bn.m91712a(r21, r22, r23)
            double r2 = (double) r2
            double r4 = m91897c(r22, r23)
            double r6 = m91897c(r1, r0)
            double r8 = m91897c(r21, r22)
            double r10 = r4 + r6
            double r10 = r10 + r8
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 * r12
            r14 = 4554169646866313825(0x3f33a92a30553261, double:3.0E-4)
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x0076
            double r14 = r10 * r10
            double r12 = java.lang.Math.max(r6, r8)
            double r12 = java.lang.Math.max(r4, r12)
            double r12 = r10 - r12
            r17 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r17 = r17 * r10
            double r17 = r17 * r14
            double r17 = r17 * r14
            int r14 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0076
            com.google.common.g.bb r14 = m91902h(r21, r22)
            com.google.common.g.bb r15 = m91902h(r22, r23)
            com.google.common.g.bb r0 = m91902h(r0, r1)
            double r17 = r14.mo56496a(r0)
            double r19 = r14.mo56496a(r15)
            double r17 = r17 - r19
            double r0 = r15.mo56496a(r0)
            double r0 = r17 + r0
            r14 = 0
            double r0 = java.lang.Math.max(r14, r0)
            r14 = 4392844290060004251(0x3cf6849b86a12b9b, double:5.0E-15)
            double r14 = r14 + r0
            r17 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r14 = r14 * r17
            double r14 = r14 * r10
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x0076
            goto L_0x00ad
        L_0x0076:
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r12 = r10 * r0
            double r12 = java.lang.Math.tan(r12)
            double r4 = r10 - r4
            double r4 = r4 * r0
            double r4 = java.lang.Math.tan(r4)
            double r12 = r12 * r4
            double r4 = r10 - r6
            double r4 = r4 * r0
            double r4 = java.lang.Math.tan(r4)
            double r12 = r12 * r4
            double r10 = r10 - r8
            double r10 = r10 * r0
            double r0 = java.lang.Math.tan(r10)
            double r12 = r12 * r0
            r0 = 0
            double r0 = java.lang.Math.max(r0, r12)
            double r0 = java.lang.Math.sqrt(r0)
            double r0 = java.lang.Math.atan(r0)
            r4 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = r0 * r4
        L_0x00ad:
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59222p.m91896b(com.google.common.g.bb, com.google.common.g.bb, com.google.common.g.bb):double");
    }

    /* renamed from: c */
    public static double m91897c(C59136bb bbVar, C59136bb bbVar2) {
        double atan2 = Math.atan2(Math.sqrt(C59136bb.m91672o(bbVar, bbVar2).mo56501e()), Math.sqrt(C59136bb.m91667j(bbVar, bbVar2).mo56501e()));
        return atan2 + atan2;
    }

    /* renamed from: d */
    public static double m91898d(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3) {
        double a = m91902h(bbVar, bbVar2).mo56496a(m91902h(bbVar2, bbVar3));
        return C59148bn.m91712a(bbVar, bbVar2, bbVar3) > 0 ? a : -a;
    }

    /* renamed from: e */
    public static int m91899e(int i) {
        boolean z = false;
        if (i >= 0 && i < 4) {
            z = true;
        }
        C58838bb.m90868c(z);
        return f157315g[i];
    }

    /* renamed from: f */
    public static C59136bb m91900f(C59211e eVar, C59136bb bbVar) {
        boolean z = true;
        C59211e b = C59211e.m91844b(bbVar);
        if (eVar.f157285b != 3) {
            z = false;
        }
        C58838bb.m90868c(z);
        C59211e eVar2 = new C59211e(b.f157285b);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < eVar2.f157285b; i2++) {
                double d = C59203do.f157270a;
                for (int i3 = 0; i3 < eVar.f157285b; i3++) {
                    d += eVar.mo56579a(i, i3) * b.mo56579a(i3, i2);
                }
                eVar2.mo56580c(i, i2, d);
            }
        }
        double[] dArr = eVar2.f157284a;
        double d2 = dArr[0];
        int i4 = eVar2.f157285b;
        return new C59136bb(d2, dArr[i4], dArr[i4 + i4]);
    }

    /* renamed from: g */
    public static C59136bb m91901g(C59136bb bbVar) {
        int i = C59136bb.m91666i(bbVar.f157162e, bbVar.f157163f, bbVar.f157164g) - 1;
        if (i < 0) {
            i = 2;
        }
        return C59136bb.m91671n(C59136bb.m91668k(bbVar, f157316h[i]));
    }

    /* renamed from: h */
    public static C59136bb m91902h(C59136bb bbVar, C59136bb bbVar2) {
        C59136bb k = C59136bb.m91668k(C59136bb.m91667j(bbVar2, bbVar), C59136bb.m91672o(bbVar2, bbVar));
        if (!k.mo56506q(C59136bb.f157158a)) {
            return k;
        }
        return m91901g(bbVar);
    }

    /* renamed from: i */
    public static boolean m91903i(C59136bb bbVar) {
        return Math.abs(bbVar.mo56501e() + -1.0d) <= f157311c * 5.0d;
    }
}
