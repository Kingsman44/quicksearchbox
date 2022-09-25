package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p001a.p014d.p015a.p016a.C0069n;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ep */
/* compiled from: PG */
public final /* synthetic */ class C79287ep implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79287ep f217760a = new C79287ep();

    private /* synthetic */ C79287ep() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((C0069n) obj).f192b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
