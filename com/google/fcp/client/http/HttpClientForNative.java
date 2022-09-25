package com.google.fcp.client.http;

import java.io.Closeable;

/* compiled from: PG */
public abstract class HttpClientForNative implements Closeable {

    /* compiled from: PG */
    public abstract class HttpRequestHandle implements Closeable {
        public volatile long nativeHandle = 0;

        public abstract void close();

        public abstract byte[] getTotalSentReceivedBytes();
    }

    public static native boolean onResponseBody(long j, byte[] bArr, int i);

    public static native void onResponseBodyError(long j, byte[] bArr);

    public static native void onResponseCompleted(long j);

    public static native void onResponseError(long j, byte[] bArr);

    public static native boolean onResponseStarted(long j, byte[] bArr);

    public static native boolean readRequestBody(long j, byte[] bArr, long j2, int[] iArr);

    public abstract void close();

    public abstract HttpRequestHandle enqueueRequest(byte[] bArr);

    public abstract byte[] performRequests(Object[] objArr);
}
