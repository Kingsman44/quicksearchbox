package com.google.ads.interactivemedia.p367v3.internal;

import android.view.Surface;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gj */
/* compiled from: PG */
public final class C6957gj implements C6889dw, C6983hi, afu, C7333uh, abp, C7034jf, afk, C6968gu {

    /* renamed from: a */
    private final adt f22183a = new adt();

    /* renamed from: b */
    private final adk f22184b;

    /* renamed from: c */
    private final C6910eq f22185c;

    /* renamed from: d */
    private final C6911er f22186d;

    /* renamed from: e */
    private final C6956gi f22187e;

    /* renamed from: f */
    private C6890dx f22188f;

    /* renamed from: g */
    private boolean f22189g;

    public C6957gj(adk adk) {
        this.f22184b = adk;
        C6910eq eqVar = new C6910eq();
        this.f22185c = eqVar;
        this.f22186d = new C6911er();
        this.f22187e = new C6956gi(eqVar);
    }

    /* renamed from: P */
    private final C6958gk m20415P(C7321tw twVar) {
        C6912es esVar;
        ary.m19467t(this.f22188f);
        if (twVar == null) {
            esVar = null;
        } else {
            esVar = this.f22187e.mo15873e(twVar);
        }
        if (twVar != null && esVar != null) {
            return mo15882O(esVar, esVar.mo15479g(twVar.f23859a, this.f22185c).f22038c, twVar);
        }
        int m = this.f22188f.mo15565m();
        C6912es u = this.f22188f.mo15573u();
        if (m >= u.mo15780s()) {
            u = C6912es.f22059a;
        }
        return mo15882O(u, m, (C7321tw) null);
    }

    /* renamed from: Q */
    private final C6958gk m20416Q() {
        return m20415P(this.f22187e.mo15869a());
    }

    /* renamed from: R */
    private final C6958gk m20417R() {
        return m20415P(this.f22187e.mo15870b());
    }

    /* renamed from: S */
    private final C6958gk m20418S() {
        return m20415P(this.f22187e.mo15871c());
    }

    /* renamed from: T */
    private final C6958gk m20419T(int i, C7321tw twVar) {
        ary.m19467t(this.f22188f);
        if (twVar == null) {
            C6912es u = this.f22188f.mo15573u();
            if (i >= u.mo15780s()) {
                u = C6912es.f22059a;
            }
            return mo15882O(u, i, (C7321tw) null);
        } else if (this.f22187e.mo15873e(twVar) != null) {
            return m20415P(twVar);
        } else {
            return mo15882O(C6912es.f22059a, i, twVar);
        }
    }

    /* renamed from: A */
    public final void mo15798A(String str, long j, long j2) {
        this.f22183a.mo14515e(new C6944fx(m20418S(), str, j2));
    }

    /* renamed from: B */
    public final void mo15799B(C6864cy cyVar) {
        this.f22183a.mo14515e(new C6951gd(m20418S(), cyVar));
    }

    /* renamed from: C */
    public final void mo15800C(long j) {
        this.f22183a.mo14515e(new C6952ge(m20418S(), j));
    }

    /* renamed from: D */
    public final void mo15801D(int i, long j, long j2) {
        this.f22183a.mo14515e(new C6953gf(m20418S(), i, j, j2));
    }

    /* renamed from: E */
    public final void mo15802E(C7022iu iuVar) {
        this.f22183a.mo14515e(new C6954gg(m20417R(), iuVar));
    }

    /* renamed from: F */
    public final void mo15803F(boolean z) {
        this.f22183a.mo14515e(new C6916ew(m20418S(), z));
    }

    /* renamed from: G */
    public final void mo15877G(C6959gl glVar) {
        ary.m19467t(glVar);
        this.f22183a.mo14511a(glVar);
    }

    /* renamed from: H */
    public final void mo15878H(C6959gl glVar) {
        this.f22183a.mo14512b(glVar);
    }

    /* renamed from: I */
    public final void mo15879I(C6890dx dxVar) {
        boolean z = true;
        if (this.f22188f != null && !this.f22187e.f22178b.isEmpty()) {
            z = false;
        }
        ary.m19464q(z);
        this.f22188f = dxVar;
    }

