package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.am.d.a.bx */
/* compiled from: PG */
public enum C8750bx implements C62957cd {
    INVALID(0),
    NORMAL(1),
    LOCAL(2),
    ANY(3),
    ANY_EXCEPT_LOCAL(4),
    ALL(5),
    ALL_EXCEPT_LOCAL(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f30101i;

    private C8750bx(int i) {
        this.f30101i = i;
    }

    /* renamed from: a */
    public static C8750bx m23400a(int i) {
        switch (i) {
            case 0:
                return INVALID;
            case 1:
                return NORMAL;
            case 2:
                return LOCAL;
            case 3:
                return ANY;
            case 4:
                return ANY_EXCEPT_LOCAL;
            case 5:
                return ALL;
            case 6:
                return ALL_EXCEPT_LOCAL;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f30101i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
