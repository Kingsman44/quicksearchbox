package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.i */
/* compiled from: PG */
public final /* synthetic */ class C77396i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77396i f213413a = new C77396i();

    private /* synthetic */ C77396i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C77402o.f213420c;
        return (String) ((Optional) obj).orElse("<EMPTY>");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
