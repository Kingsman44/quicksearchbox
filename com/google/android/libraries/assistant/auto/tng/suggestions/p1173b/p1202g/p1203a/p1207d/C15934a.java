package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.p1207d;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15933d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.C16282a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1259b.C16300p;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.d.a */
/* compiled from: PG */
public final class C15934a implements C15933d {

    /* renamed from: a */
    private final C16282a f47299a;

    public C15934a(C16282a aVar) {
        this.f47299a = aVar;
    }

    /* renamed from: a */
    public final C15924c mo22612a() {
        return C15924c.SUGGESTION_GENERATION;
    }

    /* renamed from: b */
    public final C60870cx mo22613b(C15938h hVar) {
        C16282a aVar = this.f47299a;
        C16300p pVar = (C16300p) aVar;
        if (!((Boolean) pVar.f47980n.mo17428b()).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60866ct.f164955a;
        } else if (!C47831fm.m85015j().equals("<no trace>")) {
            C58976aa aaVar2 = C58975e.f156826a;
            C47831fm.m85015j();
            return pVar.mo22874a(hVar);
        } else {
            C47538ax c = pVar.f47977k.mo51613c("SuggestionProcessor#suggestionGeneration");
            try {
                C58976aa aaVar3 = C58975e.f156826a;
                C47831fm.m85015j();
                C60870cx a = ((C16300p) aVar).mo22874a(hVar);
                if (c == null) {
                    return a;
                }
                c.close();
                return a;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
        throw th;
    }
}
