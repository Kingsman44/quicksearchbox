package com.google.mediapipe.framework;

/* compiled from: PG */
public class Packet {

    /* renamed from: a */
    public long f169364a;

    private Packet(long j) {
        this.f169364a = j;
    }

    public static Packet create(long j) {
        return new Packet(j);
    }

    private native long nativeCopyPacket(long j);

    private native boolean nativeIsEmpty(long j);

    private native void nativeReleasePacket(long j);

    public long getNativeHandle() {
        return this.f169364a;
    }

    public native long nativeGetTimestamp(long j);

    public void release() {
        long j = this.f169364a;
        if (j != 0) {
            nativeReleasePacket(j);
            this.f169364a = 0;
        }
    }
}
