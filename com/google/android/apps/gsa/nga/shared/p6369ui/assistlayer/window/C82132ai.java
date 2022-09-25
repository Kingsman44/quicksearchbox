package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.ai */
/* compiled from: PG */
public final /* synthetic */ class C82132ai implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C82132ai f224537a = new C82132ai();

    private /* synthetic */ C82132ai() {
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
