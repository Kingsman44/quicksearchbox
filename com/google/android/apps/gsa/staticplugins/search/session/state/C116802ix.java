package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86699a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86725e;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ix */
/* compiled from: PG */
public final class C116802ix extends C116780ib {

    /* renamed from: a */
    public final C86726f f324073a = new C86726f(C86725e.m139700c(C86724d.IDLE));

    /* renamed from: b */
    private final C21370a f324074b;

    /* renamed from: c */
    private final C118827a f324075c;

    /* renamed from: d */
    private final C68214a f324076d;

    /* renamed from: e */
    private long f324077e;

    public C116802ix(C68214a aVar, C21370a aVar2, C68214a aVar3, C118827a aVar4) {
        super(aVar, 176);
        this.f324074b = aVar2;
        this.f324076d = aVar3;
        this.f324075c = aVar4;
    }

    /* renamed from: e */
    public final void mo102952e(C86724d dVar) {
        C86724d dVar2 = ((C86699a) this.f324073a.f234274a).f234194a;
        if (dVar != dVar2) {
            if (!C86724d.m139699b(dVar2, dVar)) {
                C89886e b = ((C89911f) this.f324076d.mo27525b()).mo83756b(new C90452a(211, C89885b.USER_ADVOCATE_INVALID_TRANSITION.f246280a));
                b.f246282c = 64257657;
                b.mo83721a();
            }
            if (dVar2 == C86724d.IDLE) {
                this.f324077e = this.f324074b.mo26872d();
            } else {
                C118575h hVar = dVar2.f234273i;
                if (hVar != C118575h.UNKNOWN_WORKLOAD) {
                    C118837d.m197249c(this.f324075c.mo77944g(C118569b.WORKER_LATENCY_MICROS, hVar), this.f324077e);
                }
            }
            C86699a aVar = new C86699a(dVar, this.f324074b.mo26871c());
            C58976aa aaVar = C58975e.f156826a;
            this.f324073a.mo80336a(aVar);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("UserAdvocateState");
        fVar.mo85279c("lastObservedUserScenario").mo85276a(C90752i.m148231e(this.f324073a.f234274a));
    }
}
