package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.k */
/* compiled from: PG */
public final /* synthetic */ class C113499k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113499k f314253a = new C113499k();

    private /* synthetic */ C113499k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        return str.isEmpty() ? Optional.empty() : Optional.m71637of(str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
