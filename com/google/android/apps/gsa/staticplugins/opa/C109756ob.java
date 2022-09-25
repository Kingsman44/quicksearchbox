package com.google.android.apps.gsa.staticplugins.opa;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ob */
/* compiled from: PG */
public final /* synthetic */ class C109756ob implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C109756ob f305801a = new C109756ob();

    private /* synthetic */ C109756ob() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        boolean z = true;
        if (!((Boolean) obj).booleanValue() && !bool.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
