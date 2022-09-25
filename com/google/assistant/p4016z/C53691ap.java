package com.google.assistant.p4016z;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.z.ap */
/* compiled from: PG */
public enum C53691ap implements C62957cd {
    UNSPECIFIED(0),
    STORE(1),
    TRANSIT_STATION(2),
    RESTAURANT(3),
    HOME(4),
    WORK(5),
    GAS_STATION(6),
    PARKING(7),
    CAFE(8),
    SHOPPING_CENTER(9),
    NO_PLACE(10);
    

    /* renamed from: l */
    public final int f140936l;

    private C53691ap(int i) {
        this.f140936l = i;
    }

    /* renamed from: a */
    public static C53691ap m86884a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return STORE;
            case 2:
                return TRANSIT_STATION;
            case 3:
                return RESTAURANT;
            case 4:
                return HOME;
            case 5:
                return WORK;
            case 6:
                return GAS_STATION;
            case 7:
                return PARKING;
            case 8:
                return CAFE;
            case 9:
                return SHOPPING_CENTER;
            case 10:
                return NO_PLACE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86885b() {
        return C53690ao.f140923a;
    }

    public final int getNumber() {
        return this.f140936l;
    }

    public final String toString() {
        return Integer.toString(this.f140936l);
    }
}
