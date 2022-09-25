package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.be */
/* compiled from: PG */
public final /* synthetic */ class C82077be implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C82077be f224371a = new C82077be();

    private /* synthetic */ C82077be() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (((Boolean) obj).booleanValue()) {
            return false;
        }
        return Boolean.valueOf(!bool.booleanValue());
    }
}
