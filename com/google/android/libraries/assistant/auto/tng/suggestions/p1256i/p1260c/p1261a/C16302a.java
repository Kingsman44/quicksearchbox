package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1260c.p1261a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15916a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15935e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15936f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15944b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.c.a.a */
/* compiled from: PG */
final class C16302a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C16303b f47982a;

    public C16302a(C16303b bVar) {
        this.f47982a = bVar;
    }

    public final void run() {
        C15924c cVar;
        synchronized (this) {
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f47982a.f47983a.mo22633h().isEmpty()) {
                C16303b bVar = this.f47982a;
                C15944b bVar2 = bVar.f47985c;
                if (bVar.mo22880c()) {
                    cVar = C15924c.PCP_FETCH;
                } else {
                    cVar = C15924c.SUGGESTION_GENERATION;
                }
                C15936f d = C15938h.m32735d();
                d.mo22604c(C15937g.PERIODIC_SUGGESTION_GENERATION);
                ((C15916a) d).f47258a = C58836b.f156633a;
                C46459k.m82829b(bVar2.mo22621b(cVar, d.mo22602a()), "Failed to trigger.", new Object[0]);
            }
            C16303b bVar3 = this.f47982a;
            C46459k.m82829b(bVar3.f47984b.mo29164d(C47810es.m84977q(new C16302a(bVar3)), this.f47982a.mo22879b().plusMillis(((C15935e) this.f47982a.f47986d.get()).mo22617c()).toMillis(), TimeUnit.MILLISECONDS), "Failed to schedule.", new Object[0]);
        }
    }
}
