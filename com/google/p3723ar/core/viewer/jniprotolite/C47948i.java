package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.i */
/* compiled from: PG */
final class C47948i implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124127a = new C47948i();

    private C47948i() {
    }

    public final boolean isInRange(int i) {
        return Types.LightingSettings.Mode.forNumber(i) != null;
    }
}
