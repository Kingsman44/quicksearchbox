package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.util.Pair;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.d */
/* compiled from: PG */
public final /* synthetic */ class C113196d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113196d f313529a = new C113196d();

    private /* synthetic */ C113196d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return Pair.create((String) entry.getKey(), (Double) entry.getValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
