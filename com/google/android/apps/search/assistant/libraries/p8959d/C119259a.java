package com.google.android.apps.search.assistant.libraries.p8959d;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.libraries.d.a */
/* compiled from: PG */
public final class C119259a {

    /* renamed from: a */
    public final AtomicReference f332586a;

    /* renamed from: b */
    private final Set f332587b = new CopyOnWriteArraySet();

    public C119259a(Object obj) {
        this.f332586a = new AtomicReference(obj);
    }

    /* renamed from: a */
    public final void mo104263a(Object obj) {
        if (!Objects.equals(this.f332586a.getAndSet(obj), obj)) {
            for (Consumer accept : this.f332587b) {
                accept.accept(obj);
            }
        }
    }

    /* renamed from: b */
    public final void mo104264b(Consumer consumer) {
        this.f332587b.add(consumer);
    }

    /* renamed from: c */
    public final void mo104265c(Consumer consumer) {
        this.f332587b.remove(consumer);
    }
}
