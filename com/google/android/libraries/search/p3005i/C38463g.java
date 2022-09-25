package com.google.android.libraries.search.p3005i;

import com.google.android.libraries.geller.portable.Geller;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.i.g */
/* compiled from: PG */
public final /* synthetic */ class C38463g implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C65753ak f101790a;

    /* renamed from: b */
    public final /* synthetic */ int f101791b;

    /* renamed from: c */
    public final /* synthetic */ C63662ac f101792c;

    public /* synthetic */ C38463g(C65753ak akVar, int i, C63662ac acVar) {
        this.f101790a = akVar;
        this.f101791b = i;
        this.f101792c = acVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return ((Geller) obj).mo27208s((String) obj2, this.f101790a, this.f101791b, this.f101792c);
    }
}
