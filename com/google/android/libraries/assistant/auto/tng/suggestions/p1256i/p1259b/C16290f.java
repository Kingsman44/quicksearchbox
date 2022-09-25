package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1259b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16106be;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import org.json.JSONException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.b.f */
/* compiled from: PG */
public final /* synthetic */ class C16290f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16300p f47949a;

    /* renamed from: b */
    public final /* synthetic */ C15938h f47950b;

    /* renamed from: c */
    public final /* synthetic */ C16090ap f47951c;

    public /* synthetic */ C16290f(C16300p pVar, C15938h hVar, C16090ap apVar) {
        this.f47949a = pVar;
        this.f47950b = hVar;
        this.f47951c = apVar;
    }

    public final C60870cx apply(Object obj) {
        C16300p pVar = this.f47949a;
        C15938h hVar = this.f47950b;
        C16090ap apVar = this.f47951c;
        Boolean bool = (Boolean) obj;
        if (!hVar.mo22605a().equals(C15937g.IMMEDIATE_EMPTY_SUGGESTION_GENERATION)) {
            boolean booleanValue = ((Boolean) pVar.f47979m.mo17428b()).booleanValue();
            if ((apVar != C16090ap.SMART_CHIP || booleanValue) && bool.booleanValue()) {
                ((C37215b) pVar.f47970d.mo17428b()).mo19974a(C37179a.f97402A.mo40816j("displayTypeWithTrigger", C16300p.m33314c(apVar, hVar)));
                try {
                    boolean c = hVar.mo22607c();
                    boolean p = pVar.f47973g.mo22641p(apVar);
                    C58833ax g = pVar.f47973g.mo22632g(apVar);
                    if (c || (p && (!g.mo56113h() || ((C16106be) g.mo56107c()).mo22760d()))) {
                        C60870cx b = pVar.f47975i.mo22542b(apVar);
                        C16285a aVar = new C16285a(pVar, hVar, apVar);
                        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(aVar), pVar.f47968b);
                        C16286b bVar = new C16286b(pVar, apVar, hVar);
                        C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(bVar), pVar.f47968b);
                        C16287c cVar = new C16287c(pVar);
                        C60870cx a = C47638k.m84753d(h, h2, C60922j.m93045h(h, C47810es.m84966f(cVar), pVar.f47968b)).mo51520a(new C16288d(pVar, h, apVar, hVar), pVar.f47968b);
                        C16289e eVar = new C16289e(pVar, apVar, hVar);
                        return C60846c.m92878g(a, Exception.class, C47810es.m84963c(eVar), pVar.f47968b);
                    }
                    C37252a c2 = C37179a.f97407F.mo40805c(C62722b.CANCELLED);
                    ((C37253b) c2).mo40795s("displayTypeWithTrigger", C16300p.m33314c(apVar, hVar));
                    ((C37215b) pVar.f47970d.mo17428b()).mo19974a(c2);
                    return C60866ct.f164955a;
                } catch (JSONException e) {
                    C59104x c3 = C16300p.f47967a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "SuggestionProcessor");
                    ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(46683)).mo56386p("Error in parsing JSON signal from Partner Application");
                    C37252a c4 = C37179a.f97407F.mo40805c(C62722b.ABORTED);
                    ((C37253b) c4).mo40795s("displayTypeWithTrigger", C16300p.m33314c(apVar, hVar));
                    ((C37215b) pVar.f47970d.mo17428b()).mo19974a(c4);
                    return C60866ct.f164955a;
                }
            }
        }
        C60870cx g2 = pVar.f47969c.mo22650g(apVar);
        C16294j jVar = new C16294j(pVar);
        return C60922j.m93045h(g2, C47810es.m84966f(jVar), pVar.f47968b);
    }
}
