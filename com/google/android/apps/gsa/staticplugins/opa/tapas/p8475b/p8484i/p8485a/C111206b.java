package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8484i.p8485a;

import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.i.a.b */
/* compiled from: PG */
public final /* synthetic */ class C111206b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111206b f309503a = new C111206b();

    private /* synthetic */ C111206b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return Collection.EL.stream((Set) entry.getValue()).map(new C111205a(entry));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
