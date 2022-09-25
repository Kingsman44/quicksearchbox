package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.is */
/* compiled from: PG */
public enum C14424is implements C62957cd {
    UNKNOWN(0),
    MESSAGE_TILE(1),
    TOP_CONTACT(2),
    SOMEONE_ELSE(3),
    MESSAGE_CENTER_SEND_MESSAGE(4),
    EMPTY_STATE(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f43634h;

    private C14424is(int i) {
        this.f43634h = i;
    }

    /* renamed from: a */
    public static C14424is m30619a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return MESSAGE_TILE;
        }
        if (i == 2) {
            return TOP_CONTACT;
        }
        if (i == 3) {
            return SOMEONE_ELSE;
        }
        if (i == 4) {
            return MESSAGE_CENTER_SEND_MESSAGE;
        }
        if (i != 5) {
            return null;
        }
        return EMPTY_STATE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43634h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
