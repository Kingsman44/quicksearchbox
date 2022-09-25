package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.common.util.concurrent.eb */
/* compiled from: PG */
final class C60915eb extends C60837br implements RunnableFuture {

    /* renamed from: a */
    private volatile C60869cw f165031a;

    public C60915eb(C60930r rVar) {
        this.f165031a = new C60912dz(this, rVar);
    }

    /* renamed from: e */
    static C60915eb m93031e(Runnable runnable, Object obj) {
        return new C60915eb(Executors.callable(runnable, obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        C60869cw cwVar;
        if (mo57359q() && (cwVar = this.f165031a) != null) {
            cwVar.mo57350h();
        }
        this.f165031a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        C60869cw cwVar = this.f165031a;
        if (cwVar == null) {
            return super.mo45912hT();
        }
        return "task=[" + cwVar + "]";
    }

    public final void run() {
        C60869cw cwVar = this.f165031a;
        if (cwVar != null) {
            cwVar.run();
        }
        this.f165031a = null;
    }

    public C60915eb(Callable callable) {
        this.f165031a = new C60914ea(this, callable);
    }
}
