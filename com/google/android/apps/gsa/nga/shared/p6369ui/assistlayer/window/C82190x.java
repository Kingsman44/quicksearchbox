package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.x */
/* compiled from: PG */
public final /* synthetic */ class C82190x implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C82190x f224622a = new C82190x();

    private /* synthetic */ C82190x() {
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
