package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.common.util.concurrent.by */
/* compiled from: PG */
public abstract class C60844by extends C60839bt implements C60887da {
    protected C60844by() {
    }

    /* renamed from: a */
    public final C60870cx submit(Runnable runnable) {
        return mo29168h().mo19398a(runnable);
    }

    /* renamed from: b */
    public final C60870cx submit(Callable callable) {
        return mo29168h().mo19399b(callable);
    }

    /* renamed from: c */
    public final C60870cx submit(Runnable runnable, Object obj) {
        return mo29168h().mo19400c(runnable, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C60887da mo29168h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* bridge */ /* synthetic */ ExecutorService mo29169i() {
        throw null;
    }
}
