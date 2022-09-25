package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e;

import com.google.android.apps.gsa.nga.api.a.ay;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78535ar;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.e */
/* compiled from: PG */
public final /* synthetic */ class C78235e implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C78235e f215376a = new C78235e();

    private /* synthetic */ C78235e() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C78540aw awVar = (C78540aw) obj2;
        if (!((Boolean) obj).booleanValue()) {
            return ay.a;
        }
        if (!awVar.mo73436b().mo73472a().equals(C78535ar.EMPTY)) {
            return ay.b;
        }
        return ay.a;
    }
}
