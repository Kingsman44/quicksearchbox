package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;
import java.util.Collection;

/* renamed from: com.google.ar.core.Earth */
/* compiled from: PG */
public class Earth extends TrackableBase {

    /* renamed from: com.google.ar.core.Earth$EarthState */
    /* compiled from: PG */
    public enum EarthState {
        ENABLED(0),
        ERROR_INTERNAL(-1),
        ERROR_GEOSPATIAL_MODE_DISABLED(-2),
        ERROR_NOT_AUTHORIZED(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_APK_VERSION_TOO_OLD(-5);
        
        final int nativeCode;

        private EarthState(int i) {
            this.nativeCode = i;
        }

        static EarthState forNumber(int i) {
            for (EarthState earthState : values()) {
                if (earthState.nativeCode == i) {
                    return earthState;
                }
            }
            throw new FatalException("Unexpected value for native EarthState, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Earth$LocalizationPerformanceMode */
    /* compiled from: PG */
    public enum LocalizationPerformanceMode {
        SESSION_STATE_DEFAULT(0),
        ACTIVE_AR(1),
        ACTIVE_NO_CAMERA(2),
        INACTIVE_PASSIVE(3);
        
        final int nativeCode;

        private LocalizationPerformanceMode(int i) {
            this.nativeCode = i;
        }

        static LocalizationPerformanceMode forNumber(int i) {
            for (LocalizationPerformanceMode localizationPerformanceMode : values()) {
                if (localizationPerformanceMode.nativeCode == i) {
                    return localizationPerformanceMode;
                }
            }
            throw new FatalException("Unexpected value for native LocalizationPerformanceMode, value=" + i);
        }
    }

    public Earth(long j, Session session) {
        super(j, session);
    }

    private native long nativeCreateAnchor(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long nativeCreateAnchorOnTerrain(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long nativeCreateAnchorOnWgs84(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long nativeGetCameraGeospatialPose(long j, long j2);

    private native int nativeGetEarthState(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeReleaseEarth(long j, long j2);

    private native long nativeResolveAnchorOnTerrain(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native void nativeSetLocalizationPerformanceMode(long j, long j2, int i);

    private native void nativeSetNetworkClient(long j, long j2, EarthNetworkClientInterface earthNetworkClientInterface);

    public Anchor createAnchor(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    public Anchor createAnchorOnTerrain(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeCreateAnchorOnTerrain(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    public Anchor createAnchorOnWgs84(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeCreateAnchorOnWgs84(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseEarth(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public GeospatialPose getCameraGeospatialPose() {
        return new GeospatialPose(nativeGetCameraGeospatialPose(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public EarthState getEarthState() {
        return EarthState.forNumber(nativeGetEarthState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public Anchor resolveAnchorOnTerrain(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeResolveAnchorOnTerrain(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    public void setLocalizationPerformanceMode(LocalizationPerformanceMode localizationPerformanceMode) {
        nativeSetLocalizationPerformanceMode(this.session.nativeWrapperHandle, this.nativeHandle, localizationPerformanceMode.nativeCode);
    }

    public void setNetworkClient(EarthNetworkClientInterface earthNetworkClientInterface) {
        nativeSetNetworkClient(this.session.nativeWrapperHandle, this.nativeHandle, earthNetworkClientInterface);
    }

    public Anchor createAnchor(double d, double d2, double d3, float[] fArr) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, fArr[0], fArr[1], fArr[2], fArr[3]), this.session);
    }

    @Deprecated
    public Anchor createAnchor(Pose pose) {
        throw new IllegalArgumentException("Earth does not support createAnchor using a Pose. Use createAnchor with Geospatial coordinates instead.");
    }
}
