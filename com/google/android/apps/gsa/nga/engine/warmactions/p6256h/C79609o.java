package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.o */
/* compiled from: PG */
public final /* synthetic */ class C79609o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79609o f218409a = new C79609o();

    private /* synthetic */ C79609o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79606l lVar = (C79606l) obj;
        C79595a aVar = new C79595a();
        if (lVar != null) {
            aVar.f218382a = lVar;
            return aVar.mo74141a();
        }
        throw new NullPointerException("Null resource");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
