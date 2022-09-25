package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.a.a.y */
/* compiled from: PG */
public enum C48128y implements C62957cd {
    COMMAND_TYPE_UNSPECIFIED(0),
    VOICE_QUERY(1),
    TEXT_QUERY(2),
    CANCEL_QUERY(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f124559f;

    private C48128y(int i) {
        this.f124559f = i;
    }

    /* renamed from: a */
    public static C48128y m85188a(int i) {
        if (i == 0) {
            return COMMAND_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return VOICE_QUERY;
        }
        if (i == 2) {
            return TEXT_QUERY;
        }
        if (i != 3) {
            return null;
        }
        return CANCEL_QUERY;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f124559f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
