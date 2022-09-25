package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* renamed from: com.google.common.util.concurrent.ce */
/* compiled from: PG */
final class C60851ce implements Callable {

    /* renamed from: a */
    final /* synthetic */ Runnable f164938a;

    public C60851ce(Runnable runnable) {
        this.f164938a = runnable;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f164938a.run();
        return null;
    }
}
