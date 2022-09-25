package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.x */
/* compiled from: PG */
public final /* synthetic */ class C103898x implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103898x f289211a = new C103898x();

    private /* synthetic */ C103898x() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((List) obj).map(C103900z.f289213a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
