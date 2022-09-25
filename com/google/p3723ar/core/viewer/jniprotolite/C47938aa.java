package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.aa */
/* compiled from: PG */
final class C47938aa implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124122a = new C47938aa();

    private C47938aa() {
    }

    public final boolean isInRange(int i) {
        return Types.ViewerMode.forNumber(i) != null;
    }
}
