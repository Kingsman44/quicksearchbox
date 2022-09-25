package com.google.lens.p4707j;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.lens.j.q */
/* compiled from: PG */
public enum C62583q implements C62957cd {
    UNKNOWN(0),
    INACTIVE(1),
    REMOTE_COPY_NOT_ENABLED(2),
    MISSING_ENCRYPTION_DATA(3),
    UNSUPPORTED_SYSTEM(4),
    CHROME_OUTDATED(5),
    RECENTLY_INACTIVE(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f168964i;

    private C62583q(int i) {
        this.f168964i = i;
    }

    /* renamed from: a */
    public static C62583q m94804a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return INACTIVE;
            case 2:
                return REMOTE_COPY_NOT_ENABLED;
            case 3:
                return MISSING_ENCRYPTION_DATA;
            case 4:
                return UNSUPPORTED_SYSTEM;
            case 5:
                return CHROME_OUTDATED;
            case 6:
                return RECENTLY_INACTIVE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f168964i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
