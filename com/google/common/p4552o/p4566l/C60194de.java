package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.l.de */
/* compiled from: PG */
public enum C60194de implements C62957cd {
    UNDEFINED(0),
    SUCCESS(1),
    EXECUTION_ERROR(2),
    NOT_STARTED(3),
    INTERRUPTED(4),
    CANCELLED(5),
    CALL_CREDENTIALS_ERROR(6),
    UNKNOWN_HOST(7),
    UNSUPPORTED_PROTOCOL(8),
    PENDING_LOCAL_CHANGES(9),
    CONNECT_EXCEPTION(10),
    UNAUTHENTICATED(11),
    UNAVAILABLE(12),
    DEADLINE_EXCEEDED(13),
    UNRECOGNIZED(-1);
    

    /* renamed from: p */
    private final int f162860p;

    private C60194de(int i) {
        this.f162860p = i;
    }

    /* renamed from: a */
    public static C60194de m92539a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return SUCCESS;
            case 2:
                return EXECUTION_ERROR;
            case 3:
                return NOT_STARTED;
            case 4:
                return INTERRUPTED;
            case 5:
                return CANCELLED;
            case 6:
                return CALL_CREDENTIALS_ERROR;
            case 7:
                return UNKNOWN_HOST;
            case 8:
                return UNSUPPORTED_PROTOCOL;
            case 9:
                return PENDING_LOCAL_CHANGES;
            case 10:
                return CONNECT_EXCEPTION;
            case 11:
                return UNAUTHENTICATED;
            case 12:
                return UNAVAILABLE;
            case 13:
                return DEADLINE_EXCEEDED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92540b() {
        return C60193dd.f162843a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f162860p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
