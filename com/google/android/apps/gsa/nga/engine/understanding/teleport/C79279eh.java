package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.eh */
/* compiled from: PG */
public final /* synthetic */ class C79279eh implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79289er f217748a;

    /* renamed from: b */
    public final /* synthetic */ String f217749b;

    public /* synthetic */ C79279eh(C79289er erVar, String str) {
        this.f217748a = erVar;
        this.f217749b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f217748a.mo73845a((String) obj, this.f217749b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
