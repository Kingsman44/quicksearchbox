package com.google.p3723ar.core.viewer.jniprotolite;

import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ar.core.viewer.jniprotolite.ac */
/* compiled from: PG */
final class C47940ac implements C62959cf {

    /* renamed from: a */
    static final C62959cf f124123a = new C47940ac();

    private C47940ac() {
    }

    public final boolean isInRange(int i) {
        return Types.Visibility.forNumber(i) != null;
    }
}
