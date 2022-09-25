package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.p1206c;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.c.g */
/* compiled from: PG */
final class C15931g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C15932h f47289a;

    public C15931g(C15932h hVar) {
        this.f47289a = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C15932h.f47290a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SuggestionRateLimiter");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(46502)).mo56386p("Failed to trigger scheduled task.");
        C46459k.m82829b(this.f47289a.mo22618d((C60870cx) null), "Failed to set tasks.", new Object[0]);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C46459k.m82829b(this.f47289a.mo22618d((C60870cx) null), "Failed to set tasks.", new Object[0]);
        C15932h hVar = this.f47289a;
        hVar.f47297h.set(hVar.f47294e.mo57444a().toEpochMilli());
    }
}
