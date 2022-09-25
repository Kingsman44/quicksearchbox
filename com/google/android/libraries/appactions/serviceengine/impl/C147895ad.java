package com.google.android.libraries.appactions.serviceengine.impl;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.ad */
/* compiled from: PG */
public final /* synthetic */ class C147895ad implements Function {

    /* renamed from: a */
    public final /* synthetic */ String[] f398956a;

    public /* synthetic */ C147895ad(String[] strArr) {
        this.f398956a = strArr;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String[] strArr = this.f398956a;
        int intValue = ((Integer) obj).intValue();
        return strArr[intValue + intValue + 1];
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
