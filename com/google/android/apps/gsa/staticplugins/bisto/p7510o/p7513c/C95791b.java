package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7513c;

import com.google.android.apps.gsa.staticplugins.bisto.util.C96456an;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.c.b */
/* compiled from: PG */
public final class C95791b implements AutoCloseable {

    /* renamed from: a */
    public final AtomicBoolean f268225a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AtomicBoolean f268226b = new AtomicBoolean(false);

    /* renamed from: c */
    public final C96456an f268227c;

    public C95791b(C96456an anVar) {
        this.f268227c = anVar;
    }

    /* renamed from: a */
    public final void mo89771a() {
        if (this.f268225a.getAndSet(false)) {
            this.f268227c.mo90144e();
        }
    }

    /* renamed from: b */
    public final void mo89772b() {
        this.f268226b.set(this.f268225a.get());
    }

    public final void close() {
        this.f268227c.mo90141b();
    }
}
