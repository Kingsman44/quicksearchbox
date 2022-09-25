package com.google.android.apps.gsa.nga.engine.warmactions.call;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.s */
/* compiled from: PG */
public final /* synthetic */ class C79532s implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f218247a = "com.android.phone";

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f218247a.equals((String) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
