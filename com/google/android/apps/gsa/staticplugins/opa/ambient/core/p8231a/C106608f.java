package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.f */
/* compiled from: PG */
public final /* synthetic */ class C106608f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106608f f297241a = new C106608f();

    private /* synthetic */ C106608f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((List) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
