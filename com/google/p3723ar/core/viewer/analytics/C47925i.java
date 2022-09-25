package com.google.p3723ar.core.viewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.analytics.i */
/* compiled from: PG */
final class C47925i implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124113a = new C47925i();

    private C47925i() {
    }

    public final boolean isInRange(int i) {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason.forNumber(i) != null;
    }
}
