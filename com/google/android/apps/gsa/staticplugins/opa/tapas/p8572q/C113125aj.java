package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.aj */
/* compiled from: PG */
public final /* synthetic */ class C113125aj implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C113125aj f313426a = new C113125aj();

    private /* synthetic */ C113125aj() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return Double.valueOf(Math.min(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()));
    }
}
