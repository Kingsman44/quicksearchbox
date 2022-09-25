package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8484i.p8485a;

import java.util.AbstractMap;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.i.a.a */
/* compiled from: PG */
public final /* synthetic */ class C111205a implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f309502a;

    public /* synthetic */ C111205a(Map.Entry entry) {
        this.f309502a = entry;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return new AbstractMap.SimpleImmutableEntry((String) this.f309502a.getKey(), (String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
