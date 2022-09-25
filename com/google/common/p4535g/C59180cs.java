package com.google.common.p4535g;

/* renamed from: com.google.common.g.cs */
/* compiled from: PG */
final class C59180cs {

    /* renamed from: a */
    public boolean f157244a = false;

    /* renamed from: b */
    public C59136bb f157245b;

    /* renamed from: c */
    public C59226t f157246c;

    /* renamed from: d */
    public final int[] f157247d;

    /* renamed from: e */
    public int f157248e;

    /* renamed from: f */
    public final C59200dl[] f157249f;

    /* renamed from: g */
    private C59136bb f157250g;

    /* renamed from: h */
    private C59136bb f157251h;

    /* renamed from: i */
    private C59119al f157252i;

    public C59180cs(int i) {
        this.f157249f = new C59200dl[i];
        this.f157247d = new int[i];
        long i2 = C59226t.m91931i(0);
        this.f157246c = new C59226t((i2 - Long.lowestOneBit(i2)) + C59226t.m91932k(30));
        this.f157245b = C59222p.f157312d;
        mo56555a(C59136bb.m91671n(C59164cc.m91756k(0, -1.0d, -1.0d)));
    }

    /* renamed from: a */
    public final void mo56555a(C59136bb bbVar) {
        this.f157250g = this.f157245b;
        this.f157245b = bbVar;
        this.f157252i = new C59119al(this.f157250g, this.f157245b);
        this.f157251h = null;
    }

    /* renamed from: b */
    public final void mo56556b(int i, C59136bb bbVar, C59136bb bbVar2) {
        if (bbVar != this.f157251h) {
            this.f157252i.mo56436d(bbVar);
        }
        if (this.f157252i.mo56437e(bbVar2)) {
            mo56557c(i);
        }
        this.f157251h = bbVar2;
    }

    /* renamed from: c */
    public final void mo56557c(int i) {
        int[] iArr;
        int i2;
        int i3 = this.f157248e;
        int i4 = 0;
        if (i3 == 0) {
            this.f157247d[0] = i;
            this.f157248e = 1;
            return;
        }
        int[] iArr2 = this.f157247d;
        if (iArr2[0] == i) {
            int i5 = i3 - 1;
            this.f157248e = i5;
            if (i3 > 1) {
                System.arraycopy(iArr2, 1, iArr2, 0, i5);
                return;
            }
            return;
        }
        do {
            iArr = this.f157247d;
            int i6 = iArr[i4];
            if (i6 < i) {
                i4++;
                i2 = this.f157248e;
            } else if (i6 == i) {
                int i7 = this.f157248e - 1;
                this.f157248e = i7;
                System.arraycopy(iArr, i4 + 1, iArr, i4, i7 - i4);
                return;
            } else {
                System.arraycopy(iArr, i4, iArr, i4 + 1, this.f157248e - i4);
                this.f157247d[i4] = i;
                this.f157248e++;
                return;
            }
        } while (i4 != i2);
        this.f157248e = i2 + 1;
        iArr[i2] = i;
    }
}
