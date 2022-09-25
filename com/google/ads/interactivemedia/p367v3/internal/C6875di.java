package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.di */
/* compiled from: PG */
final class C6875di {

    /* renamed from: a */
    public final C7320tv f21862a;

    /* renamed from: b */
    public final Object f21863b;

    /* renamed from: c */
    public final C7354vb[] f21864c;

    /* renamed from: d */
    public boolean f21865d;

    /* renamed from: e */
    public boolean f21866e;

    /* renamed from: f */
    public C6876dj f21867f;

    /* renamed from: g */
    public boolean f21868g;

    /* renamed from: h */
    private final boolean[] f21869h;

    /* renamed from: i */
    private final C6898ee[] f21870i;

    /* renamed from: j */
    private final abf f21871j;

    /* renamed from: k */
    private final C6885ds f21872k;

    /* renamed from: l */
    private C6875di f21873l;

    /* renamed from: m */
    private C7362vj f21874m = C7362vj.f24051a;

    /* renamed from: n */
    private abg f21875n;

    /* renamed from: o */
    private long f21876o;

    public C6875di(C6898ee[] eeVarArr, long j, abf abf, acc acc, C6885ds dsVar, C6876dj djVar, abg abg) {
        this.f21870i = eeVarArr;
        this.f21876o = j;
        this.f21871j = abf;
        this.f21872k = dsVar;
        this.f21863b = djVar.f21877a.f23859a;
        this.f21867f = djVar;
        this.f21875n = abg;
        int length = eeVarArr.length;
        this.f21864c = new C7354vb[length];
        this.f21869h = new boolean[length];
        C7321tw twVar = djVar.f21877a;
        long j2 = djVar.f21878b;
        long j3 = djVar.f21880d;
        C7320tv m = dsVar.mo15729m(twVar, acc, j2);
        if (!(j3 == -9223372036854775807L || j3 == Long.MIN_VALUE)) {
            m = new C7294sw(m, j3);
        }
        this.f21862a = m;
    }

