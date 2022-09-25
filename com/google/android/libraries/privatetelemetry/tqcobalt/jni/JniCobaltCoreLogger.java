package com.google.android.libraries.privatetelemetry.tqcobalt.jni;

import java.nio.ByteBuffer;

/* compiled from: PG */
public final class JniCobaltCoreLogger implements C32026a {
    static {
        System.loadLibrary("android_cobalt_core_wrapper");
    }

    private static native int generateObservations(ByteBuffer byteBuffer);

    private static native int logCustom(ByteBuffer byteBuffer);

    private static native int logHistogram(ByteBuffer byteBuffer);

    private static native int logInteger(ByteBuffer byteBuffer);

    private static native int logOccurrence(ByteBuffer byteBuffer);

    private static native int logString(ByteBuffer byteBuffer);

    /* renamed from: a */
    public final int mo37805a(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return generateObservations(allocateDirect);
    }

    /* renamed from: b */
    public final int mo37806b(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return logCustom(allocateDirect);
    }

    /* renamed from: c */
    public final int mo37807c(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return logHistogram(allocateDirect);
    }

    /* renamed from: d */
    public final int mo37808d(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return logInteger(allocateDirect);
    }

    /* renamed from: e */
    public final int mo37809e(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return logOccurrence(allocateDirect);
    }

    /* renamed from: f */
    public final int mo37810f(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return logString(allocateDirect);
    }
}
