package com.google.android.apps.gsa.staticplugins.p7887eb;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.ac */
/* compiled from: PG */
public final /* synthetic */ class C100342ac implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C100342ac f280599a = new C100342ac();

    private /* synthetic */ C100342ac() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        boolean z = false;
        if (((Boolean) obj).booleanValue() && bool.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
