package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p367v3.internal.aps;
import com.google.ads.interactivemedia.p367v3.internal.arn;
import com.google.ads.interactivemedia.p367v3.internal.arx;

@aps(mo15153a = C6765m.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.f */
/* compiled from: PG */
public abstract class C6758f {
    public static C6757e builder(AdsRenderingSettings adsRenderingSettings) {
        C6759g gVar = (C6759g) adsRenderingSettings;
        C6764l lVar = new C6764l();
        lVar.setBitrate(gVar.getBitrateKbps());
        lVar.setDisableUi(gVar.getDisableUi());
        lVar.setEnablePreloading(gVar.getEnablePreloading());
        lVar.setEnableFocusSkipButton(gVar.getFocusSkipButtonWhenAvailable());
        lVar.setLoadVideoTimeout(gVar.getLoadVideoTimeout());
        lVar.setMimeTypes(gVar.getMimeTypes());
        lVar.setPlayAdsAfterTime(gVar.getPlayAdsAfterTime());
        lVar.setUiElements(gVar.getUiElements());
        return lVar;
    }

    public abstract int bitrate();

    public abstract boolean disableUi();

    public abstract boolean enableFocusSkipButton();

    public abstract boolean enablePreloading();

    public abstract int loadVideoTimeout();

    public abstract arn mimeTypes();

    public abstract double playAdsAfterTime();

    /* access modifiers changed from: package-private */
    public abstract C6757e toBuilder();

    public abstract arx uiElements();
}
