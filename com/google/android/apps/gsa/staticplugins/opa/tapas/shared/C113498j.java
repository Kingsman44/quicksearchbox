package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.j */
/* compiled from: PG */
public final /* synthetic */ class C113498j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113498j f314252a = new C113498j();

    private /* synthetic */ C113498j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (String) ((Supplier) obj).get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
