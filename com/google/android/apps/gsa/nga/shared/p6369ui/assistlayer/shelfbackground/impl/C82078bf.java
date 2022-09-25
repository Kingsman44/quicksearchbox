package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80839ar;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80840as;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.bf */
/* compiled from: PG */
public final /* synthetic */ class C82078bf implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C82078bf f224372a = new C82078bf();

    private /* synthetic */ C82078bf() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        int i = C82084bl.f224386n;
        C80839ar arVar = (C80839ar) C80840as.f221769c.createBuilder();
        boolean booleanValue = ((Boolean) obj).booleanValue();
        arVar.copyOnWrite();
        ((C80840as) arVar.instance).f221771a = booleanValue;
        int intValue = ((Integer) obj2).intValue();
        arVar.copyOnWrite();
        ((C80840as) arVar.instance).f221772b = intValue;
        return (C80840as) arVar.build();
    }
}
