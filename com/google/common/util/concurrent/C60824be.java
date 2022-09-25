package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.common.util.concurrent.be */
/* compiled from: PG */
abstract class C60824be extends C60869cw {

    /* renamed from: a */
    private final Executor f164893a;

    /* renamed from: b */
    final /* synthetic */ C60825bf f164894b;

    public C60824be(C60825bf bfVar, Executor executor) {
        this.f164894b = bfVar;
        executor.getClass();
        this.f164893a = executor;
    }

    /* renamed from: c */
    public abstract void mo57289c(Object obj);

    /* renamed from: d */
    public final void mo57290d(Throwable th) {
        C60825bf bfVar = this.f164894b;
        bfVar.f164895c = null;
        if (th instanceof ExecutionException) {
            bfVar.mo57357o(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            bfVar.cancel(false);
        } else {
            bfVar.mo57357o(th);
        }
    }

    /* renamed from: e */
    public final void mo57291e(Object obj) {
        this.f164894b.f164895c = null;
        mo57289c(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo57292f() {
        try {
            this.f164893a.execute(this);
        } catch (RejectedExecutionException e) {
            this.f164894b.mo57357o(e);
        }
    }

    /* renamed from: g */
    public final boolean mo57293g() {
        return this.f164894b.isDone();
    }
}
