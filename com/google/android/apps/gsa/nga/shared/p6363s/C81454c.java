package com.google.android.apps.gsa.nga.shared.p6363s;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.s.c */
/* compiled from: PG */
public final /* synthetic */ class C81454c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C81455d f222866a;

    /* renamed from: b */
    public final /* synthetic */ Object f222867b;

    public /* synthetic */ C81454c(C81455d dVar, Object obj) {
        this.f222866a = dVar;
        this.f222867b = obj;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C81455d dVar = this.f222866a;
        return (C60870cx) dVar.f222868a.apply(obj, this.f222867b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
