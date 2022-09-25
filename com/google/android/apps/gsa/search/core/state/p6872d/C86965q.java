package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6519al.p6769y.C85615a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.q */
/* compiled from: PG */
public final class C86965q extends C86898ct {

    /* renamed from: a */
    public int f234898a;

    /* renamed from: b */
    private final C85615a f234899b;

    public C86965q(C68214a aVar, C85615a aVar2) {
        super(aVar, 2);
        this.f234899b = aVar2;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.UPDATE_GSA_CONFIGS, C87739bu.FETCH_CONFIGS_FROM_PHENOTYPE, C87739bu.PROPERTIES_UPDATE_IN_PHENOTYPE};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ConfigurationState");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 87) {
            this.f234899b.mo79098c(j);
        } else if (ordinal == 88) {
            this.f234899b.mo79097a(j);
        } else if (ordinal == 99) {
            this.f234899b.mo79099gu(j);
        }
    }
}
