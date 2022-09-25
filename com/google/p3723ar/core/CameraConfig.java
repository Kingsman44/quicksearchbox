package com.google.p3723ar.core;

import android.util.Range;
import android.util.Size;
import com.google.p3723ar.core.exceptions.FatalException;
import java.util.EnumSet;

/* renamed from: com.google.ar.core.CameraConfig */
/* compiled from: PG */
public class CameraConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* renamed from: com.google.ar.core.CameraConfig$DepthSensorUsage */
    /* compiled from: PG */
    public enum DepthSensorUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        private DepthSensorUsage(int i) {
            this.nativeCode = i;
        }

        static EnumSet forBitFlags(int i) {
            EnumSet<E> noneOf = EnumSet.noneOf(DepthSensorUsage.class);
            for (DepthSensorUsage depthSensorUsage : values()) {
                if ((depthSensorUsage.nativeCode & i) != 0) {
                    noneOf.add(depthSensorUsage);
                }
            }
            return noneOf;
        }

        static DepthSensorUsage forNumber(int i) {
            for (DepthSensorUsage depthSensorUsage : values()) {
                if (depthSensorUsage.nativeCode == i) {
                    return depthSensorUsage;
                }
            }
            throw new FatalException("Unexpected value for native DepthSensorUsage, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.CameraConfig$FacingDirection */
    /* compiled from: PG */
    public enum FacingDirection {
        BACK(0),
        FRONT(1);
        
        final int nativeCode;

        private FacingDirection(int i) {
            this.nativeCode = i;
        }

        static FacingDirection forNumber(int i) {
            for (FacingDirection facingDirection : values()) {
                if (facingDirection.nativeCode == i) {
                    return facingDirection;
                }
            }
            throw new FatalException("Unexpected value for native FacingDirection, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.CameraConfig$StereoCameraUsage */
    /* compiled from: PG */
    public enum StereoCameraUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        private StereoCameraUsage(int i) {
            this.nativeCode = i;
        }

        static EnumSet forBitFlags(int i) {
            EnumSet<E> noneOf = EnumSet.noneOf(StereoCameraUsage.class);
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if ((stereoCameraUsage.nativeCode & i) != 0) {
                    noneOf.add(stereoCameraUsage);
                }
            }
            return noneOf;
        }

        static StereoCameraUsage forNumber(int i) {
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if (stereoCameraUsage.nativeCode == i) {
                    return stereoCameraUsage;
                }
            }
            throw new FatalException("Unexpected value for native StereoCameraUsage, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.CameraConfig$TargetFps */
    /* compiled from: PG */
    public enum TargetFps {
        TARGET_FPS_30(1),
        TARGET_FPS_60(2);
        
        final int nativeCode;

        private TargetFps(int i) {
            this.nativeCode = i;
        }

        static EnumSet forBitFlags(int i) {
            EnumSet<E> noneOf = EnumSet.noneOf(TargetFps.class);
            for (TargetFps targetFps : values()) {
                if ((targetFps.nativeCode & i) != 0) {
                    noneOf.add(targetFps);
                }
            }
            return noneOf;
        }
    }

    protected CameraConfig() {
        this.session = null;
        this.nativeHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    public CameraConfig(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private static native void nativeDestroyCameraConfig(long j, long j2);

    private native String nativeGetCameraId(long j, long j2);

    private native int nativeGetDepthSensorUsage(long j, long j2);

    private native int nativeGetFacingDirection(long j, long j2);

    private native void nativeGetFpsRange(long j, long j2, int[] iArr);

    private native void nativeGetImageDimensions(long j, long j2, int[] iArr);

    private native int nativeGetStereoCameraUsage(long j, long j2);

    private native void nativeGetTextureDimensions(long j, long j2, int[] iArr);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyCameraConfig(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public String getCameraId() {
        return nativeGetCameraId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public DepthSensorUsage getDepthSensorUsage() {
        return DepthSensorUsage.forNumber(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FacingDirection getFacingDirection() {
        return FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Range getFpsRange() {
        int[] iArr = new int[2];
        nativeGetFpsRange(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Range(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public Size getImageSize() {
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    public StereoCameraUsage getStereoCameraUsage() {
        return StereoCameraUsage.forNumber(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Size getTextureSize() {
        int[] iArr = new int[2];
        nativeGetTextureDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }
}
