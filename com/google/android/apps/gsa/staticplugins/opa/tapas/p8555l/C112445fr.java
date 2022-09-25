package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import p3186j$.util.function.Function;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fr */
/* compiled from: PG */
public final /* synthetic */ class C112445fr implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113295bt btVar = (C113295bt) obj;
        return IntStream.CC.range(0, btVar.f313760a.size()).mapToObj(new C112441fn(btVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
