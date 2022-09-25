package com.google.mediapipe.framework;

/* compiled from: PG */
public interface GlSyncToken {
    long nativeToken();

    void release();

    void waitOnCpu();

    void waitOnGpu();
}
