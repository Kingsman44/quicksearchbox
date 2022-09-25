package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.t */
/* compiled from: PG */
public final /* synthetic */ class C78818t implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C78818t f216933a = new C78818t();

    private /* synthetic */ C78818t() {
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
