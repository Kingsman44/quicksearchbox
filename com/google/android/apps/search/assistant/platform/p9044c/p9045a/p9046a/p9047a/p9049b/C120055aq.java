package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.aq */
/* compiled from: PG */
public enum C120055aq implements C62957cd {
    UNKNOWN(0),
    CLASSIC(1),
    APA(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f334230e;

    private C120055aq(int i) {
        this.f334230e = i;
    }

    /* renamed from: a */
    public static C120055aq m198956a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CLASSIC;
        }
        if (i != 2) {
            return null;
        }
        return APA;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f334230e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
