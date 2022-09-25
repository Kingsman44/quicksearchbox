package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.ad.d.b.a.bn */
/* compiled from: PG */
public enum C48625bn implements C62957cd {
    UNDEFINED(0),
    NOT_RESERVED(1),
    RESERVED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f125661e;

    private C48625bn(int i) {
        this.f125661e = i;
    }

    /* renamed from: a */
    public static C48625bn m85246a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return NOT_RESERVED;
        }
        if (i != 2) {
            return null;
        }
        return RESERVED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f125661e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
