package androidx.media.filterpacks.miscellaneous;

import androidx.media.filterfw.C2429a;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* compiled from: PG */
public final class AverageIntensity extends C2429a {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private native void averageIntensity(ByteBuffer byteBuffer, IntBuffer intBuffer, int i, int i2, int i3, int i4);
}
