package com.google.common.p4543n.p4545b;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.n.b.c */
/* compiled from: PG */
public final /* synthetic */ class C59369c implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ Function f157570a;

    public /* synthetic */ C59369c(Function function) {
        this.f157570a = function;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return this.f157570a.apply(obj);
    }
}
