package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.el */
/* compiled from: PG */
public final /* synthetic */ class C113401el implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C113401el f314033a = new C113401el();

    private /* synthetic */ C113401el() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return Double.valueOf(((Double) obj).doubleValue() * ((Double) obj2).doubleValue());
    }
}
