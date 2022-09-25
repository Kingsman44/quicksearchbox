package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.service.p6852g.C86699a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.iy */
/* compiled from: PG */
public final class C116803iy implements C87143ik {

    /* renamed from: a */
    private final C116802ix f324078a;

    /* renamed from: b */
    private final C68214a f324079b;

    public C116803iy(C116802ix ixVar, C68214a aVar) {
        this.f324078a = ixVar;
        this.f324079b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f324078a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C116775hx) this.f324079b.mo27525b()).f235452J)) {
            C116802ix ixVar = this.f324078a;
            C116775hx hxVar = (C116775hx) this.f324079b.mo27525b();
            C58976aa aaVar = C58975e.f156826a;
            if (C86724d.STARTUP_QSB_TEXT.equals(((C86699a) ixVar.f324073a.f234274a).f234194a) && !hxVar.f323957j) {
                ixVar.mo102952e(C86724d.IDLE);
            }
        }
    }
}
