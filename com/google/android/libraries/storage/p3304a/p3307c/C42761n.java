package com.google.android.libraries.storage.p3304a.p3307c;

import java.io.Closeable;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.libraries.storage.a.c.n */
/* compiled from: PG */
public final class C42761n implements Closeable {

    /* renamed from: a */
    private Semaphore f112021a;

    public C42761n(Semaphore semaphore) {
        this.f112021a = semaphore;
    }

    public final void close() {
        Semaphore semaphore = this.f112021a;
        if (semaphore != null) {
            semaphore.release();
            this.f112021a = null;
        }
    }
}
