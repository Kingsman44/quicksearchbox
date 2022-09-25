package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.q */
/* compiled from: PG */
final class C47956q implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124131a = new C47956q();

    private C47956q() {
    }

    public final boolean isInRange(int i) {
        return Types.SceneViewerParams.LightingMode.forNumber(i) != null;
    }
}
