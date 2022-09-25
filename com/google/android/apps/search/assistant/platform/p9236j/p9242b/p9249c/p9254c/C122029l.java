package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.l */
/* compiled from: PG */
public enum C122029l implements C62957cd {
    UNKNOWN_STATE(0),
    SHOWN(1),
    HIDDEN(2),
    CREATED(3),
    DESTROYED(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f338577g;

    private C122029l(int i) {
        this.f338577g = i;
    }

    /* renamed from: a */
    public static C122029l m201534a(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return SHOWN;
        }
        if (i == 2) {
            return HIDDEN;
        }
        if (i == 3) {
            return CREATED;
        }
        if (i != 4) {
            return null;
        }
        return DESTROYED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f338577g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
