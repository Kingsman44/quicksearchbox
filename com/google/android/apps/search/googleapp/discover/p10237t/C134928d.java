package com.google.android.apps.search.googleapp.discover.p10237t;

import com.google.android.apps.search.googleapp.discover.p10214s.C134572bj;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.discover.t.d */
/* compiled from: PG */
final class C134928d implements BiFunction {

    /* renamed from: a */
    public static final C134928d f367371a = new C134928d();

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        C134572bj bjVar = (C134572bj) obj;
        Integer num = (Integer) obj2;
        if (num == null) {
            return 1;
        }
        return Integer.valueOf(num.intValue() + 1);
    }
}
