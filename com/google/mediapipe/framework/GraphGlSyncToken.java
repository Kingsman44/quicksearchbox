package com.google.mediapipe.framework;

/* compiled from: PG */
public final class GraphGlSyncToken implements GlSyncToken {

    /* renamed from: a */
    private long f169358a;

    public GraphGlSyncToken(long j) {
        this.f169358a = j;
    }

    private static native void nativeRelease(long j);

    private static native void nativeWaitOnCpu(long j);

    private static native void nativeWaitOnGpu(long j);

    public final long nativeToken() {
        return this.f169358a;
    }

    public final void release() {
        long j = this.f169358a;
        if (j != 0) {
            nativeRelease(j);
            this.f169358a = 0;
        }
    }

    public final void waitOnCpu() {
        long j = this.f169358a;
        if (j != 0) {
            nativeWaitOnCpu(j);
        }
    }

    public final void waitOnGpu() {
        long j = this.f169358a;
        if (j != 0) {
            nativeWaitOnGpu(j);
        }
    }
}
