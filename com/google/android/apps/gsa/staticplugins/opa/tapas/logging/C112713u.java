package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.u */
/* compiled from: PG */
public final /* synthetic */ class C112713u implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112713u f312454a = new C112713u();

    private /* synthetic */ C112713u() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Long) ((Optional) obj).get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
