package com.google.android.libraries.blocks.runtime.java;

import com.google.android.libraries.blocks.StreamReaderWriter;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
public class BaseClient implements AutoCloseable {

    /* compiled from: PG */
    interface ReadableWritableStreamCreator {
        StreamReaderWriter create(long j, long j2);
    }

    private native void nativeCallAsync(long j, int i, byte[] bArr, SettableFuture settableFuture);

    private native long nativeCallReadableStream(long j, int i, byte[] bArr);

    private native StreamReaderWriter nativeCallReadableWritableStream(long j, int i, ReadableWritableStreamCreator readableWritableStreamCreator);

    private native byte[] nativeCallSync(long j, int i, byte[] bArr);

    private native long nativeCallWritableStream(long j, int i, SettableFuture settableFuture);

    private native void nativeDelete(long j);

    private native InstanceProxy nativeGetUnderlyingInstanceProxy(long j);

    private native void nativeRelease(long j);

    private native String nativeToMovableRef(long j);

    private native String nativeToSharedRef(long j);

    public final void close() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        nativeDelete(0);
    }
}
