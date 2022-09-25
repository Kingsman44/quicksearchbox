package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ee */
/* compiled from: PG */
public final /* synthetic */ class C79276ee implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79289er f217744a;

    /* renamed from: b */
    public final /* synthetic */ String f217745b;

    public /* synthetic */ C79276ee(C79289er erVar, String str) {
        this.f217744a = erVar;
        this.f217745b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f217744a.mo73845a((String) obj, this.f217745b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
