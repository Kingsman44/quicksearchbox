package com.google.lens.p4707j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.lens.j.l */
/* compiled from: PG */
public enum C62578l implements C62957cd {
    NONE(0),
    DLH_DISH(1),
    MA_DISH(2),
    CSPI_DISH(3),
    QBICA_DISH(4),
    OBATZDA_WINE(5),
    MA_WINE(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f168953i;

    private C62578l(int i) {
        this.f168953i = i;
    }

    /* renamed from: a */
    public static C62578l m94800a(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return DLH_DISH;
            case 2:
                return MA_DISH;
            case 3:
                return CSPI_DISH;
            case 4:
                return QBICA_DISH;
            case 5:
                return OBATZDA_WINE;
            case 6:
                return MA_WINE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m94801b() {
        return C62577k.f168943a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f168953i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
