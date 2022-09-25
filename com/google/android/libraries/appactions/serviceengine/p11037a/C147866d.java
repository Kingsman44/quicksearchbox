package com.google.android.libraries.appactions.serviceengine.p11037a;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.a.d */
/* compiled from: PG */
public final /* synthetic */ class C147866d implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f398893a = "com.instacart.client";

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f398893a;
        return "android.resource://" + str + "/" + ((Integer) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
