package com.google.p4283bv.p4287b.p4288a.p4289a.p4312q;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.b.a.a.q.b */
/* compiled from: PG */
public enum C56794b implements C62957cd {
    ALL(1),
    IMAGES(2),
    VIDEOS(3),
    NEWS(4),
    MAPS(5),
    SHOPPING(6),
    BOOKS(7),
    FLIGHT(8),
    PERSONAL(9),
    FINANCE(10);
    

    /* renamed from: k */
    private final int f151565k;

    private C56794b(int i) {
        this.f151565k = i;
    }

    /* renamed from: a */
    public static C56794b m88224a(int i) {
        switch (i) {
            case 1:
                return ALL;
            case 2:
                return IMAGES;
            case 3:
                return VIDEOS;
            case 4:
                return NEWS;
            case 5:
                return MAPS;
            case 6:
                return SHOPPING;
            case 7:
                return BOOKS;
            case 8:
                return FLIGHT;
            case 9:
                return PERSONAL;
            case 10:
                return FINANCE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m88225b() {
        return C56793a.f151553a;
    }

    public final int getNumber() {
        return this.f151565k;
    }

    public final String toString() {
        return Integer.toString(this.f151565k);
    }
}
