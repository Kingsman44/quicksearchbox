package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.util.Pair;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dl */
/* compiled from: PG */
final class C6878dl {

    /* renamed from: a */
    private final C6910eq f21888a = new C6910eq();

    /* renamed from: b */
    private final C6911er f21889b = new C6911er();

    /* renamed from: c */
    private final C6957gj f21890c;

    /* renamed from: d */
    private final Handler f21891d;

    /* renamed from: e */
    private long f21892e;

    /* renamed from: f */
    private int f21893f;

    /* renamed from: g */
    private boolean f21894g;

    /* renamed from: h */
    private C6875di f21895h;

    /* renamed from: i */
    private C6875di f21896i;

    /* renamed from: j */
    private C6875di f21897j;

    /* renamed from: k */
    private int f21898k;

    /* renamed from: l */
    private Object f21899l;

    /* renamed from: m */
    private long f21900m;

    public C6878dl(C6957gj gjVar, Handler handler) {
        this.f21890c = gjVar;
        this.f21891d = handler;
    }

    /* renamed from: A */
    private final boolean m20023A(C6912es esVar, C7321tw twVar, boolean z) {
        int i = esVar.mo15481i(twVar.f23859a);
        if (esVar.mo15852v(esVar.mo15856z(i, this.f21888a).f22038c, this.f21889b).f22051i) {
            return false;
        }
        return esVar.mo15853w(i, this.f21888a, this.f21889b, this.f21893f, this.f21894g) == -1 && z;
    }

    /* renamed from: B */
    private static final boolean m20024B(C7321tw twVar) {
        return !twVar.mo16542b() && twVar.f23863e == -1;
    }

    /* renamed from: s */
    private final void m20025s() {
        C7321tw twVar;
        if (this.f21890c != null) {
            ark r = arn.m19409r();
            for (C6875di diVar = this.f21895h; diVar != null; diVar = diVar.mo15684o()) {
                r.mo15288d(diVar.f21867f.f21877a);
            }
            C6875di diVar2 = this.f21896i;
            if (diVar2 == null) {
                twVar = null;
            } else {
                twVar = diVar2.f21867f.f21877a;
            }
            this.f21891d.post(new C6877dk(this, r, twVar));
        }
    }

    /* renamed from: t */
    private static C7321tw m20026t(C6912es esVar, Object obj, long j, long j2, C6910eq eqVar) {
        esVar.mo15479g(obj, eqVar);
        int f = eqVar.mo15837f(j);
        if (f == -1) {
            return new C7321tw(obj, j2, eqVar.mo15838g(j));
        }
        return new C7321tw(obj, f, eqVar.mo15834d(f), j2);
    }

