package com.google.android.libraries.search.p3005i;

import com.google.android.libraries.geller.portable.Geller;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.i.l */
/* compiled from: PG */
public final /* synthetic */ class C38468l implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C65753ak f101805a;

    /* renamed from: b */
    public final /* synthetic */ String f101806b;

    /* renamed from: c */
    public final /* synthetic */ C63662ac f101807c;

    /* renamed from: d */
    public final /* synthetic */ MessageLite f101808d;

    public /* synthetic */ C38468l(C65753ak akVar, String str, C63662ac acVar, MessageLite messageLite) {
        this.f101805a = akVar;
        this.f101806b = str;
        this.f101807c = acVar;
        this.f101808d = messageLite;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return ((Geller) obj).mo27181h((String) obj2, this.f101805a, this.f101806b, C65031ap.f176100j, this.f101807c, this.f101808d);
    }
}
