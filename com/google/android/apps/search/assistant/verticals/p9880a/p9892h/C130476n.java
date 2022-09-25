package com.google.android.apps.search.assistant.verticals.p9880a.p9892h;

import com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9893a.C130414g;
import com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9894b.C130425d;
import com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9894b.C130429h;
import com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c.C130441b;
import com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c.C130453n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58745qk;
import com.google.common.p4522b.C58756qv;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.n */
/* compiled from: PG */
public final class C130476n implements C130407a {

    /* renamed from: a */
    public static final C58974d f357443a = C58974d.m91136j();

    /* renamed from: b */
    public final C60887da f357444b;

    /* renamed from: c */
    private final C130414g f357445c;

    /* renamed from: d */
    private final C130453n f357446d;

    /* renamed from: e */
    private final C130429h f357447e;

    /* renamed from: f */
    private final boolean f357448f;

    public C130476n(C130414g gVar, C130453n nVar, C130429h hVar, boolean z, C60887da daVar) {
        this.f357445c = gVar;
        this.f357446d = nVar;
        this.f357447e = hVar;
        this.f357448f = z;
        this.f357444b = daVar;
    }

    /* renamed from: c */
    private final C60870cx m212882c(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        return C47638k.m84751b(cxVar, cxVar2, cxVar3).mo51520a(new C130466d(cxVar, cxVar2, cxVar3), this.f357444b);
    }

    /* renamed from: b */
    public final C60870cx mo109689b(List list) {
        C130453n nVar = this.f357446d;
        C60870cx b = nVar.mo109705b(nVar.mo109704a(C58528ij.m90006F(list)));
        C130474l lVar = C130474l.f357441a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(lVar), this.f357444b);
        C60870cx b2 = this.f357445c.mo109693b(C58528ij.m90006F(list));
        C130475m mVar = C130475m.f357442a;
        return m212882c(g, C60922j.m93044g(b2, C47810es.m84963c(mVar), this.f357444b), C60856cj.m92900i(C58485gu.m89845m()));
    }

    /* renamed from: a */
    public final C60870cx mo109688a() {
        C60870cx cxVar;
        if (this.f357448f) {
            C130429h hVar = this.f357447e;
            C60870cx d = hVar.f357390a.mo41433d(C65753ak.APP_ACTIONS, (String) null, C63662ac.f172144a, 1, C49301bt.f127423f);
            C130425d dVar = C130425d.f357386a;
            cxVar = C60922j.m93044g(d, C47810es.m84963c(dVar), hVar.f357391b);
        } else {
            cxVar = C60856cj.m92900i(C58729pv.f156485a);
        }
        C130470h hVar2 = C130470h.f357436a;
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(hVar2), this.f357444b);
        C60870cx a = this.f357445c.mo109692a();
        C130471i iVar = C130471i.f357437a;
        C60870cx g2 = C60922j.m93044g(a, C47810es.m84963c(iVar), this.f357444b);
        C130453n nVar = this.f357446d;
        C58756qv e = C58758qx.m90647e(C130441b.m212876a(nVar.f357415c), C58758qx.m90646d(C130453n.f357413a.map.keySet(), nVar.f357416d));
        C58526ih ihVar = new C58526ih();
        C58745qk qkVar = (C58745qk) e;
        ihVar.mo55489i(qkVar.f156516a);
        ihVar.mo55489i(qkVar.f156517b);
        C60870cx b = nVar.mo109705b(nVar.mo109704a(ihVar.mo55486f()));
        C130472j jVar = C130472j.f357438a;
        C60870cx c = m212882c(C60922j.m93044g(b, C47810es.m84963c(jVar), this.f357444b), g2, g);
        C130473k kVar = new C130473k(this, cxVar);
        return C60922j.m93045h(c, C47810es.m84966f(kVar), this.f357444b);
    }
}
