package com.google.android.libraries.web.contrib.debug.internal;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.i */
/* compiled from: PG */
public final /* synthetic */ class C43485i implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f113587a;

    public /* synthetic */ C43485i(Map map) {
        this.f113587a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C43489m.m76739b(((C43501y) obj).mo46564c().f113334g, this.f113587a, "TITLE");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
