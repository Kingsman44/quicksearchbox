package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.AugmentedRegionConfig */
/* compiled from: PG */
public class AugmentedRegionConfig {
    private static final String TAG = "ARCore-AugmentedRegionConfig";
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* renamed from: com.google.ar.core.AugmentedRegionConfig$AugmentedRegionTrackingType */
    /* compiled from: PG */
    public enum AugmentedRegionTrackingType {
        RECTANGLE_AXIS_ALIGNED(0),
        RECTANGLE(1),
        QUAD(2),
        LEFT_TOP_RIGHT_BOTTOM_ROTATION(3);
        
        final int nativeCode;

        private AugmentedRegionTrackingType(int i) {
            this.nativeCode = i;
        }

        static AugmentedRegionTrackingType forNumber(int i) {
            for (AugmentedRegionTrackingType augmentedRegionTrackingType : values()) {
                if (augmentedRegionTrackingType.nativeCode == i) {
                    return augmentedRegionTrackingType;
                }
            }
            throw new FatalException("Unexpected value for native AugmentedRegionTrackingType, value=" + i);
        }
    }

    public AugmentedRegionConfig(Session session2) {
        this.session = session2;
        this.nativeHandle = nativeCreate(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j, long j2);

    private native void nativeSetAspectRatio(long j, long j2, float f);

    private native void nativeSetEnableFeatureMatchStats(long j, long j2, boolean z);

    private native void nativeSetEnableGroupTracking(long j, long j2, boolean z);

    private native void nativeSetEnableReacquisition(long j, long j2, boolean z);

    private native void nativeSetPolygon(long j, long j2, float[] fArr);

    private native void nativeSetPolygonCoordinateType(long j, long j2, int i);

    private native void nativeSetSkipOcclusionDetection(long j, long j2, boolean z);

    private native void nativeSetTimestamp(long j, long j2, long j3);

    private native void nativeSetTrackingType(long j, long j2, int i);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public AugmentedRegionConfig setAspectRatio(float f) {
        nativeSetAspectRatio(this.session.nativeWrapperHandle, this.nativeHandle, f);
        return this;
    }

    public AugmentedRegionConfig setEnableFeatureMatchStats(boolean z) {
        nativeSetEnableFeatureMatchStats(this.session.nativeWrapperHandle, this.nativeHandle, z);
        return this;
    }

    public AugmentedRegionConfig setEnableGroupTracking(boolean z) {
        nativeSetEnableGroupTracking(this.session.nativeWrapperHandle, this.nativeHandle, z);
        return this;
    }

    public AugmentedRegionConfig setEnableReacquisition(boolean z) {
        nativeSetEnableReacquisition(this.session.nativeWrapperHandle, this.nativeHandle, z);
        return this;
    }

    public AugmentedRegionConfig setPolygonCoordinateType(Coordinates2d coordinates2d) {
        nativeSetPolygonCoordinateType(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode);
        return this;
    }

    public AugmentedRegionConfig setSkipOcclusionDetection(boolean z) {
        nativeSetSkipOcclusionDetection(this.session.nativeWrapperHandle, this.nativeHandle, z);
        return this;
    }

    public AugmentedRegionConfig setTimestamp(long j) {
        nativeSetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle, j);
        return this;
    }

    public AugmentedRegionConfig setTrackingType(AugmentedRegionTrackingType augmentedRegionTrackingType) {
        nativeSetTrackingType(this.session.nativeWrapperHandle, this.nativeHandle, augmentedRegionTrackingType.nativeCode);
        return this;
    }

    public AugmentedRegionConfig setVertices(float[] fArr) {
        nativeSetPolygon(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return this;
    }
}
