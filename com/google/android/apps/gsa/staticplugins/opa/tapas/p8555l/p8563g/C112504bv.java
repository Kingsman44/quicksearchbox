package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.bv */
/* compiled from: PG */
public final /* synthetic */ class C112504bv implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112519cj f312043a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f312044b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f312045c;

    public /* synthetic */ C112504bv(C112519cj cjVar, C58485gu guVar, AtomicBoolean atomicBoolean) {
        this.f312043a = cjVar;
        this.f312044b = guVar;
        this.f312045c = atomicBoolean;
    }

    public final Object get() {
        C112519cj cjVar = this.f312043a;
        C58485gu guVar = this.f312044b;
        AtomicBoolean atomicBoolean = this.f312045c;
        if (!cjVar.mo99566i(guVar) && !cjVar.mo99567j(guVar)) {
            atomicBoolean.set(true);
            C112519cj.f312068a.mo105242k("initializeSignalFetchDataMap", cjVar.f312074g, new C112481az(cjVar, guVar));
            C60870cx cxVar = cjVar.f312072e;
            C112490bh bhVar = new C112490bh(cjVar, guVar);
            C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(bhVar), cjVar.f312078k);
            C60870cx cxVar2 = cjVar.f312072e;
            C112505bw bwVar = new C112505bw();
            C60856cj.m92911t(cxVar2, C47810es.m84974n(bwVar), cjVar.f312079l);
            return h;
        } else if (cjVar.mo99565h()) {
            return C60856cj.m92900i(new HashMap());
        } else {
            C60870cx g = cjVar.f312077j.mo28207g("Clear Signals Account Swap", new C112491bi(cjVar));
            C112492bj bjVar = new C112492bj(cjVar, guVar);
            C60870cx h2 = C60922j.m93045h(g, C47810es.m84966f(bjVar), cjVar.f312078k);
            C112506bx bxVar = new C112506bx();
            C60856cj.m92911t(g, C47810es.m84974n(bxVar), cjVar.f312079l);
            return h2;
        }
    }
}
