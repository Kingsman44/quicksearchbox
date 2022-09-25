package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.af */
/* compiled from: PG */
public final /* synthetic */ class C79410af implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C79410af f218049a = new C79410af();

    private /* synthetic */ C79410af() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        C58974d dVar = C79418an.f218059a;
        String str = true != ((Boolean) obj2).booleanValue() ? "disabled" : "enabled";
        return num + " " + str;
    }
}
