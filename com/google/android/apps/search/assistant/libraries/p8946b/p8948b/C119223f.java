package com.google.android.apps.search.assistant.libraries.p8946b.p8948b;

import com.google.android.apps.search.assistant.libraries.p8942a.C119206c;
import com.google.android.libraries.geller.p1816d.C21769a;
import com.google.android.libraries.geller.p1816d.C21770b;
import com.google.android.libraries.geller.p1816d.C21771c;
import com.google.android.libraries.geller.p1816d.C21772d;
import com.google.android.libraries.geller.p1816d.C21773e;
import com.google.android.libraries.geller.p1816d.C21774f;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4874ap.p4875a.p4876a.C63678q;
import com.google.protos.p5129p.p5130a.C65716ao;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.b.f */
/* compiled from: PG */
public final class C119223f {

    /* renamed from: f */
    private static final C58974d f332490f = C58974d.m91136j();

    /* renamed from: a */
    public final Executor f332491a;

    /* renamed from: b */
    public final C46128f f332492b;

    /* renamed from: c */
    public final C119206c f332493c;

    /* renamed from: d */
    public final C21773e f332494d;

    /* renamed from: e */
    public final AccountId f332495e;

    /* renamed from: g */
    private final C46175b f332496g;

    /* renamed from: h */
    private final C38469m f332497h;

    /* renamed from: i */
    private final Map f332498i;

    /* renamed from: j */
    private final boolean f332499j;

    public C119223f(Executor executor, C21773e eVar, C119206c cVar, C46128f fVar, C46175b bVar, AccountId accountId, C38469m mVar, Map map, boolean z) {
        this.f332491a = executor;
        this.f332494d = eVar;
        this.f332493c = cVar;
        this.f332492b = fVar;
        this.f332496g = bVar;
        this.f332495e = accountId;
        this.f332497h = mVar;
        this.f332498i = map;
        this.f332499j = z;
    }

    /* renamed from: e */
    private final C60870cx m197909e(C65753ak akVar) {
        try {
            C21772d a = this.f332494d.mo27107a(akVar, C65716ao.f178536d, C58485gu.m89845m());
            akVar.name();
            return this.f332493c.mo104239a(((C21769a) a).f60076a, ((C21769a) a).f60077b);
        } catch (C21774f e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: a */
    public final C60870cx mo104248a(C65753ak akVar) {
        try {
            mo104251d();
            if (this.f332498i.containsKey(akVar)) {
                return m197909e(((C21771c) this.f332498i.get(akVar)).mo27106b());
            }
            return m197909e(akVar);
        } catch (C21774f e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: b */
    public final C60870cx mo104249b(C65753ak akVar) {
        C60870cx cxVar;
        try {
            mo104251d();
            if (this.f332498i.containsKey(akVar)) {
                cxVar = ((C21771c) this.f332498i.get(akVar)).mo27105a();
            } else {
                int i = -1;
                if (C21770b.f60078a.containsKey(akVar) && (((C63678q) C21770b.f60078a.get(akVar)).f172179a & 1) != 0) {
                    i = ((C63678q) C21770b.f60078a.get(akVar)).f172180b;
                }
                cxVar = C47633f.m84733g(this.f332497h.mo41436g(akVar, i, C63662ac.f172144a)).mo51515h(C119222e.f332489a, this.f332491a);
            }
            return mo104250c(akVar, cxVar);
        } catch (C21774f e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: c */
    public final C60870cx mo104250c(C65753ak akVar, C60870cx cxVar) {
        C47633f h = C47633f.m84733g(this.f332496g.mo50246c(this.f332495e)).mo51515h(C119220c.f332485a, this.f332491a);
        C119221d dVar = new C119221d(this, akVar, cxVar);
        return C60922j.m93045h(h, C47810es.m84966f(dVar), this.f332491a);
    }

    /* renamed from: d */
    public final void mo104251d() {
        if (!this.f332499j) {
            ((C58970a) ((C58970a) f332490f.mo56224b()).mo56372aa(34368)).mo56386p("Geller-AiAi egress is not enabled");
            throw new C21774f("Geller AiAi data share is not enabled");
        }
    }
}
