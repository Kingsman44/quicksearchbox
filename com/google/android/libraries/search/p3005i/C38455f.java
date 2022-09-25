package com.google.android.libraries.search.p3005i;

import com.google.android.libraries.geller.portable.Geller;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.i.f */
/* compiled from: PG */
public final /* synthetic */ class C38455f implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C65753ak f101779a;

    /* renamed from: b */
    public final /* synthetic */ C65768az f101780b;

    public /* synthetic */ C38455f(C65753ak akVar, C65768az azVar) {
        this.f101779a = akVar;
        this.f101780b = azVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return ((Geller) obj).mo27186m((String) obj2, this.f101779a, this.f101780b);
    }
}
