package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.dr */
/* compiled from: PG */
public enum C51329dr implements C62957cd {
    UNKNOWN_STATUS(0),
    NOT_DISCLOSED(1),
    DISCLOSED(2);
    

    /* renamed from: d */
    public final int f133640d;

    private C51329dr(int i) {
        this.f133640d = i;
    }

    /* renamed from: a */
    public static C51329dr m86133a(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return NOT_DISCLOSED;
        }
        if (i != 2) {
            return null;
        }
        return DISCLOSED;
    }

    /* renamed from: b */
    public static C62959cf m86134b() {
        return C51328dq.f133635a;
    }

    public final int getNumber() {
        return this.f133640d;
    }

    public final String toString() {
        return Integer.toString(this.f133640d);
    }
}
