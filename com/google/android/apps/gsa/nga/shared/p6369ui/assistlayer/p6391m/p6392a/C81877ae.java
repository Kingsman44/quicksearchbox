package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80835an;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80836ao;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C81877ae implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C81877ae f223894a = new C81877ae();

    private /* synthetic */ C81877ae() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C80835an anVar = (C80835an) C80836ao.f221763c.createBuilder();
        boolean booleanValue = ((Boolean) obj).booleanValue();
        anVar.copyOnWrite();
        ((C80836ao) anVar.instance).f221766b = booleanValue;
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        anVar.copyOnWrite();
        ((C80836ao) anVar.instance).f221765a = booleanValue2;
        return (C80836ao) anVar.build();
    }
}
