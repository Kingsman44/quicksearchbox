package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cd */
/* compiled from: PG */
public final /* synthetic */ class C113333cd implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113333cd f313858a = new C113333cd();

    private /* synthetic */ C113333cd() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C113339cj.f313864a;
        return Collection.EL.stream(((C113295bt) obj).f313760a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
