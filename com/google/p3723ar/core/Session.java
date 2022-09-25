package com.google.p3723ar.core;

import android.content.Context;
import android.net.Uri;
import com.google.p3723ar.core.Config;
import com.google.p3723ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.google.ar.core.Session */
/* compiled from: PG */
public class Session {
    private static final String TAG = "ARCore-Session";
    final C47906l faceCache;
    final long nativeSymbolTableHandle;
    long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    /* renamed from: com.google.ar.core.Session$Feature */
    /* compiled from: PG */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000),
        DO_NOT_USE_ACTIVE_DEPTH_SENSOR(5),
        MOTION_TRACKING_ODOMETRY(6),
        HIT_TEST_WITH_DEPTH(7),
        DEPTH_IMAGE_USES_GEO_FACADES(14);
        
        final int nativeCode;

        private Feature(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Session$FeatureMapQuality */
    /* compiled from: PG */
    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);
        
        final int nativeCode;

        private FeatureMapQuality(int i) {
            this.nativeCode = i;
        }

        static FeatureMapQuality forNumber(int i) {
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i) {
                    return featureMapQuality;
                }
            }
            throw new FatalException("Unexpected value for native FeatureMapQuality, value=" + i);
        }
    }

    /* renamed from: com.google.ar.core.Session$RandomAccessType */
    /* compiled from: PG */
    public enum RandomAccessType {
        DEFAULT(0),
        OFF(1),
        ON(2);
        
        final int nativeCode;

        private RandomAccessType(int i) {
            this.nativeCode = i;
        }

        public static RandomAccessType forNumber(int i) {
            for (RandomAccessType randomAccessType : values()) {
                if (randomAccessType.nativeCode == i) {
                    return randomAccessType;
                }
            }
            throw new FatalException("Unexpected value for native RandomAccessType, value=" + i);
        }
    }

    protected Session() {
        this.faceCache = new C47906l();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    @Deprecated
    public static Session createForSharedCamera(Context context) {
        return new Session(context, (Set) EnumSet.of(Feature.SHARED_CAMERA));
    }

    static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    static void loadDynamicSymbolsAfterSessionCreate() {
        ArImage.nativeLoadSymbols();
        ImageMetadata.nativeLoadSymbols();
    }

    private native long[] nativeAcquireAllAnchors(long j);

    private native long nativeAcquireEarth(long j);

    private native int nativeCheckModuleAvailability(long j, int i);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    private native long nativeCreateAugmentedRegion(long j, float[] fArr);

    private native long nativeCreateAugmentedRegionWithConfig(long j, float[] fArr, long j2);

    private native long[] nativeCreateAugmentedRegions(long j, long[] jArr, int i);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    private static native long nativeCreateSessionAndWrapperWithSettings(Context context, String str);

    private static native long nativeCreateSessionAndWrapperWithSettingsProto(Context context, byte[] bArr, String str);

    static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native void nativeEnableIncognitoMode(long j);

    private native int nativeEstimateFeatureMapQualityForHosting(long j, Pose pose);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native void nativeGetDebugSessionIdLongs(long j, long[] jArr);

    private native int nativeGetFrameDelay(long j);

    private native int nativeGetPlaybackStatus(long j);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native int nativeGetRecordingStatus(long j);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native long nativeHostCloudAnchorWithTtl(long j, long j2, int i);

    private native void nativeInjectImage(long j, long j2, long j3, int i, int i2, ByteBuffer byteBuffer, int i3, int i4);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeRequestModuleInstallDeferred(long j, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j, int[] iArr);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native void nativeResume(long j);

    private native void nativeSetAnalyticsPolicy(long j, String str);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCameraTextureNames(long j, int[] iArr);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetExternalDownsampleFactor(long j, float f);

    private native void nativeSetPlaybackDataset(long j, String str);

    private native void nativeSetPlaybackDatasetUri(long j, String str);

    private native void nativeStartRecording(long j, long j2);

    private native void nativeStopRecording(long j);

    private native void nativeUpdate(long j, long j2);

    private native void nativeUpdateWithImage(long j, long j2, long j3, int i, int i2, ByteBuffer byteBuffer, int i3, int i4);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            sharedCamera2.pause();
        }
    }

    static void throwExceptionFromArStatus(int i) {
        throwExceptionFromArStatus((String) null, i, (String[]) null, (int[]) null);
    }

    public ModuleAvailability checkModuleAvailability(Module module) {
        return ModuleAvailability.forNumber(nativeCheckModuleAvailability(this.nativeWrapperHandle, module.nativeCode));
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    public Collection convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long anchor : jArr) {
            arrayList.add(new Anchor(anchor, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Collection convertNativeAugmentedRegionsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long augmentedRegion : jArr) {
            arrayList.add(new AugmentedRegion(augmentedRegion, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long cameraConfig : jArr) {
            arrayList.add(new CameraConfig(this, cameraConfig));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Collection convertNativeTrackDataToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long trackData : jArr) {
            arrayList.add(new TrackData(trackData, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Collection convertNativeTrackablesToCollection(Class cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long createTrackable : jArr) {
            Trackable createTrackable2 = createTrackable(createTrackable);
            if (createTrackable2 != null) {
                arrayList.add((Trackable) cls.cast(createTrackable2));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    public AugmentedRegion createAugmentedRegion(float[] fArr) {
        return new AugmentedRegion(nativeCreateAugmentedRegion(this.nativeWrapperHandle, fArr), this);
    }

    public AugmentedRegion createAugmentedRegionWithConfig(float[] fArr, AugmentedRegionConfig augmentedRegionConfig) {
        return new AugmentedRegion(nativeCreateAugmentedRegionWithConfig(this.nativeWrapperHandle, fArr, augmentedRegionConfig.nativeHandle), this);
    }

    public Collection createAugmentedRegions(AugmentedRegionConfig[] augmentedRegionConfigArr, RandomAccessType randomAccessType) {
        long[] jArr = new long[augmentedRegionConfigArr.length];
        for (int i = 0; i < augmentedRegionConfigArr.length; i++) {
            jArr[i] = augmentedRegionConfigArr[i].nativeHandle;
        }
        return convertNativeAugmentedRegionsToCollection(nativeCreateAugmentedRegions(this.nativeWrapperHandle, jArr, randomAccessType.nativeCode));
    }

    public Trackable createTrackable(long j) {
        C47915u uVar;
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j);
        C47915u[] values = C47915u.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                uVar = null;
                break;
            }
            uVar = values[i];
            if (uVar.f124106k == internalGetType) {
                break;
            }
            i++;
        }
        if (uVar == null) {
            TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j);
            return null;
        }
        switch (uVar.ordinal()) {
            case 0:
            case 1:
                return null;
            case 2:
                return new Plane(j, this);
            case 3:
                return new Point(j, this);
            case 4:
                return new AugmentedImage(j, this);
            case 5:
                return this.faceCache.mo52253a(j, this);
            case 6:
                return getEarth();
            case 7:
                return new DepthPoint(j, this);
            case 8:
                return new InstantPlacementPoint(j, this);
            case 9:
                return new MagicalSurfacePoint(j, this);
            default:
                throw null;
        }
    }

    public void enableIncognitoMode() {
        nativeEnableIncognitoMode(this.nativeWrapperHandle);
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0;
        }
        super.finalize();
    }

    public Collection getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public Collection getAllTrackables(Class cls) {
        C47915u a = C47915u.m85123a(cls);
        if (a == C47915u.UNKNOWN_TO_JAVA) {
            return Collections.emptyList();
        }
        return convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, a.f124106k));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public UUID getDebugSessionId() {
        long[] jArr = new long[2];
        nativeGetDebugSessionIdLongs(this.nativeWrapperHandle, jArr);
        return new UUID(jArr[0], jArr[1]);
    }

    public Earth getEarth() {
        long nativeAcquireEarth = nativeAcquireEarth(this.nativeWrapperHandle);
        if (nativeAcquireEarth != 0) {
            return new Earth(nativeAcquireEarth, this);
        }
        return null;
    }

    public int getFrameDelay() {
        return nativeGetFrameDelay(this.nativeWrapperHandle);
    }

    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    public LatencyStats getRandomAccessStats() {
        LatencyStats latencyStats = new LatencyStats(this);
        nativeGetRandomAccessStats(this.nativeWrapperHandle, latencyStats.nativeHandle);
        return latencyStats;
    }

    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            return sharedCamera2;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    @Deprecated
    public List getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i), this);
    }

    public InjectionResult injectImage(long j, int i, int i2, ByteBuffer byteBuffer, int i3, int i4) {
        InjectionResult injectionResult = new InjectionResult(this);
        nativeInjectImage(this.nativeWrapperHandle, injectionResult.nativeHandle, j, i, i2, byteBuffer, i3, i4);
        return injectionResult;
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isDepthModeSupportedPrivate(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupportedPrivate(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isGeospatialModeSupported(Config.GeospatialMode geospatialMode) {
        return nativeIsGeospatialModeSupported(this.nativeWrapperHandle, geospatialMode.nativeCode);
    }

    public boolean isSegmentationModeSupported(Config.SegmentationMode segmentationMode) {
        return nativeIsSegmentationModeSupported(this.nativeWrapperHandle, segmentationMode.nativeCode);
    }

    /* access modifiers changed from: package-private */
    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native void nativeDestroySessionWrapper(long j);

    public native long nativeGetSessionNativeHandle(long j);

    public native boolean nativeIsDepthModeSupported(long j, int i);

    public native boolean nativeIsDepthModeSupportedPrivate(long j, int i);

    public native boolean nativeIsGeospatialModeSupported(long j, int i);

    public native boolean nativeIsSegmentationModeSupported(long j, int i);

    public native long nativeReleaseSessionOwnership(long j);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    public void requestModuleInstallDeferred(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Module) it.next()).nativeCode;
            i++;
        }
        nativeRequestModuleInstallDeferred(this.nativeWrapperHandle, iArr);
    }

    public void requestModuleInstallImmediate(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Module) it.next()).nativeCode;
            i++;
        }
        nativeRequestModuleInstallImmediate(this.nativeWrapperHandle, iArr);
    }

    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setAnalyticsPolicy(String str) {
        nativeSetAnalyticsPolicy(this.nativeWrapperHandle, str);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
        }
        nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
    }

    public void setExternalDownsampleFactor(float f) {
        nativeSetExternalDownsampleFactor(this.nativeWrapperHandle, f);
    }

    @Deprecated
    public void setPlaybackDataset(String str) {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void setPlaybackDatasetUri(Uri uri) {
        nativeSetPlaybackDatasetUri(this.nativeWrapperHandle, uri.toString());
    }

    public void startRecording(RecordingConfig recordingConfig) {
        if (recordingConfig != null) {
            nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void stopRecording() {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    public Frame updateWithImage(long j, int i, int i2, ByteBuffer byteBuffer, int i3, int i4) {
        Frame frame = new Frame(this);
        nativeUpdateWithImage(this.nativeWrapperHandle, frame.nativeHandle, j, i, i2, byteBuffer, i3, i4);
        return frame;
    }

    public Session(long j) {
        this.faceCache = new C47906l();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j);
    }

    static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) {
        int i2;
        for (C47914t tVar : C47914t.values()) {
            if (tVar.f124092G == i) {
                Class cls = tVar.f124093H;
                if (cls != null) {
                    if (strArr == null || iArr == null || (i2 = strArr.length) != iArr.length) {
                        i2 = 0;
                    }
                    String str2 = tVar.f124094I;
                    if (str2 == null && str == null) {
                        throw ((Exception) cls.getConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    if (str2 != null) {
                        if (str == null) {
                            str = str2;
                        } else {
                            str = String.valueOf(str2).concat(String.valueOf(str));
                        }
                    }
                    Exception exc = (Exception) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
                    StackTraceElement[] stackTrace = exc.getStackTrace();
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[(stackTrace.length + i2)];
                    int i3 = 0;
                    while (i3 < i2) {
                        stackTraceElementArr[i3] = new StackTraceElement("ARCore", "native", strArr[i3], iArr[i3]);
                        i3++;
                    }
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        stackTraceElementArr[i3] = stackTraceElement;
                        i3++;
                    }
                    exc.setStackTrace(stackTraceElementArr);
                    throw exc;
                }
                return;
            }
        }
        throw new FatalException("Unexpected error code: " + i);
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    public List getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter != null) {
            ArrayList arrayList = new ArrayList(r1);
            for (long cameraConfig : nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle)) {
                arrayList.add(new CameraConfig(this, cameraConfig));
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Session(Context context) {
        this(context, (Set) EnumSet.noneOf(Feature.class));
    }

    @Deprecated
    public Session(Context context, String str) {
        this.faceCache = new C47906l();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        long nativeCreateSessionAndWrapperWithSettings = nativeCreateSessionAndWrapperWithSettings(context, str);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithSettings;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithSettings);
        if (str.contains("camera_stack,java")) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    public Session(Context context, Set set) {
        this.faceCache = new C47906l();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[(set.size() + 1)];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Feature) it.next()).nativeCode;
            i++;
        }
        iArr[i] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    public Session(Context context, byte[] bArr, String str, boolean z) {
        this.faceCache = new C47906l();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        long nativeCreateSessionAndWrapperWithSettingsProto = nativeCreateSessionAndWrapperWithSettingsProto(context, bArr, str);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithSettingsProto;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithSettingsProto);
        if (z) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }
}
