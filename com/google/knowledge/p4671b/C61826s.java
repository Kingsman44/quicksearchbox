package com.google.knowledge.p4671b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.knowledge.b.s */
/* compiled from: PG */
public enum C61826s implements C62957cd {
    OPA_OPT_IN_STATUS_UNKNOWN(0),
    OPA_OPT_IN_STATUS_DISABLED(1),
    OPA_OPT_IN_STATUS_ENABLED(2);
    

    /* renamed from: d */
    public final int f167079d;

    private C61826s(int i) {
        this.f167079d = i;
    }

    /* renamed from: a */
    public static C61826s m94481a(int i) {
        if (i == 0) {
            return OPA_OPT_IN_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return OPA_OPT_IN_STATUS_DISABLED;
        }
        if (i != 2) {
            return null;
        }
        return OPA_OPT_IN_STATUS_ENABLED;
    }

    /* renamed from: b */
    public static C62959cf m94482b() {
        return C61825r.f167074a;
    }

    public final int getNumber() {
        return this.f167079d;
    }

    public final String toString() {
        return Integer.toString(this.f167079d);
    }
}
