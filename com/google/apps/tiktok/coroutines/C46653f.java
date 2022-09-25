package com.google.apps.tiktok.coroutines;

import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.coroutines.f */
/* compiled from: PG */
final class C46653f implements Callable {

    /* renamed from: a */
    final /* synthetic */ Callable f121905a;

    /* renamed from: b */
    final /* synthetic */ C46658k f121906b;

    public C46653f(Callable callable, C46658k kVar) {
        this.f121905a = callable;
        this.f121906b = kVar;
    }

    public final Object call() {
        Object call = this.f121905a.call();
        Throwable th = (Throwable) this.f121906b.f121912a.get();
        this.f121906b.f121912a.remove();
        if (th == null) {
            return call;
        }
        throw th;
    }
}
