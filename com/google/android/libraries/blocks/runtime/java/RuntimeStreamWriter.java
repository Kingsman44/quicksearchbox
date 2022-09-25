package com.google.android.libraries.blocks.runtime.java;

/* compiled from: PG */
public final class RuntimeStreamWriter implements AutoCloseable {
    private native void nativeDelete(long j);

    private native void nativeSetWriter(long j, WriterProxy writerProxy);

    private native boolean nativeWrite(long j, byte[] bArr);

    private native void nativeWritesDone(long j);

    private native void nativeWritesDoneWithError(long j, byte[] bArr);

    public final void close() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        nativeDelete(0);
    }
}
