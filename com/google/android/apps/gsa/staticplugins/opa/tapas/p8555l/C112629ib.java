package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import p3186j$.util.function.Function;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ib */
/* compiled from: PG */
public final /* synthetic */ class C112629ib implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112629ib f312235a = new C112629ib();

    private /* synthetic */ C112629ib() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113295bt btVar = (C113295bt) obj;
        int i = C112637ij.f312244a;
        return IntStream.CC.range(0, btVar.f313760a.size()).mapToObj(new C112623hw(btVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
