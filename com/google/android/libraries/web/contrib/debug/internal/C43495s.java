package com.google.android.libraries.web.contrib.debug.internal;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.s */
/* compiled from: PG */
public final /* synthetic */ class C43495s implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f113602a;

    public /* synthetic */ C43495s(String str) {
        this.f113602a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f113602a;
        return str + "  " + ((String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
