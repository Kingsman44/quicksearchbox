package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.Camera */
/* compiled from: PG */
public class Camera {
    private static final String TAG = "ARCore-Camera";
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    @Deprecated(forRemoval = true)
    /* renamed from: com.google.ar.core.Camera$EarthLocalizationState */
    /* compiled from: PG */
    public enum EarthLocalizationState {
        NOT_LOCALIZED(0),
        LOCALIZED(1),
        UNAVAILABLE(2);
        
        final int nativeCode;

        private EarthLocalizationState(int i) {
            this.nativeCode = i;
        }

        static EarthLocalizationState forNumber(int i) {
            for (EarthLocalizationState earthLocalizationState : values()) {
                if (earthLocalizationState.nativeCode == i) {
                    return earthLocalizationState;
                }
            }
            throw new FatalException("Unexpected value for native ArEarthLocalizationState, value=" + i);
        }
    }

    protected Camera() {
        this.session = null;
        this.nativeHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    public Camera(Session session2, Frame frame) {
        this.session = session2;
        this.nativeHandle = nativeAcquireCamera(session2.nativeWrapperHandle, frame.nativeHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private static native long nativeAcquireCamera(long j, long j2);

    private native long nativeCreateCameraIntrinsics(long j);

    private native Pose nativeDisplayOrientedPose(long j, long j2);

    private native void nativeGetImageIntrinsics(long j, long j2, long j3);

    private native Pose nativeGetPose(long j, long j2);

    private native void nativeGetProjectionMatrix(long j, long j2, float[] fArr, int i, float f, float f2);

    private native void nativeGetTextureIntrinsics(long j, long j2, long j3);

    private native int nativeGetTrackingFailureReason(long j, long j2);

    private native int nativeGetTrackingStack(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeGetViewMatrix(long j, long j2, float[] fArr, int i);

    private static native void nativeReleaseCamera(long j, long j2);

    public boolean equals(Object obj) {
        if ((obj instanceof Camera) && ((Camera) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseCamera(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public Pose getDisplayOrientedPose() {
        return nativeDisplayOrientedPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public CameraIntrinsics getImageIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetImageIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void getProjectionMatrix(float[] fArr, int i, float f, float f2) {
        nativeGetProjectionMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i, f, f2);
    }

    public CameraIntrinsics getTextureIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetTextureIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    public TrackingFailureReason getTrackingFailureReason() {
        return TrackingFailureReason.forNumber(nativeGetTrackingFailureReason(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingStack getTrackingStack() {
        return TrackingStack.forNumber(nativeGetTrackingStack(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public void getViewMatrix(float[] fArr, int i) {
        nativeGetViewMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }
}
