package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.p */
/* compiled from: PG */
public final /* synthetic */ class C80920p implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f221891a;

    public /* synthetic */ C80920p(int i) {
        this.f221891a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Stream) obj).limit((long) this.f221891a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
