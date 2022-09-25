package com.google.protos.p4985f.p5002e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.f.e.i */
/* compiled from: PG */
public enum C64840i implements C62957cd {
    UNKNOWN_CATEGORY(0),
    GROCERY_STORES(1),
    ELECTRONICS_STORES(2),
    HARDWARE_STORES(3),
    PET_STORES(4),
    PHARMACIES(5),
    SHOPPING_CENTERS(6),
    SPORTING_GOODS_STORES(7),
    TOY_STORES(8);
    

    /* renamed from: j */
    public final int f175719j;

    private C64840i(int i) {
        this.f175719j = i;
    }

    /* renamed from: a */
    public static C64840i m96468a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CATEGORY;
            case 1:
                return GROCERY_STORES;
            case 2:
                return ELECTRONICS_STORES;
            case 3:
                return HARDWARE_STORES;
            case 4:
                return PET_STORES;
            case 5:
                return PHARMACIES;
            case 6:
                return SHOPPING_CENTERS;
            case 7:
                return SPORTING_GOODS_STORES;
            case 8:
                return TOY_STORES;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96469b() {
        return C64839h.f175708a;
    }

    public final int getNumber() {
        return this.f175719j;
    }

    public final String toString() {
        return Integer.toString(this.f175719j);
    }
}
