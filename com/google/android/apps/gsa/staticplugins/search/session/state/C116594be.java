package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.search.Query;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.be */
/* compiled from: PG */
public final class C116594be implements C87143ik {

    /* renamed from: a */
    private final C116593bd f323350a;

    /* renamed from: b */
    private final C86842bk f323351b;

    /* renamed from: c */
    private final C86842bk f323352c;

    public C116594be(C116593bd bdVar, C68214a aVar, C68214a aVar2) {
        this.f323350a = bdVar;
        this.f323351b = new C86842bk(aVar);
        this.f323352c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323350a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        Query n;
        this.f323351b.mo80534b(icVar);
        this.f323352c.mo80534b(icVar);
        C86842bk bkVar = this.f323351b;
        if (bkVar.f234552a || this.f323352c.f234552a) {
            C116593bd bdVar = this.f323350a;
            C86842bk bkVar2 = this.f323352c;
            if (bkVar2.f234552a && !((C116735gk) bkVar2.mo80533a()).f323784p.mo84435dP()) {
                bdVar.mo102791k((C116735gk) bkVar2.mo80533a());
            }
            if (bkVar.f234552a) {
                bdVar.mo102788g((C116836z) bkVar.mo80533a());
            }
            if (bkVar2.f234552a && (n = ((C116735gk) bkVar2.mo80533a()).mo102901n("clockwork")) != null) {
                bdVar.f323345d.mo28211k(bdVar.f323348g.mo79095b(n), "Clockwork Search Callback", new C116591bb(bdVar, n));
            }
        }
    }
}
