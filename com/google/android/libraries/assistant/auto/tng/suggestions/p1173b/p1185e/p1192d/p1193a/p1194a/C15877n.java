package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1192d.p1193a.p1194a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15936f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15944b;
import com.google.apps.tiktok.concurrent.C46459k;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C15877n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15878o f47149a;

    public /* synthetic */ C15877n(C15878o oVar) {
        this.f47149a = oVar;
    }

    public final void run() {
        C15944b bVar = this.f47149a.f47155f;
        C15924c cVar = C15924c.SUGGESTION_GENERATION;
        C15936f d = C15938h.m32735d();
        d.mo22604c(C15937g.ONEOFF_SUGGESTION_GENERATION);
        C46459k.m82829b(bVar.mo22621b(cVar, d.mo22602a()), "Failed to trigger new suggestion generation.", new Object[0]);
    }
}
