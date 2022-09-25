package com.google.p3562ao.p3570b.p3571a.p3572a.p3573a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ao.b.a.a.a.b */
/* compiled from: PG */
public enum C45591b implements C62957cd {
    STRUCTURE_LEVEL_CONSENT_VERSION_UNSPECIFIED(0),
    V1(1),
    V2(2),
    V3(3),
    V4(4),
    V5(5),
    V6(6),
    V7(7);
    

    /* renamed from: i */
    public final int f119155i;

    private C45591b(int i) {
        this.f119155i = i;
    }

    /* renamed from: a */
    public static C45591b m81279a(int i) {
        switch (i) {
            case 0:
                return STRUCTURE_LEVEL_CONSENT_VERSION_UNSPECIFIED;
            case 1:
                return V1;
            case 2:
                return V2;
            case 3:
                return V3;
            case 4:
                return V4;
            case 5:
                return V5;
            case 6:
                return V6;
            case 7:
                return V7;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m81280b() {
        return C45590a.f119145a;
    }

    public final int getNumber() {
        return this.f119155i;
    }

    public final String toString() {
        return Integer.toString(this.f119155i);
    }
}
