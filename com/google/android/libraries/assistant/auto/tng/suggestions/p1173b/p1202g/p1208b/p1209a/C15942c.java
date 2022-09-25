package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.p1209a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15933d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15939a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.b.a.c */
/* compiled from: PG */
public final class C15942c implements C15939a {

    /* renamed from: a */
    public final C60888db f47311a;

    /* renamed from: b */
    public final C69464a f47312b;

    /* renamed from: c */
    public C60870cx f47313c = null;

    /* renamed from: d */
    private final Map f47314d = new ConcurrentHashMap();

    /* renamed from: e */
    private final Executor f47315e;

    public C15942c(C60888db dbVar, C69464a aVar) {
        this.f47311a = dbVar;
        this.f47312b = aVar;
        this.f47315e = new C60904dr(dbVar);
    }

    /* renamed from: a */
    public final void mo22619a(C15933d dVar) {
        this.f47314d.put(dVar.mo22612a(), dVar);
    }

    /* renamed from: b */
    public final C60870cx mo22621b(C15924c cVar, C15938h hVar) {
        if (!this.f47314d.containsKey(cVar)) {
            return C60856cj.m92899h(new Exception(String.format("Cannot trigger action for: %s because no corresponding Context Action Trigger Listener has been registered", new Object[]{cVar.name()})));
        }
        C15933d dVar = (C15933d) this.f47314d.get(cVar);
        C58976aa aaVar = C58975e.f156826a;
        cVar.name();
        if (hVar == null) {
            hVar = C15938h.m32735d().mo22602a();
        }
        if (hVar.mo22606b().mo56113h() && ((C16090ap) hVar.mo22606b().mo56107c()).equals(C16090ap.SMART_CHIP) && hVar.mo22605a().equals(C15937g.ONEOFF_SUGGESTION_GENERATION)) {
            C15941b bVar = new C15941b(this, dVar, (C16090ap) hVar.mo22606b().mo56107c());
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(bVar), this.f47315e), "Failed to trigger one off suggestion generation.", new Object[0]);
        }
        return dVar.mo22613b(hVar);
    }
}
