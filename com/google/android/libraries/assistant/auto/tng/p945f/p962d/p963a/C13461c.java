package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c */
/* compiled from: PG */
public enum C13461c implements C62957cd {
    UNKNOWN_SOURCE(0),
    HEURISTIC(1),
    TC_LIB(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f41313e;

    private C13461c(int i) {
        this.f41313e = i;
    }

    /* renamed from: a */
    public static C13461c m29715a(int i) {
        if (i == 0) {
            return UNKNOWN_SOURCE;
        }
        if (i == 1) {
            return HEURISTIC;
        }
        if (i != 2) {
            return null;
        }
        return TC_LIB;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f41313e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
