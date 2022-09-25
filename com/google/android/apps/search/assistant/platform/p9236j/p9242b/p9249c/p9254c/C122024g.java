package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.g */
/* compiled from: PG */
public enum C122024g implements C62957cd {
    UNKNOWN_EVENT(0),
    CONFIGURATION_CHANGED(1),
    CLOSE_SYSTEM_DIALOGS_REQUESTED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f338564e;

    private C122024g(int i) {
        this.f338564e = i;
    }

    /* renamed from: a */
    public static C122024g m201533a(int i) {
        if (i == 0) {
            return UNKNOWN_EVENT;
        }
        if (i == 1) {
            return CONFIGURATION_CHANGED;
        }
        if (i != 2) {
            return null;
        }
        return CLOSE_SYSTEM_DIALOGS_REQUESTED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f338564e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
