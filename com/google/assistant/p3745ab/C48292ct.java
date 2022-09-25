package com.google.assistant.p3745ab;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ab.ct */
/* compiled from: PG */
public enum C48292ct implements C62957cd {
    UNKNOWN(0),
    SUCCESS(1),
    ERROR_NO_PARSE(2),
    ERROR_NOT_SUPPORTED(3),
    ERROR_NO_DIALOG_ADVANCE(4),
    ERROR_FAILED_DEPENDENCY(5),
    ERROR_BLACKLISTED(6),
    ERROR_FAILED_INTERNAL(7),
    ERROR_MISSING_CONTEXT(8),
    ERROR_REQUEST_REJECTED(9),
    ERROR_PERMISSION(10),
    ERROR_ENTITY_NOT_AVAILABLE(11),
    ERROR_SENSITIVE(12),
    PALATINO_OVERWRITE(13);
    

    /* renamed from: o */
    public final int f124907o;

    private C48292ct(int i) {
        this.f124907o = i;
    }

    /* renamed from: a */
    public static C48292ct m85216a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SUCCESS;
            case 2:
                return ERROR_NO_PARSE;
            case 3:
                return ERROR_NOT_SUPPORTED;
            case 4:
                return ERROR_NO_DIALOG_ADVANCE;
            case 5:
                return ERROR_FAILED_DEPENDENCY;
            case 6:
                return ERROR_BLACKLISTED;
            case 7:
                return ERROR_FAILED_INTERNAL;
            case 8:
                return ERROR_MISSING_CONTEXT;
            case 9:
                return ERROR_REQUEST_REJECTED;
            case 10:
                return ERROR_PERMISSION;
            case 11:
                return ERROR_ENTITY_NOT_AVAILABLE;
            case 12:
                return ERROR_SENSITIVE;
            case 13:
                return PALATINO_OVERWRITE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85217b() {
        return C48291cs.f124891a;
    }

    public final int getNumber() {
        return this.f124907o;
    }

    public final String toString() {
        return Integer.toString(this.f124907o);
    }
}
