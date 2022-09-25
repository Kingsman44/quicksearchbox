package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p682e.p683a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.e.a.g */
/* compiled from: PG */
public final /* synthetic */ class C11643g implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C11646j f37608a;

    public /* synthetic */ C11643g(C11646j jVar) {
        this.f37608a = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C11646j jVar = this.f37608a;
        ((Optional) obj).ifPresent(C11640d.f37603a);
        C60870cx b = jVar.mo20097b();
        C11638b bVar = C11638b.f37601a;
        return Optional.m71637of(C60922j.m93045h(b, C47810es.m84966f(bVar), jVar.f37612b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
