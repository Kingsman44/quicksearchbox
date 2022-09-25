package com.google.common.p4535g;

/* renamed from: com.google.common.g.ba */
/* compiled from: PG */
public final class C59135ba {

    /* renamed from: a */
    public final C59226t f157150a;

    /* renamed from: b */
    public final int f157151b;

    /* renamed from: c */
    public final int f157152c;

    /* renamed from: d */
    public final int f157153d;

    /* renamed from: e */
    public final int f157154e;

    /* renamed from: f */
    private final double f157155f;

    /* renamed from: g */
    private final C59215i f157156g;

    /* renamed from: h */
    private C59215i f157157h;

    public C59135ba(C59226t tVar, double d) {
        this.f157150a = tVar;
        this.f157155f = d;
        if (tVar.mo56660F()) {
            double d2 = 1.0d + d;
            double d3 = -d2;
            this.f157156g = new C59215i(new C59214h(d3, d2), new C59214h(d3, d2));
            double d4 = -d;
            this.f157157h = new C59215i(new C59214h(d4, d), new C59214h(d4, d));
            this.f157152c = 0;
            this.f157151b = 0;
            this.f157153d = tVar.mo56664b() & 1;
            this.f157154e = 0;
            return;
        }
        long n = tVar.mo56671n();
        int d5 = C59226t.m91927d(n);
        int e = C59226t.m91928e(n);
        this.f157153d = C59226t.m91929f(n);
        int h = tVar.mo56668h();
        this.f157154e = h;
        this.f157156g = C59226t.m91935o(d5, e, h).mo56595b(d);
        int i = -C59226t.m91930g(h);
        this.f157151b = d5 & i;
        this.f157152c = i & e;
    }

