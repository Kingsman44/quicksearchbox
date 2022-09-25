package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.b */
/* compiled from: PG */
public enum C34037b implements C62957cd {
    CLIENT_UNKNOWN(0),
    CLIENT_DEV_APP(1),
    CLIENT_MAIN_ASSISTANT(2),
    CLIENT_TITAN_AMBIENT_MODE(3),
    CLIENT_DICTATION(4),
    CLIENT_AUTO_PROJECTED(5),
    CLIENT_CONCRETE(6),
    CLIENT_MORRIS(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f90706j;

    private C34037b(int i) {
        this.f90706j = i;
    }

    /* renamed from: a */
    public static C34037b m62690a(int i) {
        switch (i) {
            case 0:
                return CLIENT_UNKNOWN;
            case 1:
                return CLIENT_DEV_APP;
            case 2:
                return CLIENT_MAIN_ASSISTANT;
            case 3:
                return CLIENT_TITAN_AMBIENT_MODE;
            case 4:
                return CLIENT_DICTATION;
            case 5:
                return CLIENT_AUTO_PROJECTED;
            case 6:
                return CLIENT_CONCRETE;
            case 7:
                return CLIENT_MORRIS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m62691b() {
        return C34010a.f90661a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f90706j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
