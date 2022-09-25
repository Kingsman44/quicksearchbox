package com.google.android.libraries.blocks.runtime.java;

/* compiled from: PG */
public final class RuntimeStreamReader implements AutoCloseable {
    private native void nativeDelete(long j);

    private native void nativeReadsDone(long j);

    private native void nativeReadsDoneWithError(long j, byte[] bArr);

    private native void nativeSetReader(long j, ReaderProxy readerProxy);

    public final void close() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        nativeDelete(0);
    }
}
