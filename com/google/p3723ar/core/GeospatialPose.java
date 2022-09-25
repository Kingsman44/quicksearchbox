package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.GeospatialPose */
/* compiled from: PG */
public class GeospatialPose {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    /* renamed from: com.google.ar.core.GeospatialPose$GeospatialPoseConfidence */
    /* compiled from: PG */
    public enum GeospatialPoseConfidence {
        LEVEL_0(0),
        LEVEL_1(1),
        LEVEL_2(2),
        LEVEL_3(3),
        LEVEL_4(4);
        
        final int nativeCode;

        private GeospatialPoseConfidence(int i) {
            this.nativeCode = i;
        }

        static GeospatialPoseConfidence forNumber(int i) {
            for (GeospatialPoseConfidence geospatialPoseConfidence : values()) {
                if (geospatialPoseConfidence.nativeCode == i) {
                    return geospatialPoseConfidence;
                }
            }
            throw new FatalException("Unexpected value for native GeospatialPoseConfidence, value=" + i);
        }

        public boolean isAtLeast(GeospatialPoseConfidence geospatialPoseConfidence) {
            return this.nativeCode >= geospatialPoseConfidence.nativeCode;
        }
    }

    public GeospatialPose(long j, Session session2) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private static native void nativeDestroy(long j, long j2);

    private native double nativeGetAltitude(long j, long j2);

    private native int nativeGetConfidence(long j, long j2);

    private native float[] nativeGetDisplayOrientedQuaternion(long j, long j2);

    private native double nativeGetHeading(long j, long j2);

    private native double nativeGetHeadingAccuracy(long j, long j2);

    private native double nativeGetHorizontalAccuracy(long j, long j2);

    private native double nativeGetLatitude(long j, long j2);

    private native double nativeGetLongitude(long j, long j2);

    private native double nativeGetVerticalAccuracy(long j, long j2);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public double getAltitude() {
        return nativeGetAltitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getAltitudeMeters() {
        return nativeGetAltitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public GeospatialPoseConfidence getConfidence() {
        return GeospatialPoseConfidence.forNumber(nativeGetConfidence(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public float[] getDisplayOrientedQuaternion() {
        return nativeGetDisplayOrientedQuaternion(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHeading() {
        return nativeGetHeading(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHeadingAccuracy() {
        return nativeGetHeadingAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHeadingAccuracyDegrees() {
        return nativeGetHeadingAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHeadingDegrees() {
        return nativeGetHeading(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getHorizontalAccuracy() {
        return nativeGetHorizontalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLatitude() {
        return nativeGetLatitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLatitudeDegrees() {
        return nativeGetLatitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLocationAccuracyMeters() {
        return nativeGetHorizontalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLongitude() {
        return nativeGetLongitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getLongitudeDegrees() {
        return nativeGetLongitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public double getVerticalAccuracy() {
        return nativeGetVerticalAccuracy(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
