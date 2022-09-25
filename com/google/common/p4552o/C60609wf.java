package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.wf */
/* compiled from: PG */
public enum C60609wf implements C62957cd {
    UNKNOWN(0),
    TABLET(1),
    KID_HOME_ENABLED(2),
    LOCALE(3),
    METHOD_ERROR(4),
    DEVICE_CHECKER(5),
    RAM_UNSET(6),
    RAM_CAPACITY(7),
    RAM_INVALID(8),
    RAM_UNSET_RECOVERED(9),
    RAM_UNSET_RECOVERED_CAPACITY_FAIL(10),
    RAM_UNSET_ACTIVITY_MANAGER_MISS(11);
    

    /* renamed from: m */
    public final int f164427m;

    private C60609wf(int i) {
        this.f164427m = i;
    }

    /* renamed from: a */
    public static C60609wf m92628a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TABLET;
            case 2:
                return KID_HOME_ENABLED;
            case 3:
                return LOCALE;
            case 4:
                return METHOD_ERROR;
            case 5:
                return DEVICE_CHECKER;
            case 6:
                return RAM_UNSET;
            case 7:
                return RAM_CAPACITY;
            case 8:
                return RAM_INVALID;
            case 9:
                return RAM_UNSET_RECOVERED;
            case 10:
                return RAM_UNSET_RECOVERED_CAPACITY_FAIL;
            case 11:
                return RAM_UNSET_ACTIVITY_MANAGER_MISS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92629b() {
        return C60608we.f164413a;
    }

    public final int getNumber() {
        return this.f164427m;
    }

    public final String toString() {
        return Integer.toString(this.f164427m);
    }
}
