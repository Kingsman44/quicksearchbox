package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16128c;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.m */
/* compiled from: PG */
public final /* synthetic */ class C16040m implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47488a;

    /* renamed from: b */
    public final /* synthetic */ String f47489b;

    public /* synthetic */ C16040m(C16027ax axVar, String str) {
        this.f47488a = axVar;
        this.f47489b = str;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C16027ax axVar = this.f47488a;
        String str = this.f47489b;
        C59104x d = C16027ax.f47450a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SuggestionRepository");
        ((C59052c) ((C59052c) d).mo56372aa(46523)).mo56389s("Metrics was not created in showCandidateSuggestion() for suggestion: %s", str);
        C16128c cVar = new C16128c();
        cVar.mo22689b(str);
        cVar.mo22690c(1);
        cVar.mo22696i(1);
        cVar.mo22691d(0);
        cVar.mo22694g(0);
        cVar.mo22693f(axVar.f47451b.mo26870b());
        cVar.mo22695h(axVar.f47451b.mo26870b());
        cVar.mo22692e(axVar.f47451b.mo26870b());
        return cVar.mo22688a();
    }
}
