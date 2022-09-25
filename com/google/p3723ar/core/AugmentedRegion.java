package com.google.p3723ar.core;

import java.nio.FloatBuffer;
import p3186j$.util.Optional;

/* renamed from: com.google.ar.core.AugmentedRegion */
/* compiled from: PG */
public class AugmentedRegion {
    private static final String TAG = "ARCore-AugmentedRegion";
    final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final int numberOfVertices;
    private final Session session;

    /* renamed from: com.google.ar.core.AugmentedRegion$FeatureMatchStats */
    /* compiled from: PG */
    public class FeatureMatchStats {
        private static final int LENGTH = 6;
        public int initialFeaturesCountInsideCurrentBox;
        public int initialFeaturesCountInsideInitialBox;
        public int initialFeaturesCountOutsideCurrentBox;
        public int initialFeaturesCountOutsideInitialBox;
        public int newFeaturesCountInsideCurrentBox;
        public int newFeaturesCountOutsideCurrentBox;

        public FeatureMatchStats(int[] iArr) {
            if (iArr.length == 6) {
                this.initialFeaturesCountInsideInitialBox = iArr[0];
                this.initialFeaturesCountOutsideInitialBox = iArr[1];
                this.initialFeaturesCountInsideCurrentBox = iArr[2];
                this.initialFeaturesCountOutsideCurrentBox = iArr[3];
                this.newFeaturesCountInsideCurrentBox = iArr[4];
                this.newFeaturesCountOutsideCurrentBox = iArr[5];
                return;
            }
            throw new IllegalArgumentException("Wrong length of Feature Match Stats.");
        }
    }

    public AugmentedRegion(long j, Session session2) {
        this.nativeHandle = j;
        this.session = session2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        this.numberOfVertices = nativeGetNumberOfVertices(session2.nativeWrapperHandle, j);
    }

    private native boolean nativeGetFeatureMatchStats(long j, long j2, Object obj);

    private native int nativeGetId(long j, long j2);

    private native int nativeGetNumberOfVertices(long j, long j2);

    private native int nativeGetPolygonCoordinateType(long j, long j2);

    private native int nativeGetState(long j, long j2);

    private native float nativeGetTrackingConfidence(long j, long j2);

    private native void nativeGetVertices(long j, long j2, Object obj);

    private native boolean nativeIsGroupHomographyUsed(long j, long j2);

    private native void nativeReleaseAugmentedRegion(long j, long j2);

    private native void nativeStop(long j, long j2);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseAugmentedRegion(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public Optional getFeatureMatchStats() {
        int[] iArr = new int[6];
        if (nativeGetFeatureMatchStats(this.session.nativeWrapperHandle, this.nativeHandle, iArr)) {
            return Optional.m71637of(new FeatureMatchStats(iArr));
        }
        return Optional.empty();
    }

    public int getId() {
        return nativeGetId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public int getNumberOfVertices() {
        return this.numberOfVertices;
    }

    public Coordinates2d getPolygonCoordinateType() {
        return Coordinates2d.forNumber(nativeGetPolygonCoordinateType(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getState() {
        return TrackingState.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public float getTrackingConfidence() {
        return nativeGetTrackingConfidence(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float[] getVertices() {
        int i = this.numberOfVertices;
        float[] fArr = new float[(i + i)];
        nativeGetVertices(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public boolean isGroupHomographyUsed() {
        return nativeIsGroupHomographyUsed(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void stop() {
        nativeStop(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void getVertices(FloatBuffer floatBuffer) {
        nativeGetVertices(this.session.nativeWrapperHandle, this.nativeHandle, floatBuffer);
    }
}