    /* renamed from: J */
    public final void mo15880J(List list, C7321tw twVar) {
        C6956gi giVar = this.f22187e;
        C6890dx dxVar = this.f22188f;
        ary.m19467t(dxVar);
        giVar.mo15876h(list, twVar, dxVar);
    }

    /* renamed from: K */
    public final void mo15881K() {
        if (!this.f22189g) {
            C6958gk Q = m20416Q();
            this.f22189g = true;
            this.f22183a.mo14515e(new C6915ev(Q));
        }
    }

    /* renamed from: L */
    public final void mo14666L() {
    }

    /* renamed from: M */
    public final void mo14667M(int i, int i2) {
        this.f22183a.mo14515e(new C6926ff(m20418S(), i, i2));
    }

    /* renamed from: N */
    public final void mo14397N(int i, long j, long j2) {
        this.f22183a.mo14515e(new C6950gc(m20415P(this.f22187e.mo15872d()), i, j, j2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final C6958gk mo15882O(C6912es esVar, int i, C7321tw twVar) {
        C6912es esVar2 = esVar;
        int i2 = i;
        boolean z = true;
        C7321tw twVar2 = true == esVar.mo15851u() ? null : twVar;
        long a = this.f22184b.mo14486a();
        if (!esVar2.equals(this.f22188f.mo15573u()) || i2 != this.f22188f.mo15565m()) {
            z = false;
        }
        long j = 0;
        if (twVar2 == null || !twVar2.mo16542b()) {
            if (z) {
                j = this.f22188f.mo15572t();
            } else if (!esVar.mo15851u()) {
                j = esVar2.mo15852v(i2, this.f22186d).mo15845a();
            }
        } else if (z && this.f22188f.mo15570r() == twVar2.f23860b && this.f22188f.mo15571s() == twVar2.f23861c) {
            j = this.f22188f.mo15567o();
        }
        return new C6958gk(a, esVar, i, twVar2, j, this.f22188f.mo15573u(), this.f22188f.mo15565m(), this.f22187e.mo15869a(), this.f22188f.mo15567o(), this.f22188f.mo15568p());
    }

    /* renamed from: U */
    public final void mo15712U(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar) {
        this.f22183a.mo14515e(new C6927fg(m20419T(i, twVar), toVar, ttVar));
    }

    /* renamed from: V */
    public final void mo15713V(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar) {
        this.f22183a.mo14515e(new C6928fh(m20419T(i, twVar), toVar, ttVar));
    }

    /* renamed from: W */
    public final void mo15714W(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar) {
        this.f22183a.mo14515e(new C6929fi(m20419T(i, twVar), toVar, ttVar));
    }

    /* renamed from: X */
    public final void mo15715X(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar, IOException iOException, boolean z) {
        this.f22183a.mo14515e(new C6930fj(m20419T(i, twVar), toVar, ttVar, iOException, z));
    }

    /* renamed from: Y */
    public final void mo15716Y(int i, C7321tw twVar, C7318tt ttVar) {
        this.f22183a.mo14515e(new C6931fk(m20419T(i, twVar), ttVar));
    }

    /* renamed from: Z */
    public final void mo15717Z(int i, C7321tw twVar, C7318tt ttVar) {
        this.f22183a.mo14515e(new C6932fl(m20419T(i, twVar), ttVar));
    }

    /* renamed from: a */
    public final void mo14693a(C7022iu iuVar) {
        this.f22183a.mo14515e(new C6917ex(m20418S(), iuVar));
    }

    /* renamed from: b */
    public final void mo14694b(String str, long j, long j2) {
        this.f22183a.mo14515e(new C6918ey(m20418S(), str, j2));
    }

    /* renamed from: c */
    public final void mo14695c(C6864cy cyVar) {
        this.f22183a.mo14515e(new C6919ez(m20418S(), cyVar));
    }

    /* renamed from: d */
    public final void mo14696d(int i, long j) {
        this.f22183a.mo14515e(new C6921fa(m20417R(), i, j));
    }

    /* renamed from: e */
    public final void mo14697e(int i, int i2, int i3, float f) {
        this.f22183a.mo14515e(new C6925fe(m20418S(), i, i2, i3, f));
    }

    /* renamed from: f */
    public final void mo14698f(Surface surface) {
        this.f22183a.mo14515e(new C6923fc(m20418S(), surface));
    }

    /* renamed from: g */
    public final void mo15743g(C6912es esVar, int i) {
        C6956gi giVar = this.f22187e;
        C6890dx dxVar = this.f22188f;
        ary.m19467t(dxVar);
        giVar.mo15875g(dxVar);
        this.f22183a.mo14515e(new C6933fm(m20416Q(), i));
    }

    /* renamed from: h */
    public final void mo15744h(C6873dg dgVar, int i) {
        this.f22183a.mo14515e(new C6934fn(m20416Q(), dgVar, i));
    }

    /* renamed from: i */
    public final void mo15745i(C7362vj vjVar, abb abb) {
        this.f22183a.mo14515e(new C6936fp(m20416Q(), vjVar, abb));
    }

    /* renamed from: j */
    public final void mo15746j(List list) {
        this.f22183a.mo14515e(new C6937fq(m20416Q(), list));
    }

    /* renamed from: k */
    public final void mo15747k(boolean z) {
        this.f22183a.mo14515e(new C6938fr(m20416Q(), z));
    }

    /* renamed from: l */
    public final void mo15748l(boolean z, int i) {
        this.f22183a.mo14515e(new C6939fs(m20416Q(), z, i));
    }

    /* renamed from: m */
    public final void mo15749m(int i) {
        this.f22183a.mo14515e(new C6940ft(m20416Q(), i));
    }

    /* renamed from: n */
    public final void mo15750n(boolean z, int i) {
        this.f22183a.mo14515e(new C6941fu(m20416Q(), z, i));
    }

    /* renamed from: o */
    public final void mo15751o(int i) {
        this.f22183a.mo14515e(new C6942fv(m20416Q(), i));
    }

    /* renamed from: p */
    public final void mo15752p(boolean z) {
        this.f22183a.mo14515e(new C6943fw(m20416Q(), z));
    }

    /* renamed from: q */
    public final void mo15753q(C6826bn bnVar) {
        C6958gk gkVar;
        C7321tw twVar = bnVar.f21639h;
        if (twVar != null) {
            gkVar = m20415P(twVar);
        } else {
            gkVar = m20416Q();
        }
        this.f22183a.mo14515e(new C6945fy(gkVar, bnVar));
    }

    /* renamed from: r */
    public final void mo15754r(int i) {
        if (i == 1) {
            this.f22189g = false;
            i = 1;
        }
        C6956gi giVar = this.f22187e;
        C6890dx dxVar = this.f22188f;
        ary.m19467t(dxVar);
        giVar.mo15874f(dxVar);
        this.f22183a.mo14515e(new C6946fz(m20416Q(), i));
    }

    /* renamed from: s */
    public final void mo15755s(C6888dv dvVar) {
        this.f22183a.mo14515e(new C6948ga(m20416Q(), dvVar));
    }

    /* renamed from: t */
    public final void mo15756t() {
        this.f22183a.mo14515e(new C6949gb(m20416Q()));
    }

    /* renamed from: u */
    public final void mo15757u() {
    }

    /* renamed from: v */
    public final void mo15758v() {
    }

    /* renamed from: w */
    public final void mo14699w(C7022iu iuVar) {
        this.f22183a.mo14515e(new C6922fb(m20417R(), iuVar));
    }

    /* renamed from: x */
    public final void mo14700x(long j, int i) {
        this.f22183a.mo14515e(new C6924fd(m20417R(), j, i));
    }

    /* renamed from: y */
    public final void mo15811y(C7022iu iuVar) {
        this.f22183a.mo14515e(new C6935fo(m20418S(), iuVar));
    }

    /* renamed from: z */
    public final void mo15812z(int i) {
        this.f22183a.mo14515e(new C6955gh(m20418S(), i));
    }
}
