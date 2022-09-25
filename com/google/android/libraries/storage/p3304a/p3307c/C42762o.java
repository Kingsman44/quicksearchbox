package com.google.android.libraries.storage.p3304a.p3307c;

import java.io.Closeable;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.libraries.storage.a.c.o */
/* compiled from: PG */
public final class C42762o implements Closeable {

    /* renamed from: a */
    public Semaphore f112022a;

    public C42762o(Semaphore semaphore) {
        this.f112022a = semaphore;
    }

    public final void close() {
        Semaphore semaphore = this.f112022a;
        if (semaphore != null) {
            semaphore.release();
            this.f112022a = null;
        }
    }
}
