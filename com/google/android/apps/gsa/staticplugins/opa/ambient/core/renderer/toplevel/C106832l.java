package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import android.util.Pair;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106745c;
import com.google.assistant.p3886c.C50706ar;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.l */
/* compiled from: PG */
public final /* synthetic */ class C106832l implements Function {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f297705a;

    public /* synthetic */ C106832l(ViewGroup viewGroup) {
        this.f297705a = viewGroup;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Pair pair = (Pair) obj;
        return ((C106745c) pair.first).mo95634a((C50706ar) ((Optional) pair.second).orElse(null), this.f297705a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
