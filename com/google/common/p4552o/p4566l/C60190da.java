package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.l.da */
/* compiled from: PG */
public enum C60190da implements C62957cd {
    UNDEFINED(0),
    AUTHENTICATED(1),
    IO_EXCEPTION(2),
    AUTH_EXCEPTION(3),
    USER_RECOVERABLE_AUTH_EXCEPTION(4),
    NETWORK_ERROR(5),
    BAD_AUTHENTICATION(6),
    AUTH_INTERNAL_ERROR(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f162831j;

    private C60190da(int i) {
        this.f162831j = i;
    }

    /* renamed from: a */
    public static C60190da m92535a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return AUTHENTICATED;
            case 2:
                return IO_EXCEPTION;
            case 3:
                return AUTH_EXCEPTION;
            case 4:
                return USER_RECOVERABLE_AUTH_EXCEPTION;
            case 5:
                return NETWORK_ERROR;
            case 6:
                return BAD_AUTHENTICATION;
            case 7:
                return AUTH_INTERNAL_ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92536b() {
        return C60188cz.f162815a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f162831j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
