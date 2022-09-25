package com.google.p3723ar.core.viewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.analytics.e */
/* compiled from: PG */
final class C47921e implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124111a = new C47921e();

    private C47921e() {
    }

    public final boolean isInRange(int i) {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType.forNumber(i) != null;
    }
}
