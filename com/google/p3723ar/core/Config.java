package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.Config */
/* compiled from: PG */
public class Config {
    private static final String TAG = "ARCore-Config";
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    /* renamed from: com.google.ar.core.Config$AugmentedFaceMode */
    /* compiled from: PG */
    public enum AugmentedFaceMode {
        DISABLED(0),
        POSE(1),
        MESH3D(2),
        MESH3D_IMPROVED_LIP_EYE(401),
        MESH3D_IMPROVED_EYE(405),
        MESH3D_FRONT_OR_BACK_PARTNER(418),
        POSE_LOW_FPS(100);
        
        final int nativeCode;

        private AugmentedFaceMode(int i) {
            this.nativeCode = i;
        }

        public static AugmentedFaceMode forNumber(int i) {
            for (AugmentedFaceMode augmentedFaceMode : values()) {
                if (augmentedFaceMode.nativeCode == i) {
                    return augmentedFaceMode;
                }
            }
            throw new FatalException("Unexpected value for native AugmentedFaceMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$AugmentedRegionMode */
    /* compiled from: PG */
    public enum AugmentedRegionMode {
        DISABLED(0),
        ENABLED(1);
        
        final int nativeCode;

        private AugmentedRegionMode(int i) {
            this.nativeCode = i;
        }

        public static AugmentedRegionMode forNumber(int i) {
            for (AugmentedRegionMode augmentedRegionMode : values()) {
                if (augmentedRegionMode.nativeCode == i) {
                    return augmentedRegionMode;
                }
            }
            throw new FatalException("Unexpected value for native AugmentedRegionMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$CloudAnchorMode */
    /* compiled from: PG */
    public enum CloudAnchorMode {
        DISABLED(0),
        ENABLED(1),
        ENABLED_WITH_EARTH_LOCALIZATION(2);
        
        final int nativeCode;

        private CloudAnchorMode(int i) {
            this.nativeCode = i;
        }

        public static CloudAnchorMode forNumber(int i) {
            for (CloudAnchorMode cloudAnchorMode : values()) {
                if (cloudAnchorMode.nativeCode == i) {
                    return cloudAnchorMode;
                }
            }
            throw new FatalException("Unexpected value for native AnchorHostingMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$DepthMode */
    /* compiled from: PG */
    public enum DepthMode {
        DISABLED(0),
        AUTOMATIC(1),
        STATIC_SCENE_WITH_MOVING_PEOPLE(2),
        ALWAYS_ENABLED(4),
        RAW_DEPTH_ONLY(3);
        
        final int nativeCode;

        private DepthMode(int i) {
            this.nativeCode = i;
        }

        public static DepthMode forNumber(int i) {
            for (DepthMode depthMode : values()) {
                if (depthMode.nativeCode == i) {
                    return depthMode;
                }
            }
            throw new FatalException("Unexpected value for native DepthMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$FlashMode */
    /* compiled from: PG */
    public enum FlashMode {
        OFF(0),
        TORCH(2);
        
        final int nativeCode;

        private FlashMode(int i) {
            this.nativeCode = i;
        }

        public static FlashMode forNumber(int i) {
            for (FlashMode flashMode : values()) {
                if (flashMode.nativeCode == i) {
                    return flashMode;
                }
            }
            throw new FatalException("Unexpected value for native FlashMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$FocusMode */
    /* compiled from: PG */
    public enum FocusMode {
        FIXED(0),
        AUTO(1);
        
        final int nativeCode;

        private FocusMode(int i) {
            this.nativeCode = i;
        }

        public static FocusMode forNumber(int i) {
            for (FocusMode focusMode : values()) {
                if (focusMode.nativeCode == i) {
                    return focusMode;
                }
            }
            throw new FatalException("Unexpected value for native FocusMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$GeospatialMode */
    /* compiled from: PG */
    public enum GeospatialMode {
        DISABLED(0),
        ENABLED_LEGACY_LIVE_VIEW(1),
        ENABLED(2);
        
        final int nativeCode;

        private GeospatialMode(int i) {
            this.nativeCode = i;
        }

        public static GeospatialMode forNumber(int i) {
            for (GeospatialMode geospatialMode : values()) {
                if (geospatialMode.nativeCode == i) {
                    return geospatialMode;
                }
            }
            throw new FatalException("Unexpected value for native GeospatialMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$InstantPlacementMode */
    /* compiled from: PG */
    public enum InstantPlacementMode {
        DISABLED(0),
        ENABLED(1),
        LOCAL_Y_UP(2);
        
        final int nativeCode;

        private InstantPlacementMode(int i) {
            this.nativeCode = i;
        }

        public static InstantPlacementMode forNumber(int i) {
            for (InstantPlacementMode instantPlacementMode : values()) {
                if (instantPlacementMode.nativeCode == i) {
                    return instantPlacementMode;
                }
            }
            throw new FatalException("Unexpected value for native InstantPlacementMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$LightEstimationMode */
    /* compiled from: PG */
    public enum LightEstimationMode {
        DISABLED(0),
        AMBIENT_INTENSITY(1),
        ENVIRONMENTAL_HDR(2);
        
        final int nativeCode;

        private LightEstimationMode(int i) {
            this.nativeCode = i;
        }

        public static LightEstimationMode forNumber(int i) {
            for (LightEstimationMode lightEstimationMode : values()) {
                if (lightEstimationMode.nativeCode == i) {
                    return lightEstimationMode;
                }
            }
            throw new FatalException("Unexpected value for native LightEstimationMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$MagicalSurfaceHitTestMode */
    /* compiled from: PG */
    public enum MagicalSurfaceHitTestMode {
        DISABLED(0),
        ENABLED(1);
        
        final int nativeCode;

        private MagicalSurfaceHitTestMode(int i) {
            this.nativeCode = i;
        }

        public static MagicalSurfaceHitTestMode forNumber(int i) {
            for (MagicalSurfaceHitTestMode magicalSurfaceHitTestMode : values()) {
                if (magicalSurfaceHitTestMode.nativeCode == i) {
                    return magicalSurfaceHitTestMode;
                }
            }
            throw new FatalException("Unexpected value for native MagicalSurfaceHitTestMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$PlaneFindingMode */
    /* compiled from: PG */
    public enum PlaneFindingMode {
        DISABLED(0),
        HORIZONTAL(1),
        VERTICAL(2),
        HORIZONTAL_AND_VERTICAL(3),
        HORIZONTAL_AND_VERTICAL_LOW_FEATURE_GROWTH(4);
        
        final int nativeCode;

        private PlaneFindingMode(int i) {
            this.nativeCode = i;
        }

        public static PlaneFindingMode forNumber(int i) {
            for (PlaneFindingMode planeFindingMode : values()) {
                if (planeFindingMode.nativeCode == i) {
                    return planeFindingMode;
                }
            }
            throw new FatalException("Unexpected value for native PlaneFindingMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$SegmentationMode */
    /* compiled from: PG */
    public enum SegmentationMode {
        DISABLED(0),
        BACKGROUND(1),
        BACKGROUND_LITE(2),
        BACKGROUND_LITE_CPU(3),
        PEOPLE(6);
        
        final int nativeCode;

        private SegmentationMode(int i) {
            this.nativeCode = i;
        }

        public static SegmentationMode forNumber(int i) {
            for (SegmentationMode segmentationMode : values()) {
                if (segmentationMode.nativeCode == i) {
                    return segmentationMode;
                }
            }
            throw new FatalException("Unexpected value for native SegmentationMode, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Config$UpdateMode */
    /* compiled from: PG */
    public enum UpdateMode {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1),
        BLOCKING_WITHOUT_OPENGL(2),
        LATEST_CAMERA_IMAGE_WITHOUT_OPENGL(3);
        
        final int nativeCode;

        private UpdateMode(int i) {
            this.nativeCode = i;
        }

        public static UpdateMode forNumber(int i) {
            for (UpdateMode updateMode : values()) {
                if (updateMode.nativeCode == i) {
                    return updateMode;
                }
            }
            throw new FatalException("Unexpected value for native UpdateMode, value=" + i);
        }
    }

    protected Config() {
        this.session = null;
        this.nativeHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    public Config(Session session2) {
        this.session = session2;
        this.nativeHandle = nativeCreate(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j, long j2);

    private native int nativeGetAugmentedFaceMode(long j, long j2);

    private native long nativeGetAugmentedImageDatabase(long j, long j2);

    private native int nativeGetAugmentedRegionMode(long j, long j2);

    private native int nativeGetCloudAnchorMode(long j, long j2);

    private native int nativeGetDepthMode(long j, long j2);

    private native int nativeGetDepthModePrivate(long j, long j2);

    private native int nativeGetFlashMode(long j, long j2);

    private native int nativeGetFocusMode(long j, long j2);

    private native int nativeGetFrameDelayOverride(long j, long j2);

    private native int nativeGetGeospatialMode(long j, long j2, long j3);

    private native int nativeGetInstantPlacementMode(long j, long j2);

    private native int nativeGetInstantPlacementModePrivate(long j, long j2);

    private native int nativeGetLightEstimationMode(long j, long j2);

    private native int nativeGetMagicalSurfaceHitTestModePrivate(long j, long j2);

    private native int nativeGetPlaneFindingMode(long j, long j2);

    private native int nativeGetSegmentationMode(long j, long j2);

    private native int nativeGetUpdateMode(long j, long j2);

    private native float nativeGetZoomLevel(long j, long j2);

    private native void nativeSetAugmentedFaceMode(long j, long j2, int i);

    private native void nativeSetAugmentedImageDatabase(long j, long j2, long j3);

    private native void nativeSetAugmentedRegionMode(long j, long j2, int i);

    private native void nativeSetCloudAnchorMode(long j, long j2, int i);

    private native void nativeSetDepthMode(long j, long j2, int i);

    private native void nativeSetDepthModePrivate(long j, long j2, int i);

    private native void nativeSetFlashMode(long j, long j2, int i);

    private native void nativeSetFocusMode(long j, long j2, int i);

    private native void nativeSetFrameDelayOverride(long j, long j2, int i);

    private native void nativeSetGeospatialMode(long j, long j2, long j3, int i);

    private native void nativeSetGeospatialModeDeprecated(long j, long j2, long j3, int i);

    private native void nativeSetInstantPlacementMode(long j, long j2, int i);

    private native void nativeSetInstantPlacementModePrivate(long j, long j2, int i);

    private native void nativeSetLightEstimationMode(long j, long j2, int i);

    private native void nativeSetMagicalSurfaceHitTestModePrivate(long j, long j2, int i);

    private native void nativeSetPlaneFindingMode(long j, long j2, int i);

    private native void nativeSetSegmentationMode(long j, long j2, int i);

    private native void nativeSetUpdateMode(long j, long j2, int i);

    private native void nativeSetZoomLevel(long j, long j2, float f);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public AugmentedFaceMode getAugmentedFaceMode() {
        return AugmentedFaceMode.forNumber(nativeGetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedImageDatabase getAugmentedImageDatabase() {
        return new AugmentedImageDatabase(this.session, nativeGetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedRegionMode getAugmentedRegionMode() {
        return AugmentedRegionMode.forNumber(nativeGetAugmentedRegionMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CloudAnchorMode getCloudAnchorMode() {
        return CloudAnchorMode.forNumber(nativeGetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public DepthMode getDepthMode() {
        return DepthMode.forNumber(nativeGetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public DepthMode getDepthModePrivate() {
        return DepthMode.forNumber(nativeGetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FlashMode getFlashMode() {
        return FlashMode.forNumber(nativeGetFlashMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FocusMode getFocusMode() {
        return FocusMode.forNumber(nativeGetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int getFrameDelayOverride() {
        return nativeGetFrameDelayOverride(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public GeospatialMode getGeospatialMode() {
        return GeospatialMode.forNumber(nativeGetGeospatialMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public InstantPlacementMode getInstantPlacementMode() {
        return InstantPlacementMode.forNumber(nativeGetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public InstantPlacementMode getInstantPlacementModePrivate() {
        return InstantPlacementMode.forNumber(nativeGetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public LightEstimationMode getLightEstimationMode() {
        return LightEstimationMode.forNumber(nativeGetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public MagicalSurfaceHitTestMode getMagicalSurfaceHitTestModePrivate() {
        return MagicalSurfaceHitTestMode.forNumber(nativeGetMagicalSurfaceHitTestModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public PlaneFindingMode getPlaneFindingMode() {
        return PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public SegmentationMode getSegmentationMode() {
        return SegmentationMode.forNumber(nativeGetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public UpdateMode getUpdateMode() {
        return UpdateMode.forNumber(nativeGetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public float getZoomLevel() {
        return nativeGetZoomLevel(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Config setAugmentedFaceMode(AugmentedFaceMode augmentedFaceMode) {
        nativeSetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedFaceMode.nativeCode);
        return this;
    }

    public Config setAugmentedImageDatabase(AugmentedImageDatabase augmentedImageDatabase) {
        nativeSetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle, augmentedImageDatabase == null ? 0 : augmentedImageDatabase.nativeHandle);
        return this;
    }

    public Config setAugmentedRegionMode(AugmentedRegionMode augmentedRegionMode) {
        nativeSetAugmentedRegionMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedRegionMode.nativeCode);
        return this;
    }

    public Config setCloudAnchorMode(CloudAnchorMode cloudAnchorMode) {
        nativeSetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle, cloudAnchorMode.nativeCode);
        return this;
    }

    public Config setDepthMode(DepthMode depthMode) {
        nativeSetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        return this;
    }

    public Config setDepthModePrivate(DepthMode depthMode) {
        nativeSetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        return this;
    }

    public Config setFlashMode(FlashMode flashMode) {
        nativeSetFlashMode(this.session.nativeWrapperHandle, this.nativeHandle, flashMode.nativeCode);
        return this;
    }

    public Config setFocusMode(FocusMode focusMode) {
        nativeSetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle, focusMode.nativeCode);
        return this;
    }

    public Config setFrameDelayOverride(int i) {
        nativeSetFrameDelayOverride(this.session.nativeWrapperHandle, this.nativeHandle, i);
        return this;
    }

    public Config setGeospatialMode(GeospatialMode geospatialMode) {
        nativeSetGeospatialMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle, geospatialMode.nativeCode);
        return this;
    }

    @Deprecated
    public Config setGeospatialModeDeprecated(GeospatialMode geospatialMode) {
        nativeSetGeospatialModeDeprecated(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle, geospatialMode.nativeCode);
        return this;
    }

    public Config setInstantPlacementMode(InstantPlacementMode instantPlacementMode) {
        nativeSetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        return this;
    }

    public Config setInstantPlacementModePrivate(InstantPlacementMode instantPlacementMode) {
        nativeSetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        return this;
    }

    public Config setLightEstimationMode(LightEstimationMode lightEstimationMode) {
        nativeSetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle, lightEstimationMode.nativeCode);
        return this;
    }

    public Config setMagicalSurfaceHitTestModePrivate(MagicalSurfaceHitTestMode magicalSurfaceHitTestMode) {
        nativeSetMagicalSurfaceHitTestModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, magicalSurfaceHitTestMode.nativeCode);
        return this;
    }

    public Config setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        nativeSetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle, planeFindingMode.nativeCode);
        return this;
    }

    public Config setSegmentationMode(SegmentationMode segmentationMode) {
        nativeSetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle, segmentationMode.nativeCode);
        return this;
    }

    public Config setUpdateMode(UpdateMode updateMode) {
        nativeSetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, updateMode.nativeCode);
        return this;
    }

    public Config setZoomLevel(float f) {
        nativeSetZoomLevel(this.session.nativeWrapperHandle, this.nativeHandle, f);
        return this;
    }

    Config(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
