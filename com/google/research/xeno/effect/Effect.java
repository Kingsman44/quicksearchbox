package com.google.research.xeno.effect;

import java.util.Map;

/* compiled from: PG */
public class Effect {

    /* compiled from: PG */
    interface NativeLoadCallback {
        void onCompletion(long j, String str);
    }

    private native Map nativeGetControls(long j);

    private native int nativeGetMaxFramesInFlight(long j);

    private static native void nativeLoadDeprecated(byte[] bArr, AssetManager assetManager, NativeLoadCallback nativeLoadCallback);

    private static native void nativeLoadWithRemoteAssetManager(byte[] bArr, long j, String str, NativeLoadCallback nativeLoadCallback);

    private native void nativeRelease(long j);
}
