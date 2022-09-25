package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;
import java.util.Collection;

/* renamed from: com.google.ar.core.MagicalSurfacePoint */
/* compiled from: PG */
public class MagicalSurfacePoint extends TrackableBase {

    /* renamed from: com.google.ar.core.MagicalSurfacePoint$OrientationMode */
    /* compiled from: PG */
    public enum OrientationMode {
        INITIALIZED_TO_IDENTITY(0),
        ESTIMATED_SURFACE_NORMAL(1);
        
        private final int nativeCode;

        private OrientationMode(int i) {
            this.nativeCode = i;
        }

        static OrientationMode fromNumber(int i) {
            for (OrientationMode orientationMode : values()) {
                if (orientationMode.nativeCode == i) {
                    return orientationMode;
                }
            }
            throw new FatalException("Unexpected value for native Point Orientation Mode, value=" + i);
        }
    }

    public MagicalSurfacePoint(long j, Session session) {
        super(j, session);
    }

    private native int nativeGetOrientationModePrivate(long j, long j2);

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
        return OrientationMode.fromNumber(nativeGetOrientationModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
