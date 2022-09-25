package com.google.android.libraries.blocks.runtime.java;

/* compiled from: PG */
public interface ReaderProxy {
    void onStreamData(byte[] bArr);

    void onStreamError(Throwable th);

    void onStreamFinished();
}
