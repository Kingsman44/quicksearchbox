package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.assistant.p3886c.C50704ap;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.s */
/* compiled from: PG */
public final /* synthetic */ class C106839s implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106839s f297714a = new C106839s();

    private /* synthetic */ C106839s() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C50704ap) ((Optional) obj).get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
