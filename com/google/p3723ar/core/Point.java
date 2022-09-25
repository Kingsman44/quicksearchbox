package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;
import java.util.Collection;

/* renamed from: com.google.ar.core.Point */
/* compiled from: PG */
public class Point extends TrackableBase {

    /* renamed from: com.google.ar.core.Point$OrientationMode */
    /* compiled from: PG */
    public enum OrientationMode {
        INITIALIZED_TO_IDENTITY(0),
        ESTIMATED_SURFACE_NORMAL(1);
        
        private final int nativeCode;

        private OrientationMode(int i) {
            this.nativeCode = i;
        }

        static OrientationMode forNumber(int i) {
            for (OrientationMode orientationMode : values()) {
                if (orientationMode.nativeCode == i) {
                    return orientationMode;
                }
            }
            throw new FatalException("Unexpected value for native Point Orientation Mode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Point$TrackingMethod */
    /* compiled from: PG */
    public enum TrackingMethod {
        DISTANCE_GUESS(1),
        REAL_DEPTH(2),
        DISTANCE_GUESS_AND_REAL_DEPTH(3);
        
        final int nativeCode;

        private TrackingMethod(int i) {
            this.nativeCode = i;
        }

        static TrackingMethod forNumber(int i) {
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i) {
                    return trackingMethod;
                }
            }
            throw new FatalException("Unexpected value for native Point TrackingMethod Mode, value=" + i);
        }
    }

    protected Point() {
        super(0, (Session) null);
    }

    private native int nativeGetOrientationMode(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native Pose nativeGetPoseFromDistanceGuess(long j, long j2);

    private native Pose nativeGetPoseFromRealDepth(long j, long j2);

    private native int nativeGetTrackingMethod(long j, long j2);

    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public OrientationMode getOrientationMode() {
        return OrientationMode.forNumber(nativeGetOrientationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getPoseFromDistanceGuess() {
        return nativeGetPoseFromDistanceGuess(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getPoseFromRealDepth() {
        return nativeGetPoseFromRealDepth(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.forNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public Point(long j, Session session) {
        super(j, session);
    }
}
