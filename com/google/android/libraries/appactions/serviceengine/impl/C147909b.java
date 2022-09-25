package com.google.android.libraries.appactions.serviceengine.impl;

import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.b */
/* compiled from: PG */
public final /* synthetic */ class C147909b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147909b f398985a = new C147909b();

    private /* synthetic */ C147909b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Stream) obj;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
