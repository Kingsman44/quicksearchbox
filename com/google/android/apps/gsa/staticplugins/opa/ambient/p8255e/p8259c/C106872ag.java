package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import java.util.Set;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.ag */
/* compiled from: PG */
public final /* synthetic */ class C106872ag implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C106872ag f297767a = new C106872ag();

    private /* synthetic */ C106872ag() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Set set = (Set) obj;
        set.addAll((Set) obj2);
        return set;
    }
}