    /* renamed from: t */
    private final void m20000t() {
        if (m20002v()) {
            int i = 0;
            while (true) {
                abg abg = this.f21875n;
                if (i < abg.f20184a) {
                    boolean a = abg.mo14382a(i);
                    aba a2 = this.f21875n.f20186c.mo14373a(i);
                    if (a && a2 != null) {
                        a2.mo14324f();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    private final void m20001u() {
        if (m20002v()) {
            int i = 0;
            while (true) {
                abg abg = this.f21875n;
                if (i < abg.f20184a) {
                    boolean a = abg.mo14382a(i);
                    aba a2 = this.f21875n.f20186c.mo14373a(i);
                    if (a && a2 != null) {
                        a2.mo14325g();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    private final boolean m20002v() {
        return this.f21873l == null;
    }

    /* renamed from: a */
    public final long mo15670a(long j) {
        return j + this.f21876o;
    }

    /* renamed from: b */
    public final long mo15671b(long j) {
        return j - this.f21876o;
    }

    /* renamed from: c */
    public final long mo15672c() {
        return this.f21876o;
    }

    /* renamed from: d */
    public final long mo15673d() {
        return this.f21867f.f21878b + this.f21876o;
    }

    /* renamed from: e */
    public final boolean mo15674e() {
        if (this.f21865d) {
            return !this.f21866e || this.f21862a.mo16504h() == Long.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: f */
    public final long mo15675f() {
        if (!this.f21865d) {
            return this.f21867f.f21878b;
        }
        long h = this.f21866e ? this.f21862a.mo16504h() : Long.MIN_VALUE;
        return h == Long.MIN_VALUE ? this.f21867f.f21881e : h;
    }

    /* renamed from: g */
    public final long mo15676g() {
        if (!this.f21865d) {
            return 0;
        }
        return this.f21862a.mo16507l();
    }

    /* renamed from: h */
    public final void mo15677h(float f, C6912es esVar) {
        this.f21865d = true;
        this.f21874m = this.f21862a.mo16499c();
        abg k = mo15680k(f, esVar);
        C6876dj djVar = this.f21867f;
        long j = djVar.f21878b;
        long j2 = djVar.f21881e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long r = mo15687r(k, j);
        long j3 = this.f21876o;
        C6876dj djVar2 = this.f21867f;
        this.f21876o = j3 + (djVar2.f21878b - r);
        this.f21867f = djVar2.mo15689a(r);
    }

    /* renamed from: i */
    public final void mo15678i(long j) {
        ary.m19464q(m20002v());
        if (this.f21865d) {
            this.f21862a.mo16502f(mo15671b(j));
        }
    }

    /* renamed from: j */
    public final void mo15679j(long j) {
        ary.m19464q(m20002v());
        this.f21862a.mo16508n(mo15671b(j));
    }

    /* renamed from: k */
    public final abg mo15680k(float f, C6912es esVar) {
        abf abf = this.f21871j;
        C6898ee[] eeVarArr = this.f21870i;
        C7362vj vjVar = this.f21874m;
        C7321tw twVar = this.f21867f.f21877a;
        abg i = abf.mo14381i(eeVarArr, vjVar);
        for (aba aba : i.f20186c.mo14374b()) {
            if (aba != null) {
                aba.mo14326h(f);
            }
        }
        return i;
    }

    /* renamed from: l */
    public final long mo15681l(abg abg, long j, boolean z, boolean[] zArr) {
        abg abg2 = abg;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= abg2.f20184a) {
                break;
            }
            boolean[] zArr2 = this.f21869h;
            if (z || !abg2.mo14383b(this.f21875n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        C7354vb[] vbVarArr = this.f21864c;
        int i2 = 0;
        while (true) {
            C6898ee[] eeVarArr = this.f21870i;
            if (i2 >= eeVarArr.length) {
                break;
            }
            if (eeVarArr[i2].mo15509a() == 6) {
                vbVarArr[i2] = null;
            }
            i2++;
        }
        m20001u();
        this.f21875n = abg2;
        m20000t();
        abb abb = abg2.f20186c;
        long d = this.f21862a.mo16500d(abb.mo14374b(), this.f21869h, this.f21864c, zArr, j);
        C7354vb[] vbVarArr2 = this.f21864c;
        int i3 = 0;
        while (true) {
            C6898ee[] eeVarArr2 = this.f21870i;
            if (i3 >= eeVarArr2.length) {
                break;
            }
            if (eeVarArr2[i3].mo15509a() == 6 && this.f21875n.mo14382a(i3)) {
                vbVarArr2[i3] = new C7309tk();
            }
            i3++;
        }
        this.f21866e = false;
        int i4 = 0;
        while (true) {
            C7354vb[] vbVarArr3 = this.f21864c;
            if (i4 >= vbVarArr3.length) {
                return d;
            }
            if (vbVarArr3[i4] != null) {
                ary.m19464q(abg2.mo14382a(i4));
                if (this.f21870i[i4].mo15509a() != 6) {
                    this.f21866e = true;
                }
            } else {
                ary.m19464q(abb.mo14373a(i4) == null);
            }
            i4++;
        }
    }

    /* renamed from: m */
    public final void mo15682m() {
        m20001u();
        long j = this.f21867f.f21880d;
        C6885ds dsVar = this.f21872k;
        C7320tv tvVar = this.f21862a;
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            dsVar.mo15722d(tvVar);
            return;
        }
        try {
            dsVar.mo15722d(((C7294sw) tvVar).f23775a);
        } catch (RuntimeException e) {
            adu.m18341b("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: n */
    public final void mo15683n(C6875di diVar) {
        if (diVar != this.f21873l) {
            m20001u();
            this.f21873l = diVar;
            m20000t();
        }
    }

    /* renamed from: o */
    public final C6875di mo15684o() {
        return this.f21873l;
    }

    /* renamed from: p */
    public final C7362vj mo15685p() {
        return this.f21874m;
    }

    /* renamed from: q */
    public final abg mo15686q() {
        return this.f21875n;
    }

    /* renamed from: r */
    public final long mo15687r(abg abg, long j) {
        return mo15681l(abg, j, false, new boolean[this.f21870i.length]);
    }

    /* renamed from: s */
    public final void mo15688s() {
        this.f21876o = 0;
    }
}
