package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.at */
/* compiled from: PG */
public final /* synthetic */ class C76576at implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76590bg f211815a;

    /* renamed from: b */
    public final /* synthetic */ Function f211816b;

    public /* synthetic */ C76576at(C76590bg bgVar, Function function) {
        this.f211815a = bgVar;
        this.f211816b = function;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76590bg bgVar = this.f211815a;
        return bgVar.mo72266h((String) obj).flatMap(this.f211816b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
