package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.bh */
/* compiled from: PG */
public final /* synthetic */ class C113150bh implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113150bh f313466a = new C113150bh();

    private /* synthetic */ C113150bh() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int intValue = ((Integer) obj).intValue();
        if (intValue == 1) {
            return Optional.m71637of(false);
        }
        if (intValue == 2 || intValue == 3 || intValue == 4) {
            return Optional.m71637of(true);
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
