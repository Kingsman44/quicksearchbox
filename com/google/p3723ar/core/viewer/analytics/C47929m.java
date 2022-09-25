package com.google.p3723ar.core.viewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.analytics.m */
/* compiled from: PG */
final class C47929m implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124115a = new C47929m();

    private C47929m() {
    }

    public final boolean isInRange(int i) {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason.forNumber(i) != null;
    }
}
