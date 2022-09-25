package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lb */
/* compiled from: PG */
public enum C14488lb implements C62957cd {
    LEVEL_UNKNOWN(0),
    LEVEL_NONE(10),
    LEVEL_MEDIA(20),
    LEVEL_MESSAGE(30),
    LEVEL_PHONE_CALL(40),
    LEVEL_ALL(100),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f43789h;

    private C14488lb(int i) {
        this.f43789h = i;
    }

    /* renamed from: a */
    public static C14488lb m30624a(int i) {
        if (i == 0) {
            return LEVEL_UNKNOWN;
        }
        if (i == 10) {
            return LEVEL_NONE;
        }
        if (i == 20) {
            return LEVEL_MEDIA;
        }
        if (i == 30) {
            return LEVEL_MESSAGE;
        }
        if (i == 40) {
            return LEVEL_PHONE_CALL;
        }
        if (i != 100) {
            return null;
        }
        return LEVEL_ALL;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43789h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
