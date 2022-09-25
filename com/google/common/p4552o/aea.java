package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.aea */
/* compiled from: PG */
public enum aea implements C62957cd {
    UNSPECIFIED(0),
    UNKNOWN(1),
    NO_DASHER_ACCOUNT_PRESENT(2),
    DASHER_ACCOUNT_PRESENT(3),
    ACCOUNT_CHECKER_DISABLED(4);
    

    /* renamed from: f */
    public final int f158440f;

    private aea(int i) {
        this.f158440f = i;
    }

    /* renamed from: a */
    public static aea m92373a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return UNKNOWN;
        }
        if (i == 2) {
            return NO_DASHER_ACCOUNT_PRESENT;
        }
        if (i == 3) {
            return DASHER_ACCOUNT_PRESENT;
        }
        if (i != 4) {
            return null;
        }
        return ACCOUNT_CHECKER_DISABLED;
    }

    /* renamed from: b */
    public static C62959cf m92374b() {
        return adz.f158429a;
    }

    public final int getNumber() {
        return this.f158440f;
    }

    public final String toString() {
        return Integer.toString(this.f158440f);
    }
}
