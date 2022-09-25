package com.google.android.libraries.assistant.portable;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.libraries.assistant.portable.ab */
/* compiled from: PG */
public final class C19053ab implements AutoCloseable {

    /* renamed from: a */
    private final Lock f53457a;

    /* renamed from: b */
    private boolean f53458b = false;

    public C19053ab(Lock lock) {
        this.f53457a = lock;
        lock.lock();
    }

    public final void close() {
        if (!this.f53458b) {
            this.f53457a.unlock();
            this.f53458b = true;
        }
    }
}
