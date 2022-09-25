package com.google.p3723ar.core;

/* renamed from: com.google.ar.core.LatencyStats */
/* compiled from: PG */
public class LatencyStats {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected LatencyStats() {
        this.nativeHandle = 0;
        this.session = null;
        this.nativeSymbolTableHandle = 0;
    }

    public LatencyStats(Session session2) {
        this(session2, nativeCreateLatencyStats(session2.nativeWrapperHandle));
    }

    private static native long nativeCreateLatencyStats(long j);

    private static native void nativeDestroyLatencyStats(long j, long j2);

    private native float nativeGetAverageDuration(long j, long j2);

    private native float nativeGetMaxDuration(long j, long j2);

    private native float nativeGetMinDuration(long j, long j2);

    private native int nativeGetSampleCount(long j, long j2);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyLatencyStats(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public float getAverageDuration() {
        return nativeGetAverageDuration(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getMaxDuration() {
        return nativeGetMaxDuration(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getMinDuration() {
        return nativeGetMinDuration(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public int getSampleCount() {
        return nativeGetSampleCount(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public LatencyStats(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
