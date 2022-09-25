package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.aj */
/* compiled from: PG */
public final /* synthetic */ class C79173aj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79298f f217636a;

    public /* synthetic */ C79173aj(C79298f fVar) {
        this.f217636a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79298f fVar = this.f217636a;
        int i = C79204bn.f217670a;
        return fVar.mo73861g(((Long) obj).intValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
