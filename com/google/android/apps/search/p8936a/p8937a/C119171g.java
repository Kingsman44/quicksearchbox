package com.google.android.apps.search.p8936a.p8937a;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C119171g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C119171g f332364a = new C119171g();

    private /* synthetic */ C119171g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C119167c a = C119167c.m197876a(Integer.parseInt((String) obj));
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("'dest' value is out of range");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
