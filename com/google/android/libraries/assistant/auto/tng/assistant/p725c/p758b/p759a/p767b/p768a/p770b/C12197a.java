package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b;

import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.a */
/* compiled from: PG */
public final /* synthetic */ class C12197a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12213j f38913a;

    public /* synthetic */ C12197a(C12213j jVar) {
        this.f38913a = jVar;
    }

    public final C60870cx apply(Object obj) {
        C12213j jVar = this.f38913a;
        C52081en enVar = (C52081en) obj;
        C58528ij ijVar = jVar.f38940j;
        if (!ijVar.isEmpty() && !Collection.EL.stream(enVar.f136684d).flatMap(C12207d.f38924a).anyMatch(new C12208e(ijVar))) {
            jVar.f38934d.mo22352b(C37179a.f97489bH.mo40815i(C62722b.FAILED_PRECONDITION));
            return C60856cj.m92900i(C58836b.f156633a);
        }
        jVar.f38934d.mo22352b(C37179a.f97496bO);
        C12206c cVar = new C12206c(jVar);
        return C47633f.m84733g(C60856cj.m92904m(C47810es.m84978r(cVar), jVar.f38936f)).mo51516i(new C12209f(jVar, enVar), jVar.f38935e).mo51515h(new C12210g(jVar), jVar.f38935e);
    }
}
