package com.google.p3723ar.core;

import com.google.p3723ar.core.Frame;

/* renamed from: com.google.ar.core.InjectionResult */
/* compiled from: PG */
public class InjectionResult {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected InjectionResult() {
        this.nativeHandle = 0;
        this.session = null;
        this.nativeSymbolTableHandle = 0;
    }

    public InjectionResult(Session session2) {
        this(session2, nativeCreateInjectionResult(session2.nativeWrapperHandle));
    }

    private static native long nativeCreateInjectionResult(long j);

    private static native void nativeDestroyInjectionResult(long j, long j2);

    private native int nativeGetFrameAnalysisType(long j, long j2);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyInjectionResult(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public Frame.FrameAnalysisType getFrameAnalysisType() {
        return Frame.FrameAnalysisType.forNumber(nativeGetFrameAnalysisType(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public InjectionResult(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
