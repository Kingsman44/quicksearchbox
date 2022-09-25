package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.u */
/* compiled from: PG */
public final /* synthetic */ class C76002u implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76002u f210826a = new C76002u();

    private /* synthetic */ C76002u() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C76005x.f210829a;
        return Integer.toString(((Integer) ((Optional) obj).get()).intValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
