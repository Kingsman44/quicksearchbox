package com.google.p3723ar.core.viewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.analytics.o */
/* compiled from: PG */
final class C47931o implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124116a = new C47931o();

    private C47931o() {
    }

    public final boolean isInRange(int i) {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.forNumber(i) != null;
    }
}
