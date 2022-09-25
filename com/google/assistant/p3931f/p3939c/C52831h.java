package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.f.c.h */
/* compiled from: PG */
public enum C52831h implements C62957cd {
    UNKNOWN(0),
    PENDING(1),
    DISAMBIG(4),
    ACCEPTED(2),
    REJECTED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f138622g;

    private C52831h(int i) {
        this.f138622g = i;
    }

    /* renamed from: a */
    public static C52831h m86715a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PENDING;
        }
        if (i == 2) {
            return ACCEPTED;
        }
        if (i == 3) {
            return REJECTED;
        }
        if (i != 4) {
            return null;
        }
        return DISAMBIG;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f138622g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
