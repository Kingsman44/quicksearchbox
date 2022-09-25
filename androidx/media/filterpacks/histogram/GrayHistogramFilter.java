package androidx.media.filterpacks.histogram;

import androidx.media.filterfw.C2429a;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* compiled from: PG */
public final class GrayHistogramFilter extends C2429a {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void extractHistogram(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, IntBuffer intBuffer);
}
