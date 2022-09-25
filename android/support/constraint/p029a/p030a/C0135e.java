package android.support.constraint.p029a.p030a;

import android.support.constraint.p029a.C0139b;
import android.support.constraint.p029a.C0142e;
import android.support.constraint.p029a.C0144g;

/* renamed from: android.support.constraint.a.a.e */
/* compiled from: PG */
public final class C0135e extends C0133c {

    /* renamed from: ah */
    public float f486ah = -1.0f;

    /* renamed from: ai */
    public int f487ai = -1;

    /* renamed from: aj */
    public int f488aj = -1;

    /* renamed from: ak */
    public int f489ak = 0;

    /* renamed from: al */
    private C0132b f490al = this.f455j;

    public C0135e() {
        this.f462q.clear();
        this.f462q.add(this.f490al);
    }

    /* renamed from: q */
    public final C0132b mo145q(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f489ak == 0) {
                return this.f490al;
            }
            return null;
        }
        if (this.f489ak == 1) {
            return this.f490al;
        }
        return null;
    }

    /* renamed from: u */
    public final void mo150u(C0142e eVar) {
        C0133c cVar = this.f463r;
        if (cVar != null) {
            C0132b q = cVar.mo145q(2);
            C0132b q2 = cVar.mo145q(4);
            if (this.f489ak == 0) {
                q = cVar.mo145q(3);
                q2 = cVar.mo145q(5);
            }
            if (this.f487ai != -1) {
                eVar.mo174g(C0142e.m211c(eVar, eVar.mo172e(this.f490al), eVar.mo172e(q), this.f487ai, false));
            } else if (this.f488aj != -1) {
                eVar.mo174g(C0142e.m211c(eVar, eVar.mo172e(this.f490al), eVar.mo172e(q2), -this.f488aj, false));
            } else if (this.f486ah != -1.0f) {
                C0144g e = eVar.mo172e(this.f490al);
                C0144g e2 = eVar.mo172e(q);
                C0144g e3 = eVar.mo172e(q2);
                float f = this.f486ah;
                C0139b a = eVar.mo170a();
                a.f505d.mo119f(e, -1.0f);
                a.f505d.mo119f(e2, 1.0f - f);
                a.f505d.mo119f(e3, f);
                eVar.mo174g(a);
            }
        }
    }

    /* renamed from: v */
    public final void mo151v() {
        if (this.f463r != null) {
            int o = C0142e.m212o(this.f490al);
            if (this.f489ak == 1) {
                this.f468w = o;
                this.f469x = 0;
                mo135g(this.f463r.mo129a());
                mo141m(0);
                return;
            }
            this.f468w = 0;
            this.f469x = o;
            mo141m(this.f463r.mo132d());
            mo135g(0);
        }
    }

    /* renamed from: w */
    public final void mo156w(int i) {
        if (this.f489ak != i) {
            this.f489ak = i;
            this.f462q.clear();
            if (this.f489ak == 1) {
                this.f490al = this.f454i;
            } else {
                this.f490al = this.f455j;
            }
            this.f462q.add(this.f490al);
        }
    }
}
