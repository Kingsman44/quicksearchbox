package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.at.j.a.bo */
/* compiled from: PG */
public enum C54362bo implements C62957cd {
    UNSET(0),
    ENABLE_PERSONALIZATION(1),
    DISABLE_PERSONALIZATION(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f142807e;

    private C54362bo(int i) {
        this.f142807e = i;
    }

    /* renamed from: a */
    public static C54362bo m87369a(int i) {
        if (i == 0) {
            return UNSET;
        }
        if (i == 1) {
            return ENABLE_PERSONALIZATION;
        }
        if (i != 2) {
            return null;
        }
        return DISABLE_PERSONALIZATION;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f142807e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
