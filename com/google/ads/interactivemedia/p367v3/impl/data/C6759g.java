package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p367v3.internal.auj;
import com.google.ads.interactivemedia.p367v3.internal.aul;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.g */
/* compiled from: PG */
public final class C6759g implements AdsRenderingSettings {
    private int bitrate = -1;
    private boolean disableUi = false;
    private boolean enableFocusSkipButton = true;
    private boolean enablePreloading;
    private int loadVideoTimeout = -1;
    private List mimeTypes = null;
    private double playAdsAfterTime = -1.0d;
    private Set uiElements;

    public boolean equals(Object obj) {
        return auj.m19669c(this, obj, new String[0]);
    }

    public int getBitrateKbps() {
        return this.bitrate;
    }

    public boolean getDisableUi() {
        return this.disableUi;
    }

    public boolean getEnablePreloading() {
        return this.enablePreloading;
    }

    public boolean getFocusSkipButtonWhenAvailable() {
        return this.enableFocusSkipButton;
    }

    public int getLoadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    public List getMimeTypes() {
        return this.mimeTypes;
    }

    public double getPlayAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    public Set getUiElements() {
        return this.uiElements;
    }

    public int hashCode() {
        return aul.m19677b(this, new String[0]);
    }

    public void setBitrateKbps(int i) {
        this.bitrate = i;
    }

    public void setDisableUi(boolean z) {
        this.disableUi = z;
    }

    public void setEnablePreloading(boolean z) {
        this.enablePreloading = z;
    }

    public void setFocusSkipButtonWhenAvailable(boolean z) {
        this.enableFocusSkipButton = z;
    }

    public void setLoadVideoTimeout(int i) {
        this.loadVideoTimeout = i;
    }

    public void setMimeTypes(List list) {
        this.mimeTypes = list;
    }

    public void setPlayAdsAfterTime(double d) {
        this.playAdsAfterTime = d;
    }

    public void setUiElements(Set set) {
        this.uiElements = set;
    }
}
