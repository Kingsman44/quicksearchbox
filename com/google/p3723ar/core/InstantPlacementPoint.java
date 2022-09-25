package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;
import java.util.Collection;

/* renamed from: com.google.ar.core.InstantPlacementPoint */
/* compiled from: PG */
public class InstantPlacementPoint extends TrackableBase {

    /* renamed from: com.google.ar.core.InstantPlacementPoint$TrackingMethod */
    /* compiled from: PG */
    public enum TrackingMethod {
        NOT_TRACKING(0),
        SCREENSPACE_WITH_APPROXIMATE_DISTANCE(1),
        FULL_TRACKING(2);
        
        final int nativeCode;

        private TrackingMethod(int i) {
            this.nativeCode = i;
        }

        static TrackingMethod fromNumber(int i) {
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i) {
                    return trackingMethod;
                }
            }
            throw new FatalException("Unexpected value for native InstantPlacementPoint TrackingMethod Mode, value=" + i);
        }
    }

    public InstantPlacementPoint(long j, Session session) {
        super(j, session);
    }

    private native Pose nativeGetPose(long j, long j2);

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

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
