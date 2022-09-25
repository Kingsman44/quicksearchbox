package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.y */
/* compiled from: PG */
final class C47964y implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124135a = new C47964y();

    private C47964y() {
    }

    public final boolean isInRange(int i) {
        return Types.SnackbarMessage.forNumber(i) != null;
    }
}
