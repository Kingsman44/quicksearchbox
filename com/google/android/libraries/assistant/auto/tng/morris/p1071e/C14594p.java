package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.p */
/* compiled from: PG */
public enum C14594p implements C62957cd {
    UNKNOWN(0),
    EARPIECE(1),
    SPEAKER(2),
    BLUETOOTH(3),
    WIRED_HEADSET(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f44119g;

    private C14594p(int i) {
        this.f44119g = i;
    }

    /* renamed from: a */
    public static C14594p m30642a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return EARPIECE;
        }
        if (i == 2) {
            return SPEAKER;
        }
        if (i == 3) {
            return BLUETOOTH;
        }
        if (i != 4) {
            return null;
        }
        return WIRED_HEADSET;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f44119g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
