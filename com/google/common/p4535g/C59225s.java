package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.s */
/* compiled from: PG */
public final class C59225s implements Serializable, C59165cd {

    /* renamed from: a */
    byte f157321a;

    /* renamed from: b */
    byte f157322b;

    /* renamed from: c */
    byte f157323c;

    /* renamed from: d */
    C59226t f157324d;

    /* renamed from: e */
    double f157325e;

    /* renamed from: f */
    double f157326f;

    /* renamed from: g */
    double f157327g;

    /* renamed from: h */
    double f157328h;

    static {
        Math.asin(Math.sqrt(0.3333333333333333d));
        double d = C59222p.f157309a;
    }

    public C59225s() {
    }

    public C59225s(C59226t tVar) {
        this.f157324d = tVar;
        this.f157321a = (byte) tVar.mo56664b();
        long n = tVar.mo56671n();
        this.f157323c = (byte) C59226t.m91929f(n);
        this.f157322b = (byte) tVar.mo56668h();
        int d = C59226t.m91927d(n);
        int e = C59226t.m91928e(n);
        int g = C59226t.m91930g(tVar.mo56668h());
        this.f157325e = C59164cc.f157204f.mo56541a(d, g);
        this.f157326f = C59164cc.f157204f.mo56541a(d + g, g);
        this.f157327g = C59164cc.f157204f.mo56541a(e, g);
        this.f157328h = C59164cc.f157204f.mo56541a(e + g, g);
    }

    /* renamed from: c */
    private static double m91911c(C59136bb bbVar, double d, double d2) {
        return bbVar.mo56500d(C59136bb.m91671n(new C59136bb(d, d2, 1.0d)));
    }

    /* renamed from: d */
    private static double m91912d(double d, double d2) {
        double d3 = (d * d) / ((d2 * d2) + 1.0d);
        double sqrt = 1.0d - Math.sqrt(1.0d - d3);
        return d3 + (sqrt * sqrt);
    }

    /* renamed from: e */
    private final boolean m91913e(C59136bb bbVar, boolean z) {
        double d = z ? this.f157328h : this.f157327g;
        double d2 = -this.f157325e;
        double d3 = (d * d) + 1.0d;
        C59136bb bbVar2 = new C59136bb(d3, d2 * d, d2);
        double d4 = -this.f157326f;
        return bbVar.mo56497b(bbVar2) > C59203do.f157270a && bbVar.mo56497b(new C59136bb(d3, d4 * d, d4)) < C59203do.f157270a;
    }

    /* renamed from: f */
    private final boolean m91914f(C59136bb bbVar, boolean z) {
        C59136bb bbVar2 = bbVar;
        double d = z ? this.f157326f : this.f157325e;
        double d2 = -d;
        double d3 = this.f157327g;
        double d4 = (d * d) + 1.0d;
        C59136bb bbVar3 = new C59136bb(d2 * d3, d4, -d3);
        double d5 = this.f157328h;
        return bbVar2.mo56497b(bbVar3) > C59203do.f157270a && bbVar2.mo56497b(new C59136bb(d2 * d5, d4, -d5)) < C59203do.f157270a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r3 != false) goto L_0x00a0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4535g.C59219m mo56649a(com.google.common.p4535g.C59136bb r14) {
        /*
            r13 = this;
            byte r0 = r13.f157321a
            com.google.common.g.bb r14 = com.google.common.p4535g.C59164cc.m91757l(r0, r14)
            double r0 = r14.f157162e
            double r2 = r14.f157164g
            double r4 = r13.f157325e
            double r4 = r4 * r2
            double r4 = r0 - r4
            double r6 = r13.f157326f
            double r6 = r6 * r2
            double r0 = r0 - r6
            double r6 = r14.f157163f
            double r8 = r13.f157327g
            double r8 = r8 * r2
            double r8 = r6 - r8
            double r10 = r13.f157328h
            double r2 = r2 * r10
            double r6 = r6 - r2
            r2 = 1
            r3 = 0
            r10 = 0
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x003a
            boolean r12 = r13.m91914f(r14, r3)
            if (r12 == 0) goto L_0x0038
            double r0 = -r4
            double r2 = r13.f157325e
            double r10 = m91912d(r0, r2)
            goto L_0x00a0
        L_0x0038:
            r4 = 0
            goto L_0x003b
        L_0x003a:
            r4 = 1
        L_0x003b:
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            boolean r4 = r13.m91914f(r14, r2)
            if (r4 == 0) goto L_0x004c
            double r2 = r13.f157326f
            double r10 = m91912d(r0, r2)
            goto L_0x00a0
        L_0x004c:
            r4 = 0
        L_0x004d:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            boolean r0 = r13.m91913e(r14, r3)
            if (r0 == 0) goto L_0x0060
            double r0 = -r8
            double r2 = r13.f157327g
            double r10 = m91912d(r0, r2)
            goto L_0x00a0
        L_0x005f:
            r3 = r4
        L_0x0060:
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0071
            boolean r0 = r13.m91913e(r14, r2)
            if (r0 == 0) goto L_0x0074
            double r0 = r13.f157328h
            double r10 = m91912d(r6, r0)
            goto L_0x00a0
        L_0x0071:
            if (r3 == 0) goto L_0x0074
            goto L_0x00a0
        L_0x0074:
            double r0 = r13.f157325e
            double r2 = r13.f157327g
            double r0 = m91911c(r14, r0, r2)
            double r2 = r13.f157325e
            double r4 = r13.f157328h
            double r2 = m91911c(r14, r2, r4)
            double r4 = r13.f157326f
            double r6 = r13.f157327g
            double r4 = m91911c(r14, r4, r6)
            double r6 = r13.f157326f
            double r8 = r13.f157328h
            double r6 = m91911c(r14, r6, r8)
            double r4 = java.lang.Math.min(r4, r6)
            double r2 = java.lang.Math.min(r2, r4)
            double r10 = java.lang.Math.min(r0, r2)
        L_0x00a0:
            com.google.common.g.m r14 = com.google.common.p4535g.C59219m.m91873d(r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59225s.mo56649a(com.google.common.g.bb):com.google.common.g.m");
    }

    /* renamed from: b */
    public final C59136bb mo56650b(int i) {
        int i2 = i >> 1;
        return C59164cc.m91756k(this.f157321a, ((i & 1) ^ i2) == 0 ? this.f157325e : this.f157326f, i2 == 0 ? this.f157327g : this.f157328h);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C59225s sVar = new C59225s();
        sVar.f157321a = this.f157321a;
        sVar.f157322b = this.f157322b;
        sVar.f157323c = this.f157323c;
        sVar.f157325e = this.f157325e;
        sVar.f157326f = this.f157326f;
        sVar.f157327g = this.f157327g;
        sVar.f157328h = this.f157328h;
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59225s) {
            C59225s sVar = (C59225s) obj;
            if (this.f157321a == sVar.f157321a && this.f157322b == sVar.f157322b && this.f157323c == sVar.f157323c && this.f157324d.equals(sVar.f157324d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo56467g(C59225s sVar) {
        throw null;
    }

    public final int hashCode() {
        return ((((((this.f157321a + 629) * 37) + this.f157323c) * 37) + this.f157322b) * 37) + this.f157324d.hashCode();
    }

    public final String toString() {
        return "[" + this.f157321a + ", " + this.f157322b + ", " + this.f157323c + ", " + this.f157324d + "]";
    }
}
