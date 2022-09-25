package androidx.media.filterpacks.image;

import androidx.media.filterfw.C2429a;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class HarrisCornerFilter extends C2429a {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean markCorners(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
