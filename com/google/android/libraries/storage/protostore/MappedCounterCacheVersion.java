package com.google.android.libraries.storage.protostore;

/* compiled from: PG */
public final class MappedCounterCacheVersion {

    /* renamed from: a */
    public final long f112175a;

    public MappedCounterCacheVersion(long j) {
        this.f112175a = j;
    }

    static native int nativeFileTruncate(int i);

    public static native int nativeGetCounter(long j);

    public static native int nativeIncrementCounter(long j);

    static native long nativeMmap(int i, boolean z);
}
