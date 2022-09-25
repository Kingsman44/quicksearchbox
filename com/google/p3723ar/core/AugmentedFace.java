package com.google.p3723ar.core;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Collection;

/* renamed from: com.google.ar.core.AugmentedFace */
/* compiled from: PG */
public class AugmentedFace extends TrackableBase {
    private static final String TAG = "ARCore-AugmentedFace";
    private FloatBuffer normalsBuffer;
    private FloatBuffer textureCoordinatesBuffer;
    private ShortBuffer triangleIndicesBuffer;
    private FloatBuffer verticesBuffer;

    /* renamed from: com.google.ar.core.AugmentedFace$RegionType */
    /* compiled from: PG */
    public enum RegionType {
        NOSE_TIP(0),
        FOREHEAD_LEFT(1),
        FOREHEAD_RIGHT(2);
        
        final int nativeCode;

        private RegionType(int i) {
            this.nativeCode = i;
        }
    }

    protected AugmentedFace() {
        super(0, (Session) null);
    }

    private native void nativeGetBoundingRectangle(long j, long j2, float[] fArr, int i);

    private native Pose nativeGetCenterPose(long j, long j2);

    private native float nativeGetConfidenceValue(long j, long j2);

    private native void nativeGetLandmarks(long j, long j2, float[] fArr, int i);

    private native ByteBuffer nativeGetMeshNormalsByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshTextureCoordinatesByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshTriangleIndicesByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshVerticesByteBuffer(long j, long j2);

    private native Pose nativeGetRegionPose(long j, long j2, int i);

    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public void getBoundingRectangle(float[] fArr, int i) {
        nativeGetBoundingRectangle(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
    }

    public Pose getCenterPose() {
        return nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getConfidenceValue() {
        return nativeGetConfidenceValue(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void getLandmarks(float[] fArr, int i) {
        nativeGetLandmarks(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
    }

    public FloatBuffer getMeshNormals() {
        return this.normalsBuffer;
    }

    public FloatBuffer getMeshTextureCoordinates() {
        return this.textureCoordinatesBuffer;
    }

    public ShortBuffer getMeshTriangleIndices() {
        return this.triangleIndicesBuffer;
    }

    public FloatBuffer getMeshVertices() {
        return this.verticesBuffer;
    }

    public Pose getRegionPose(RegionType regionType) {
        return nativeGetRegionPose(this.session.nativeWrapperHandle, this.nativeHandle, regionType.nativeCode);
    }

    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public void populateMeshData() {
        this.verticesBuffer = Session.directByteBufferOrDefault(nativeGetMeshVerticesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.normalsBuffer = Session.directByteBufferOrDefault(nativeGetMeshNormalsByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.textureCoordinatesBuffer = Session.directByteBufferOrDefault(nativeGetMeshTextureCoordinatesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.triangleIndicesBuffer = Session.directByteBufferOrDefault(nativeGetMeshTriangleIndicesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asShortBuffer();
    }

    public AugmentedFace(long j, Session session) {
        super(j, session);
        populateMeshData();
    }
}
