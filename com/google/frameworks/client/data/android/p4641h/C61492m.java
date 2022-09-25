package com.google.frameworks.client.data.android.p4641h;

import java.util.concurrent.Executor;

/* renamed from: com.google.frameworks.client.data.android.h.m */
/* compiled from: PG */
public final /* synthetic */ class C61492m implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C61471ad f166249a;

    /* renamed from: b */
    public final /* synthetic */ Executor f166250b;

    public /* synthetic */ C61492m(C61471ad adVar, Executor executor) {
        this.f166249a = adVar;
        this.f166250b = executor;
    }

    public final void execute(Runnable runnable) {
        this.f166250b.execute(new C61496q(this.f166249a, runnable));
    }
}
