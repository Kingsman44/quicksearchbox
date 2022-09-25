package com.google.research.xeno.effect.internal;

import com.google.research.xeno.effect.AssetDownloader;

/* compiled from: PG */
class NativeAssetDownloadCallback implements AssetDownloader.DownloadCallback {

    /* renamed from: a */
    private final long f180582a;

    public NativeAssetDownloadCallback(long j) {
        this.f180582a = j;
    }

    private native void nativeFulfillAssetDownload(long j, String str, String str2);

    public final void onCompletion(String str, String str2) {
        nativeFulfillAssetDownload(this.f180582a, str, str2);
    }
}
