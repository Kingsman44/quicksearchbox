package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4016z.C53691ap;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.v */
/* compiled from: PG */
public final /* synthetic */ class C130792v implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130739ac f358023a;

    /* renamed from: b */
    public final /* synthetic */ double f358024b;

    public /* synthetic */ C130792v(C130739ac acVar, double d) {
        this.f358023a = acVar;
        this.f358024b = d;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130739ac acVar = this.f358023a;
        double d = this.f358024b;
        C53691ap apVar = (C53691ap) obj;
        C60870cx a = acVar.f357932c.mo109805a(apVar);
        C130796z zVar = new C130796z(acVar, d, apVar);
        return C60922j.m93044g(a, C47810es.m84963c(zVar), acVar.f357933d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
