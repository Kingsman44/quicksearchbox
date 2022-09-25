package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8523p;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p.g */
/* compiled from: PG */
public final /* synthetic */ class C111757g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111757g f310642a = new C111757g();

    private /* synthetic */ C111757g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Double.valueOf(((C113415ez) Collection.EL.stream((List) obj).min(Comparator.CC.comparingDouble(C111751a.f310635a)).orElse(C113415ez.f314042L)).mo100202b());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
