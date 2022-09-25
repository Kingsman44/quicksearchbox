package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6062a.p6063a;

import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C76618b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76618b f211865a = new C76618b();

    private /* synthetic */ C76618b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((Instant) obj).toEpochMilli());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
