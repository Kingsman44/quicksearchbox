package com.google.p3723ar.core.viewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.analytics.k */
/* compiled from: PG */
final class C47927k implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124114a = new C47927k();

    private C47927k() {
    }

    public final boolean isInRange(int i) {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage.forNumber(i) != null;
    }
}
