package androidx.media.filterpacks.image;

import androidx.media.filterfw.C2429a;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class ToRgbValuesFilter extends C2429a {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean toRgbValues(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
