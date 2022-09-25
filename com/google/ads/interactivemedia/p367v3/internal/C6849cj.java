package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cj */
/* compiled from: PG */
final class C6849cj extends C6819bg implements C6890dx {

    /* renamed from: b */
    final abg f21668b;

    /* renamed from: c */
    private final abf f21669c;

    /* renamed from: d */
    private final Handler f21670d;

    /* renamed from: e */
    private final C6857cr f21671e;

    /* renamed from: f */
    private final C6860cu f21672f;

    /* renamed from: g */
    private final Handler f21673g;

    /* renamed from: h */
    private final adt f21674h = new adt();

    /* renamed from: i */
    private final C6910eq f21675i;

    /* renamed from: j */
    private final List f21676j = new ArrayList();

    /* renamed from: k */
    private final boolean f21677k;

    /* renamed from: l */
    private final C6957gj f21678l;

    /* renamed from: m */
    private final Looper f21679m;

    /* renamed from: n */
    private final abq f21680n;

    /* renamed from: o */
    private int f21681o;

    /* renamed from: p */
    private boolean f21682p;

    /* renamed from: q */
    private int f21683q;

    /* renamed from: r */
    private int f21684r;

    /* renamed from: s */
    private C6887du f21685s;

    /* renamed from: t */
    private int f21686t;

    /* renamed from: u */
    private long f21687u;

    /* renamed from: v */
    private C7357ve f21688v = new C7357ve();

