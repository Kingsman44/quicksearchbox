package com.google.android.libraries.appactions.p11035a;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.a.i */
/* compiled from: PG */
public final /* synthetic */ class C147841i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147841i f398860a = new C147841i();

    private /* synthetic */ C147841i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C58485gu) Collection.EL.stream((C58485gu) obj).map(C147845m.f398866a).collect(C58370cn.f155946a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
