package com.google.android.apps.gsa.shared.p6976ag.p6982e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.ag.e.i */
/* compiled from: PG */
public enum C89137i implements C62957cd {
    UNSPECIFIED(0),
    FLUIDACTIONS(1),
    SERVER(2),
    PORTMON(3),
    NGA(4);
    

    /* renamed from: f */
    private final int f241646f;

    private C89137i(int i) {
        this.f241646f = i;
    }

    /* renamed from: a */
    public static C89137i m145000a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return FLUIDACTIONS;
        }
        if (i == 2) {
            return SERVER;
        }
        if (i == 3) {
            return PORTMON;
        }
        if (i != 4) {
            return null;
        }
        return NGA;
    }

    /* renamed from: b */
    public static C62959cf m145001b() {
        return C89136h.f241639a;
    }

    public final int getNumber() {
        return this.f241646f;
    }

    public final String toString() {
        return Integer.toString(this.f241646f);
    }
}
