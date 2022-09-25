package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.ad.d.b.a.bm */
/* compiled from: PG */
public enum C48624bm implements C62957cd {
    UNKNOWN(0),
    STOPPED(1),
    STARTED(2),
    PAUSED(3),
    STARTED_OR_PAUSED(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f125655g;

    private C48624bm(int i) {
        this.f125655g = i;
    }

    /* renamed from: a */
    public static C48624bm m85245a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STOPPED;
        }
        if (i == 2) {
            return STARTED;
        }
        if (i == 3) {
            return PAUSED;
        }
        if (i != 4) {
            return null;
        }
        return STARTED_OR_PAUSED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f125655g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
