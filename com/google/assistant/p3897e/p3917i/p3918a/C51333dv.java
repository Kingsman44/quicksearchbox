package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.dv */
/* compiled from: PG */
public enum C51333dv implements C62957cd {
    UNKNOWN_USER_CREDENTIAL_STATUS(0),
    SIGNED_IN_AND_OPTED_IN(1),
    RETAIL_MODE(2),
    SIGNED_OUT(3),
    BLOCKED_BY_NETWORK_CHANGED(4),
    HOSPITALITY_MODE(5);
    

    /* renamed from: g */
    public final int f133656g;

    private C51333dv(int i) {
        this.f133656g = i;
    }

    /* renamed from: a */
    public static C51333dv m86137a(int i) {
        if (i == 0) {
            return UNKNOWN_USER_CREDENTIAL_STATUS;
        }
        if (i == 1) {
            return SIGNED_IN_AND_OPTED_IN;
        }
        if (i == 2) {
            return RETAIL_MODE;
        }
        if (i == 3) {
            return SIGNED_OUT;
        }
        if (i == 4) {
            return BLOCKED_BY_NETWORK_CHANGED;
        }
        if (i != 5) {
            return null;
        }
        return HOSPITALITY_MODE;
    }

    /* renamed from: b */
    public static C62959cf m86138b() {
        return C51332du.f133648a;
    }

    public final int getNumber() {
        return this.f133656g;
    }

    public final String toString() {
        return Integer.toString(this.f133656g);
    }
}
