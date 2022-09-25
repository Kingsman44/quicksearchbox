package com.google.p3562ao.p3563a.p3569e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.ao.a.e.a */
/* compiled from: PG */
public enum C45589a implements C62957cd {
    ERROR_CODE_UNSPECIFIED(0),
    ERROR_CODE_INVALID_REQUEST(1),
    ERROR_CODE_RPC_ERROR(2),
    ERROR_CODE_INTERNAL_ERROR(3),
    ERROR_CODE_AUTHENTICATION_DENIED_BY_USER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f119144g;

    private C45589a(int i) {
        this.f119144g = i;
    }

    /* renamed from: a */
    public static C45589a m81278a(int i) {
        if (i == 0) {
            return ERROR_CODE_UNSPECIFIED;
        }
        if (i == 1) {
            return ERROR_CODE_INVALID_REQUEST;
        }
        if (i == 2) {
            return ERROR_CODE_RPC_ERROR;
        }
        if (i == 3) {
            return ERROR_CODE_INTERNAL_ERROR;
        }
        if (i != 4) {
            return null;
        }
        return ERROR_CODE_AUTHENTICATION_DENIED_BY_USER;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f119144g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
