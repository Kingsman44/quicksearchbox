package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.w */
/* compiled from: PG */
final class C47962w implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124134a = new C47962w();

    private C47962w() {
    }

    public final boolean isInRange(int i) {
        return Types.SessionError.forNumber(i) != null;
    }
}
