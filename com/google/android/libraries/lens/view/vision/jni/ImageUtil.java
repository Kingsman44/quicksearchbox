package com.google.android.libraries.lens.view.vision.jni;

import java.nio.ByteBuffer;

/* compiled from: PG */
public final class ImageUtil {
    private ImageUtil() {
    }

    public static native int nativeARGBExtractAlpha(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);
}
