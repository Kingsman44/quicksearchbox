package com.google.research.xeno.effect.internal;

import com.google.research.xeno.effect.AssetManager;
import java.util.Map;

/* compiled from: PG */
class NativeAssetFetchCallback implements AssetManager.FetchCallback {

    /* renamed from: a */
    private final long f180583a;

    public NativeAssetFetchCallback(long j) {
        this.f180583a = j;
    }

    private native void nativeFulfillFetchRequest(long j, Map map, Map map2);

    public final void onCompletion(Map map, Map map2) {
        nativeFulfillFetchRequest(this.f180583a, map, map2);
    }
}
