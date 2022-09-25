package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.m */
/* compiled from: PG */
public final /* synthetic */ class C111190m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111190m f309486a = new C111190m();

    private /* synthetic */ C111190m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Instant.ofEpochMilli(((Long) obj).longValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
