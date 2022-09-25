package com.google.net.p4726a.p4727a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.net.a.a.b */
/* compiled from: PG */
public enum C62722b implements C62957cd {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    DO_NOT_USE_RESERVED_FOR_FUTURE_EXPANSION_USE_DEFAULT_IN_SWITCH_INSTEAD_(20);
    

    /* renamed from: s */
    public final int f169415s;

    private C62722b(int i) {
        this.f169415s = i;
    }

    /* renamed from: a */
    public static C62722b m94931a(int i) {
        if (i == 20) {
            return DO_NOT_USE_RESERVED_FOR_FUTURE_EXPANSION_USE_DEFAULT_IN_SWITCH_INSTEAD_;
        }
        switch (i) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m94932b() {
        return C62721a.f169395a;
    }

    public final int getNumber() {
        return this.f169415s;
    }

    public final String toString() {
        return Integer.toString(this.f169415s);
    }
}
