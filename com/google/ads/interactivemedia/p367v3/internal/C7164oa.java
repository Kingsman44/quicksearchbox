package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oa */
/* compiled from: PG */
public final class C7164oa implements C7171oh {

    /* renamed from: a */
    private final aed f23177a;

    /* renamed from: b */
    private final aee f23178b;

    /* renamed from: c */
    private final String f23179c;

    /* renamed from: d */
    private String f23180d;

    /* renamed from: e */
    private C7073kr f23181e;

    /* renamed from: f */
    private int f23182f;

    /* renamed from: g */
    private int f23183g;

    /* renamed from: h */
    private boolean f23184h;

    /* renamed from: i */
    private boolean f23185i;

    /* renamed from: j */
    private long f23186j;

    /* renamed from: k */
    private C6864cy f23187k;

    /* renamed from: l */
    private int f23188l;

    /* renamed from: m */
    private long f23189m;

    public C7164oa() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo16215a() {
        this.f23182f = 0;
        this.f23183g = 0;
        this.f23184h = false;
        this.f23185i = false;
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23180d = pqVar.mo16280c();
        this.f23181e = kaVar.mo16113ak(pqVar.mo16279b(), 1);
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23189m = j;
    }

    /* renamed from: d */
    public final void mo16218d(aee aee) {
        byte b;
        boolean z;
        ary.m19466s(this.f23181e);
        while (aee.mo14550d() > 0) {
            int i = this.f23182f;
            if (i == 0) {
                while (true) {
                    if (aee.mo14550d() > 0) {
                        if (this.f23184h) {
                            int n = aee.mo14560n();
                            this.f23184h = n == 172;
                            b = 65;
                            if (n == 64) {
                                z = false;
                                break;
                            } else if (n == 65) {
                                z = true;
                                break;
                            }
                        } else {
                            this.f23184h = aee.mo14560n() == 172;
                        }
                    } else {
                        break;
                    }
                }
                this.f23185i = z;
                this.f23182f = 1;
                this.f23178b.mo14555i()[0] = -84;
                byte[] i2 = this.f23178b.mo14555i();
                if (true != this.f23185i) {
                    b = 64;
                }
                i2[1] = b;
                this.f23183g = 2;
            } else if (i != 1) {
                int min = Math.min(aee.mo14550d(), this.f23188l - this.f23183g);
                this.f23181e.mo16105d(aee, min);
                int i3 = this.f23183g + min;
                this.f23183g = i3;
                int i4 = this.f23188l;
                if (i3 == i4) {
                    this.f23181e.mo16103b(this.f23189m, 1, i4, 0, (C7072kq) null);
                    this.f23189m += this.f23186j;
                    this.f23182f = 0;
                }
            } else {
                byte[] i5 = this.f23178b.mo14555i();
                int min2 = Math.min(aee.mo14550d(), 16 - this.f23183g);
                aee.mo14559m(i5, this.f23183g, min2);
                int i6 = this.f23183g + min2;
                this.f23183g = i6;
                if (i6 == 16) {
                    this.f23177a.mo14528e(0);
                    C6964gq a = C6965gr.m20521a(this.f23177a);
                    C6864cy cyVar = this.f23187k;
                    if (cyVar == null || cyVar.f21825y != 2 || a.f22218a != cyVar.f21826z || !"audio/ac4".equals(cyVar.f21812l)) {
                        C6863cx cxVar = new C6863cx();
                        cxVar.mo15617S(this.f23180d);
                        cxVar.mo15630ae("audio/ac4");
                        cxVar.mo15606H(2);
                        cxVar.mo15631af(a.f22218a);
                        cxVar.mo15620V(this.f23179c);
                        C6864cy a2 = cxVar.mo15625a();
                        this.f23187k = a2;
                        this.f23181e.mo16102a(a2);
                    }
                    this.f23188l = a.f22220c;
                    this.f23186j = (((long) a.f22221d) * 1000000) / ((long) this.f23187k.f21826z);
                    this.f23178b.mo14554h(0);
                    this.f23181e.mo16105d(this.f23178b, 16);
                    this.f23182f = 2;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo16219e() {
    }

    public C7164oa(String str) {
        aed aed = new aed(new byte[16]);
        this.f23177a = aed;
        this.f23178b = new aee(aed.f20421a);
        this.f23182f = 0;
        this.f23183g = 0;
        this.f23184h = false;
        this.f23185i = false;
        this.f23179c = str;
    }
}
