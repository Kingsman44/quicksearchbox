package com.google.p4449cd.p4460h.p4461a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60829bj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4453d.C57955a;
import com.google.p4449cd.p4453d.C57960f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.cd.h.a.e */
/* compiled from: PG */
final class C58018e extends FutureTask implements C60870cx, C57955a {

    /* renamed from: a */
    public final boolean f155108a;

    /* renamed from: b */
    private final Object f155109b;

    /* renamed from: c */
    private final C57960f f155110c;

    /* renamed from: d */
    private final C60829bj f155111d = new C60829bj();

    /* renamed from: e */
    private final AtomicBoolean f155112e = new AtomicBoolean(false);

    private C58018e(Runnable runnable, C57960f fVar, boolean z, Object obj) {
        super(runnable, obj);
        this.f155109b = runnable;
        this.f155110c = fVar;
        this.f155108a = z;
    }

    /* renamed from: c */
    static C58018e m88773c(Runnable runnable, C57960f fVar, boolean z) {
        return new C58018e(runnable, fVar, z, C118826c.f331422a);
    }

    /* renamed from: a */
    public final void mo54562a() {
        cancel(this.f155108a);
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f155111d.mo57297a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f155111d.mo57298b();
        if (this.f155112e.compareAndSet(false, true)) {
            this.f155110c.mo54568c(this);
        }
    }

    public final void run() {
        if (this.f155112e.compareAndSet(false, true)) {
            try {
                super.run();
            } finally {
                this.f155110c.mo54568c(this);
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f155109b);
        return "AuxiliaryTask{" + valueOf + "}";
    }

    public C58018e(Callable callable, C57960f fVar, boolean z) {
        super(callable);
        this.f155109b = callable;
        this.f155110c = fVar;
        this.f155108a = z;
    }
}
