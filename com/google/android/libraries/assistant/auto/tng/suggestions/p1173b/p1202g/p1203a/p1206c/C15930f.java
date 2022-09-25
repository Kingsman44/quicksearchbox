package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.p1206c;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.c.f */
/* compiled from: PG */
final class C15930f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C15932h f47288a;

    public C15930f(C15932h hVar) {
        this.f47288a = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C15932h.f47290a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SuggestionRateLimiter");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(46500)).mo56386p("Failed to execute immediate generation.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C15932h hVar = this.f47288a;
        C15929e eVar = new C15929e(hVar);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(eVar), hVar.f47295f), "Failed to cancel.", new Object[0]);
        C59104x b = C15932h.f47290a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SuggestionRateLimiter");
        ((C59052c) ((C59052c) b).mo56372aa(46501)).mo56386p("Cancelled previously scheduled task.");
    }
}
