package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.Anchor */
/* compiled from: PG */
public class Anchor {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    /* renamed from: com.google.ar.core.Anchor$CloudAnchorState */
    /* compiled from: PG */
    public enum CloudAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_SERVICE_UNAVAILABLE(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_HOSTING_DATASET_PROCESSING_FAILED(-5),
        ERROR_CLOUD_ID_NOT_FOUND(-6),
        ERROR_RESOLVING_LOCALIZATION_NO_MATCH(-7),
        ERROR_RESOLVING_SDK_VERSION_TOO_OLD(-8),
        ERROR_RESOLVING_SDK_VERSION_TOO_NEW(-9),
        ERROR_HOSTING_SERVICE_UNAVAILABLE(-10),
        ERROR_RESOLVING_LOCALIZED_TOO_FAR_AWAY(-11);
        
        final int nativeCode;

        private CloudAnchorState(int i) {
            this.nativeCode = i;
        }

        public static CloudAnchorState forNumber(int i) {
            for (CloudAnchorState cloudAnchorState : values()) {
                if (cloudAnchorState.nativeCode == i) {
                    return cloudAnchorState;
                }
            }
            throw new FatalException("Unexpected value for native CloudAnchorState, value=" + i);
        }

        public boolean isError() {
            return this.nativeCode < 0;
        }
    }

    @Deprecated(forRemoval = true)
    /* renamed from: com.google.ar.core.Anchor$CloudLocalizationState */
    /* compiled from: PG */
    public enum CloudLocalizationState {
        NONE(0),
        EARTH(1),
        LOCAL_MAP(2),
        LOCAL_MAP_AND_EARTH(3);
        
        final int nativeCode;

        private CloudLocalizationState(int i) {
            this.nativeCode = i;
        }

        static CloudLocalizationState forNumber(int i) {
            for (CloudLocalizationState cloudLocalizationState : values()) {
                if (cloudLocalizationState.nativeCode == i) {
                    return cloudLocalizationState;
                }
            }
            throw new FatalException("Unexpected value for native CloudLocalizationState, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Anchor$TerrainAnchorState */
    /* compiled from: PG */
    public enum TerrainAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_UNSUPPORTED_LOCATION(-3);
        
        final int nativeCode;

        private TerrainAnchorState(int i) {
            this.nativeCode = i;
        }

        public static TerrainAnchorState forNumber(int i) {
            for (TerrainAnchorState terrainAnchorState : values()) {
                if (terrainAnchorState.nativeCode == i) {
                    return terrainAnchorState;
                }
            }
            throw new FatalException("Unexpected value for native TerrainAnchorState, value=" + i);
        }

        public boolean isError() {
            return this.nativeCode < 0;
        }
    }

    protected Anchor() {
        this.session = null;
        this.nativeHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    public Anchor(long j, Session session2) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private native void nativeDetach(long j, long j2);

    private native String nativeGetCloudAnchorId(long j, long j2);

    private native int nativeGetCloudAnchorState(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTerrainAnchorState(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private static native void nativeReleaseAnchor(long j, long j2);

    public void detach() {
        nativeDetach(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Anchor) && ((Anchor) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseAnchor(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public String getCloudAnchorId() {
        return nativeGetCloudAnchorId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public CloudAnchorState getCloudAnchorState() {
        return CloudAnchorState.forNumber(nativeGetCloudAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TerrainAnchorState getTerrainAnchorState() {
        return TerrainAnchorState.forNumber(nativeGetTerrainAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }
}