    /* renamed from: u */
    private final boolean m20027u(C6912es esVar) {
        C6875di diVar = this.f21895h;
        if (diVar == null) {
            return true;
        }
        int i = esVar.mo15481i(diVar.f21863b);
        while (true) {
            i = esVar.mo15853w(i, this.f21888a, this.f21889b, this.f21893f, this.f21894g);
            while (diVar.mo15684o() != null && !diVar.f21867f.f21882f) {
                diVar = diVar.mo15684o();
            }
            C6875di o = diVar.mo15684o();
            if (i == -1 || o == null || esVar.mo15481i(o.f21863b) != i) {
                boolean l = mo15704l(diVar);
                diVar.f21867f = mo15707o(esVar, diVar.f21867f);
            } else {
                diVar = o;
            }
        }
        boolean l2 = mo15704l(diVar);
        diVar.f21867f = mo15707o(esVar, diVar.f21867f);
        if (!l2) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private final C6876dj m20028v(C6912es esVar, C6875di diVar, long j) {
        long j2;
        long j3;
        C6912es esVar2 = esVar;
        C6876dj djVar = diVar.f21867f;
        long c = (diVar.mo15672c() + djVar.f21881e) - j;
        if (djVar.f21882f) {
            int w = esVar.mo15853w(esVar.mo15481i(djVar.f21877a.f23859a), this.f21888a, this.f21889b, this.f21893f, this.f21894g);
            if (w == -1) {
                return null;
            }
            int i = esVar.mo15480h(w, this.f21888a, true).f22038c;
            Object obj = this.f21888a.f22037b;
            long j4 = djVar.f21877a.f23862d;
            if (esVar.mo15852v(i, this.f21889b).f22054l == w) {
                Pair y = esVar.mo15855y(this.f21889b, this.f21888a, i, -9223372036854775807L, Math.max(0, c));
                if (y == null) {
                    return null;
                }
                obj = y.first;
                long longValue = ((Long) y.second).longValue();
                C6875di o = diVar.mo15684o();
                if (o == null || !o.f21863b.equals(obj)) {
                    j4 = this.f21892e;
                    this.f21892e = 1 + j4;
                } else {
                    j4 = o.f21867f.f21877a.f23862d;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j3 = 0;
                j2 = 0;
            }
            return m20029w(esVar, m20026t(esVar, obj, j2, j4, this.f21888a), j3, j2);
        }
        C7321tw twVar = djVar.f21877a;
        esVar.mo15479g(twVar.f23859a, this.f21888a);
        if (twVar.mo16542b()) {
            this.f21888a.mo15839h(twVar.f23860b);
            return null;
        }
        int f = this.f21888a.mo15837f(djVar.f21880d);
        if (f == -1) {
            Object obj2 = twVar.f23859a;
            long j5 = djVar.f21881e;
            return m20031y(esVar, obj2, j5, j5, twVar.f23862d);
        }
        this.f21888a.mo15841i(f, this.f21888a.mo15834d(f));
        return null;
    }

    /* renamed from: w */
    private final C6876dj m20029w(C6912es esVar, C7321tw twVar, long j, long j2) {
        esVar.mo15479g(twVar.f23859a, this.f21888a);
        if (twVar.mo16542b()) {
            this.f21888a.mo15841i(twVar.f23860b, twVar.f23861c);
            return null;
        }
        return m20031y(esVar, twVar.f23859a, j2, j, twVar.f23862d);
    }

    /* renamed from: x */
    private final C6876dj m20030x(C6912es esVar, Object obj, int i, int i2, long j, long j2) {
        C7321tw twVar = new C7321tw(obj, i, i2, j2);
        esVar.mo15479g(twVar.f23859a, this.f21888a).mo15842j(twVar.f23860b, twVar.f23861c);
        if (i2 == this.f21888a.mo15834d(i)) {
            this.f21888a.mo15843k();
        }
        return new C6876dj(twVar, 0, j, -9223372036854775807L, -9223372036854775807L, false, false, false);
    }

    /* renamed from: y */
    private final C6876dj m20031y(C6912es esVar, Object obj, long j, long j2, long j3) {
        C6912es esVar2 = esVar;
        Object obj2 = obj;
        long j4 = j;
        esVar2.mo15479g(obj2, this.f21888a);
        int g = this.f21888a.mo15838g(j4);
        C7321tw twVar = new C7321tw(obj2, j3, g);
        boolean B = m20024B(twVar);
        boolean z = m20032z(esVar2, twVar);
        boolean A = m20023A(esVar2, twVar, B);
        long c = g != -1 ? this.f21888a.mo15833c(g) : -9223372036854775807L;
        long j5 = (c == -9223372036854775807L || c == Long.MIN_VALUE) ? this.f21888a.f22039d : c;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0, -1 + j5);
        }
        return new C6876dj(twVar, j4, j2, c, j5, B, z, A);
    }

