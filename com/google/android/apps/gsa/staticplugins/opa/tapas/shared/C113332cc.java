package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cc */
/* compiled from: PG */
public final /* synthetic */ class C113332cc implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113332cc f313857a = new C113332cc();

    private /* synthetic */ C113332cc() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C113339cj.f313864a;
        return Collection.EL.stream(((C113291bp) obj).f313754b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
