package androidx.media.filterpacks.histogram;

import androidx.media.filterfw.C2429a;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: PG */
public final class ChromaHistogramFilter extends C2429a {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void extractChromaHistogram(ByteBuffer byteBuffer, FloatBuffer floatBuffer, int i, int i2);
}
