package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.e */
/* compiled from: PG */
final class C47944e implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124125a = new C47944e();

    private C47944e() {
    }

    public final boolean isInRange(int i) {
        return Types.ChipNotificationContent.forNumber(i) != null;
    }
}
