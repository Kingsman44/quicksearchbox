package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8127a;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91389a;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91394f;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91395g;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91397i;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7744ii;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C105109p implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C105116w f293047a;

    public /* synthetic */ C105109p(C105116w wVar) {
        this.f293047a = wVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C105116w wVar = this.f293047a;
        C7744ii iiVar = (C7744ii) obj;
        C58976aa aaVar = C58975e.f156826a;
        ((C118831d) wVar.f293058e.mo6453a()).mo104025g(1);
        C91396h e = C91396h.m149472e(C91397i.m149477e(iiVar), iiVar, false);
        wVar.f293060g.mo94721d(e);
        C91389a aVar = (C91389a) e;
        C58485gu b = aVar.f254969a.mo85719b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C7708h hVar = (C7708h) b.get(i);
            C7681g a = C7681g.m22802a(hVar.f26897b);
            if (a == null) {
                a = C7681g.INVALID;
            }
            if (a == C7681g.FOREGROUND_START) {
                wVar.f293056c.mo94534c().mo28730f(C58833ax.m90834k(hVar), false);
            } else {
                C7681g a2 = C7681g.m22802a(hVar.f26897b);
                if (a2 == null) {
                    a2 = C7681g.INVALID;
                }
                if (a2 == C7681g.FOREGROUND_END) {
                    wVar.f293056c.mo94533b().mo28730f(C58833ax.m90834k(hVar), false);
                }
            }
        }
        wVar.f293059f.mo94973k(aVar.f254969a, ((C91395g) C91394f.m149470a(aVar.f254970b, (String) null).mo56107c()).f254979a, "secondScreenSessionToken", 0);
    }
}
