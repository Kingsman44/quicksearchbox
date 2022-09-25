package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public final class PerformanceEventInfo {
    final Long commandExtensionId;
    final JsPerformanceEventInfo jsPerformanceEventInfo;
    final Integer materializationCount;
    final Integer measurementCount;
    final String nodeIdentifier;
    final String templateUri;

    public PerformanceEventInfo(String str, String str2, Integer num, Integer num2, Long l, JsPerformanceEventInfo jsPerformanceEventInfo2) {
        this.templateUri = str;
        this.nodeIdentifier = str2;
        this.materializationCount = num;
        this.measurementCount = num2;
        this.commandExtensionId = l;
        this.jsPerformanceEventInfo = jsPerformanceEventInfo2;
    }

    public Long getCommandExtensionId() {
        return this.commandExtensionId;
    }

    public JsPerformanceEventInfo getJsPerformanceEventInfo() {
        return this.jsPerformanceEventInfo;
    }

    public Integer getMaterializationCount() {
        return this.materializationCount;
    }

    public Integer getMeasurementCount() {
        return this.measurementCount;
    }

    public String getNodeIdentifier() {
        return this.nodeIdentifier;
    }

    public String getTemplateUri() {
        return this.templateUri;
    }

    public String toString() {
        String str = this.templateUri;
        String str2 = this.nodeIdentifier;
        Integer num = this.materializationCount;
        Integer num2 = this.measurementCount;
        Long l = this.commandExtensionId;
        String valueOf = String.valueOf(this.jsPerformanceEventInfo);
        return "PerformanceEventInfo{templateUri=" + str + ",nodeIdentifier=" + str2 + ",materializationCount=" + num + ",measurementCount=" + num2 + ",commandExtensionId=" + l + ",jsPerformanceEventInfo=" + valueOf + "}";
    }
}
