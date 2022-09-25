package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86790e;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.ci */
/* compiled from: PG */
public final class C86887ci extends C86898ct {

    /* renamed from: a */
    public final C68214a f234642a;

    /* renamed from: b */
    public final C68214a f234643b;

    /* renamed from: c */
    public boolean f234644c;

    /* renamed from: d */
    public boolean f234645d;

    /* renamed from: e */
    public CharSequence f234646e;

    /* renamed from: f */
    public final C84624a f234647f;

    public C86887ci(C68214a aVar, C68214a aVar2, C68214a aVar3, C84624a aVar4) {
        super(aVar, 60);
        this.f234642a = aVar2;
        this.f234643b = aVar3;
        this.f234647f = aVar4;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.PREPARE_CCT_SESSION};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("CustomTabsSessionState");
        fVar.mo85279c("should prepare for session").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234644c)));
        fVar.mo85279c("query is a url").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234645d)));
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a == C87739bu.PREPARE_CCT_SESSION && ((C86790e) this.f234642a.mo27525b()).mo80442b()) {
            this.f234647f.mo78389i();
        }
    }
}