    /* renamed from: a */
    public final C59215i mo56493a() {
        if (this.f157157h == null) {
            int g = C59226t.m91930g(this.f157154e);
            C59164cc ccVar = C59164cc.f157204f;
            long j = (long) this.f157151b;
            long j2 = (long) g;
            double c = ccVar.mo56542c(C59164cc.m91750b(j + j + j2));
            C59164cc ccVar2 = C59164cc.f157204f;
            long j3 = (long) this.f157152c;
            double c2 = ccVar2.mo56542c(C59164cc.m91750b(j3 + j3 + j2));
            double d = this.f157155f;
            C59214h hVar = new C59214h(c - d, c + d);
            double d2 = this.f157155f;
            this.f157157h = new C59215i(hVar, new C59214h(c2 - d2, c2 + d2));
        }
        return this.f157157h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r1.mo56591g(r2.mo56542c(com.google.common.p4535g.C59164cc.m91750b((r3 + r3) + r5))) != false) goto L_0x00d9;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4535g.C59226t mo56494b(com.google.common.p4535g.C59215i r8) {
        /*
            r7 = this;
            int r0 = r7.f157154e
            int r0 = com.google.common.p4535g.C59226t.m91930g(r0)
            int r1 = r7.f157154e
            if (r1 != 0) goto L_0x0020
            com.google.common.g.h r1 = r8.f157291a
            r2 = 0
            boolean r1 = r1.mo56591g(r2)
            if (r1 != 0) goto L_0x001d
            com.google.common.g.h r1 = r8.f157292b
            boolean r1 = r1.mo56591g(r2)
            if (r1 != 0) goto L_0x001d
            goto L_0x0051
        L_0x001d:
            com.google.common.g.t r8 = r7.f157150a
            return r8
        L_0x0020:
            com.google.common.g.h r1 = r8.f157291a
            com.google.common.g.cc r2 = com.google.common.p4535g.C59164cc.f157204f
            int r3 = r7.f157151b
            long r3 = (long) r3
            long r5 = (long) r0
            long r3 = r3 + r3
            long r3 = r3 + r5
            double r3 = com.google.common.p4535g.C59164cc.m91750b(r3)
            double r2 = r2.mo56542c(r3)
            boolean r1 = r1.mo56591g(r2)
            if (r1 != 0) goto L_0x00d9
            com.google.common.g.h r1 = r8.f157292b
            com.google.common.g.cc r2 = com.google.common.p4535g.C59164cc.f157204f
            int r3 = r7.f157152c
            long r3 = (long) r3
            long r3 = r3 + r3
            long r3 = r3 + r5
            double r3 = com.google.common.p4535g.C59164cc.m91750b(r3)
            double r2 = r2.mo56542c(r3)
            boolean r1 = r1.mo56591g(r2)
            if (r1 == 0) goto L_0x0051
            goto L_0x00d9
        L_0x0051:
            double r1 = r7.f157155f
            double r3 = com.google.common.p4535g.C59222p.f157311c
            r5 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r3 = r3 * r5
            double r1 = r1 + r3
            com.google.common.g.i r8 = r8.mo56595b(r1)
            int r1 = r7.f157151b
            com.google.common.g.cc r2 = com.google.common.p4535g.C59164cc.f157204f
            com.google.common.g.h r3 = r8.f157291a
            double r3 = r3.f157289a
            double r2 = r2.mo56543d(r3)
            int r2 = com.google.common.p4535g.C59164cc.m91751e(r2)
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r7.f157152c
            com.google.common.g.cc r3 = com.google.common.p4535g.C59164cc.f157204f
            com.google.common.g.h r4 = r8.f157292b
            double r4 = r4.f157289a
            double r3 = r3.mo56543d(r4)
            int r3 = com.google.common.p4535g.C59164cc.m91751e(r3)
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r7.f157151b
            int r3 = r3 + r0
            int r3 = r3 + -1
            com.google.common.g.cc r4 = com.google.common.p4535g.C59164cc.f157204f
            com.google.common.g.h r5 = r8.f157291a
            double r5 = r5.f157290b
            double r4 = r4.mo56543d(r5)
            int r4 = com.google.common.p4535g.C59164cc.m91751e(r4)
            int r3 = java.lang.Math.min(r3, r4)
            r3 = r3 ^ r1
            int r4 = r7.f157152c
            int r4 = r4 + r0
            int r4 = r4 + -1
            com.google.common.g.cc r0 = com.google.common.p4535g.C59164cc.f157204f
            com.google.common.g.h r8 = r8.f157292b
            double r5 = r8.f157290b
            double r5 = r0.mo56543d(r5)
            int r8 = com.google.common.p4535g.C59164cc.m91751e(r5)
            int r8 = java.lang.Math.min(r4, r8)
            r8 = r8 ^ r2
            r8 = r8 | r3
            int r8 = r8 + r8
            int r8 = r8 + 1
            long r3 = (long) r8
            int r8 = java.lang.Long.numberOfLeadingZeros(r3)
            int r8 = 63 - r8
            int r8 = 30 - r8
            int r0 = r7.f157154e
            if (r8 > r0) goto L_0x00ca
            com.google.common.g.t r8 = r7.f157150a
            return r8
        L_0x00ca:
            com.google.common.g.t r0 = r7.f157150a
            int r0 = r0.mo56664b()
            com.google.common.g.t r0 = com.google.common.p4535g.C59226t.m91937r(r0, r1, r2)
            com.google.common.g.t r8 = r0.mo56676w(r8)
            return r8
        L_0x00d9:
            com.google.common.g.t r8 = r7.f157150a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59135ba.mo56494b(com.google.common.g.i):com.google.common.g.t");
    }

    /* renamed from: c */
    public final C59135ba mo56495c(int i, int i2) {
        return new C59135ba(this, C59222p.f157314f[this.f157153d][i + i + i2], i, i2);
    }

    public C59135ba(C59135ba baVar, int i, int i2, int i3) {
        this.f157155f = baVar.f157155f;
        C59215i iVar = new C59215i(baVar.f157156g);
        this.f157156g = iVar;
        int i4 = 1;
        int i5 = baVar.f157154e + 1;
        this.f157154e = i5;
        C59226t tVar = baVar.f157150a;
        this.f157150a = new C59226t(tVar.f157334b + (((long) ((i + i) - 3)) * (Long.lowestOneBit(tVar.f157334b) >>> 2)));
        int g = C59226t.m91930g(i5);
        this.f157151b = baVar.f157151b + (i2 * g);
        this.f157152c = baVar.f157152c + (g * i3);
        this.f157153d = C59222p.m91899e(i) ^ baVar.f157153d;
        C59215i a = baVar.mo56493a();
        int i6 = i2 == 0 ? 2 : 1;
        C59213g.m91848b(i6, iVar.f157291a, C59213g.m91847a(i6, a.f157291a));
        i4 = 1 != i3 ? 2 : i4;
        C59213g.m91848b(i4, iVar.f157292b, C59213g.m91847a(i4, a.f157292b));
    }
}
