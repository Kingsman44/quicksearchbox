package com.google.p3723ar.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* renamed from: com.google.ar.core.AugmentedImageDatabase */
/* compiled from: PG */
public class AugmentedImageDatabase {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public AugmentedImageDatabase(Session session2) {
        this(session2, nativeCreate(session2.nativeWrapperHandle));
    }

    static ByteBuffer convertBitmapToGrayscaleDirectBuffer(Bitmap bitmap) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getWidth() * bitmap.getHeight());
        for (int i = 0; i < bitmap.getHeight(); i++) {
            for (int i2 = 0; i2 < bitmap.getWidth(); i2++) {
                allocateDirect.put((bitmap.getWidth() * i) + i2, (byte) Color.red(createBitmap.getPixel(i2, i)));
            }
        }
        return allocateDirect;
    }

    public static AugmentedImageDatabase deserialize(Session session2, InputStream inputStream) {
        return new AugmentedImageDatabase(session2, nativeDeserialize(session2.nativeWrapperHandle, loadDirectByteBuffer(inputStream)));
    }

    private static ByteBuffer loadDirectByteBuffer(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArray.length);
                allocateDirect.put(byteArray);
                return allocateDirect;
            }
        }
    }

    private native int nativeAddImage(long j, long j2, String str, ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativeAddImageEntry(long j, long j2, long j3);

    private native int nativeAddImageWithPhysicalSize(long j, long j2, String str, ByteBuffer byteBuffer, int i, int i2, int i3, float f);

    private static native long nativeCreate(long j);

    private static native long nativeDeserialize(long j, ByteBuffer byteBuffer);

    private native int nativeGetNumImages(long j, long j2);

    private native void nativeReleaseDatabase(long j, long j2);

    private native ByteBuffer nativeSerialize(long j, long j2);

    private native void nativeSetDetectedRegionAtTime(long j, long j2, int i, long j3, Object obj, int i2);

    private native void nativeStopTrackingImage(long j, long j2, int i);

    public int addImage(String str, Bitmap bitmap) {
        return nativeAddImage(this.session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth());
    }

    public int addImageEntry(AugmentedImageDatabaseEntry augmentedImageDatabaseEntry) {
        return nativeAddImageEntry(this.session.nativeWrapperHandle, this.nativeHandle, augmentedImageDatabaseEntry.nativeHandle);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseDatabase(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public int getNumImages() {
        return nativeGetNumImages(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void serialize(OutputStream outputStream) {
        Channels.newChannel(outputStream).write(nativeSerialize(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public void setDetectedRegionAtTime(int i, long j, float[] fArr, Coordinates2d coordinates2d) {
        nativeSetDetectedRegionAtTime(this.session.nativeWrapperHandle, this.nativeHandle, i, j, fArr, coordinates2d.nativeCode);
    }

    public void stopTrackingImage(int i) {
        nativeStopTrackingImage(this.session.nativeWrapperHandle, this.nativeHandle, i);
    }

    public AugmentedImageDatabase(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public int addImage(String str, Bitmap bitmap, float f) {
        return nativeAddImageWithPhysicalSize(this.session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth(), f);
    }
}
