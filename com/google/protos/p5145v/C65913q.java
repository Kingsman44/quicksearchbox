package com.google.protos.p5145v;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.v.q */
/* compiled from: PG */
public enum C65913q implements C62957cd {
    UNKNOWN_ACTIVITY(0),
    NO_ACTIVITY(1),
    LOW_ACTIVITY(2),
    MEDIUM_ACTIVITY(3),
    HIGH_ACTIVITY(4),
    PENDING_ACTIVITY(5);
    

    /* renamed from: g */
    public final int f179260g;

    private C65913q(int i) {
        this.f179260g = i;
    }

    /* renamed from: a */
    public static C65913q m96825a(int i) {
        if (i == 0) {
            return UNKNOWN_ACTIVITY;
        }
        if (i == 1) {
            return NO_ACTIVITY;
        }
        if (i == 2) {
            return LOW_ACTIVITY;
        }
        if (i == 3) {
            return MEDIUM_ACTIVITY;
        }
        if (i == 4) {
            return HIGH_ACTIVITY;
        }
        if (i != 5) {
            return null;
        }
        return PENDING_ACTIVITY;
    }

    /* renamed from: b */
    public static C62959cf m96826b() {
        return C65912p.f179252a;
    }

    public final int getNumber() {
        return this.f179260g;
    }

    public final String toString() {
        return Integer.toString(this.f179260g);
    }
}
