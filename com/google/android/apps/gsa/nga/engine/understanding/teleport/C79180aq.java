package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.aq */
/* compiled from: PG */
public final /* synthetic */ class C79180aq implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79180aq f217643a = new C79180aq();

    private /* synthetic */ C79180aq() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C79204bn.f217670a;
        return Collection.EL.stream(((C79212bv) obj).mo73835a().values());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
