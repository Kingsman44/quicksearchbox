package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.aps;
import com.google.ads.interactivemedia.p367v3.internal.ars;

@aps(mo15153a = C6720am.class, mo15154b = {"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration */
/* compiled from: PG */
public abstract class TestingConfiguration {
    public static final String PARAMETER_KEY = "tcnfp";

    /* renamed from: com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration$Builder */
    /* compiled from: PG */
    public interface Builder {
        TestingConfiguration build();

        Builder disableExperiments(boolean z);

        Builder disableOnScreenDetection(boolean z);

        Builder disableSkipFadeTransition(boolean z);

        Builder enableMonitorAppLifecycle(boolean z);

        Builder extraParams(ars ars);

        Builder forceTvMode(boolean z);

        Builder ignoreStrictModeFalsePositives(boolean z);

        Builder useTestStreamManager(boolean z);

        Builder useVideoElementMock(boolean z);

        Builder videoElementMockDuration(float f);
    }

    public static Builder builder() {
        C6719al alVar = new C6719al();
        alVar.disableExperiments(true);
        alVar.disableOnScreenDetection(false);
        alVar.disableSkipFadeTransition(true);
        alVar.useVideoElementMock(false);
        alVar.videoElementMockDuration(30.0f);
        alVar.useTestStreamManager(false);
        alVar.ignoreStrictModeFalsePositives(false);
        alVar.forceTvMode(false);
        alVar.enableMonitorAppLifecycle(true);
        return alVar;
    }

    public Builder copy() {
        C6719al alVar = new C6719al();
        alVar.disableExperiments(disableExperiments());
        alVar.disableOnScreenDetection(disableOnScreenDetection());
        alVar.disableSkipFadeTransition(disableSkipFadeTransition());
        alVar.useVideoElementMock(useVideoElementMock());
        alVar.videoElementMockDuration(videoElementMockDuration());
        alVar.useTestStreamManager(useTestStreamManager());
        alVar.enableMonitorAppLifecycle(enableMonitorAppLifecycle());
        alVar.forceTvMode(forceTvMode());
        alVar.ignoreStrictModeFalsePositives(ignoreStrictModeFalsePositives());
        alVar.extraParams(extraParams());
        return alVar;
    }

    public abstract boolean disableExperiments();

    public abstract boolean disableOnScreenDetection();

    public abstract boolean disableSkipFadeTransition();

    public abstract boolean enableMonitorAppLifecycle();

    public abstract ars extraParams();

    public abstract boolean forceTvMode();

    public abstract boolean ignoreStrictModeFalsePositives();

    public abstract boolean useTestStreamManager();

    public abstract boolean useVideoElementMock();

    public abstract float videoElementMockDuration();
}