    /* renamed from: z */
    private final boolean m20032z(C6912es esVar, C7321tw twVar) {
        if (!m20024B(twVar)) {
            return false;
        }
        int i = esVar.mo15479g(twVar.f23859a, this.f21888a).f22038c;
        if (esVar.mo15852v(i, this.f21889b).f22055m == esVar.mo15481i(twVar.f23859a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo15693a(C6912es esVar, int i) {
        this.f21893f = i;
        return m20027u(esVar);
    }

    /* renamed from: b */
    public final boolean mo15694b(C6912es esVar, boolean z) {
        this.f21894g = z;
        return m20027u(esVar);
    }

    /* renamed from: c */
    public final boolean mo15695c(C7320tv tvVar) {
        C6875di diVar = this.f21897j;
        return diVar != null && diVar.f21862a == tvVar;
    }

    /* renamed from: d */
    public final void mo15696d(long j) {
        C6875di diVar = this.f21897j;
        if (diVar != null) {
            diVar.mo15678i(j);
        }
    }

    /* renamed from: e */
    public final boolean mo15697e() {
        C6875di diVar = this.f21897j;
        if (diVar != null) {
            return !diVar.f21867f.f21884h && diVar.mo15674e() && this.f21897j.f21867f.f21881e != -9223372036854775807L && this.f21898k < 100;
        }
        return true;
    }

    /* renamed from: f */
    public final C6876dj mo15698f(long j, C6887du duVar) {
        C6875di diVar = this.f21897j;
        if (diVar != null) {
            return m20028v(duVar.f21926a, diVar, j);
        }
        return m20029w(duVar.f21926a, duVar.f21927b, duVar.f21928c, duVar.f21943r);
    }

    /* renamed from: g */
    public final C6875di mo15699g() {
        return this.f21897j;
    }

    /* renamed from: h */
    public final C6875di mo15700h() {
        return this.f21895h;
    }

    /* renamed from: i */
    public final C6875di mo15701i() {
        return this.f21896i;
    }

    /* renamed from: j */
    public final C6875di mo15702j() {
        C6875di diVar = this.f21896i;
        boolean z = false;
        if (!(diVar == null || diVar.mo15684o() == null)) {
            z = true;
        }
        ary.m19464q(z);
        this.f21896i = this.f21896i.mo15684o();
        m20025s();
        return this.f21896i;
    }

    /* renamed from: k */
    public final C6875di mo15703k() {
        C6875di diVar = this.f21895h;
        if (diVar == null) {
            return null;
        }
        if (diVar == this.f21896i) {
            this.f21896i = diVar.mo15684o();
        }
        diVar.mo15682m();
        int i = this.f21898k - 1;
        this.f21898k = i;
        if (i == 0) {
            this.f21897j = null;
            C6875di diVar2 = this.f21895h;
            this.f21899l = diVar2.f21863b;
            this.f21900m = diVar2.f21867f.f21877a.f23862d;
        }
        this.f21895h = this.f21895h.mo15684o();
        m20025s();
        return this.f21895h;
    }

    /* renamed from: l */
    public final boolean mo15704l(C6875di diVar) {
        boolean z = false;
        ary.m19464q(diVar != null);
        if (diVar.equals(this.f21897j)) {
            return false;
        }
        this.f21897j = diVar;
        while (diVar.mo15684o() != null) {
            diVar = diVar.mo15684o();
            if (diVar == this.f21896i) {
                this.f21896i = this.f21895h;
                z = true;
            }
            diVar.mo15682m();
            this.f21898k--;
        }
        this.f21897j.mo15683n((C6875di) null);
        m20025s();
        return z;
    }

    /* renamed from: m */
    public final void mo15705m() {
        if (this.f21898k != 0) {
            C6875di diVar = this.f21895h;
            ary.m19466s(diVar);
            this.f21899l = diVar.f21863b;
            this.f21900m = diVar.f21867f.f21877a.f23862d;
            while (diVar != null) {
                diVar.mo15682m();
                diVar = diVar.mo15684o();
            }
            this.f21895h = null;
            this.f21897j = null;
            this.f21896i = null;
            this.f21898k = 0;
            m20025s();
        }
    }

    /* renamed from: n */
    public final boolean mo15706n(C6912es esVar, long j, long j2) {
        C6876dj djVar;
        C6876dj djVar2;
        long j3;
        C6912es esVar2 = esVar;
        C6875di diVar = this.f21895h;
        C6875di diVar2 = null;
        while (diVar != null) {
            C6876dj djVar3 = diVar.f21867f;
            if (diVar2 == null) {
                djVar = mo15707o(esVar2, djVar3);
                long j4 = j;
            } else {
                C6876dj v = m20028v(esVar2, diVar2, j);
                if (v == null) {
                    return !mo15704l(diVar2);
                }
                if (djVar3.f21878b != v.f21878b || !djVar3.f21877a.equals(v.f21877a)) {
                    return !mo15704l(diVar2);
                }
                djVar = v;
            }
            long j5 = djVar3.f21879c;
            if (j5 == djVar.f21879c) {
                djVar2 = djVar;
            } else {
                djVar2 = new C6876dj(djVar.f21877a, djVar.f21878b, j5, djVar.f21880d, djVar.f21881e, djVar.f21882f, djVar.f21883g, djVar.f21884h);
            }
            diVar.f21867f = djVar2;
            long j6 = djVar3.f21881e;
            long j7 = djVar.f21881e;
            if (j6 == -9223372036854775807L || j6 == j7) {
                diVar2 = diVar;
                diVar = diVar.mo15684o();
                esVar2 = esVar;
            } else {
                if (j7 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = diVar.mo15670a(j7);
                }
                return !mo15704l(diVar) && !(diVar == this.f21896i && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1)) >= 0));
            }
        }
        return true;
    }

