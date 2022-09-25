package com.google.knowledge.p4671b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.knowledge.b.u */
/* compiled from: PG */
public enum C61828u implements C62957cd {
    OPA_PARTIAL_EXPERIENCE_REASON_UNKNOWN(0),
    OPA_TRY_BEFORE_YOU_BUY(1),
    OPA_UDC_OPT_OUT_FLOW(2);
    

    /* renamed from: d */
    public final int f167085d;

    private C61828u(int i) {
        this.f167085d = i;
    }

    /* renamed from: a */
    public static C61828u m94483a(int i) {
        if (i == 0) {
            return OPA_PARTIAL_EXPERIENCE_REASON_UNKNOWN;
        }
        if (i == 1) {
            return OPA_TRY_BEFORE_YOU_BUY;
        }
        if (i != 2) {
            return null;
        }
        return OPA_UDC_OPT_OUT_FLOW;
    }

    /* renamed from: b */
    public static C62959cf m94484b() {
        return C61827t.f167080a;
    }

    public final int getNumber() {
        return this.f167085d;
    }

    public final String toString() {
        return Integer.toString(this.f167085d);
    }
}
