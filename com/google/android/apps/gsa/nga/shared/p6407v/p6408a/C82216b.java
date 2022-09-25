package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.b */
/* compiled from: PG */
public final /* synthetic */ class C82216b implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ boolean f224697a;

    public /* synthetic */ C82216b(boolean z) {
        this.f224697a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f224697a;
        C82218d a = ((C82219e) obj).mo75562a();
        a.mo75560b(z);
        return a.mo75559a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
