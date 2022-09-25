package com.google.research.xeno.effect;

/* compiled from: PG */
public interface AssetDownloader {

    /* compiled from: PG */
    public interface DownloadCallback {
        void onCompletion(String str, String str2);
    }

    void downloadAsset(String str, DownloadCallback downloadCallback);
}
