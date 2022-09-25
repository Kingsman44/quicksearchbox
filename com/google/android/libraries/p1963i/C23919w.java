package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.i.w */
/* compiled from: PG */
public final /* synthetic */ class C23919w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Executor f65403a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f65404b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f65405c;

    public /* synthetic */ C23919w(Executor executor, Runnable runnable, SettableFuture settableFuture) {
        this.f65403a = executor;
        this.f65404b = runnable;
        this.f65405c = settableFuture;
    }

    public final void run() {
        this.f65403a.execute(new C23916t(this.f65404b, this.f65405c));
    }
}
