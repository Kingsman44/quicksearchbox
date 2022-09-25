package com.google.android.libraries.storage.p3304a.p3307c;

import java.io.Closeable;
import java.nio.channels.FileLock;

/* renamed from: com.google.android.libraries.storage.a.c.m */
/* compiled from: PG */
public final class C42760m implements Closeable {

    /* renamed from: a */
    private FileLock f112020a;

    public C42760m(FileLock fileLock) {
        this.f112020a = fileLock;
    }

    public final void close() {
        FileLock fileLock = this.f112020a;
        if (fileLock != null) {
            fileLock.release();
            this.f112020a = null;
        }
    }
}
