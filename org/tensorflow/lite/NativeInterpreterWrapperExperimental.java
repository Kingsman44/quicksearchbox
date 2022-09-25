package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* compiled from: PG */
final class NativeInterpreterWrapperExperimental extends NativeInterpreterWrapper {
    public NativeInterpreterWrapperExperimental(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    private static native void resetVariableTensors(long j, long j2);
}
