package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.p9303a.p9304a.C123143b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.p9303a.p9304a.C123144c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.c.h */
/* compiled from: PG */
public final /* synthetic */ class C123153h implements Function {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f340824a;

    public /* synthetic */ C123153h(C60870cx cxVar) {
        this.f340824a = cxVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar = this.f340824a;
        C123144c cVar = (C123144c) obj;
        if (!cVar.f340814b) {
            return cxVar;
        }
        C123143b bVar = new C123143b(cVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(bVar), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
