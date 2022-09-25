package com.google.apps.tiktok.tracing.contrib.p3700b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60852cf;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.tracing.contrib.b.j */
/* compiled from: PG */
public final class C47637j {

    /* renamed from: a */
    private final C60852cf f123564a;

    public C47637j(C60852cf cfVar) {
        this.f123564a = cfVar;
    }

    /* renamed from: a */
    public final C60870cx mo51520a(Callable callable, Executor executor) {
        return this.f123564a.mo57334a(C47810es.m84978r(callable), executor);
    }

    /* renamed from: b */
    public final C60870cx mo51521b(C60930r rVar, Executor executor) {
        return this.f123564a.mo57335b(C47810es.m84965e(rVar), executor);
    }

    /* renamed from: c */
    public final C60870cx mo51522c(Runnable runnable, Executor executor) {
        return this.f123564a.mo57336c(C47810es.m84977q(runnable), executor);
    }
}
