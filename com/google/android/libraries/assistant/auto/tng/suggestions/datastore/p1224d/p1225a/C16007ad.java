package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16128c;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C16007ad implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47419a;

    /* renamed from: b */
    public final /* synthetic */ String f47420b;

    public /* synthetic */ C16007ad(C16027ax axVar, String str) {
        this.f47419a = axVar;
        this.f47420b = str;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C16027ax axVar = this.f47419a;
        String str = this.f47420b;
        C59104x d = C16027ax.f47450a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SuggestionRepository");
        ((C59052c) ((C59052c) d).mo56372aa(46524)).mo56389s("Metrics was not created in showCandidateSuggestion() for suggestion: %s", str);
        C16128c cVar = new C16128c();
        cVar.mo22689b(str);
        cVar.mo22690c(0);
        cVar.mo22696i(1);
        cVar.mo22691d(1);
        cVar.mo22694g(axVar.f47451b.mo26870b());
        cVar.mo22693f(0);
        cVar.mo22695h(axVar.f47451b.mo26870b());
        cVar.mo22692e(axVar.f47451b.mo26870b());
        return cVar.mo22688a();
    }
}
