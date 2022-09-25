package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.j */
/* compiled from: PG */
public enum C127546j implements C62957cd {
    UNSPECIFIED(0),
    CANCELLED(1),
    EXECUTED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f351195e;

    private C127546j(int i) {
        this.f351195e = i;
    }

    /* renamed from: a */
    public static C127546j m208522a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CANCELLED;
        }
        if (i != 2) {
            return null;
        }
        return EXECUTED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f351195e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
