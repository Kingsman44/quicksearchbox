package com.google.p3723ar.core.viewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.analytics.g */
/* compiled from: PG */
final class C47923g implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124112a = new C47923g();

    private C47923g() {
    }

    public final boolean isInRange(int i) {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason.forNumber(i) != null;
    }
}
