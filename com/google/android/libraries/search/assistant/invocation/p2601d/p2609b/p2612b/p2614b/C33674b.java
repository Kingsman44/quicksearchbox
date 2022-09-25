package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.b */
/* compiled from: PG */
public enum C33674b implements C62957cd {
    EXCEPTION_UNKNOWN(0),
    EXCEPTION_INVALID_INVOCATION_TOKEN(1),
    EXCEPTION_RESOURCE_NOT_AVAILABLE(2),
    EXCEPTION_NO_OP_IMPLEMENTATION(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f89982f;

    private C33674b(int i) {
        this.f89982f = i;
    }

    /* renamed from: a */
    public static C33674b m62278a(int i) {
        if (i == 0) {
            return EXCEPTION_UNKNOWN;
        }
        if (i == 1) {
            return EXCEPTION_INVALID_INVOCATION_TOKEN;
        }
        if (i == 2) {
            return EXCEPTION_RESOURCE_NOT_AVAILABLE;
        }
        if (i != 3) {
            return null;
        }
        return EXCEPTION_NO_OP_IMPLEMENTATION;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f89982f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
