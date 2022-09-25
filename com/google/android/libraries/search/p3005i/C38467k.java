package com.google.android.libraries.search.p3005i;

import com.google.android.libraries.geller.portable.Geller;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.i.k */
/* compiled from: PG */
public final /* synthetic */ class C38467k implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C65753ak f101803a;

    /* renamed from: b */
    public final /* synthetic */ String f101804b = "_version_info";

    public /* synthetic */ C38467k(C65753ak akVar) {
        this.f101803a = akVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return C60856cj.m92900i(((Geller) obj).mo27178e((String) obj2, this.f101803a, this.f101804b));
    }
}
