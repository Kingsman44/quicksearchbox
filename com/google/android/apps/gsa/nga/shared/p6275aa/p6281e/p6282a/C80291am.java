package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.am */
/* compiled from: PG */
public enum C80291am implements C62957cd {
    UNKNOWN(0),
    PLAY(1),
    PAUSE(2),
    STOP(3),
    PREVIOUS(4),
    NEXT(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f220331h;

    private C80291am(int i) {
        this.f220331h = i;
    }

    /* renamed from: a */
    public static C80291am m128114a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PLAY;
        }
        if (i == 2) {
            return PAUSE;
        }
        if (i == 3) {
            return STOP;
        }
        if (i == 4) {
            return PREVIOUS;
        }
        if (i != 5) {
            return null;
        }
        return NEXT;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f220331h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
