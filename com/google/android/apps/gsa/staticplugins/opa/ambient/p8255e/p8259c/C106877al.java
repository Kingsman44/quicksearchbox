package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import java.util.IdentityHashMap;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.al */
/* compiled from: PG */
public final /* synthetic */ class C106877al implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C106877al f297772a = new C106877al();

    private /* synthetic */ C106877al() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        IdentityHashMap identityHashMap = (IdentityHashMap) obj;
        identityHashMap.putAll((IdentityHashMap) obj2);
        return identityHashMap;
    }
}
