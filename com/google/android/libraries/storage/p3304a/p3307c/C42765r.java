package com.google.android.libraries.storage.p3304a.p3307c;

import java.io.Closeable;

/* renamed from: com.google.android.libraries.storage.a.c.r */
/* compiled from: PG */
public final class C42765r implements Closeable {

    /* renamed from: a */
    public Closeable f112024a;

    public C42765r(Closeable closeable) {
        this.f112024a = closeable;
    }

    public final void close() {
        Closeable closeable = this.f112024a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
