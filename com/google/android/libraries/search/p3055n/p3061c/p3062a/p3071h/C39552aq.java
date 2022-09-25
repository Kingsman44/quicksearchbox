package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.binaries.satin.app.aqw;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.search.p2904c.C37660hg;
import com.google.android.libraries.search.p2904c.p2952o.p2954b.C37909b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.n.c.a.h.aq */
/* compiled from: PG */
public final /* synthetic */ class C39552aq implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104127a;

    /* renamed from: b */
    public final /* synthetic */ C39562b f104128b;

    public /* synthetic */ C39552aq(C39580br brVar, C39562b bVar) {
        this.f104127a = brVar;
        this.f104128b = bVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C39580br brVar = this.f104127a;
        C39562b bVar = this.f104128b;
        C39606y yVar = brVar.f104179l;
        Soda soda = (Soda) brVar.f104186s.mo56107c();
        C37660hg hgVar = brVar.f104170c;
        C39526i iVar = brVar.f104178k;
        boolean c = ((C39583bu) brVar.f104188u.mo56107c()).mo41921c().mo41884c();
        boolean k = brVar.mo41913k();
        Executor executor = brVar.f104174g;
        C37909b bVar2 = (C37909b) yVar.f104275a.mo17428b();
        bVar2.getClass();
        aqw aqw = (aqw) yVar.f104276b.mo17428b();
        aqw.getClass();
        Boolean bool = (Boolean) yVar.f104277c.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        soda.getClass();
        hgVar.getClass();
        bVar.getClass();
        iVar.getClass();
        executor.getClass();
        brVar.f104187t = C58833ax.m90834k(new C39605x(bVar2, aqw, booleanValue, soda, hgVar, bVar, iVar, c, k, executor));
        brVar.f104184q = C58833ax.m90834k(cVar);
        C39605x xVar = (C39605x) brVar.f104187t.mo56107c();
        ((C59052c) ((C59052c) C39605x.f104254a.mo56224b()).mo56372aa(53712)).mo56389s("pushAudioToSoda. stopPushAudio is %b", Boolean.valueOf(xVar.f104264k.get()));
        C39600s sVar = new C39600s(xVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(sVar), xVar.f104258e);
        C39595n nVar = new C39595n(xVar);
        C60870cx h = C60922j.m93045h(m, C47810es.m84966f(nVar), xVar.f104258e);
        C39586e eVar = new C39586e(h, C47633f.m84733g(h).mo51516i(new C39596o(xVar), xVar.f104258e).mo51514f(Exception.class, new C39597p(xVar), xVar.f104258e));
        C60870cx cxVar = eVar.f104208a;
        C60845bz n = C47810es.m84974n(new C39578bp(brVar, eVar));
        C60856cj.m92911t(cxVar, C47810es.m84974n(n), brVar.f104174g);
        return "Start a listening session and pushing audio to soda.";
    }
}
