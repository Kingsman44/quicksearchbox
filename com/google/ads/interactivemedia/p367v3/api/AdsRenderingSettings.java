package com.google.ads.interactivemedia.p367v3.api;

import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdsRenderingSettings */
/* compiled from: PG */
public interface AdsRenderingSettings {
    int getBitrateKbps();

    boolean getDisableUi();

    boolean getEnablePreloading();

    boolean getFocusSkipButtonWhenAvailable();

    List getMimeTypes();

    void setBitrateKbps(int i);

    void setDisableUi(boolean z);

    void setEnablePreloading(boolean z);

    void setFocusSkipButtonWhenAvailable(boolean z);

    void setLoadVideoTimeout(int i);

    void setMimeTypes(List list);

    void setPlayAdsAfterTime(double d);

    void setUiElements(Set set);
}
