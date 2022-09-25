package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.bu */
/* compiled from: PG */
public final /* synthetic */ class C111024bu implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C111024bu f309207a = new C111024bu();

    private /* synthetic */ C111024bu() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return Double.valueOf(Math.max(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()));
    }
}
