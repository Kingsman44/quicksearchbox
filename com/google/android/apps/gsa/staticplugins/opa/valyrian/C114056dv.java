package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.C109037fg;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dv */
/* compiled from: PG */
final class C114056dv {

    /* renamed from: a */
    boolean f315758a = false;

    /* renamed from: b */
    final /* synthetic */ C114071eg f315759b;

    public C114056dv(C114071eg egVar) {
        this.f315759b = egVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo100968a() {
        int i;
        this.f315758a = false;
        int e = this.f315759b.f315859aq.mo101122e(C108230ba.f301013a);
        if (e >= 0) {
            if (!this.f315759b.f315982r.mo79746e(C90014bt.f247181cM) && C113987f.m188692c(this.f315759b.f315982r)) {
                C108232bc b = this.f315759b.f315859aq.mo95352b(e);
                if (b instanceof C108451je) {
                    C108451je jeVar = (C108451je) b;
                    if (jeVar.mo96575b()) {
                        if (!this.f315759b.f315982r.mo79746e(C90014bt.f247779nb) || !this.f315759b.mo101037dg() || !this.f315759b.f315835aS.f300678a) {
                            jeVar.f301665g = true;
                            jeVar.mo96893w();
                        } else {
                            jeVar.f301665g = false;
                            jeVar.mo96893w();
                        }
                    }
                }
                C108232bc b2 = this.f315759b.f315859aq.mo95352b(e + 1);
                if (b2 instanceof C108262cf) {
                    C108262cf cfVar = (C108262cf) b2;
                    cfVar.f301176f = !this.f315759b.f315835aS.f300678a;
                    cfVar.mo96712f();
                }
            }
            this.f315759b.mo101011bt(e);
            C108451je jeVar2 = (C108451je) this.f315759b.f315859aq.mo95352b(0);
            if (jeVar2 != null) {
                this.f315759b.mo101005bS(jeVar2);
            }
            C114071eg egVar = this.f315759b;
            if (egVar.f315911bu == null || !egVar.mo101043dx()) {
                i = 0;
            } else {
                C109037fg fgVar = this.f315759b.f315911bu;
                fgVar.getClass();
                i = fgVar.mo97408a();
            }
            this.f315759b.mo101040dt(0, this.f315759b.mo100986aI(false) - i);
        }
    }

    /* renamed from: b */
    public final boolean mo100969b(C108232bc bcVar) {
        int h;
        if (!(this.f315759b.mo101035dd(bcVar) || (h = bcVar.mo95830h()) == -2 || h == -3)) {
            if (h == 0) {
                if (this.f315759b.mo101037dg() && this.f315759b.f315982r.mo79746e(C90014bt.f247079aQ)) {
                    h = 0;
                }
            }
            if (h != 4) {
                if (h != 1 || ((C108262cf) bcVar).f301170K == 2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
