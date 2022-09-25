package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.a */
/* compiled from: PG */
public enum C125034a implements C62957cd {
    TRIGGER_UNKNOWN(0),
    TRIGGER_VOICE(1),
    TRIGGER_KEYBOARD(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f344968e;

    private C125034a(int i) {
        this.f344968e = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f344968e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
