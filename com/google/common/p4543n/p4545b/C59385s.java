package com.google.common.p4543n.p4545b;

import java.util.AbstractMap;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.n.b.s */
/* compiled from: PG */
public final /* synthetic */ class C59385s implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C59385s f157590a = new C59385s();

    private /* synthetic */ C59385s() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
