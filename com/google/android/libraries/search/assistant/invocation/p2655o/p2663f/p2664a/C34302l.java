package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.l */
/* compiled from: PG */
public enum C34302l implements C62957cd {
    UNKNOWN(0),
    NO_ELIGIBLE_INVOCATION_CLIENT(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f91222d;

    private C34302l(int i) {
        this.f91222d = i;
    }

    /* renamed from: a */
    public static C34302l m62963a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return NO_ELIGIBLE_INVOCATION_CLIENT;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f91222d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
