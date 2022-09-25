package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nx */
/* compiled from: PG */
public final class C7160nx implements C7171oh {

    /* renamed from: a */
    private final aed f23154a;

    /* renamed from: b */
    private final aee f23155b;

    /* renamed from: c */
    private final String f23156c;

    /* renamed from: d */
    private String f23157d;

    /* renamed from: e */
    private C7073kr f23158e;

    /* renamed from: f */
    private int f23159f;

    /* renamed from: g */
    private int f23160g;

    /* renamed from: h */
    private boolean f23161h;

    /* renamed from: i */
    private long f23162i;

    /* renamed from: j */
    private C6864cy f23163j;

    /* renamed from: k */
    private int f23164k;

    /* renamed from: l */
    private long f23165l;

    public C7160nx() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo16215a() {
        this.f23159f = 0;
        this.f23160g = 0;
        this.f23161h = false;
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23157d = pqVar.mo16280c();
        this.f23158e = kaVar.mo16113ak(pqVar.mo16279b(), 1);
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23165l = j;
    }

    /* renamed from: d */
    public final void mo16218d(aee aee) {
        ary.m19466s(this.f23158e);
        while (aee.mo14550d() > 0) {
            int i = this.f23159f;
            if (i == 0) {
                while (true) {
                    if (aee.mo14550d() <= 0) {
                        break;
                    } else if (!this.f23161h) {
                        this.f23161h = aee.mo14560n() == 11;
                    } else {
                        int n = aee.mo14560n();
                        if (n == 119) {
                            this.f23161h = false;
                            this.f23159f = 1;
                            this.f23155b.mo14555i()[0] = 11;
                            this.f23155b.mo14555i()[1] = 119;
                            this.f23160g = 2;
                            break;
                        }
                        this.f23161h = n == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(aee.mo14550d(), this.f23164k - this.f23160g);
                this.f23158e.mo16105d(aee, min);
                int i2 = this.f23160g + min;
                this.f23160g = i2;
                int i3 = this.f23164k;
                if (i2 == i3) {
                    this.f23158e.mo16103b(this.f23165l, 1, i3, 0, (C7072kq) null);
                    this.f23165l += this.f23162i;
                    this.f23159f = 0;
                }
            } else {
                byte[] i4 = this.f23155b.mo14555i();
                int min2 = Math.min(aee.mo14550d(), 128 - this.f23160g);
                aee.mo14559m(i4, this.f23160g, min2);
                int i5 = this.f23160g + min2;
                this.f23160g = i5;
                if (i5 == 128) {
                    this.f23154a.mo14528e(0);
                    C6962go c = C6963gp.m20517c(this.f23154a);
                    C6864cy cyVar = this.f23163j;
                    if (cyVar == null || c.f22208c != cyVar.f21825y || c.f22207b != cyVar.f21826z || !aeu.m18533c(c.f22206a, cyVar.f21812l)) {
                        C6863cx cxVar = new C6863cx();
                        cxVar.mo15617S(this.f23157d);
                        cxVar.mo15630ae(c.f22206a);
                        cxVar.mo15606H(c.f22208c);
                        cxVar.mo15631af(c.f22207b);
                        cxVar.mo15620V(this.f23156c);
                        C6864cy a = cxVar.mo15625a();
                        this.f23163j = a;
                        this.f23158e.mo16102a(a);
                    }
                    this.f23164k = c.f22209d;
                    this.f23162i = (((long) c.f22210e) * 1000000) / ((long) this.f23163j.f21826z);
                    this.f23155b.mo14554h(0);
                    this.f23158e.mo16105d(this.f23155b, 128);
                    this.f23159f = 2;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo16219e() {
    }

    public C7160nx(String str) {
        aed aed = new aed(new byte[128]);
        this.f23154a = aed;
        this.f23155b = new aee(aed.f20421a);
        this.f23159f = 0;
        this.f23156c = str;
    }
}
