package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.i.t */
/* compiled from: PG */
public final /* synthetic */ class C23916t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f65397a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f65398b;

    public /* synthetic */ C23916t(Runnable runnable, SettableFuture settableFuture) {
        this.f65397a = runnable;
        this.f65398b = settableFuture;
    }

    public final void run() {
        Runnable runnable = this.f65397a;
        SettableFuture settableFuture = this.f65398b;
        int i = C23828ac.f65247b;
        try {
            runnable.run();
        } catch (Throwable th) {
            settableFuture.mo57357o(th);
        }
    }
}
