package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a;
import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90091ep;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.p3096r.C39905a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.im */
/* compiled from: PG */
public final class C116791im implements C87143ik {

    /* renamed from: a */
    private final C116790il f324022a;

    /* renamed from: b */
    private final C86842bk f324023b;

    /* renamed from: c */
    private final C86842bk f324024c;

    public C116791im(C116790il ilVar, C68214a aVar, C68214a aVar2) {
        this.f324022a = ilVar;
        this.f324023b = new C86842bk(aVar);
        this.f324024c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f324022a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        Query n;
        C60870cx cxVar;
        this.f324023b.mo80534b(icVar);
        this.f324024c.mo80534b(icVar);
        C86842bk bkVar = this.f324023b;
        if (bkVar.f234552a || this.f324024c.f234552a) {
            C116790il ilVar = this.f324022a;
            C86842bk bkVar2 = this.f324024c;
            if (bkVar2.f234552a) {
                C116775hx hxVar = (C116775hx) bkVar2.mo80533a();
                boolean z = hxVar.f323961n;
                hxVar.f323961n = false;
                if (z && !((C86124t) ilVar.f324009b.mo27525b()).mo79746e(C90091ep.f250546i) && ilVar.f324016i.compareAndSet(false, true)) {
                    C89356b e = ilVar.mo102944e();
                    ilVar.f324012e.mo78897a(ilVar.mo102945g(e), (C86361a) ilVar.f324011d.mo27525b(), e);
                }
            }
            if (bkVar.f234552a && (n = ((C116735gk) bkVar.mo80533a()).mo102901n("textsearch")) != null) {
                C116619cc ccVar = (C116619cc) ilVar.f324008a.mo27525b();
                if (!n.mo84337bV() && !n.mo84326bK() && n.mo84391cX() && C39905a.m69320a(n.f252768g.toString()) != null) {
                    cxVar = C60856cj.m92900i(true);
                } else if ("web".equals(n.mo84346be())) {
                    cxVar = C60856cj.m92900i(false);
                } else {
                    cxVar = ccVar.f323433f.mo78423c(n);
                }
                C60856cj.m92911t(cxVar, new C116789ik(ilVar, n, ((C116735gk) ilVar.f324010c.mo27525b()).mo102898e(n)), C60826bg.f164896a);
            }
        }
    }
}
