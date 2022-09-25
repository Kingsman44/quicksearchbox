package com.google.ads.interactivemedia.p367v3.impl.data;

import com.evernote.android.state.BuildConfig;
import com.google.ads.interactivemedia.p367v3.internal.arn;
import com.google.ads.interactivemedia.p367v3.internal.arx;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.l */
/* compiled from: PG */
final class C6764l extends C6757e {
    private Integer bitrate;
    private Boolean disableUi;
    private Boolean enableFocusSkipButton;
    private Boolean enablePreloading;
    private Integer loadVideoTimeout;
    private arn mimeTypes;
    private Double playAdsAfterTime;
    private arx uiElements;

    public C6764l() {
    }

    private C6764l(C6758f fVar) {
        this.bitrate = Integer.valueOf(fVar.bitrate());
        this.mimeTypes = fVar.mimeTypes();
        this.uiElements = fVar.uiElements();
        this.enablePreloading = Boolean.valueOf(fVar.enablePreloading());
        this.enableFocusSkipButton = Boolean.valueOf(fVar.enableFocusSkipButton());
        this.playAdsAfterTime = Double.valueOf(fVar.playAdsAfterTime());
        this.disableUi = Boolean.valueOf(fVar.disableUi());
        this.loadVideoTimeout = Integer.valueOf(fVar.loadVideoTimeout());
    }

    public C6758f build() {
        String str = this.bitrate == null ? " bitrate" : BuildConfig.FLAVOR;
        if (this.enablePreloading == null) {
            str = str.concat(" enablePreloading");
        }
        if (this.enableFocusSkipButton == null) {
            str = String.valueOf(str).concat(" enableFocusSkipButton");
        }
        if (this.playAdsAfterTime == null) {
            str = String.valueOf(str).concat(" playAdsAfterTime");
        }
        if (this.disableUi == null) {
            str = String.valueOf(str).concat(" disableUi");
        }
        if (this.loadVideoTimeout == null) {
            str = String.valueOf(str).concat(" loadVideoTimeout");
        }
        if (str.isEmpty()) {
            return new C6765m(this.bitrate.intValue(), this.mimeTypes, this.uiElements, this.enablePreloading.booleanValue(), this.enableFocusSkipButton.booleanValue(), this.playAdsAfterTime.doubleValue(), this.disableUi.booleanValue(), this.loadVideoTimeout.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public C6757e setBitrate(int i) {
        this.bitrate = Integer.valueOf(i);
        return this;
    }

    public C6757e setDisableUi(boolean z) {
        this.disableUi = Boolean.valueOf(z);
        return this;
    }

    public C6757e setEnableFocusSkipButton(boolean z) {
        this.enableFocusSkipButton = Boolean.valueOf(z);
        return this;
    }

    public C6757e setEnablePreloading(boolean z) {
        this.enablePreloading = Boolean.valueOf(z);
        return this;
    }

    public C6757e setLoadVideoTimeout(int i) {
        this.loadVideoTimeout = Integer.valueOf(i);
        return this;
    }

    public C6757e setMimeTypes(List list) {
        this.mimeTypes = list == null ? null : arn.m19405l(list);
        return this;
    }

    public C6757e setPlayAdsAfterTime(double d) {
        this.playAdsAfterTime = Double.valueOf(d);
        return this;
    }

    public C6757e setUiElements(Set set) {
        this.uiElements = set == null ? null : arx.m19441j(set);
        return this;
    }
}
