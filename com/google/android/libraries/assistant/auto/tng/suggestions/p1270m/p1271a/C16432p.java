package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15763a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15916a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15936f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15939a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.C16237a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1251c.C16247a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.p */
/* compiled from: PG */
public final /* synthetic */ class C16432p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48333a;

    /* renamed from: b */
    public final /* synthetic */ C16090ap f48334b;

    /* renamed from: c */
    public final /* synthetic */ C16091aq f48335c;

    /* renamed from: d */
    public final /* synthetic */ C15763a f48336d;

    public /* synthetic */ C16432p(C16416ag agVar, C16090ap apVar, C16091aq aqVar, C15763a aVar) {
        this.f48333a = agVar;
        this.f48334b = apVar;
        this.f48335c = aqVar;
        this.f48336d = aVar;
    }

    public final Object apply(Object obj) {
        C16416ag agVar = this.f48333a;
        C16090ap apVar = this.f48334b;
        C16091aq aqVar = this.f48335c;
        C15763a aVar = this.f48336d;
        Void voidR = (Void) obj;
        agVar.f48288c.mo22638m(aqVar);
        agVar.f48288c.mo22640o(apVar, aVar);
        agVar.f48288c.mo22639n(apVar, true);
        agVar.f48288c.f47362c.remove(apVar);
        C58976aa aaVar = C58975e.f156826a;
        aqVar.mo22735i();
        C53306j b = apVar.mo22725b();
        if (((Boolean) agVar.f48303r.mo17428b()).booleanValue() && agVar.f48292g.mo22868b(new C16247a((C16237a) agVar.f48291f.mo27525b(), apVar.mo22725b())) && apVar != C16090ap.MORRIS_DRIVING_SCREEN) {
            C46459k.m82829b(((C16237a) agVar.f48291f.mo27525b()).mo22860a(C53270hr.FOREGROUND, b), "Get proactive suggestions failed", new Object[0]);
        }
        int ordinal = apVar.ordinal();
        if (ordinal != 3) {
            if (ordinal != 4) {
                C58833ax k = C58833ax.m90834k(apVar);
                C15937g gVar = C15937g.ONEOFF_SUGGESTION_GENERATION;
                C15924c cVar = C15924c.SUGGESTION_GENERATION;
                C15936f d = C15938h.m32735d();
                d.mo22604c(gVar);
                ((C15916a) d).f47258a = k;
                C46459k.m82829b(((C15939a) agVar.f48293h.mo27525b()).mo22621b(cVar, d.mo22602a()), "Failed to trigger generation at display registration.", new Object[0]);
            } else {
                C15924c cVar2 = C15924c.PCP_FETCH;
                C15936f d2 = C15938h.m32735d();
                d2.mo22604c(C15937g.IMMEDIATE_ONEOFF_SUGGESTION_GENERATION);
                ((C15916a) d2).f47258a = C58833ax.m90834k(apVar);
                C46459k.m82829b(((C15939a) agVar.f48293h.mo27525b()).mo22621b(cVar2, d2.mo22602a()), "Failed to trigger pcp fetch and generation at display registration.", new Object[0]);
            }
        }
        return true;
    }
}
