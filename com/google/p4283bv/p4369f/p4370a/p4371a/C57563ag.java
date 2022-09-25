package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.bv.f.a.a.ag */
/* compiled from: PG */
public enum C57563ag implements C62957cd {
    UNKNOWN_LIST_CLASS(0),
    CUSTOM(1),
    FAVORITES(2),
    WANT_TO_GO(3),
    STARRED(4),
    WISHLIST(5),
    ALL_SAVES(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f153789i;

    private C57563ag(int i) {
        this.f153789i = i;
    }

    /* renamed from: a */
    public static C57563ag m88496a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_LIST_CLASS;
            case 1:
                return CUSTOM;
            case 2:
                return FAVORITES;
            case 3:
                return WANT_TO_GO;
            case 4:
                return STARRED;
            case 5:
                return WISHLIST;
            case 6:
                return ALL_SAVES;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f153789i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
