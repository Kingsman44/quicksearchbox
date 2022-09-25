package com.google.p3723ar.core.viewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.analytics.s */
/* compiled from: PG */
final class C47935s implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124118a = new C47935s();

    private C47935s() {
    }

    public final boolean isInRange(int i) {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode.forNumber(i) != null;
    }
}
