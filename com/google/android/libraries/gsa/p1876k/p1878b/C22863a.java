package com.google.android.libraries.gsa.p1876k.p1878b;

import android.os.Handler;
import com.google.android.libraries.gsa.p1876k.p1877a.C22851e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.libraries.gsa.k.b.a */
/* compiled from: PG */
public final class C22863a extends C22851e {

    /* renamed from: a */
    private final Handler f62931a;

    public C22863a(Class cls, Handler handler) {
        super(cls);
        this.f62931a = handler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C60870cx mo28214n(long j, Callable callable) {
        C60871cy cyVar = new C60871cy(callable);
        if (this.f62931a.postDelayed(cyVar, j)) {
            return cyVar;
        }
        throw new RejectedExecutionException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C60870cx mo28215o(Callable callable) {
        C60871cy cyVar = new C60871cy(callable);
        if (this.f62931a.post(cyVar)) {
            return cyVar;
        }
        throw new RejectedExecutionException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo28216p(long j, Runnable runnable) {
        if (!this.f62931a.postDelayed(runnable, j)) {
            throw new RejectedExecutionException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo28217q(Runnable runnable) {
        if (!this.f62931a.post(runnable)) {
            throw new RejectedExecutionException();
        }
    }
}
