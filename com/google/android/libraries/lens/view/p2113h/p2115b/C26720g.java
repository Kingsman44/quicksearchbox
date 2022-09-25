package com.google.android.libraries.lens.view.p2113h.p2115b;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.lens.view.h.b.g */
/* compiled from: PG */
public final /* synthetic */ class C26720g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f72847a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f72848b;

    public /* synthetic */ C26720g(Runnable runnable, SettableFuture settableFuture) {
        this.f72847a = runnable;
        this.f72848b = settableFuture;
    }

    public final void run() {
        Runnable runnable = this.f72847a;
        SettableFuture settableFuture = this.f72848b;
        runnable.run();
        settableFuture.mo57356n((Object) null);
    }
}
