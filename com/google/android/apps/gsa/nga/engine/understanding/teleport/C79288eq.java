package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p001a.p014d.p015a.p016a.C0081z;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.eq */
/* compiled from: PG */
public final /* synthetic */ class C79288eq implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79290es f217761a;

    public /* synthetic */ C79288eq(C79290es esVar) {
        this.f217761a = esVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C0081z zVar = (C0081z) obj;
        Optional ofNullable = Optional.ofNullable((C79214bx) this.f217761a.f217776o.d.get(zVar));
        if (!ofNullable.isPresent()) {
            return C79204bn.m127148a(zVar);
        }
        return (C79214bx) ofNullable.get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
