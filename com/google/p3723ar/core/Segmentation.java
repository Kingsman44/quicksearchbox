package com.google.p3723ar.core;

import android.media.Image;

/* renamed from: com.google.ar.core.Segmentation */
/* compiled from: PG */
public class Segmentation {
    private static final String TAG = "ARCore-Segmentation";
    final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public Segmentation(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private native long nativeAcquirePersonMask(long j, long j2);

    private native void nativeReleaseSegmentation(long j, long j2);

    public Image acquirePersonMask() {
        return new ArImage(this.session, nativeAcquirePersonMask(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseSegmentation(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }
}
