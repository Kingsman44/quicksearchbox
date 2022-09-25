package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.hf */
/* compiled from: PG */
public final /* synthetic */ class C112606hf implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112606hf f312208a = new C112606hf();

    private /* synthetic */ C112606hf() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((ArrayList) obj).findFirst();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