    /* renamed from: o */
    public final C6876dj mo15707o(C6912es esVar, C6876dj djVar) {
        long j;
        C7321tw twVar = djVar.f21877a;
        boolean B = m20024B(twVar);
        boolean z = m20032z(esVar, twVar);
        boolean A = m20023A(esVar, twVar, B);
        esVar.mo15479g(djVar.f21877a.f23859a, this.f21888a);
        long j2 = -9223372036854775807L;
        if (twVar.mo16542b()) {
            this.f21888a.mo15842j(twVar.f23860b, twVar.f23861c);
        } else {
            long j3 = djVar.f21880d;
            if (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) {
                j2 = this.f21888a.f22039d;
            } else {
                j = j3;
                return new C6876dj(twVar, djVar.f21878b, djVar.f21879c, djVar.f21880d, j, B, z, A);
            }
        }
        j = j2;
        return new C6876dj(twVar, djVar.f21878b, djVar.f21879c, djVar.f21880d, j, B, z, A);
    }

    /* renamed from: p */
    public final C7321tw mo15708p(C6912es esVar, Object obj, long j) {
        long j2;
        int i;
        int i2 = esVar.mo15479g(obj, this.f21888a).f22038c;
        Object obj2 = this.f21899l;
        if (obj2 == null || (i = esVar.mo15481i(obj2)) == -1 || esVar.mo15856z(i, this.f21888a).f22038c != i2) {
            C6875di diVar = this.f21895h;
            while (true) {
                if (diVar == null) {
                    C6875di diVar2 = this.f21895h;
                    while (true) {
                        if (diVar2 != null) {
                            int i3 = esVar.mo15481i(diVar2.f21863b);
                            if (i3 != -1 && esVar.mo15856z(i3, this.f21888a).f22038c == i2) {
                                j2 = diVar2.f21867f.f21877a.f23862d;
                                break;
                            }
                            diVar2 = diVar2.mo15684o();
                        } else {
                            j2 = this.f21892e;
                            this.f21892e = 1 + j2;
                            if (this.f21895h == null) {
                                this.f21899l = obj;
                                this.f21900m = j2;
                            }
                        }
                    }
                } else if (diVar.f21863b.equals(obj)) {
                    j2 = diVar.f21867f.f21877a.f23862d;
                    break;
                } else {
                    diVar = diVar.mo15684o();
                }
            }
        } else {
            j2 = this.f21900m;
        }
        return m20026t(esVar, obj, j, j2, this.f21888a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo15709q(ark ark, C7321tw twVar) {
        this.f21890c.mo15880J(ark.mo15287c(), twVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p367v3.internal.C6875di mo15710r(com.google.ads.interactivemedia.p367v3.internal.C6898ee[] r12, com.google.ads.interactivemedia.p367v3.internal.abf r13, com.google.ads.interactivemedia.p367v3.internal.acc r14, com.google.ads.interactivemedia.p367v3.internal.C6885ds r15, com.google.ads.interactivemedia.p367v3.internal.C6876dj r16, com.google.ads.interactivemedia.p367v3.internal.abg r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.google.ads.interactivemedia.v3.internal.di r1 = r0.f21897j
            if (r1 != 0) goto L_0x001e
            com.google.ads.interactivemedia.v3.internal.tw r1 = r8.f21877a
            boolean r1 = r1.mo16542b()
            r2 = 0
            if (r1 == 0) goto L_0x002a
            long r4 = r8.f21879c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x002a
            r3 = r4
            goto L_0x002b
        L_0x001e:
            long r2 = r1.mo15672c()
            com.google.ads.interactivemedia.v3.internal.dj r1 = r1.f21867f
            long r4 = r1.f21881e
            long r2 = r2 + r4
            long r4 = r8.f21878b
            long r2 = r2 - r4
        L_0x002a:
            r3 = r2
        L_0x002b:
            com.google.ads.interactivemedia.v3.internal.di r10 = new com.google.ads.interactivemedia.v3.internal.di
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.google.ads.interactivemedia.v3.internal.di r1 = r0.f21897j
            if (r1 == 0) goto L_0x0041
            r1.mo15683n(r10)
            goto L_0x0045
        L_0x0041:
            r0.f21895h = r10
            r0.f21896i = r10
        L_0x0045:
            r1 = 0
            r0.f21899l = r1
            r0.f21897j = r10
            int r1 = r0.f21898k
            int r1 = r1 + 1
            r0.f21898k = r1
            r11.m20025s()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6878dl.mo15710r(com.google.ads.interactivemedia.v3.internal.ee[], com.google.ads.interactivemedia.v3.internal.abf, com.google.ads.interactivemedia.v3.internal.acc, com.google.ads.interactivemedia.v3.internal.ds, com.google.ads.interactivemedia.v3.internal.dj, com.google.ads.interactivemedia.v3.internal.abg):com.google.ads.interactivemedia.v3.internal.di");
    }
}
