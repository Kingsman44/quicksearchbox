package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.ars;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.am */
/* compiled from: PG */
final class C6720am extends TestingConfiguration {
    private final boolean disableExperiments;
    private final boolean disableOnScreenDetection;
    private final boolean disableSkipFadeTransition;
    private final boolean enableMonitorAppLifecycle;
    private final ars extraParams;
    private final boolean forceTvMode;
    private final boolean ignoreStrictModeFalsePositives;
    private final boolean useTestStreamManager;
    private final boolean useVideoElementMock;
    private final float videoElementMockDuration;

    private C6720am(boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5, boolean z6, boolean z7, boolean z8, ars ars) {
        this.disableExperiments = z;
        this.disableOnScreenDetection = z2;
        this.disableSkipFadeTransition = z3;
        this.useVideoElementMock = z4;
        this.videoElementMockDuration = f;
        this.useTestStreamManager = z5;
        this.enableMonitorAppLifecycle = z6;
        this.forceTvMode = z7;
        this.ignoreStrictModeFalsePositives = z8;
        this.extraParams = ars;
    }

    public boolean disableExperiments() {
        return this.disableExperiments;
    }

    public boolean disableOnScreenDetection() {
        return this.disableOnScreenDetection;
    }

    public boolean disableSkipFadeTransition() {
        return this.disableSkipFadeTransition;
    }

    public boolean enableMonitorAppLifecycle() {
        return this.enableMonitorAppLifecycle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r1 = r4.extraParams;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.ads.interactivemedia.p367v3.impl.data.TestingConfiguration
            r2 = 0
            if (r1 == 0) goto L_0x0072
            com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration r5 = (com.google.ads.interactivemedia.p367v3.impl.data.TestingConfiguration) r5
            boolean r1 = r4.disableExperiments
            boolean r3 = r5.disableExperiments()
            if (r1 != r3) goto L_0x0072
            boolean r1 = r4.disableOnScreenDetection
            boolean r3 = r5.disableOnScreenDetection()
            if (r1 != r3) goto L_0x0072
            boolean r1 = r4.disableSkipFadeTransition
            boolean r3 = r5.disableSkipFadeTransition()
            if (r1 != r3) goto L_0x0072
            boolean r1 = r4.useVideoElementMock
            boolean r3 = r5.useVideoElementMock()
            if (r1 != r3) goto L_0x0072
            float r1 = r4.videoElementMockDuration
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.videoElementMockDuration()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x0072
            boolean r1 = r4.useTestStreamManager
            boolean r3 = r5.useTestStreamManager()
            if (r1 != r3) goto L_0x0072
            boolean r1 = r4.enableMonitorAppLifecycle
            boolean r3 = r5.enableMonitorAppLifecycle()
            if (r1 != r3) goto L_0x0072
            boolean r1 = r4.forceTvMode
            boolean r3 = r5.forceTvMode()
            if (r1 != r3) goto L_0x0072
            boolean r1 = r4.ignoreStrictModeFalsePositives
            boolean r3 = r5.ignoreStrictModeFalsePositives()
            if (r1 != r3) goto L_0x0072
            com.google.ads.interactivemedia.v3.internal.ars r1 = r4.extraParams
            if (r1 != 0) goto L_0x0066
            com.google.ads.interactivemedia.v3.internal.ars r5 = r5.extraParams()
            if (r5 != 0) goto L_0x0072
            goto L_0x0071
        L_0x0066:
            com.google.ads.interactivemedia.v3.internal.ars r5 = r5.extraParams()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            return r0
        L_0x0072:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.impl.data.C6720am.equals(java.lang.Object):boolean");
    }

    public ars extraParams() {
        return this.extraParams;
    }

    public boolean forceTvMode() {
        return this.forceTvMode;
    }

    public int hashCode() {
        int i;
        int i2 = 1237;
        int floatToIntBits = ((((((((((((((((true != this.disableExperiments ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.disableOnScreenDetection ? 1237 : 1231)) * 1000003) ^ (true != this.disableSkipFadeTransition ? 1237 : 1231)) * 1000003) ^ (true != this.useVideoElementMock ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.videoElementMockDuration)) * 1000003) ^ (true != this.useTestStreamManager ? 1237 : 1231)) * 1000003) ^ (true != this.enableMonitorAppLifecycle ? 1237 : 1231)) * 1000003) ^ (true != this.forceTvMode ? 1237 : 1231)) * 1000003;
        if (true == this.ignoreStrictModeFalsePositives) {
            i2 = 1231;
        }
        int i3 = (floatToIntBits ^ i2) * 1000003;
        ars ars = this.extraParams;
        if (ars == null) {
            i = 0;
        } else {
            i = ars.hashCode();
        }
        return i3 ^ i;
    }

    public boolean ignoreStrictModeFalsePositives() {
        return this.ignoreStrictModeFalsePositives;
    }

    public String toString() {
        boolean z = this.disableExperiments;
        boolean z2 = this.disableOnScreenDetection;
        boolean z3 = this.disableSkipFadeTransition;
        boolean z4 = this.useVideoElementMock;
        float f = this.videoElementMockDuration;
        boolean z5 = this.useTestStreamManager;
        boolean z6 = this.enableMonitorAppLifecycle;
        boolean z7 = this.forceTvMode;
        boolean z8 = this.ignoreStrictModeFalsePositives;
        String valueOf = String.valueOf(this.extraParams);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 312);
        sb.append("TestingConfiguration{disableExperiments=");
        sb.append(z);
        sb.append(", disableOnScreenDetection=");
        sb.append(z2);
        sb.append(", disableSkipFadeTransition=");
        sb.append(z3);
        sb.append(", useVideoElementMock=");
        sb.append(z4);
        sb.append(", videoElementMockDuration=");
        sb.append(f);
        sb.append(", useTestStreamManager=");
        sb.append(z5);
        sb.append(", enableMonitorAppLifecycle=");
        sb.append(z6);
        sb.append(", forceTvMode=");
        sb.append(z7);
        sb.append(", ignoreStrictModeFalsePositives=");
        sb.append(z8);
        sb.append(", extraParams=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public boolean useTestStreamManager() {
        return this.useTestStreamManager;
    }

    public boolean useVideoElementMock() {
        return this.useVideoElementMock;
    }

    public float videoElementMockDuration() {
        return this.videoElementMockDuration;
    }
}
