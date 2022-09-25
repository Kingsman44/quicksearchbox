package com.google.protos.p4953bc.p4954a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.bc.a.j */
/* compiled from: PG */
public enum C64406j implements C62957cd {
    NO_VALUE(0),
    CANCELLED(1),
    DELAYED(2),
    DIVERTED(3),
    IN_AIR(4),
    LANDED(8),
    ON_TIME(12),
    REDIRECTED(13),
    SCHEDULED(14),
    UNKNOWN(15),
    RETURN_TO_RAMP(16),
    FORCED_RETURN(17),
    UNRECOGNIZED(18),
    NOT_OPERATIONAL(19);
    

    /* renamed from: o */
    private final int f174682o;

    private C64406j(int i) {
        this.f174682o = i;
    }

    /* renamed from: a */
    public static C64406j m96401a(int i) {
        if (i == 0) {
            return NO_VALUE;
        }
        if (i == 1) {
            return CANCELLED;
        }
        if (i == 2) {
            return DELAYED;
        }
        if (i == 3) {
            return DIVERTED;
        }
        if (i == 4) {
            return IN_AIR;
        }
        if (i == 8) {
            return LANDED;
        }
        switch (i) {
            case 12:
                return ON_TIME;
            case 13:
                return REDIRECTED;
            case 14:
                return SCHEDULED;
            case 15:
                return UNKNOWN;
            case 16:
                return RETURN_TO_RAMP;
            case 17:
                return FORCED_RETURN;
            case 18:
                return UNRECOGNIZED;
            case 19:
                return NOT_OPERATIONAL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96402b() {
        return C64405i.f174666a;
    }

    public final int getNumber() {
        return this.f174682o;
    }

    public final String toString() {
        return Integer.toString(this.f174682o);
    }
}
