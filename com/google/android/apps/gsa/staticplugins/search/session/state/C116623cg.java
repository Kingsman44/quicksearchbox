package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.search.Query;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.cg */
/* compiled from: PG */
public final class C116623cg implements C87143ik {

    /* renamed from: a */
    private final C116622cf f323442a;

    /* renamed from: b */
    private final C68214a f323443b;

    public C116623cg(C116622cf cfVar, C68214a aVar) {
        this.f323442a = cfVar;
        this.f323443b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323442a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((TtsState) this.f323443b.mo27525b()).f235452J)) {
            C116622cf cfVar = this.f323442a;
            TtsState ttsState = (TtsState) this.f323443b.mo27525b();
            Query query = cfVar.f323441b;
            if (query != null && ttsState.mo102767y()) {
                C116735gk gkVar = (C116735gk) cfVar.f323440a.mo27525b();
                if (gkVar.mo102895as(gkVar.f323784p, query)) {
                    gkVar.mo80591ar();
                }
                cfVar.f323441b = null;
            }
        }
    }
}
