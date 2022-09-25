package androidx.media.filterpacks.image;

import androidx.media.filterfw.C2429a;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class GaussianFilter7x7 extends C2429a {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean blur(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
