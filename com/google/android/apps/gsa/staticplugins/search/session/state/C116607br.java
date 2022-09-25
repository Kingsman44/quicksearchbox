package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86790e;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.br */
/* compiled from: PG */
public final class C116607br extends C116780ib {

    /* renamed from: a */
    public final C68214a f323400a;

    /* renamed from: b */
    public final C68214a f323401b;

    /* renamed from: c */
    public final C68214a f323402c;

    /* renamed from: d */
    public boolean f323403d;

    /* renamed from: e */
    public boolean f323404e;

    /* renamed from: f */
    public CharSequence f323405f;

    /* renamed from: g */
    public final C84624a f323406g;

    public C116607br(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C84624a aVar5) {
        super(aVar, 164);
        this.f323400a = aVar2;
        this.f323401b = aVar3;
        this.f323402c = aVar4;
        this.f323406g = aVar5;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.PREPARE_CCT_SESSION};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("CustomTabsSessionState");
        fVar.mo85279c("should prepare for session").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323403d)));
        fVar.mo85279c("query is a url").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323404e)));
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a == C87739bu.PREPARE_CCT_SESSION && ((C86790e) this.f323400a.mo27525b()).mo80442b()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f323406g.mo78389i();
        }
    }
}
