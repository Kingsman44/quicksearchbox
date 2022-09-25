package com.google.android.apps.gsa.nga.engine.p6034i.p6037c;

import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.i.c.e */
/* compiled from: PG */
public final class C76160e implements AutoCloseable {

    /* renamed from: a */
    public final Optional f211137a;

    /* renamed from: b */
    public final AtomicInteger f211138b = new AtomicInteger(1);

    /* renamed from: c */
    private final Consumer f211139c;

    public C76160e(Optional optional, Consumer consumer) {
        this.f211137a = optional;
        this.f211139c = consumer;
    }

    public final void close() {
        int decrementAndGet = this.f211138b.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Illegal lock state");
        } else if (decrementAndGet == 0) {
            this.f211137a.ifPresent(this.f211139c);
        }
    }
}
