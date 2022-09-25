package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bh */
/* compiled from: PG */
public final /* synthetic */ class C111870bh implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111870bh f310865a = new C111870bh();

    private /* synthetic */ C111870bh() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Integer) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
