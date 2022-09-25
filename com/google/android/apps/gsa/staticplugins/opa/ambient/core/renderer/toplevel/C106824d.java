package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.assistant.p3886c.C50738bc;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.d */
/* compiled from: PG */
public final /* synthetic */ class C106824d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106824d f297695a = new C106824d();

    private /* synthetic */ C106824d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((C50738bc) obj).f132043j);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
