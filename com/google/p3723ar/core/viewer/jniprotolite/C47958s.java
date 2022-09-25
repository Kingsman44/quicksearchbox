package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.s */
/* compiled from: PG */
final class C47958s implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124132a = new C47958s();

    private C47958s() {
    }

    public final boolean isInRange(int i) {
        return Types.SceneViewerParams.ModePreference.forNumber(i) != null;
    }
}
