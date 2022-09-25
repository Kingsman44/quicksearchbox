package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.do */
/* compiled from: PG */
public final /* synthetic */ class C77243do implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77243do f213083a = new C77243do();

    private /* synthetic */ C77243do() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Duration.ofMinutes(((Duration) obj).toMinutes());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
