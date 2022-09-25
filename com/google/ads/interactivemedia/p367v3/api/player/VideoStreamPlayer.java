package com.google.ads.interactivemedia.p367v3.api.player;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer */
/* compiled from: PG */
public interface VideoStreamPlayer extends ContentProgressProvider, VolumeProvider {

    /* renamed from: com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer$VideoStreamPlayerCallback */
    /* compiled from: PG */
    public interface VideoStreamPlayerCallback {
        void onContentComplete();

        void onPause();

        void onResume();

        void onUserTextReceived(String str);

        void onVolumeChanged(int i);
    }

    void addCallback(VideoStreamPlayerCallback videoStreamPlayerCallback);

    void loadUrl(String str, List list);

    void onAdBreakEnded();

    void onAdBreakStarted();

    void onAdPeriodEnded();

    void onAdPeriodStarted();

    void pause();

    void removeCallback(VideoStreamPlayerCallback videoStreamPlayerCallback);

    void resume();

    void seek(long j);
}
