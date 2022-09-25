package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.dh */
/* compiled from: PG */
public final /* synthetic */ class C79252dh implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79290es f217719a;

    /* renamed from: b */
    public final /* synthetic */ C79298f f217720b;

    public /* synthetic */ C79252dh(C79290es esVar, C79298f fVar) {
        this.f217719a = esVar;
        this.f217720b = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f217719a.mo73855j((C79311i) obj, this.f217720b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
