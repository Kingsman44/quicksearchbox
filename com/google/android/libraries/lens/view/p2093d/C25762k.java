package com.google.android.libraries.lens.view.p2093d;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import java.util.ConcurrentModificationException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.lens.view.d.k */
/* compiled from: PG */
public final class C25762k {

    /* renamed from: a */
    public final C2164c f70025a;

    /* renamed from: b */
    public final C60870cx f70026b;

    /* renamed from: c */
    public final C25761j f70027c;

    /* renamed from: d */
    private final AtomicBoolean f70028d = new AtomicBoolean();

    /* renamed from: e */
    private final Executor f70029e;

    private C25762k(C2164c cVar, C60870cx cxVar, C25761j jVar, Executor executor) {
        this.f70025a = cVar;
        this.f70026b = cxVar;
        this.f70027c = jVar;
        this.f70029e = executor;
    }

    /* renamed from: a */
    public static C25762k m47565a(C25761j jVar, Executor executor, Object obj) {
        AtomicReference atomicReference = new AtomicReference();
        C60870cx a = C2169h.m6027a(new C25759h(atomicReference, obj));
        C2164c cVar = (C2164c) atomicReference.get();
        cVar.getClass();
        return new C25762k(cVar, a, jVar, executor);
    }

    /* renamed from: b */
    public final void mo30912b(Throwable th) {
        if (th instanceof CancellationException) {
            this.f70026b.cancel(false);
        } else {
            mo30914d(th);
        }
    }

    /* renamed from: c */
    public final void mo30913c(Object obj, boolean z) {
        if (!((C2168g) this.f70026b).f6144b.isDone()) {
            if (this.f70028d.compareAndSet(false, true)) {
                try {
                    this.f70029e.execute(C47810es.m84977q(new C25760i(this, obj)));
                    if (z) {
                        this.f70025a.mo5437b(obj);
                    }
                } finally {
                    C58838bb.m90884s(this.f70028d.compareAndSet(true, false), "expected isUpdating to be true");
                }
            } else {
                throw new ConcurrentModificationException("Concurrent/reentrant update attempt");
            }
        }
    }

    /* renamed from: d */
    public final void mo30914d(Throwable th) {
        if (!((C2168g) this.f70026b).f6144b.isDone()) {
            if (this.f70028d.compareAndSet(false, true)) {
                try {
                    this.f70025a.mo5439d(th);
                } finally {
                    C58838bb.m90884s(this.f70028d.compareAndSet(true, false), "expected isUpdating to be true");
                }
            } else {
                throw new ConcurrentModificationException("Concurrent/reentrant fail attempt");
            }
        }
    }
}
