package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.fb */
/* compiled from: PG */
public final /* synthetic */ class C120335fb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120342fi f334792a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f334793b;

    public /* synthetic */ C120335fb(C120342fi fiVar, Consumer consumer) {
        this.f334792a = fiVar;
        this.f334793b = consumer;
    }

    public final C60870cx apply(Object obj) {
        C120342fi fiVar = this.f334792a;
        Consumer consumer = this.f334793b;
        Void voidR = (Void) obj;
        C60870cx j = C60856cj.m92901j(fiVar.f334809d);
        C120336fc fcVar = new C120336fc(fiVar, consumer);
        return C60922j.m93045h(j, C47810es.m84966f(fcVar), fiVar.f334808c);
    }
}
