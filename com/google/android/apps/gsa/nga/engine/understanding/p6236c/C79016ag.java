package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.ag */
/* compiled from: PG */
public final /* synthetic */ class C79016ag implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C79016ag f217305a = new C79016ag();

    private /* synthetic */ C79016ag() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C80080z zVar = (C80080z) obj;
        Integer num = (Integer) obj2;
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        return Integer.valueOf(i);
    }
}
