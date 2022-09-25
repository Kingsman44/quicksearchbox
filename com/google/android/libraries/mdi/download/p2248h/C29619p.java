package com.google.android.libraries.mdi.download.p2248h;

import com.google.common.base.C58833ax;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.mdi.download.h.p */
/* compiled from: PG */
public final /* synthetic */ class C29619p implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C29619p f80218a = new C29619p();

    private /* synthetic */ C29619p() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Locale locale = (Locale) obj;
        Set set = (Set) obj2;
        C58833ax axVar = (C58833ax) C29627x.f80228a.apply(locale, set);
        if (axVar.mo56113h()) {
            return axVar;
        }
        return (C58833ax) C29627x.f80228a.apply(new Locale(locale.getLanguage()), set);
    }
}
