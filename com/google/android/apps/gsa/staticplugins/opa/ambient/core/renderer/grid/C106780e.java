package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.util.Pair;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.e */
/* compiled from: PG */
public final /* synthetic */ class C106780e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106780e f297566a = new C106780e();

    private /* synthetic */ C106780e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Pair pair = (Pair) obj;
        return new Pair((C106734a) pair.first, (View) ((Optional) pair.second).get());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
