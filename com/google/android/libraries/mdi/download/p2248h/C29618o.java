package com.google.android.libraries.mdi.download.p2248h;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.mdi.download.h.o */
/* compiled from: PG */
public final /* synthetic */ class C29618o implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C29618o f80217a = new C29618o();

    private /* synthetic */ C29618o() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Locale locale = (Locale) obj;
        BiFunction biFunction = C29627x.f80228a;
        return ((Set) obj2).contains(locale) ? C58833ax.m90834k(locale) : C58836b.f156633a;
    }
}
