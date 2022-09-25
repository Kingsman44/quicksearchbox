package com.google.common.p4535g;

/* renamed from: com.google.common.g.al */
/* compiled from: PG */
public final class C59119al {

    /* renamed from: a */
    public C59136bb f157110a;

    /* renamed from: b */
    int f157111b;

    /* renamed from: c */
    private C59136bb f157112c;

    /* renamed from: d */
    private C59136bb f157113d;

    /* renamed from: e */
    private C59136bb f157114e;

    /* renamed from: f */
    private int f157115f;

    /* renamed from: g */
    private boolean f157116g;

    /* renamed from: h */
    private C59136bb f157117h;

    /* renamed from: i */
    private C59136bb f157118i;

    public C59119al() {
    }

    /* renamed from: b */
    static int m91574b(C59136bb bbVar, C59136bb bbVar2) {
        double d = C59222p.f157311c * 1.8274d;
        double b = bbVar.mo56497b(bbVar2);
        if (b >= d) {
            return 1;
        }
        return b <= (-d) ? -1 : 0;
    }

    /* renamed from: f */
    private static int m91575f(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3, C59136bb bbVar4) {
        int b = m91574b(bbVar4, bbVar3);
        return b == 0 ? C59147bm.m91710a(bbVar, bbVar2, bbVar3) : b;
    }

    /* renamed from: a */
    public final int mo56434a(C59136bb bbVar) {
        int b = m91574b(this.f157114e, bbVar);
        int i = -b;
        int i2 = -1;
        if (this.f157115f != i || b == 0) {
            this.f157111b = b;
            if (!this.f157116g) {
                C59136bb n = C59136bb.m91671n(C59222p.m91902h(this.f157112c, this.f157113d));
                this.f157117h = C59136bb.m91668k(this.f157112c, n);
                this.f157118i = C59136bb.m91668k(n, this.f157113d);
                this.f157116g = true;
            }
            double sqrt = ((1.0d / Math.sqrt(3.0d)) + 1.5d) * C59222p.f157311c;
            if ((this.f157110a.mo56497b(this.f157117h) <= sqrt || bbVar.mo56497b(this.f157117h) <= sqrt) && (this.f157110a.mo56497b(this.f157118i) <= sqrt || bbVar.mo56497b(this.f157118i) <= sqrt)) {
                if (this.f157112c.mo56506q(this.f157110a) || this.f157112c.mo56506q(bbVar) || this.f157113d.mo56506q(this.f157110a) || this.f157113d.mo56506q(bbVar)) {
                    i2 = 0;
                } else if (!this.f157112c.mo56506q(this.f157113d) && !this.f157110a.mo56506q(bbVar)) {
                    if (this.f157115f == 0) {
                        this.f157115f = -C59147bm.m91710a(this.f157112c, this.f157113d, this.f157110a);
                    }
                    int i3 = this.f157111b;
                    if (i3 == 0) {
                        i3 = C59147bm.m91710a(this.f157112c, this.f157113d, bbVar);
                        this.f157111b = i3;
                    }
                    if (i3 == this.f157115f) {
                        C59136bb k = C59136bb.m91668k(this.f157110a, bbVar);
                        if ((-m91575f(this.f157110a, bbVar, this.f157113d, k)) == this.f157115f && m91575f(this.f157110a, bbVar, this.f157112c, k) == this.f157115f) {
                            i2 = 1;
                        }
                    }
                }
            }
            this.f157110a = bbVar;
            this.f157115f = -this.f157111b;
            return i2;
        }
        this.f157110a = bbVar;
        this.f157115f = i;
        return -1;
    }

    /* renamed from: c */
    public final void mo56435c(C59136bb bbVar, C59136bb bbVar2) {
        this.f157112c = bbVar;
        this.f157113d = bbVar2;
        this.f157110a = null;
        this.f157114e = C59136bb.m91668k(bbVar, bbVar2);
        this.f157116g = false;
    }

    /* renamed from: d */
    public final void mo56436d(C59136bb bbVar) {
        this.f157110a = bbVar;
        this.f157115f = -m91574b(this.f157114e, bbVar);
    }

    /* renamed from: e */
    public final boolean mo56437e(C59136bb bbVar) {
        C59136bb bbVar2 = this.f157110a;
        int a = mo56434a(bbVar);
        if (a < 0) {
            return false;
        }
        if (a > 0) {
            return true;
        }
        return C59123ap.m91594n(this.f157112c, this.f157113d, bbVar2, bbVar);
    }

    public C59119al(C59136bb bbVar, C59136bb bbVar2) {
        mo56435c(bbVar, bbVar2);
    }

    public C59119al(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3) {
        mo56435c(bbVar, bbVar2);
        mo56436d(bbVar3);
    }
}
