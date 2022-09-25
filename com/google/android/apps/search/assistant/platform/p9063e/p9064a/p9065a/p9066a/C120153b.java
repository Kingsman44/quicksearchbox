package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9066a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.speech.p5218j.C67050je;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C120153b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C120163l f334406a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f334407b;

    public /* synthetic */ C120153b(C120163l lVar, Consumer consumer) {
        this.f334406a = lVar;
        this.f334407b = consumer;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C120163l lVar = this.f334406a;
        C120158g gVar = new C120158g(lVar, this.f334407b, (C67050je) obj);
        return C60856cj.m92905n(C47810es.m84965e(gVar), lVar.f334423a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
