package com.google.android.apps.gsa.shared.bisto;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.bisto.ae */
/* compiled from: PG */
public final /* synthetic */ class C89607ae implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C89607ae f242668a = new C89607ae();

    private /* synthetic */ C89607ae() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((String) obj).trim();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
