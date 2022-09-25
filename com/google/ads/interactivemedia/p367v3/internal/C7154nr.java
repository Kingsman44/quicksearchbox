package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nr */
/* compiled from: PG */
abstract class C7154nr {

    /* renamed from: a */
    private final C7148nl f23118a = new C7148nl();

    /* renamed from: b */
    private C7073kr f23119b;

    /* renamed from: c */
    private C7056ka f23120c;

    /* renamed from: d */
    private C7150nn f23121d;

    /* renamed from: e */
    private long f23122e;

    /* renamed from: f */
    private long f23123f;

    /* renamed from: g */
    private long f23124g;

    /* renamed from: h */
    private int f23125h;

    /* renamed from: i */
    private int f23126i;

    /* renamed from: j */
    private C7152np f23127j;

    /* renamed from: k */
    private long f23128k;

    /* renamed from: l */
    private boolean f23129l;

    /* renamed from: m */
    private boolean f23130m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16197a(boolean z) {
        int i;
        if (z) {
            this.f23127j = new C7152np();
            this.f23123f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f23125h = i;
        this.f23122e = -1;
        this.f23124g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo16198b(aee aee);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo16199c(aee aee, long j, C7152np npVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo16209e(C7056ka kaVar, C7073kr krVar) {
        this.f23120c = kaVar;
        this.f23119b = krVar;
        mo16197a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo16210f(long j, long j2) {
        this.f23118a.mo16200a();
        if (j == 0) {
            mo16197a(!this.f23129l);
        } else if (this.f23125h != 0) {
            long h = mo16212h(j2);
            this.f23122e = h;
            this.f23121d.mo16193a(h);
            this.f23125h = 2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final long mo16211g(long j) {
        return (j * 1000000) / ((long) this.f23126i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final long mo16212h(long j) {
        return (((long) this.f23126i) * j) / 1000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo16213i(long j) {
        this.f23124g = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo16214j(C7050jv jvVar, C7067kl klVar) {
        C7050jv jvVar2 = jvVar;
        int i = this.f23125h;
        if (i == 0) {
            while (this.f23118a.mo16204e(jvVar2)) {
                this.f23128k = jvVar.mo16099l() - this.f23123f;
                if (mo16199c(this.f23118a.mo16202c(), this.f23123f, this.f23127j)) {
                    this.f23123f = jvVar.mo16099l();
                } else {
                    C6864cy cyVar = this.f23127j.f23116a;
                    this.f23126i = cyVar.f21826z;
                    if (!this.f23130m) {
                        this.f23119b.mo16102a(cyVar);
                        this.f23130m = true;
                    }
                    C7150nn nnVar = this.f23127j.f23117b;
                    if (nnVar != null) {
                        this.f23121d = nnVar;
                    } else if (jvVar.mo16100m() == -1) {
                        this.f23121d = new C7153nq((byte[]) null);
                    } else {
                        C7149nm b = this.f23118a.mo16201b();
                        this.f23121d = new C7143ng(this, this.f23123f, jvVar.mo16100m(), (long) (b.f23110e + b.f23111f), b.f23108c, (b.f23107b & 4) != 0);
                    }
                    this.f23127j = null;
                    this.f23125h = 2;
                    this.f23118a.mo16203d();
                    return 0;
                }
            }
            this.f23125h = 3;
            return -1;
        } else if (i == 1) {
            jvVar2.mo16091d((int) this.f23123f);
            this.f23125h = 2;
            return 0;
        } else if (i == 2) {
            long g = this.f23121d.mo16195g(jvVar2);
            if (g >= 0) {
                klVar.f22624a = g;
                return 1;
            }
            if (g < -1) {
                mo16213i(-(g + 2));
            }
            if (!this.f23129l) {
                C7070ko b2 = this.f23121d.mo16194b();
                ary.m19466s(b2);
                this.f23120c.mo16115am(b2);
                this.f23129l = true;
            }
            if (this.f23128k > 0 || this.f23118a.mo16204e(jvVar2)) {
                this.f23128k = 0;
                aee c = this.f23118a.mo16202c();
                long b3 = mo16198b(c);
                if (b3 >= 0) {
                    long j = this.f23124g;
                    if (j + b3 >= this.f23122e) {
                        long g2 = mo16211g(j);
                        this.f23119b.mo16105d(c, c.mo14551e());
                        this.f23119b.mo16103b(g2, 1, c.mo14551e(), 0, (C7072kq) null);
                        this.f23122e = -1;
                    }
                }
                this.f23124g += b3;
                return 0;
            }
            this.f23125h = 3;
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }
}
