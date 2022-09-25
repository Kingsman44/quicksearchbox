package com.google.p4479cg;

/* renamed from: com.google.cg.f */
/* compiled from: PG */
public enum C58074f {
    UTC_OFFSET,
    TIME_ZONE,
    TIMEOFFSET_NOT_SET;

    /* renamed from: a */
    public static C58074f m88831a(int i) {
        if (i == 0) {
            return TIMEOFFSET_NOT_SET;
        }
        if (i == 8) {
            return UTC_OFFSET;
        }
        if (i != 9) {
            return null;
        }
        return TIME_ZONE;
    }
}
