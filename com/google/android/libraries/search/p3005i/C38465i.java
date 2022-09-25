package com.google.android.libraries.search.p3005i;

import com.google.android.libraries.geller.portable.Geller;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.i.i */
/* compiled from: PG */
public final /* synthetic */ class C38465i implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C65753ak f101797a;

    /* renamed from: b */
    public final /* synthetic */ String f101798b;

    /* renamed from: c */
    public final /* synthetic */ int f101799c;

    /* renamed from: d */
    public final /* synthetic */ C63662ac f101800d;

    /* renamed from: e */
    public final /* synthetic */ MessageLite f101801e;

    public /* synthetic */ C38465i(C65753ak akVar, String str, int i, C63662ac acVar, MessageLite messageLite) {
        this.f101797a = akVar;
        this.f101798b = str;
        this.f101799c = i;
        this.f101800d = acVar;
        this.f101801e = messageLite;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return ((Geller) obj).mo27184k((String) obj2, this.f101797a, this.f101798b, this.f101799c, this.f101800d, this.f101801e);
    }
}
