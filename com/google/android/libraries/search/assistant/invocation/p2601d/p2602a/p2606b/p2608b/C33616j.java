package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.j */
/* compiled from: PG */
public enum C33616j implements C62957cd {
    EXCEPTION_UNKNOWN(0),
    EXCEPTION_INVALID_INVOCATION_TOKEN(1),
    EXCEPTION_RESOURCE_NOT_AVAILABLE(2),
    EXCEPTION_FAILED_ACQUIRING_FOCUS(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f89843f;

    private C33616j(int i) {
        this.f89843f = i;
    }

    /* renamed from: a */
    public static C33616j m62214a(int i) {
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
        return EXCEPTION_FAILED_ACQUIRING_FOCUS;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f89843f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
