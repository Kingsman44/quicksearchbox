package com.google.android.libraries.search.assistant.invocation.p2651n.p2654c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.c.l */
/* compiled from: PG */
public enum C33995l implements C62957cd {
    UNKNOWN(0),
    VOICE_INTERACTION_SERVICE_NOT_RUNNING(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f90621d;

    private C33995l(int i) {
        this.f90621d = i;
    }

    /* renamed from: a */
    public static C33995l m62665a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return VOICE_INTERACTION_SERVICE_NOT_RUNNING;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f90621d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
