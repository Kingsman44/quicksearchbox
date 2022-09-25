package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.ap */
/* compiled from: PG */
public final /* synthetic */ class C76846ap implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76848ar f212250a;

    public /* synthetic */ C76846ap(C76848ar arVar) {
        this.f212250a = arVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Optional.m71637of("after:".concat(C76871v.m123492c(this.f212250a.f212254a.mo72340a().minusDays((long) ((int) (((Long) obj).longValue() / 86400000))))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
