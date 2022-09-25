package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.c */
/* compiled from: PG */
public final /* synthetic */ class C77201c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77201c f213018a = new C77201c();

    private /* synthetic */ C77201c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Duration.ofMillis(((Long) obj).longValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
