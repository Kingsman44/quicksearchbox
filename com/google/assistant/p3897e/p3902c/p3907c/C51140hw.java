package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.c.c.hw */
/* compiled from: PG */
public enum C51140hw implements C62957cd {
    DEFAULT(0),
    TITLE(1),
    ERROR(2),
    CONFIRMATION_TITLE(3),
    CONFIRMATION_PRIMARY(4),
    CONFIRMATION_SECONDARY(5),
    CANCEL_TITLE(6),
    PLACEHOLDER(7),
    TABLE_TITLE(8);
    

    /* renamed from: j */
    public final int f133118j;

    private C51140hw(int i) {
        this.f133118j = i;
    }

    /* renamed from: a */
    public static C51140hw m86041a(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return TITLE;
            case 2:
                return ERROR;
            case 3:
                return CONFIRMATION_TITLE;
            case 4:
                return CONFIRMATION_PRIMARY;
            case 5:
                return CONFIRMATION_SECONDARY;
            case 6:
                return CANCEL_TITLE;
            case 7:
                return PLACEHOLDER;
            case 8:
                return TABLE_TITLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86042b() {
        return C51139hv.f133107a;
    }

    public final int getNumber() {
        return this.f133118j;
    }

    public final String toString() {
        return Integer.toString(this.f133118j);
    }
}
