package com.google.p3723ar.core;

/* renamed from: com.google.ar.core.EarthNetworkCallback */
/* compiled from: PG */
public class EarthNetworkCallback implements EarthNetworkCallbackInterface {
    private final long nativeHandle;

    public EarthNetworkCallback(long j) {
        this.nativeHandle = j;
    }

    private native void nativeCallback(long j, EarthNetworkCallResult earthNetworkCallResult);

    public void run(EarthNetworkCallResult earthNetworkCallResult) {
        nativeCallback(this.nativeHandle, earthNetworkCallResult);
    }
}