    public C6849cj(C6897ed[] edVarArr, abf abf, C6823bk bkVar, abq abq, C6957gj gjVar, boolean z, C6900eg egVar, C6822bj bjVar, long j, boolean z2, adk adk, Looper looper) {
        abq abq2 = abq;
        C6957gj gjVar2 = gjVar;
        Looper looper2 = looper;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = aeu.f20470e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.12.1] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = edVarArr.length;
        ary.m19464q(true);
        C6897ed[] edVarArr2 = (C6897ed[]) ary.m19467t(edVarArr);
        ary.m19467t(abf);
        this.f21669c = abf;
        this.f21680n = abq2;
        this.f21678l = gjVar2;
        this.f21677k = z;
        this.f21679m = looper2;
        abg abg = new abg(new C6899ef[2], new aba[2], (Object) null);
        this.f21668b = abg;
        this.f21675i = new C6910eq();
        this.f21686t = -1;
        this.f21670d = new Handler(looper2);
        C6828bp bpVar = new C6828bp(this);
        this.f21671e = bpVar;
        this.f21685s = C6887du.m20086a(abg);
        if (gjVar2 != null) {
            gjVar2.mo15879I(this);
            mo15557e(gjVar2);
            abq2.mo14400c(new Handler(looper2), gjVar2);
        }
        C6860cu cuVar = r1;
        C6860cu cuVar2 = new C6860cu(edVarArr, abf, abg, bkVar, abq, gjVar, egVar, bjVar, j, false, looper, adk, bpVar);
        C6860cu cuVar3 = cuVar;
        this.f21672f = cuVar3;
        this.f21673g = new Handler(cuVar3.mo15595i());
    }

    /* renamed from: C */
    private final int m19811C() {
        if (this.f21685s.f21926a.mo15851u()) {
            return this.f21686t;
        }
        C6887du duVar = this.f21685s;
        return duVar.f21926a.mo15479g(duVar.f21927b.f23859a, this.f21675i).f22038c;
    }

    /* renamed from: D */
    private final void m19812D(C6887du duVar, boolean z, int i, int i2, int i3, boolean z2) {
        Pair pair;
        C6873dg dgVar;
        C6887du duVar2 = duVar;
        int i4 = i;
        C6887du duVar3 = this.f21685s;
        this.f21685s = duVar2;
        int i5 = 1;
        boolean z3 = !duVar3.f21926a.equals(duVar2.f21926a);
        C6912es esVar = duVar3.f21926a;
        C6912es esVar2 = duVar2.f21926a;
        int i6 = 0;
        if (esVar2.mo15851u() && esVar.mo15851u()) {
            pair = new Pair(false, -1);
        } else if (esVar2.mo15851u() != esVar.mo15851u()) {
            pair = new Pair(true, 3);
        } else {
            Object obj = esVar.mo15852v(esVar.mo15479g(duVar3.f21927b.f23859a, this.f21675i).f22038c, this.f21593a).f22044b;
            Object obj2 = esVar2.mo15852v(esVar2.mo15479g(duVar2.f21927b.f23859a, this.f21675i).f22038c, this.f21593a).f22044b;
            int i7 = this.f21593a.f22054l;
            if (!obj.equals(obj2)) {
                if (z && i4 == 0) {
                    i4 = 0;
                } else if (z && i4 == 1) {
                    i5 = 2;
                } else if (z3) {
                    i5 = 3;
                } else {
                    throw new IllegalStateException();
                }
                pair = new Pair(true, Integer.valueOf(i5));
            } else {
                if (!z || i4 != 0) {
                    i6 = i4;
                } else if (esVar2.mo15481i(duVar2.f21927b.f23859a) == i7) {
                    pair = new Pair(true, 0);
                    i4 = 0;
                }
                pair = new Pair(false, -1);
                i4 = i6;
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (!duVar3.f21926a.equals(duVar2.f21926a)) {
            this.f21674h.mo14513c(new C6842cc(duVar2, i2));
        }
        if (z) {
            this.f21674h.mo14513c(new C6843cd(i4));
        }
        if (booleanValue) {
            if (!duVar2.f21926a.mo15851u()) {
                dgVar = duVar2.f21926a.mo15852v(duVar2.f21926a.mo15479g(duVar2.f21927b.f23859a, this.f21675i).f22038c, this.f21593a).f22045c;
            } else {
                dgVar = null;
            }
            this.f21674h.mo14513c(new C6844ce(dgVar, intValue));
        }
        C6826bn bnVar = duVar3.f21930e;
        C6826bn bnVar2 = duVar2.f21930e;
        if (!(bnVar == bnVar2 || bnVar2 == null)) {
            this.f21674h.mo14513c(new C6845cf(duVar2));
        }
        abg abg = duVar3.f21933h;
        abg abg2 = duVar2.f21933h;
        if (abg != abg2) {
            Object obj3 = abg2.f20187d;
            this.f21674h.mo14513c(new C6846cg(duVar2));
        }
        if (!duVar3.f21934i.equals(duVar2.f21934i)) {
            this.f21674h.mo14513c(new C6847ch(duVar2));
        }
        if (duVar3.f21931f != duVar2.f21931f) {
            this.f21674h.mo14513c(new C6829bq(duVar2));
        }
        if (!(duVar3.f21929d == duVar2.f21929d && duVar3.f21936k == duVar2.f21936k)) {
            this.f21674h.mo14513c(new C6830br(duVar2));
        }
        if (duVar3.f21929d != duVar2.f21929d) {
            this.f21674h.mo14513c(new C6831bs(duVar2));
        }
        if (duVar3.f21936k != duVar2.f21936k) {
            this.f21674h.mo14513c(new C6832bt(duVar2, i3));
        }
        if (duVar3.f21937l != duVar2.f21937l) {
            this.f21674h.mo14513c(new C6833bu(duVar2));
        }
        if (m19815G(duVar3) != m19815G(duVar)) {
            this.f21674h.mo14513c(new C6834bv(duVar2));
        }
        if (!duVar3.f21938m.equals(duVar2.f21938m)) {
            this.f21674h.mo14513c(new C6835bw(duVar2));
        }
        if (z2) {
            this.f21674h.mo14513c(C6836bx.f21651a);
        }
        if (duVar3.f21939n != duVar2.f21939n) {
            this.f21674h.mo14513c(new C6837by(duVar2));
        }
        if (duVar3.f21940o != duVar2.f21940o) {
            this.f21674h.mo14513c(new C6838bz(duVar2));
        }
        this.f21674h.mo14514d();
    }

    /* renamed from: E */
    private final C6887du m19813E(C6887du duVar, C6912es esVar, Pair pair) {
        C7362vj vjVar;
        abg abg;
        List list;
        long j;
        C6912es esVar2 = esVar;
        Pair pair2 = pair;
        ary.m19462o(esVar.mo15851u() || pair2 != null);
        C6912es esVar3 = duVar.f21926a;
        C6887du d = duVar.mo15733d(esVar);
        if (esVar.mo15851u()) {
            C7321tw b = C6887du.m20087b();
            C6887du g = d.mo15732c(b, C6821bi.m19755b(this.f21687u), C6821bi.m19755b(this.f21687u), 0, C7362vj.f24051a, this.f21668b, arn.m19402i()).mo15736g(b);
            g.f21941p = g.f21943r;
            return g;
        }
        Object obj = d.f21927b.f23859a;
        int i = aeu.f20466a;
        boolean z = !obj.equals(pair2.first);
        C7321tw twVar = z ? new C7321tw(pair2.first) : d.f21927b;
        long longValue = ((Long) pair2.second).longValue();
        long b2 = C6821bi.m19755b(mo15572t());
        if (!esVar3.mo15851u()) {
            b2 -= esVar3.mo15479g(obj, this.f21675i).mo15832b();
        }
        if (z || longValue < b2) {
            C7321tw twVar2 = twVar;
            ary.m19464q(!twVar2.mo16542b());
            if (z) {
                vjVar = C7362vj.f24051a;
            } else {
                vjVar = d.f21932g;
            }
            C7362vj vjVar2 = vjVar;
            if (z) {
                abg = this.f21668b;
            } else {
                abg = d.f21933h;
            }
            abg abg2 = abg;
            if (z) {
                list = arn.m19402i();
            } else {
                list = d.f21934i;
            }
            C6887du g2 = d.mo15732c(twVar2, longValue, longValue, 0, vjVar2, abg2, list).mo15736g(twVar2);
            g2.f21941p = longValue;
            return g2;
        } else if (longValue == b2) {
            int i2 = esVar2.mo15481i(d.f21935j.f23859a);
            if (i2 != -1 && esVar2.mo15856z(i2, this.f21675i).f22038c == esVar2.mo15479g(twVar.f23859a, this.f21675i).f22038c) {
                return d;
            }
            esVar2.mo15479g(twVar.f23859a, this.f21675i);
            if (twVar.mo16542b()) {
                this.f21675i.mo15842j(twVar.f23860b, twVar.f23861c);
                j = -9223372036854775807L;
            } else {
                j = this.f21675i.f22039d;
            }
            C6887du g3 = d.mo15732c(twVar, d.f21943r, d.f21943r, j - d.f21943r, d.f21932g, d.f21933h, d.f21934i).mo15736g(twVar);
            g3.f21941p = j;
            return g3;
        } else {
            C7321tw twVar3 = twVar;
            ary.m19464q(!twVar3.mo16542b());
            long max = Math.max(0, d.f21942q - (longValue - b2));
            long j2 = d.f21941p;
            if (d.f21935j.equals(d.f21927b)) {
                j2 = longValue + max;
            }
            C6887du c = d.mo15732c(twVar3, longValue, longValue, max, d.f21932g, d.f21933h, d.f21934i);
            c.f21941p = j2;
            return c;
        }
    }

    /* renamed from: F */
    private final Pair m19814F(C6912es esVar, int i, long j) {
        if (esVar.mo15851u()) {
            this.f21686t = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f21687u = j;
            return null;
        }
        if (i >= esVar.mo15780s()) {
            i = esVar.mo15477e(false);
            j = esVar.mo15852v(i, this.f21593a).mo15845a();
        }
        return esVar.mo15854x(this.f21593a, this.f21675i, i, C6821bi.m19755b(j));
    }

    /* renamed from: G */
    private static boolean m19815G(C6887du duVar) {
        return duVar.f21929d == 3 && duVar.f21936k && duVar.f21937l == 0;
    }

    /* renamed from: A */
    public final void mo15552A() {
        mo15553B((C6826bn) null);
    }

    /* renamed from: B */
    public final void mo15553B(C6826bn bnVar) {
        C6887du duVar = this.f21685s;
        C6887du g = duVar.mo15736g(duVar.f21927b);
        g.f21941p = g.f21943r;
        g.f21942q = 0;
        C6887du e = g.mo15734e(1);
        if (bnVar != null) {
            e = e.mo15735f(bnVar);
        }
        this.f21681o++;
        this.f21672f.mo15591f();
        m19812D(e, false, 4, 0, 1, false);
    }

    /* renamed from: b */
    public final void mo15554b() {
        this.f21672f.mo15587b();
    }

    /* renamed from: c */
    public final boolean mo15555c() {
        return this.f21685s.f21940o;
    }

    /* renamed from: d */
    public final Looper mo15556d() {
        return this.f21679m;
    }

    /* renamed from: e */
    public final void mo15557e(C6889dw dwVar) {
        this.f21674h.mo14511a(dwVar);
    }

    /* renamed from: f */
    public final int mo15558f() {
        return this.f21685s.f21929d;
    }

    /* renamed from: g */
    public final void mo15559g() {
        C6887du duVar = this.f21685s;
        if (duVar.f21929d == 1) {
            C6887du f = duVar.mo15735f((C6826bn) null);
            C6887du e = f.mo15734e(true != f.f21926a.mo15851u() ? 2 : 4);
            this.f21681o++;
            this.f21672f.mo15588c();
            m19812D(e, false, 4, 1, 1, false);
        }
    }

    /* renamed from: h */
    public final void mo15560h(boolean z, int i, int i2) {
        C6887du duVar = this.f21685s;
        if (duVar.f21936k != z || duVar.f21937l != i) {
            this.f21681o++;
            C6887du h = duVar.mo15737h(z, i);
            this.f21672f.mo15589d(z, i);
            m19812D(h, false, 4, 0, i2, false);
        }
    }

    /* renamed from: i */
    public final boolean mo15561i() {
        return this.f21685s.f21936k;
    }

    /* renamed from: j */
    public final void mo15562j() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = aeu.f20470e;
        String a = C6861cv.m19919a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(a).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.12.1] [");
        sb.append(str);
        sb.append("] [");
        sb.append(a);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        if (!this.f21672f.mo15593h()) {
            this.f21674h.mo14515e(C6841cb.f21657a);
        }
        this.f21674h.mo14516f();
        this.f21670d.removeCallbacksAndMessages((Object) null);
        C6957gj gjVar = this.f21678l;
        if (gjVar != null) {
            this.f21680n.mo14401d(gjVar);
        }
        C6887du e = this.f21685s.mo15734e(1);
        this.f21685s = e;
        C6887du g = e.mo15736g(e.f21927b);
        this.f21685s = g;
        g.f21941p = g.f21943r;
        this.f21685s.f21942q = 0;
    }

    /* renamed from: k */
    public final C6894ea mo15563k(C6892dz dzVar) {
        return new C6894ea(this.f21672f, dzVar, this.f21685s.f21926a, mo15565m(), this.f21673g);
    }

    /* renamed from: l */
    public final int mo15564l() {
        if (this.f21685s.f21926a.mo15851u()) {
            return 0;
        }
        C6887du duVar = this.f21685s;
        return duVar.f21926a.mo15481i(duVar.f21927b.f23859a);
    }

    /* renamed from: m */
    public final int mo15565m() {
        int C = m19811C();
        if (C == -1) {
            return 0;
        }
        return C;
    }

    /* renamed from: n */
    public final long mo15566n() {
        if (!mo15569q()) {
            C6912es u = mo15573u();
            if (u.mo15851u()) {
                return -9223372036854775807L;
            }
            return C6821bi.m19754a(u.mo15852v(mo15565m(), this.f21593a).f22057o);
        }
        C6887du duVar = this.f21685s;
        C7321tw twVar = duVar.f21927b;
        duVar.f21926a.mo15479g(twVar.f23859a, this.f21675i);
        this.f21675i.mo15842j(twVar.f23860b, twVar.f23861c);
        return C6821bi.m19754a(-9223372036854775807L);
    }

    /* renamed from: o */
    public final long mo15567o() {
        if (this.f21685s.f21926a.mo15851u()) {
            return this.f21687u;
        }
        if (this.f21685s.f21927b.mo16542b()) {
            return C6821bi.m19754a(this.f21685s.f21943r);
        }
        C6887du duVar = this.f21685s;
        C7321tw twVar = duVar.f21927b;
        long a = C6821bi.m19754a(duVar.f21943r);
        this.f21685s.f21926a.mo15479g(twVar.f23859a, this.f21675i);
        return a + this.f21675i.mo15831a();
    }

    /* renamed from: p */
    public final long mo15568p() {
        return C6821bi.m19754a(this.f21685s.f21942q);
    }

    /* renamed from: q */
    public final boolean mo15569q() {
        return this.f21685s.f21927b.mo16542b();
    }

    /* renamed from: r */
    public final int mo15570r() {
        if (mo15569q()) {
            return this.f21685s.f21927b.f23860b;
        }
        return -1;
    }

    /* renamed from: s */
    public final int mo15571s() {
        if (mo15569q()) {
            return this.f21685s.f21927b.f23861c;
        }
        return -1;
    }

    /* renamed from: t */
    public final long mo15572t() {
        if (!mo15569q()) {
            return mo15567o();
        }
        C6887du duVar = this.f21685s;
        duVar.f21926a.mo15479g(duVar.f21927b.f23859a, this.f21675i);
        C6887du duVar2 = this.f21685s;
        if (duVar2.f21928c == -9223372036854775807L) {
            return duVar2.f21926a.mo15852v(mo15565m(), this.f21593a).mo15845a();
        }
        return this.f21675i.mo15831a() + C6821bi.m19754a(this.f21685s.f21928c);
    }

    /* renamed from: u */
    public final C6912es mo15573u() {
        return this.f21685s.f21926a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ void mo15574w(C6856cq cqVar) {
        this.f21670d.post(new C6840ca(this, cqVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ void mo15575x(C6856cq cqVar) {
        int i = this.f21681o - cqVar.f21706b;
        this.f21681o = i;
        boolean z = true;
        if (cqVar.f21707c) {
            this.f21682p = true;
            this.f21683q = cqVar.f21708d;
        }
        if (cqVar.f21709e) {
            this.f21684r = cqVar.f21710f;
        }
        if (i == 0) {
            C6912es esVar = cqVar.f21705a.f21926a;
            if (!this.f21685s.f21926a.mo15851u() && esVar.mo15851u()) {
                this.f21686t = -1;
                this.f21687u = 0;
            }
            if (!esVar.mo15851u()) {
                List r = ((C6895eb) esVar).mo15779r();
                if (r.size() != this.f21676j.size()) {
                    z = false;
                }
                ary.m19464q(z);
                for (int i2 = 0; i2 < r.size(); i2++) {
                    ((C6848ci) this.f21676j.get(i2)).f21667b = (C6912es) r.get(i2);
                }
            }
            boolean z2 = this.f21682p;
            this.f21682p = false;
            m19812D(cqVar.f21705a, z2, this.f21683q, 1, this.f21684r, false);
        }
    }

    /* renamed from: y */
    public final void mo15576y(int i) {
        C6912es esVar = this.f21685s.f21926a;
        if (i < 0 || (!esVar.mo15851u() && i >= esVar.mo15780s())) {
            throw new C6867da();
        }
        int i2 = 1;
        this.f21681o++;
        if (mo15569q()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.f21671e.mo15548a(new C6856cq(this.f21685s));
            return;
        }
        if (mo15558f() != 1) {
            i2 = 2;
        }
        C6887du E = m19813E(this.f21685s.mo15734e(i2), esVar, m19814F(esVar, i, 0));
        this.f21672f.mo15590e(esVar, i, C6821bi.m19755b(0));
        m19812D(E, true, 1, 0, 1, true);
    }

    /* renamed from: z */
    public final void mo15577z(List list) {
        int size = list.size();
        int i = 0;
        while (i < list.size()) {
            C7323ty tyVar = (C7323ty) list.get(i);
            ary.m19467t(tyVar);
            if (!(tyVar instanceof C7366vn) || size <= 1) {
                i++;
            } else {
                throw new IllegalArgumentException();
            }
        }
        m19811C();
        mo15567o();
        this.f21681o++;
        if (!this.f21676j.isEmpty()) {
            int size2 = this.f21676j.size();
            for (int i2 = size2 - 1; i2 >= 0; i2--) {
                this.f21676j.remove(i2);
            }
            this.f21688v = this.f21688v.mo16644g(0, size2);
            this.f21676j.isEmpty();
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C6883dq dqVar = new C6883dq((C7323ty) list.get(i3), this.f21677k);
            arrayList.add(dqVar);
            this.f21676j.add(i3, new C6848ci(dqVar.f21910b, dqVar.f21909a.mo16539C()));
        }
        this.f21688v = this.f21688v.mo16643f(0, arrayList.size());
        C6895eb ebVar = new C6895eb(this.f21676j, this.f21688v);
        if (ebVar.mo15851u() || ebVar.mo15780s() > 0) {
            C6887du E = m19813E(this.f21685s, ebVar, m19814F(ebVar, 0, -9223372036854775807L));
            int i4 = E.f21929d;
            if (i4 != 1) {
                i4 = (ebVar.mo15851u() || ebVar.mo15780s() <= 0) ? 4 : 2;
            }
            C6887du e = E.mo15734e(i4);
            this.f21672f.mo15601q(arrayList, 0, C6821bi.m19755b(-9223372036854775807L), this.f21688v);
            m19812D(e, false, 4, 0, 1, false);
            return;
        }
        throw new C6867da();
    }
}
