package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.u */
/* compiled from: PG */
final class C47960u implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124133a = new C47960u();

    private C47960u() {
    }

    public final boolean isInRange(int i) {
        return Types.SceneViewerParams.StreamingMode.forNumber(i) != null;
    }
}
