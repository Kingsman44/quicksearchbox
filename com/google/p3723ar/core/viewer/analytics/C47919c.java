package com.google.p3723ar.core.viewer.analytics;

import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.analytics.c */
/* compiled from: PG */
final class C47919c implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124110a = new C47919c();

    private C47919c() {
    }

    public final boolean isInRange(int i) {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.forNumber(i) != null;
    }
}
