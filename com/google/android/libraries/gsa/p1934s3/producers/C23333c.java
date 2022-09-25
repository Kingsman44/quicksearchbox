package com.google.android.libraries.gsa.p1934s3.producers;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.gsa.s3.producers.c */
/* compiled from: PG */
public class C23333c implements Closeable {

    /* renamed from: a */
    private final AtomicBoolean f63869a = new AtomicBoolean(false);

    public final void close() {
        this.f63869a.set(true);
    }
}
