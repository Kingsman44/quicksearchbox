package com.google.android.libraries.lens.view.p2067ak;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.ak.cg */
/* compiled from: PG */
public final /* synthetic */ class C25255cg implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f68718a;

    public /* synthetic */ C25255cg(String str) {
        this.f68718a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((String) obj).substring(this.f68718a.length());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
