package com.google.knowledge.p4671b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.knowledge.b.o */
/* compiled from: PG */
public enum C61822o implements C62957cd {
    NOT_ELIGIBLE(0),
    ELIGIBLE_PREBUILT(1),
    ELIGIBLE_FOR_UPGRADE(2),
    ELIGIBLE_UPGRADING(3),
    ELIGIBLE_UPGRADED(4),
    ELIGIBLE_UPGRADED_BYPASS(5);
    

    /* renamed from: g */
    public final int f167065g;

    private C61822o(int i) {
        this.f167065g = i;
    }

    /* renamed from: a */
    public static C61822o m94477a(int i) {
        if (i == 0) {
            return NOT_ELIGIBLE;
        }
        if (i == 1) {
            return ELIGIBLE_PREBUILT;
        }
        if (i == 2) {
            return ELIGIBLE_FOR_UPGRADE;
        }
        if (i == 3) {
            return ELIGIBLE_UPGRADING;
        }
        if (i == 4) {
            return ELIGIBLE_UPGRADED;
        }
        if (i != 5) {
            return null;
        }
        return ELIGIBLE_UPGRADED_BYPASS;
    }

    /* renamed from: b */
    public static C62959cf m94478b() {
        return C61821n.f167057a;
    }

    public final int getNumber() {
        return this.f167065g;
    }

    public final String toString() {
        return Integer.toString(this.f167065g);
    }
}
