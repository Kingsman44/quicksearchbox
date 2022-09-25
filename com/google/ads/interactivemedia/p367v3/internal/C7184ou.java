package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ou */
/* compiled from: PG */
public final class C7184ou implements C7171oh {

    /* renamed from: a */
    private final aee f23395a;

    /* renamed from: b */
    private final C7012ik f23396b;

    /* renamed from: c */
    private final String f23397c;

    /* renamed from: d */
    private C7073kr f23398d;

    /* renamed from: e */
    private String f23399e;

    /* renamed from: f */
    private int f23400f;

    /* renamed from: g */
    private int f23401g;

    /* renamed from: h */
    private boolean f23402h;

    /* renamed from: i */
    private boolean f23403i;

    /* renamed from: j */
    private long f23404j;

    /* renamed from: k */
    private int f23405k;

    /* renamed from: l */
    private long f23406l;

    public C7184ou() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo16215a() {
        this.f23400f = 0;
        this.f23401g = 0;
        this.f23403i = false;
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        pqVar.mo16278a();
        this.f23399e = pqVar.mo16280c();
        this.f23398d = kaVar.mo16113ak(pqVar.mo16279b(), 1);
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        this.f23406l = j;
    }

    /* renamed from: d */
    public final void mo16218d(aee aee) {
        ary.m19466s(this.f23398d);
        while (aee.mo14550d() > 0) {
            int i = this.f23400f;
            if (i == 0) {
                byte[] i2 = aee.mo14555i();
                int g = aee.mo14553g();
                int e = aee.mo14551e();
                while (true) {
                    if (g >= e) {
                        aee.mo14554h(e);
                        break;
                    }
                    byte b = i2[g];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f23403i && (b & 224) == 224;
                    this.f23403i = z;
                    if (z2) {
                        aee.mo14554h(g + 1);
                        this.f23403i = false;
                        this.f23395a.mo14555i()[1] = i2[g];
                        this.f23401g = 2;
                        this.f23400f = 1;
                        break;
                    }
                    g++;
                }
            } else if (i != 1) {
                int min = Math.min(aee.mo14550d(), this.f23405k - this.f23401g);
                this.f23398d.mo16105d(aee, min);
                int i3 = this.f23401g + min;
                this.f23401g = i3;
                int i4 = this.f23405k;
                if (i3 >= i4) {
                    this.f23398d.mo16103b(this.f23406l, 1, i4, 0, (C7072kq) null);
                    this.f23406l += this.f23404j;
                    this.f23401g = 0;
                    this.f23400f = 0;
                }
            } else {
                int min2 = Math.min(aee.mo14550d(), 4 - this.f23401g);
                aee.mo14559m(this.f23395a.mo14555i(), this.f23401g, min2);
                int i5 = this.f23401g + min2;
                this.f23401g = i5;
                if (i5 >= 4) {
                    this.f23395a.mo14554h(0);
                    if (!this.f23396b.mo16016a(this.f23395a.mo14568v())) {
                        this.f23401g = 0;
                        this.f23400f = 1;
                    } else {
                        C7012ik ikVar = this.f23396b;
                        this.f23405k = ikVar.f22427c;
                        if (!this.f23402h) {
                            this.f23404j = (((long) ikVar.f22431g) * 1000000) / ((long) ikVar.f22428d);
                            C6863cx cxVar = new C6863cx();
                            cxVar.mo15617S(this.f23399e);
                            cxVar.mo15630ae(this.f23396b.f22426b);
                            cxVar.mo15621W(4096);
                            cxVar.mo15606H(this.f23396b.f22429e);
                            cxVar.mo15631af(this.f23396b.f22428d);
                            cxVar.mo15620V(this.f23397c);
                            this.f23398d.mo16102a(cxVar.mo15625a());
                            this.f23402h = true;
                        }
                        this.f23395a.mo14554h(0);
                        this.f23398d.mo16105d(this.f23395a, 4);
                        this.f23400f = 2;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo16219e() {
    }

    public C7184ou(String str) {
        this.f23400f = 0;
        aee aee = new aee(4);
        this.f23395a = aee;
        aee.mo14555i()[0] = -1;
        this.f23396b = new C7012ik();
        this.f23397c = str;
    }
}
