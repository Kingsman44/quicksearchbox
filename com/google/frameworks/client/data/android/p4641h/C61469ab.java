package com.google.frameworks.client.data.android.p4641h;

import java.util.concurrent.Executor;

/* renamed from: com.google.frameworks.client.data.android.h.ab */
/* compiled from: PG */
final class C61469ab implements Executor {

    /* renamed from: a */
    public volatile Executor f166179a;

    public C61469ab(Executor executor) {
        this.f166179a = executor;
    }

    public final void execute(Runnable runnable) {
        this.f166179a.execute(runnable);
    }
}
