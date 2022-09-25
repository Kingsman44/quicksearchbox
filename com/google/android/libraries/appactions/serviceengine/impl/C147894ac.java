package com.google.android.libraries.appactions.serviceengine.impl;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.ac */
/* compiled from: PG */
public final /* synthetic */ class C147894ac implements Function {

    /* renamed from: a */
    public final /* synthetic */ String[] f398955a;

    public /* synthetic */ C147894ac(String[] strArr) {
        this.f398955a = strArr;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String[] strArr = this.f398955a;
        int intValue = ((Integer) obj).intValue();
        return strArr[intValue + intValue];
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
