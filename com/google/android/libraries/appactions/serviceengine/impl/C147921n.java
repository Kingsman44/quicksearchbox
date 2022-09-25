package com.google.android.libraries.appactions.serviceengine.impl;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.n */
/* compiled from: PG */
public final /* synthetic */ class C147921n implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f398999a;

    public /* synthetic */ C147921n(String str) {
        this.f398999a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((String) obj).equals(this.f398999a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
