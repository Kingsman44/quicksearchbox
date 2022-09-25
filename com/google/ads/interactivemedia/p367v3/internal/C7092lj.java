package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lj */
/* compiled from: PG */
final class C7092lj extends C7091li {

    /* renamed from: b */
    private final aee f22727b = new aee(aec.f20417a);

    /* renamed from: c */
    private final aee f22728c = new aee(4);

    /* renamed from: d */
    private int f22729d;

    /* renamed from: e */
    private boolean f22730e;

    /* renamed from: f */
    private boolean f22731f;

    /* renamed from: g */
    private int f22732g;

    public C7092lj(C7073kr krVar) {
        super(krVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16141a(aee aee) {
        int n = aee.mo14560n();
        int i = n >> 4;
        int i2 = n & 15;
        if (i2 == 7) {
            this.f22732g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new C7090lh(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo16142b(aee aee, long j) {
        int n = aee.mo14560n();
        long s = j + (((long) aee.mo14565s()) * 1000);
        if (n == 0) {
            if (!this.f22730e) {
                aee aee2 = new aee(new byte[aee.mo14550d()]);
                aee.mo14559m(aee2.mo14555i(), 0, aee.mo14550d());
                aev a = aev.m18557a(aee2);
                this.f22729d = a.f20481b;
                C6863cx cxVar = new C6863cx();
                cxVar.mo15630ae("video/avc");
                cxVar.mo15635aj(a.f20482c);
                cxVar.mo15615Q(a.f20483d);
                cxVar.mo15626aa(a.f20484e);
                cxVar.mo15618T(a.f20480a);
                this.f22726a.mo16102a(cxVar.mo15625a());
                this.f22730e = true;
                return false;
            }
        } else if (n == 1 && this.f22730e) {
            int i = this.f22732g == 1 ? 1 : 0;
            if (!this.f22731f && i == 0) {
                return false;
            }
            byte[] i2 = this.f22728c.mo14555i();
            i2[0] = 0;
            i2[1] = 0;
            i2[2] = 0;
            int i3 = 4 - this.f22729d;
            int i4 = 0;
            while (aee.mo14550d() > 0) {
                aee.mo14559m(this.f22728c.mo14555i(), i3, this.f22729d);
                this.f22728c.mo14554h(0);
                int B = this.f22728c.mo14538B();
                this.f22727b.mo14554h(0);
                this.f22726a.mo16105d(this.f22727b, 4);
                this.f22726a.mo16105d(aee, B);
                i4 = i4 + 4 + B;
            }
            this.f22726a.mo16103b(s, i, i4, 0, (C7072kq) null);
            this.f22731f = true;
            return true;
        }
        return false;
    }
}
