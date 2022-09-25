package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.p */
/* compiled from: PG */
public final /* synthetic */ class C106836p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106836p f297711a = new C106836p();

    private /* synthetic */ C106836p() {
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
