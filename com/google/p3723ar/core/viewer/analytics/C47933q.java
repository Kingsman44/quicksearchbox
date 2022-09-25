package com.google.p3723ar.core.viewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.analytics.q */
/* compiled from: PG */
final class C47933q implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124117a = new C47933q();

    private C47933q() {
    }

    public final boolean isInRange(int i) {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion.forNumber(i) != null;
    }
}
