package androidx.media.filterpacks.image;

import androidx.media.filterfw.C2429a;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class StructureTensor2DFilter extends C2429a {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean constructStructureTensor(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);
}
