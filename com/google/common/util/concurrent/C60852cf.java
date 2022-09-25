package com.google.common.util.concurrent;

import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.cf */
/* compiled from: PG */
public final class C60852cf {

    /* renamed from: a */
    private final boolean f164939a;

    /* renamed from: b */
    private final C58485gu f164940b;

    public C60852cf(boolean z, C58485gu guVar) {
        this.f164939a = z;
        this.f164940b = guVar;
    }

    /* renamed from: a */
    public final C60870cx mo57334a(Callable callable, Executor executor) {
        return new C60825bf((C58471gg) this.f164940b, this.f164939a, executor, callable);
    }

    /* renamed from: b */
    public final C60870cx mo57335b(C60930r rVar, Executor executor) {
        return new C60825bf((C58471gg) this.f164940b, this.f164939a, executor, rVar);
    }

    /* renamed from: c */
    public final C60870cx mo57336c(Runnable runnable, Executor executor) {
        return mo57334a(new C60851ce(runnable), executor);
    }
}
