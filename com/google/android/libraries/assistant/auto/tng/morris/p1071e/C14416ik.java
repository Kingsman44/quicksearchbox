package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ik */
/* compiled from: PG */
public enum C14416ik implements C62957cd {
    UNKNOWN(0),
    NO_ACTIVE_SESSION(1),
    ACTIVE_SESSION(2),
    SESSION_NOT_AVAILABLE(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f43603f;

    private C14416ik(int i) {
        this.f43603f = i;
    }

    /* renamed from: a */
    public static C14416ik m30617a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NO_ACTIVE_SESSION;
        }
        if (i == 2) {
            return ACTIVE_SESSION;
        }
        if (i != 3) {
            return null;
        }
        return SESSION_NOT_AVAILABLE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43603f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
