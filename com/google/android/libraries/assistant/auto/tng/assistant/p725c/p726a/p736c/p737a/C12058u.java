package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c.p737a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12024b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.a.u */
/* compiled from: PG */
public final class C12058u implements C12024b {

    /* renamed from: b */
    private static final C59071e f38607b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.a.u");

    /* renamed from: a */
    public final Executor f38608a;

    /* renamed from: c */
    private final C60870cx f38609c;

    /* renamed from: d */
    private final C60870cx f38610d;

    /* renamed from: e */
    private final C60870cx f38611e;

    public C12058u(C60870cx cxVar, Executor executor, C60870cx cxVar2, C60870cx cxVar3) {
        this.f38609c = cxVar;
        this.f38608a = executor;
        this.f38610d = cxVar2;
        this.f38611e = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo20366a() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f38610d;
        C12051n nVar = C12051n.f38601a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(nVar), this.f38608a);
    }

    /* renamed from: b */
    public final C60870cx mo20367b() {
        C60870cx cxVar = this.f38610d;
        C12052o oVar = new C12052o(this);
        return C60922j.m93045h(cxVar, C47810es.m84966f(oVar), this.f38608a);
    }

    /* renamed from: c */
    public final C60870cx mo20368c() {
        return this.f38611e;
    }

    /* renamed from: d */
    public final C60870cx mo20369d() {
        C59104x b = f38607b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AudioLstnSess");
        ((C59052c) ((C59052c) b).mo56372aa(44014)).mo56386p("#stopListening");
        C60870cx cxVar = this.f38610d;
        C12053p pVar = C12053p.f38603a;
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(pVar), this.f38608a);
        C60870cx cxVar2 = this.f38609c;
        C12054q qVar = C12054q.f38604a;
        C60870cx h = C60922j.m93045h(cxVar2, C47810es.m84966f(qVar), this.f38608a);
        C12055r rVar = C12055r.f38605a;
        return C60856cj.m92901j(C47638k.m84751b(g, C60922j.m93044g(h, C47810es.m84963c(rVar), this.f38608a)).mo51520a(C12056s.f38606a, this.f38608a));
    }
}
