package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.f */
/* compiled from: PG */
public final /* synthetic */ class C81205f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81205f f222344a = new C81205f();

    private /* synthetic */ C81205f() {
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
