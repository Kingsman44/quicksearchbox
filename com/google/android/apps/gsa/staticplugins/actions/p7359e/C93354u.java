package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import com.google.android.apps.gsa.search.shared.actions.modular.C87426a;
import com.google.android.apps.gsa.search.shared.actions.util.C87480b;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55365pr;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.u */
/* compiled from: PG */
final class C93354u extends C93356w {

    /* renamed from: a */
    final C54944ab f260368a;

    public C93354u(C93357x xVar, C87426a aVar, C55365pr prVar, C54944ab abVar) {
        super(xVar, aVar, prVar);
        this.f260368a = abVar;
    }

    /* renamed from: a */
    public final void mo87645a(C87480b bVar, String str) {
        bVar.mo81466h(str, this.f260368a);
    }

    /* renamed from: b */
    public final void mo87646b() {
        this.f260372d.mo81210Q().mo81398b("No resource sets for prompted field ".concat(String.valueOf(String.valueOf(this.f260368a))));
    }

    /* renamed from: c */
    public final void mo87647c(C87480b bVar, TtsRequest ttsRequest) {
        bVar.mo81467i(ttsRequest, this.f260368a);
    }
}
