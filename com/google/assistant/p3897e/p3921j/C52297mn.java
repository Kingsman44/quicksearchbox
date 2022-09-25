package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.e.j.mn */
/* compiled from: PG */
public enum C52297mn implements C62957cd {
    UNKNOWN_TYPE(0),
    OUTGOING_CALL_LOGS(1),
    INCOMING_CALL_LOGS(2),
    MISSED_CALL_LOGS(3),
    INCOMING_AND_MISSED_CALL_LOGS(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f137289g;

    private C52297mn(int i) {
        this.f137289g = i;
    }

    /* renamed from: a */
    public static C52297mn m86564a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return OUTGOING_CALL_LOGS;
        }
        if (i == 2) {
            return INCOMING_CALL_LOGS;
        }
        if (i == 3) {
            return MISSED_CALL_LOGS;
        }
        if (i != 4) {
            return null;
        }
        return INCOMING_AND_MISSED_CALL_LOGS;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f137289g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
