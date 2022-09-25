package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18199ac;
import com.google.android.libraries.assistant.gallium.framework.C18215as;
import com.google.android.libraries.assistant.gallium.framework.C18217au;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.assistant.portable.ac */
/* compiled from: PG */
final class C19054ac implements C18217au {

    /* renamed from: a */
    private final C18217au f53459a;

    /* renamed from: b */
    private final AtomicInteger f53460b;

    /* renamed from: c */
    private final AtomicBoolean f53461c = new AtomicBoolean(false);

    public C19054ac(C18217au auVar, AtomicInteger atomicInteger) {
        this.f53459a = auVar;
        this.f53460b = atomicInteger;
    }

    /* renamed from: a */
    public final long mo23676a() {
        return ((C18215as) ((C18199ac) this.f53459a).f51724a).f51737a;
    }

    public final void close() {
        this.f53459a.close();
        if (!this.f53461c.getAndSet(true)) {
            synchronized (this.f53460b) {
                if (this.f53460b.decrementAndGet() <= 0) {
                    this.f53460b.notifyAll();
                }
            }
        }
    }
}
