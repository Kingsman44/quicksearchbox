package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.bu */
/* compiled from: PG */
public final /* synthetic */ class C81118bu implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81118bu f222240a = new C81118bu();

    private /* synthetic */ C81118bu() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Instant.ofEpochMilli(((Long) obj).longValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
