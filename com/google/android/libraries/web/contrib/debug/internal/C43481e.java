package com.google.android.libraries.web.contrib.debug.internal;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.e */
/* compiled from: PG */
public final /* synthetic */ class C43481e implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f113583a;

    public /* synthetic */ C43481e(Map map) {
        this.f113583a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C43489m.m76739b(((C43501y) obj).mo46564c().f113329b, this.f113583a, "URL");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
