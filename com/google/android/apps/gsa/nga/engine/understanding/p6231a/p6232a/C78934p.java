package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import p001a.p014d.p015a.p016a.C0072q;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C78934p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C78934p f217173a = new C78934p();

    private /* synthetic */ C78934p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((C0072q) obj).f199a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
