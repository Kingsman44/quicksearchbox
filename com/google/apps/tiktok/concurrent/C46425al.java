package com.google.apps.tiktok.concurrent;

import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.concurrent.al */
/* compiled from: PG */
public final /* synthetic */ class C46425al implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f121493a;

    /* renamed from: b */
    public final /* synthetic */ Object f121494b;

    public /* synthetic */ C46425al(Runnable runnable, Object obj) {
        this.f121493a = runnable;
        this.f121494b = obj;
    }

    public final Object call() {
        Runnable runnable = this.f121493a;
        Object obj = this.f121494b;
        runnable.run();
        return obj;
    }
}
