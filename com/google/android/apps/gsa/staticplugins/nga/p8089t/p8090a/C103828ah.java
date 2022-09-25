package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C103828ah implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C103828ah f289079a = new C103828ah();

    private /* synthetic */ C103828ah() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        if (num == null || num2 == null) {
            return null;
        }
        return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
    }
}
