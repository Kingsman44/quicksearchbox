package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e;

import com.google.android.apps.gsa.nga.api.a.be;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80836ao;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.d */
/* compiled from: PG */
public final /* synthetic */ class C78228d implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C78228d f215369a = new C78228d();

    private /* synthetic */ C78228d() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C80836ao aoVar = (C80836ao) obj2;
        if (!((Boolean) obj).booleanValue()) {
            return be.b;
        }
        if (!aoVar.f221765a || aoVar.f221766b) {
            return be.b;
        }
        return be.a;
    }
}
