package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dg */
/* compiled from: PG */
public final /* synthetic */ class C77235dg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C77244dp f213075a;

    public /* synthetic */ C77235dg(C77244dp dpVar) {
        this.f213075a = dpVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f213075a.mo72486d().plus((Duration) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
