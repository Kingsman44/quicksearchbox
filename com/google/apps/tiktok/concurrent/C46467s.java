package com.google.apps.tiktok.concurrent;

import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.concurrent.s */
/* compiled from: PG */
public final /* synthetic */ class C46467s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46472x f121592a;

    /* renamed from: b */
    public final /* synthetic */ Executor f121593b;

    public /* synthetic */ C46467s(C46472x xVar, Executor executor) {
        this.f121592a = xVar;
        this.f121593b = executor;
    }

    public final void run() {
        this.f121593b.execute(new C46469u(this.f121592a));
    }
}
