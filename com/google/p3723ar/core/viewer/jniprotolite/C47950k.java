package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.k */
/* compiled from: PG */
final class C47950k implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124128a = new C47950k();

    private C47950k() {
    }

    public final boolean isInRange(int i) {
        return Types.Notification.forNumber(i) != null;
    }
}
