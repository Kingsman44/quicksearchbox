package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.r */
/* compiled from: PG */
public final /* synthetic */ class C80922r implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f221894a;

    public /* synthetic */ C80922r(Function function) {
        this.f221894a = function;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Stream) obj).map(this.f221894a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
