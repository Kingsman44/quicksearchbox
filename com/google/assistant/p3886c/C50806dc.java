package com.google.assistant.p3886c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.dc */
/* compiled from: PG */
public enum C50806dc implements C62957cd {
    DEDUPING_BEHAVIOR_UNSPECIFIED(0),
    HIDE(1),
    UNBUNDLE(2);
    

    /* renamed from: d */
    public final int f132256d;

    private C50806dc(int i) {
        this.f132256d = i;
    }

    /* renamed from: a */
    public static C50806dc m85943a(int i) {
        if (i == 0) {
            return DEDUPING_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return HIDE;
        }
        if (i != 2) {
            return null;
        }
        return UNBUNDLE;
    }

    /* renamed from: b */
    public static C62959cf m85944b() {
        return C50805db.f132251a;
    }

    public final int getNumber() {
        return this.f132256d;
    }

    public final String toString() {
        return Integer.toString(this.f132256d);
    }
}
