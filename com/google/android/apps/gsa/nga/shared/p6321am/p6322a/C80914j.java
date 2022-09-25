package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import p3186j$.util.function.Function;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.j */
/* compiled from: PG */
public final /* synthetic */ class C80914j implements Function {

    /* renamed from: a */
    public final /* synthetic */ Predicate f221881a;

    public /* synthetic */ C80914j(Predicate predicate) {
        this.f221881a = predicate;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Stream) obj).filter(this.f221881a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
