package com.google.mediapipe.framework;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: PG */
public class PacketCreator {

    /* renamed from: a */
    public Graph f169365a;

    public PacketCreator(Graph graph) {
        this.f169365a = graph;
    }

    private native long nativeCreateBool(long j, boolean z);

    private native long nativeCreateCalculatorOptions(long j, byte[] bArr);

    private native long nativeCreateCameraIntrinsics(long j, float f, float f2, float f3, float f4, float f5, float f6);

    private native long nativeCreateCpuImage(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    private native long nativeCreateFloat32(long j, float f);

    private native long nativeCreateFloat32Array(long j, float[] fArr);

    private native long nativeCreateFloat32Vector(long j, float[] fArr);

    private native long nativeCreateFloat64(long j, double d);

    private native long nativeCreateFloatImageFrame(long j, FloatBuffer floatBuffer, int i, int i2);

    private native long nativeCreateGpuImage(long j, int i, int i2, int i3, TextureReleaseCallback textureReleaseCallback);

    private native long nativeCreateGrayscaleImage(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long nativeCreateInputFrameSource(long j, int i);

    private native long nativeCreateInt16(long j, short s);

    private native long nativeCreateInt32(long j, int i);

    private native long nativeCreateInt32Array(long j, int[] iArr);

    private native long nativeCreateInt64(long j, long j2);

    private native long nativeCreateMatrix(long j, int i, int i2, float[] fArr);

    private native long nativeCreateProto(long j, ProtoUtil$SerializedMessage protoUtil$SerializedMessage);

    private native long nativeCreateReferencePacket(long j, long j2);

    private native long nativeCreateRgbImage(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long nativeCreateRgbImageFromRgba(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long nativeCreateRgbaImageFrame(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long nativeCreateString(long j, String str);

    private native long nativeCreateStringFromByteArray(long j, byte[] bArr);

    private native long nativeCreateTimeSeriesHeader(long j, int i, double d);

    private native long nativeCreateVideoHeader(long j, int i, int i2);

    private void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
        textureReleaseCallback.release(new GraphGlSyncToken(j));
    }

    public native long nativeCreateAudioPacket(long j, byte[] bArr, int i, int i2, int i3);

    public native long nativeCreateAudioPacketDirect(long j, ByteBuffer byteBuffer, int i, int i2);

    public native long nativeCreateGpuBuffer(long j, int i, int i2, int i3, TextureReleaseCallback textureReleaseCallback);
}
