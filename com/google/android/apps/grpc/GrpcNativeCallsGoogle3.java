package com.google.android.apps.grpc;

/* compiled from: PG */
final class GrpcNativeCallsGoogle3 {
    GrpcNativeCallsGoogle3() {
    }

    private static native int nativeGetGrpcSocketFd(String str);

    private static native void nativeGrpcIpcSocketClientOnError(long j);

    private static native void nativeGrpcIpcSocketClientOnFileDescriptor(long j, int i);
}
