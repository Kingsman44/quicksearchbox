package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.da */
/* compiled from: PG */
public final class C116644da implements C87143ik {

    /* renamed from: a */
    private final C116642cz f323513a;

    /* renamed from: b */
    private final C68214a f323514b;

    public C116644da(C116642cz czVar, C68214a aVar) {
        this.f323513a = czVar;
        this.f323514b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323513a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C116735gk) this.f323514b.mo27525b()).f235452J)) {
            C116642cz czVar = this.f323513a;
            Query query = ((C116735gk) this.f323514b.mo27525b()).f323784p;
            if (czVar.f323504c.mo79746e(C90120fr.f250793aF) && query.mo84420dA() && ((C91077d) czVar.f323503b.mo27525b()).f254356c.mo85346a("android.permission.MEDIA_CONTENT_CONTROL") && !query.equals(Query.f252741b) && query.f252780s != czVar.f323507f.f252780s) {
                czVar.f323507f = query;
                new C90873ag(czVar.f323505d.mo78523a(), czVar.f323506e, "MediaControlState.storePlaybackStatusSnapshot", new C116640cx(czVar)).mo85223a(C116641cy.f323501a);
            }
        }
    }
}
