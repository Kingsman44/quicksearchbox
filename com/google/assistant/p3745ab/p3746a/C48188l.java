package com.google.assistant.p3745ab.p3746a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ab.a.l */
/* compiled from: PG */
public enum C48188l implements C62957cd {
    UNKNOWN_STORAGE_STATUS(0),
    OK(1),
    ERROR(2),
    KEY_NOT_FOUND(3),
    INVALID_ARGUMENT(4),
    SKIP(5),
    ALREADY_EXIST(6),
    DISABLED(7),
    USER_UNVERIFIED(8),
    BLOCKED(9);
    

    /* renamed from: k */
    public final int f124700k;

    private C48188l(int i) {
        this.f124700k = i;
    }

    /* renamed from: a */
    public static C48188l m85211a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STORAGE_STATUS;
            case 1:
                return OK;
            case 2:
                return ERROR;
            case 3:
                return KEY_NOT_FOUND;
            case 4:
                return INVALID_ARGUMENT;
            case 5:
                return SKIP;
            case 6:
                return ALREADY_EXIST;
            case 7:
                return DISABLED;
            case 8:
                return USER_UNVERIFIED;
            case 9:
                return BLOCKED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85212b() {
        return C48187k.f124688a;
    }

    public final int getNumber() {
        return this.f124700k;
    }

    public final String toString() {
        return Integer.toString(this.f124700k);
    }
}
