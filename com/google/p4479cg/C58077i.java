package com.google.p4479cg;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.cg.i */
/* compiled from: PG */
public enum C58077i implements C62957cd {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f155249j;

    private C58077i(int i) {
        this.f155249j = i;
    }

    /* renamed from: a */
    public static C58077i m88832a(int i) {
        switch (i) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m88833b() {
        return C58076h.f155238a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f155249j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
