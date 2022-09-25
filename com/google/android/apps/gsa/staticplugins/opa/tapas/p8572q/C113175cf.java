package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.util.Pair;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.cf */
/* compiled from: PG */
public final /* synthetic */ class C113175cf implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113175cf f313492a = new C113175cf();

    private /* synthetic */ C113175cf() {
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
