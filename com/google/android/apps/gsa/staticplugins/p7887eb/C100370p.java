package com.google.android.apps.gsa.staticplugins.p7887eb;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.p */
/* compiled from: PG */
public final /* synthetic */ class C100370p implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C100370p f280663a = new C100370p();

    private /* synthetic */ C100370p() {
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
