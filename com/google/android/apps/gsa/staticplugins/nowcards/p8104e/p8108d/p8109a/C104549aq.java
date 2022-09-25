package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91398j;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8178yk;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.aq */
/* compiled from: PG */
final class C104549aq implements C91398j {

    /* renamed from: a */
    final /* synthetic */ C104551as f290843a;

    public C104549aq(C104551as asVar) {
        this.f290843a = asVar;
    }

    /* renamed from: c */
    private final void m172900c(C7718hj hjVar, boolean z) {
        boolean z2;
        Object obj;
        C91667f fVar = this.f290843a.f290889v;
        fVar.getClass();
        C7718hj g = fVar.mo86085g();
        if (C91978bb.m150942h(g, hjVar)) {
            if (z && (g.f26955a & 128) != 0) {
                C7711hc hcVar = (C7711hc) hjVar.toBuilder();
                C7709ha haVar = g.f26972m;
                if (haVar == null) {
                    haVar = C7709ha.f26910f;
                }
                hcVar.copyOnWrite();
                C7718hj hjVar2 = (C7718hj) hcVar.instance;
                haVar.getClass();
                hjVar2.f26972m = haVar;
                hjVar2.f26955a |= 64;
                C8178yk ykVar = g.f26973n;
                if (ykVar == null) {
                    ykVar = C8178yk.f28736g;
                }
                hcVar.copyOnWrite();
                C7718hj hjVar3 = (C7718hj) hcVar.instance;
                ykVar.getClass();
                hjVar3.f26973n = ykVar;
                hjVar3.f26955a |= 128;
                hjVar = (C7718hj) hcVar.build();
            }
            this.f290843a.f290889v.mo86086h(hjVar);
            z2 = true;
        } else {
            z2 = false;
        }
        C1970e c = this.f290843a.f290889v.mo86081c();
        if (!(c == null || (obj = c.f5889b) == null)) {
            for (C7718hj hjVar4 : (C7718hj[]) obj) {
                if (C91978bb.m150942h(hjVar4, hjVar)) {
                    if (z && (hjVar4.f26955a & 128) != 0) {
                        C7711hc hcVar2 = (C7711hc) hjVar.toBuilder();
                        C7709ha haVar2 = hjVar4.f26972m;
                        if (haVar2 == null) {
                            haVar2 = C7709ha.f26910f;
                        }
                        hcVar2.copyOnWrite();
                        C7718hj hjVar5 = (C7718hj) hcVar2.instance;
                        haVar2.getClass();
                        hjVar5.f26972m = haVar2;
                        hjVar5.f26955a |= 64;
                        C8178yk ykVar2 = hjVar4.f26973n;
                        if (ykVar2 == null) {
                            ykVar2 = C8178yk.f28736g;
                        }
                        hcVar2.copyOnWrite();
                        C7718hj hjVar6 = (C7718hj) hcVar2.instance;
                        ykVar2.getClass();
                        hjVar6.f26973n = ykVar2;
                        hjVar6.f26955a |= 128;
                        hjVar = (C7718hj) hcVar2.build();
                    }
                    this.f290843a.f290889v.mo86090l(hjVar4, hjVar);
                    z2 = true;
                }
            }
        }
        if (z2) {
            C104551as asVar = this.f290843a;
            C9270n f = asVar.f290889v.mo86084f(asVar.f290869b);
            if (f != null && !C104551as.m172911p(f, this.f290843a.f290882o)) {
                this.f290843a.mo94249j();
                C104551as asVar2 = this.f290843a;
                asVar2.f290882o = f;
                asVar2.mo94248i(f, asVar2.f290889v, asVar2.f290881n, asVar2.f290879l, asVar2.f290880m, asVar2.f290887t, asVar2.f290888u, asVar2.f290886s, asVar2.f290885r, false, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo85735a(C7718hj hjVar) {
        m172900c(hjVar, true);
    }

    /* renamed from: b */
    public final void mo85736b(C7718hj hjVar) {
        m172900c(hjVar, false);
    }
}
