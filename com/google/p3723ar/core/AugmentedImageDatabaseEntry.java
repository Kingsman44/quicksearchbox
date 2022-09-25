package com.google.p3723ar.core;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.core.AugmentedImageDatabaseEntry */
/* compiled from: PG */
public class AugmentedImageDatabaseEntry {
    final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public AugmentedImageDatabaseEntry(Session session2) {
        this.session = session2;
        this.nativeHandle = nativeCreate(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    private static native long nativeCreate(long j);

    private static native long nativeCreateFromImage(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    private static native long nativeCreateWithAspectRatio(long j, float f);

    private static native long nativeDeserialize(long j, ByteBuffer byteBuffer);

    private native String nativeGetName(long j, long j2);

    private native float nativeGetWidthInMeters(long j, long j2);

    private static native void nativeRelease(long j, long j2);

    private native void nativeSetDetectedRegionAtTime(long j, long j2, long j3, Object obj, int i);

    private native void nativeSetName(long j, long j2, String str);

    private native void nativeSetWidthInMeters(long j, long j2, float f);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeRelease(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public String getName() {
        return nativeGetName(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getWidthInMeters() {
        return nativeGetWidthInMeters(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public AugmentedImageDatabaseEntry setDetectedRegionAtTime(long j, float[] fArr, Coordinates2d coordinates2d) {
        nativeSetDetectedRegionAtTime(this.session.nativeWrapperHandle, this.nativeHandle, j, fArr, coordinates2d.nativeCode);
        return this;
    }

    public AugmentedImageDatabaseEntry setName(String str) {
        nativeSetName(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    public AugmentedImageDatabaseEntry setWidthInMeters(float f) {
        nativeSetWidthInMeters(this.session.nativeWrapperHandle, this.nativeHandle, f);
        return this;
    }

    public AugmentedImageDatabaseEntry(Session session2, float f) {
        this.session = session2;
        this.nativeHandle = nativeCreateWithAspectRatio(session2.nativeWrapperHandle, f);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public AugmentedImageDatabaseEntry(Session session2, Bitmap bitmap) {
        this.session = session2;
        this.nativeHandle = nativeCreateFromImage(session2.nativeWrapperHandle, AugmentedImageDatabase.convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth());
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public AugmentedImageDatabaseEntry(Session session2, ByteBuffer byteBuffer) {
        this.session = session2;
        this.nativeHandle = nativeDeserialize(session2.nativeWrapperHandle, byteBuffer);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
