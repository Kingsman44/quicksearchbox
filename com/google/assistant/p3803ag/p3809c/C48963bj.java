package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.c.bj */
/* compiled from: PG */
public enum C48963bj implements C62957cd {
    UNSPECIFIED(0),
    NO_NAVIGATION(1),
    GUIDED_NAVIGATION(2),
    FREE_NAVIGATION(3);
    

    /* renamed from: e */
    private final int f126679e;

    private C48963bj(int i) {
        this.f126679e = i;
    }

    /* renamed from: a */
    public static C48963bj m85326a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return NO_NAVIGATION;
        }
        if (i == 2) {
            return GUIDED_NAVIGATION;
        }
        if (i != 3) {
            return null;
        }
        return FREE_NAVIGATION;
    }

    /* renamed from: b */
    public static C62959cf m85327b() {
        return C48962bi.f126673a;
    }

    public final int getNumber() {
        return this.f126679e;
    }

    public final String toString() {
        return Integer.toString(this.f126679e);
    }
}
