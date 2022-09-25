package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.e */
/* compiled from: PG */
public final /* synthetic */ class C79599e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79605k f218386a;

    /* renamed from: b */
    public final /* synthetic */ String f218387b;

    public /* synthetic */ C79599e(C79605k kVar, String str) {
        this.f218386a = kVar;
        this.f218387b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f218386a.mo74150b(((Integer) obj).intValue(), this.f218387b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
