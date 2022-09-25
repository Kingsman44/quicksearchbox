package com.google.common.util.concurrent;

import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.cd */
/* compiled from: PG */
public final class C60850cd implements Runnable {

    /* renamed from: a */
    C60870cx f164936a;

    /* renamed from: b */
    Future f164937b;

    public C60850cd(C60870cx cxVar, Future future) {
        this.f164936a = cxVar;
        this.f164937b = future;
    }

    public final void run() {
        C60856cj.m92912u(this.f164936a, this.f164937b);
        this.f164936a = null;
        this.f164937b = null;
    }
}
