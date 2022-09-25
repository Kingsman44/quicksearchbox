package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.e.c.c.bp */
/* compiled from: PG */
public enum C50971bp implements C62957cd {
    UNKNOWN(0),
    PENDING(1),
    DISAMBIG(4),
    ACCEPTED(2),
    REJECTED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f132696g;

    private C50971bp(int i) {
        this.f132696g = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f132696g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
