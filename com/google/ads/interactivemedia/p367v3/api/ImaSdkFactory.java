package com.google.ads.interactivemedia.p367v3.api;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.p367v3.impl.data.C6732ay;
import com.google.ads.interactivemedia.p367v3.impl.data.C6733az;
import com.google.ads.interactivemedia.p367v3.impl.data.C6759g;
import com.google.ads.interactivemedia.p367v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.p367v3.internal.C6795amp;
import com.google.ads.interactivemedia.p367v3.internal.alj;
import com.google.ads.interactivemedia.p367v3.internal.alv;
import com.google.ads.interactivemedia.p367v3.internal.amb;
import com.google.ads.interactivemedia.p367v3.internal.ami;
import com.google.ads.interactivemedia.p367v3.internal.amq;
import com.google.ads.interactivemedia.p367v3.internal.anv;
import com.google.ads.interactivemedia.p367v3.internal.anx;
import com.google.ads.interactivemedia.p367v3.internal.aoh;
import com.google.ads.interactivemedia.p367v3.internal.aqd;

/* renamed from: com.google.ads.interactivemedia.v3.api.ImaSdkFactory */
/* compiled from: PG */
public class ImaSdkFactory {
    private static ImaSdkFactory instance;

    private ImaSdkFactory() {
    }

    private AdsLoader createAdsLoader(Context context, Uri uri, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, AdDisplayContainer adDisplayContainer) {
        alv alv = new alv(context, uri, imaSdkSettings, adDisplayContainer, testingConfiguration);
        alv.mo14934a();
        return alv;
    }

    @Deprecated
    public static VideoAdPlayer createSdkOwnedPlayer(Context context, ViewGroup viewGroup) {
        aqd.m19282j(context);
        aqd.m19282j(viewGroup);
        return new aoh(context, viewGroup);
    }

    public static ImaSdkFactory getInstance() {
        if (instance == null) {
            instance = new ImaSdkFactory();
        }
        return instance;
    }

    private Uri readJsCoreUri(ImaSdkSettings imaSdkSettings) {
        return (imaSdkSettings == null || !imaSdkSettings.isDebugMode()) ? C6795amp.f20986a : C6795amp.f20987b;
    }

    @Deprecated
    public AdDisplayContainer createAdDisplayContainer() {
        return new alj((ViewGroup) null, (VideoAdPlayer) null);
    }

    public AdsRenderingSettings createAdsRenderingSettings() {
        return new C6759g();
    }

    public AdsRequest createAdsRequest() {
        return new amb();
    }

    @Deprecated
    public AdDisplayContainer createAudioAdDisplayContainer(Context context) {
        aqd.m19282j(context);
        return new alj(context, (VideoAdPlayer) null);
    }

    public CompanionAdSlot createCompanionAdSlot() {
        return new ami();
    }

    public FriendlyObstruction createFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        C6732ay builder = C6733az.builder();
        builder.view(view);
        builder.purpose(friendlyObstructionPurpose);
        builder.detailedReason(str);
        return builder.build();
    }

    public ImaSdkSettings createImaSdkSettings() {
        return new amq();
    }

    public StreamRequest createLiveStreamRequest(String str, String str2) {
        anx anx = new anx();
        anx.mo15052a(str);
        anx.mo15055d(str2);
        return anx;
    }

    @Deprecated
    public StreamDisplayContainer createStreamDisplayContainer() {
        return new anv((ViewGroup) null, (VideoStreamPlayer) null);
    }

    public StreamRequest createVodStreamRequest(String str, String str2, String str3) {
        anx anx = new anx();
        anx.mo15053b(str);
        anx.mo15054c(str2);
        anx.mo15055d(str3);
        return anx;
    }

    public static AdDisplayContainer createAdDisplayContainer(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        aqd.m19282j(viewGroup);
        aqd.m19282j(videoAdPlayer);
        return new alj(viewGroup, videoAdPlayer);
    }

    public static StreamDisplayContainer createStreamDisplayContainer(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        aqd.m19282j(viewGroup);
        aqd.m19282j(videoStreamPlayer);
        return new anv(viewGroup, videoStreamPlayer);
    }

    private AdsLoader createAdsLoader(Context context, Uri uri, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, StreamDisplayContainer streamDisplayContainer) {
        alv alv = new alv(context, uri, imaSdkSettings, streamDisplayContainer, testingConfiguration);
        alv.mo14934a();
        return alv;
    }

    public static AdDisplayContainer createAudioAdDisplayContainer(Context context, VideoAdPlayer videoAdPlayer) {
        aqd.m19282j(context);
        aqd.m19282j(videoAdPlayer);
        return new alj(context, videoAdPlayer);
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        return new alv(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, adDisplayContainer, (TestingConfiguration) null);
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, StreamDisplayContainer streamDisplayContainer) {
        return new alv(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, streamDisplayContainer, (TestingConfiguration) null);
    }

    private AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, AdDisplayContainer adDisplayContainer) {
        return createAdsLoader(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, testingConfiguration, adDisplayContainer);
    }

    private AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, StreamDisplayContainer streamDisplayContainer) {
        return createAdsLoader(context, readJsCoreUri(imaSdkSettings), imaSdkSettings, testingConfiguration, streamDisplayContainer);
    }
}
