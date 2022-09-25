package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e */
/* compiled from: PG */
public final /* synthetic */ class C78665e implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C78665e f216566a = new C78665e();

    private /* synthetic */ C78665e() {
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
