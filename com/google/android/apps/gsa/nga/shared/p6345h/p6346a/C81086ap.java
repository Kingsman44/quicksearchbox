package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C81086ap implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81086ap f222205a = new C81086ap();

    private /* synthetic */ C81086ap() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (String) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
