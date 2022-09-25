package com.google.ads.interactivemedia.p367v3.impl.data;

import com.evernote.android.state.BuildConfig;
import com.google.ads.interactivemedia.p367v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.p367v3.internal.ars;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.al */
/* compiled from: PG */
final class C6719al implements TestingConfiguration.Builder {
    private Boolean disableExperiments;
    private Boolean disableOnScreenDetection;
    private Boolean disableSkipFadeTransition;
    private Boolean enableMonitorAppLifecycle;
    private ars extraParams;
    private Boolean forceTvMode;
    private Boolean ignoreStrictModeFalsePositives;
    private Boolean useTestStreamManager;
    private Boolean useVideoElementMock;
    private Float videoElementMockDuration;

    public TestingConfiguration build() {
        String str = this.disableExperiments == null ? " disableExperiments" : BuildConfig.FLAVOR;
        if (this.disableOnScreenDetection == null) {
            str = str.concat(" disableOnScreenDetection");
        }
        if (this.disableSkipFadeTransition == null) {
            str = String.valueOf(str).concat(" disableSkipFadeTransition");
        }
        if (this.useVideoElementMock == null) {
            str = String.valueOf(str).concat(" useVideoElementMock");
        }
        if (this.videoElementMockDuration == null) {
            str = String.valueOf(str).concat(" videoElementMockDuration");
        }
        if (this.useTestStreamManager == null) {
            str = String.valueOf(str).concat(" useTestStreamManager");
        }
        if (this.enableMonitorAppLifecycle == null) {
            str = String.valueOf(str).concat(" enableMonitorAppLifecycle");
        }
        if (this.forceTvMode == null) {
            str = String.valueOf(str).concat(" forceTvMode");
        }
        if (this.ignoreStrictModeFalsePositives == null) {
            str = String.valueOf(str).concat(" ignoreStrictModeFalsePositives");
        }
        if (str.isEmpty()) {
            return new C6720am(this.disableExperiments.booleanValue(), this.disableOnScreenDetection.booleanValue(), this.disableSkipFadeTransition.booleanValue(), this.useVideoElementMock.booleanValue(), this.videoElementMockDuration.floatValue(), this.useTestStreamManager.booleanValue(), this.enableMonitorAppLifecycle.booleanValue(), this.forceTvMode.booleanValue(), this.ignoreStrictModeFalsePositives.booleanValue(), this.extraParams);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public TestingConfiguration.Builder disableExperiments(boolean z) {
        this.disableExperiments = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder disableOnScreenDetection(boolean z) {
        this.disableOnScreenDetection = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder disableSkipFadeTransition(boolean z) {
        this.disableSkipFadeTransition = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder enableMonitorAppLifecycle(boolean z) {
        this.enableMonitorAppLifecycle = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder extraParams(ars ars) {
        this.extraParams = ars;
        return this;
    }

    public TestingConfiguration.Builder forceTvMode(boolean z) {
        this.forceTvMode = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder ignoreStrictModeFalsePositives(boolean z) {
        this.ignoreStrictModeFalsePositives = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder useTestStreamManager(boolean z) {
        this.useTestStreamManager = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder useVideoElementMock(boolean z) {
        this.useVideoElementMock = Boolean.valueOf(z);
        return this;
    }

    public TestingConfiguration.Builder videoElementMockDuration(float f) {
        this.videoElementMockDuration = Float.valueOf(f);
        return this;
    }
}
