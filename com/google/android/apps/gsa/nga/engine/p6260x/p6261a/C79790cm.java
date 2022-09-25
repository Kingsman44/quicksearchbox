package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.cm */
/* compiled from: PG */
public final /* synthetic */ class C79790cm implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C79790cm f218772a = new C79790cm();

    private /* synthetic */ C79790cm() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C82889ee eeVar = (C82889ee) obj;
        C82889ee eeVar2 = (C82889ee) obj2;
        return eeVar.f226098c > eeVar2.f226098c ? eeVar : eeVar2;
    }
}
