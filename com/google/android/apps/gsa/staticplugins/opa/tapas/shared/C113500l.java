package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.l */
/* compiled from: PG */
public final /* synthetic */ class C113500l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113500l f314254a = new C113500l();

    private /* synthetic */ C113500l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (String) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
