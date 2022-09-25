package com.google.research.xeno.effect;

import java.util.HashMap;
import java.util.concurrent.Executors;

/* compiled from: PG */
public class RemoteAssetManager {

    /* compiled from: PG */
    public interface FetchCallback {
        void onCompletion(String str, String str2);
    }

    static {
        new HashMap();
        Executors.newSingleThreadExecutor();
    }

    private static native long nativeCreateRemoteAssetManager(String str, long j, AssetDownloader assetDownloader, String str2);

    private static native long nativeFetchAsset(long j, String str, FetchCallback fetchCallback);

    private static native String nativeGetExpectedCachedAssetPath(String str, String str2);
}
