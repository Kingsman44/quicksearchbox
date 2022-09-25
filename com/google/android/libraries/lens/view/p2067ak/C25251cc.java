package com.google.android.libraries.lens.view.p2067ak;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.ak.cc */
/* compiled from: PG */
public final /* synthetic */ class C25251cc implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f68714a;

    public /* synthetic */ C25251cc(String str) {
        this.f68714a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((String) obj).substring(this.f68714a.length());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
