package com.google.apps.tiktok.tracing.contrib.p3700b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.tracing.contrib.b.i */
/* compiled from: PG */
public final class C47636i {
    /* renamed from: a */
    public static C47633f m84742a(Callable callable, Executor executor) {
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(new C47634g(callable)), executor));
    }

    /* renamed from: b */
    public static C47635h m84743b(Iterable iterable) {
        return new C47635h(C47638k.m84750a(iterable));
    }

    @SafeVarargs
    /* renamed from: c */
    public static C47635h m84744c(C60870cx... cxVarArr) {
        return new C47635h(C47638k.m84751b(cxVarArr));
    }

    /* renamed from: d */
    public static C47635h m84745d(Iterable iterable) {
        return new C47635h(C47638k.m84752c(iterable));
    }

    @SafeVarargs
    /* renamed from: e */
    public static C47635h m84746e(C60870cx... cxVarArr) {
        return new C47635h(C47638k.m84753d(cxVarArr));
    }
}
