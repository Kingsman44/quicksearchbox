package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.o */
/* compiled from: PG */
final class C47954o implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124130a = new C47954o();

    private C47954o() {
    }

    public final boolean isInRange(int i) {
        return Types.Scaling.forNumber(i) != null;
    }
}
