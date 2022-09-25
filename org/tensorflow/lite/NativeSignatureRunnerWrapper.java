package org.tensorflow.lite;

/* compiled from: PG */
final class NativeSignatureRunnerWrapper {
    private static native void nativeAllocateTensors(long j, long j2);

    private static native int nativeGetInputIndex(long j, String str);

    private static native int nativeGetOutputIndex(long j, String str);

    private static native long nativeGetSignatureRunner(long j, String str);

    private static native int nativeGetSubgraphIndex(long j);

    private static native String[] nativeInputNames(long j);

    private static native void nativeInvoke(long j, long j2);

    private static native String[] nativeOutputNames(long j);

    private static native boolean nativeResizeInput(long j, long j2, String str, int[] iArr);
}
