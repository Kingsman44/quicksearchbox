package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.bv */
/* compiled from: PG */
public final /* synthetic */ class C113297bv implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113297bv f313763a = new C113297bv();

    private /* synthetic */ C113297bv() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Stream.CC.m71935of(obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
