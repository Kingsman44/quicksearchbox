package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.o */
/* compiled from: PG */
public final /* synthetic */ class C80919o implements Function {

    /* renamed from: a */
    public final /* synthetic */ Collector f221890a;

    public /* synthetic */ C80919o(Collector collector) {
        this.f221890a = collector;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Stream) obj).collect(this.f221890a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
