package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.m */
/* compiled from: PG */
final class C47952m implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124129a = new C47952m();

    private C47952m() {
    }

    public final boolean isInRange(int i) {
        return Types.OcclusionSettings.Mode.forNumber(i) != null;
    }
}
