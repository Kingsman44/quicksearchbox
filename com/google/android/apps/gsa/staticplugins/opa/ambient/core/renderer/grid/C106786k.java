package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.k */
/* compiled from: PG */
public final /* synthetic */ class C106786k implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106791p f297574a;

    /* renamed from: b */
    public final /* synthetic */ C106740b f297575b;

    public /* synthetic */ C106786k(C106791p pVar, C106740b bVar) {
        this.f297574a = pVar;
        this.f297575b = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C106791p pVar = this.f297574a;
        C106740b bVar = this.f297575b;
        C60870cx b = bVar.mo95633b();
        C106784i iVar = new C106784i(pVar, bVar);
        Class<RuntimeException> cls = RuntimeException.class;
        C60870cx g = C60846c.m92878g(b, cls, C47810es.m84963c(iVar), pVar.f297586b);
        C106785j jVar = new C106785j((C106734a) obj);
        return C60922j.m93044g(g, C47810es.m84963c(jVar), pVar.f297586b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
