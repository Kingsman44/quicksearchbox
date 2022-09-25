package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import android.util.Pair;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.f */
/* compiled from: PG */
public final /* synthetic */ class C106826f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106826f f297697a = new C106826f();

    private /* synthetic */ C106826f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C60870cx) ((Pair) obj).second;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
