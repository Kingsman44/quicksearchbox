package com.google.android.libraries.search.p3005i;

import com.google.android.libraries.geller.portable.Geller;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.i.e */
/* compiled from: PG */
public final /* synthetic */ class C38448e implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C65753ak f101764a;

    /* renamed from: b */
    public final /* synthetic */ String f101765b;

    /* renamed from: c */
    public final /* synthetic */ C63662ac f101766c;

    public /* synthetic */ C38448e(C65753ak akVar, String str, C63662ac acVar) {
        this.f101764a = akVar;
        this.f101765b = str;
        this.f101766c = acVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return ((Geller) obj).mo27182i((String) obj2, this.f101764a, this.f101765b, C65031ap.f176100j, this.f101766c);
    }
}
