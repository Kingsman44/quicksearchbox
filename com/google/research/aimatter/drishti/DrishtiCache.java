package com.google.research.aimatter.drishti;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public class DrishtiCache {

    /* renamed from: a */
    public final long f180555a = nativeCreateCache();

    /* renamed from: b */
    public final AtomicBoolean f180556b = new AtomicBoolean(true);

    private native void nativeClearCache(long j);

    private native long nativeCreateCache();

    private native void nativeReleaseCache(long j);
}
