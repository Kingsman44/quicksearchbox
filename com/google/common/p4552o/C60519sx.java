package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.sx */
/* compiled from: PG */
public enum C60519sx implements C62957cd {
    UNKNOWN_REASON(0),
    DEVICE_NOT_SUPPORTED(1),
    LOCALE_NOT_SUPPORTED(2),
    GEO_NOT_SUPPORTED(3),
    NO_USER_SIGNED_IN(4),
    IS_UNICORN_ACCOUNT(5),
    DISABLED_BY_ADMINISTRATOR(6),
    DENYLISTED_DEVICE(7);
    

    /* renamed from: i */
    public final int f163835i;

    private C60519sx(int i) {
        this.f163835i = i;
    }

    /* renamed from: a */
    public static C60519sx m92603a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REASON;
            case 1:
                return DEVICE_NOT_SUPPORTED;
            case 2:
                return LOCALE_NOT_SUPPORTED;
            case 3:
                return GEO_NOT_SUPPORTED;
            case 4:
                return NO_USER_SIGNED_IN;
            case 5:
                return IS_UNICORN_ACCOUNT;
            case 6:
                return DISABLED_BY_ADMINISTRATOR;
            case 7:
                return DENYLISTED_DEVICE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92604b() {
        return C60518sw.f163825a;
    }

    public final int getNumber() {
        return this.f163835i;
    }

    public final String toString() {
        return Integer.toString(this.f163835i);
    }
}
