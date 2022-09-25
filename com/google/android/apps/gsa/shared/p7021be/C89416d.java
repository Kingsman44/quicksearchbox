package com.google.android.apps.gsa.shared.p7021be;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.be.d */
/* compiled from: PG */
public final /* synthetic */ class C89416d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C89416d f242401a = new C89416d();

    private /* synthetic */ C89416d() {
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
