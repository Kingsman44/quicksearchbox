package com.google.android.apps.search.assistant.libraries.p8972f.p8973a;

import com.google.android.apps.gsa.p8867w.p8875e.C118784a;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.C121059e;
import com.google.android.apps.search.assistant.platform.p9141h.p9167j.C121170d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.p4671b.C61822o;
import com.google.knowledge.p4671b.C61826s;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.libraries.f.a.q */
/* compiled from: PG */
public final class C119380q implements C119369f {

    /* renamed from: a */
    public static final C59071e f332830a = C59071e.m91332i("com.google.android.apps.search.assistant.libraries.f.a.q");

    /* renamed from: b */
    public final C118784a f332831b;

    /* renamed from: c */
    private final C69464a f332832c;

    /* renamed from: d */
    private final C46175b f332833d;

    /* renamed from: e */
    private final C121011a f332834e;

    /* renamed from: f */
    private final Executor f332835f;

    /* renamed from: g */
    private final C121059e f332836g;

    /* renamed from: h */
    private final boolean f332837h;

    /* renamed from: i */
    private final boolean f332838i;

    /* renamed from: j */
    private final C121170d f332839j;

    public C119380q(C69464a aVar, C46175b bVar, Executor executor, C121011a aVar2, C118784a aVar3, C121170d dVar, C121059e eVar, boolean z, boolean z2) {
        this.f332835f = executor;
        this.f332832c = aVar;
        this.f332833d = bVar;
        this.f332834e = aVar2;
        this.f332831b = aVar3;
        this.f332839j = dVar;
        this.f332836g = eVar;
        this.f332837h = z;
        this.f332838i = z2;
    }

    /* renamed from: a */
    public final C60870cx mo104311a(C119368e eVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        if (eVar.mo104307a() != 1) {
            EnumMap enumMap = new EnumMap(C119379p.class);
            C119379p pVar = C119379p.OPA_USER_ENABLED_STATUS;
            C60870cx a = this.f332834e.mo104231a();
            C60870cx b = this.f332834e.mo104232b();
            enumMap.put(pVar, C47638k.m84753d(a, b).mo51520a(new C119373j(a, b), this.f332835f));
            enumMap.put(C119379p.OPA_UDC_CONSENT_STATUS, C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN));
            C119379p pVar2 = C119379p.SCREEN_CONTEXT_OPT_IN_STATUS;
            C60870cx a2 = this.f332839j.mo105068a();
            C119375l lVar = C119375l.f332810a;
            enumMap.put(pVar2, C60922j.m93044g(a2, C47810es.m84963c(lVar), this.f332835f));
            enumMap.put(C119379p.OPA_EMAIL_OPT_IN_STATUS, C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN));
            enumMap.put(C119379p.SPEAKER_MODEL_STATUS, C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN));
            enumMap.put(C119379p.THIRD_PARTY_DISCLOSURE_STATUS, C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN));
            C119379p pVar3 = C119379p.ASSISTANT_ON_LOCKSCREEN_STATUS;
            if (!this.f332837h) {
                cxVar = C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN);
            } else {
                C60870cx a3 = this.f332836g.mo105035a();
                C119376m mVar = C119376m.f332811a;
                cxVar = C60922j.m93044g(a3, C47810es.m84963c(mVar), this.f332835f);
            }
            enumMap.put(pVar3, cxVar);
            C119379p pVar4 = C119379p.SKIP_VOICE_RECOGNITION_STATUS;
            if (!this.f332838i) {
                cxVar2 = C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN);
            } else {
                C60870cx c = this.f332836g.mo105037c();
                C119374k kVar = C119374k.f332809a;
                cxVar2 = C60922j.m93044g(c, C47810es.m84963c(kVar), this.f332835f);
            }
            enumMap.put(pVar4, cxVar2);
            enumMap.put(C119379p.HEADPHONE_PERSONAL_RESULTS_STATUS, C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN));
            enumMap.put(C119379p.WARM_ACTIONS_ENROLLMENT_STATUS, C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN));
            enumMap.put(C119379p.WARM_ACTIONS_ALARMS_TIMERS_ENROLLMENT_STATUS, C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN));
            enumMap.put(C119379p.WARM_ACTIONS_CALLS_ENROLLMENT_STATUS, C60856cj.m92900i(C61826s.OPA_OPT_IN_STATUS_UNKNOWN));
            C60870cx i = C60856cj.m92900i(C61822o.NOT_ELIGIBLE);
            C60870cx c2 = this.f332833d.mo50246c((AccountId) this.f332832c.mo17428b());
            C119370g gVar = new C119370g(this);
            C60870cx h = C60922j.m93045h(c2, C47810es.m84966f(gVar), this.f332835f);
            C119371h hVar = C119371h.f332805a;
            C60870cx g = C60922j.m93044g(h, C47810es.m84963c(hVar), this.f332835f);
            C60870cx a4 = this.f332834e.mo104231a();
            C119378o oVar = C119378o.f332816a;
            C60870cx g2 = C60922j.m93044g(a4, C47810es.m84963c(oVar), this.f332835f);
            ArrayList arrayList = new ArrayList(enumMap.values());
            arrayList.add(i);
            arrayList.add(g);
            arrayList.add(g2);
            return C47638k.m84750a(arrayList).mo51520a(new C119377n(enumMap, i, g, g2), this.f332835f);
        }
        return C60856cj.m92899h(new IllegalArgumentException(String.format("Failed to fetch ClientOptInContext because the FetchReason %s is illegal.", new Object[]{C119367d.m198095a(eVar.mo104307a())})));
    }
}
