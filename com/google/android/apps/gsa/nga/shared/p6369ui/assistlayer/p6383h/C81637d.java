package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6383h;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.h.d */
/* compiled from: PG */
public final /* synthetic */ class C81637d implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C81637d f223298a = new C81637d();

    private /* synthetic */ C81637d() {
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
