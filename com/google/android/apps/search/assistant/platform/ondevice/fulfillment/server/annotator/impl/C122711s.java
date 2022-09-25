package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122998as;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.s */
/* compiled from: PG */
public final /* synthetic */ class C122711s implements C122998as {

    /* renamed from: a */
    public final /* synthetic */ C122699g f339993a;

    public /* synthetic */ C122711s(C122699g gVar) {
        this.f339993a = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo105711a() {
        C122699g gVar = this.f339993a;
        C60870cx e = C60856cj.m92896e((Iterable) Collection.EL.stream(gVar.f339960a).map(C122697e.f339958a).collect(C58370cn.f155946a));
        C122698f fVar = new C122698f(gVar);
        return C60922j.m93044g(e, C47810es.m84963c(fVar), C60826bg.f164896a);
    }
}
