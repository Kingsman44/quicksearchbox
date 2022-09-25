package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.y.a.bj */
/* compiled from: PG */
public enum C53577bj implements C62957cd {
    PRIORITY_UNKNOWN(0),
    PRIORITY_LOW(1),
    PRIORITY_HIGH(2);
    

    /* renamed from: d */
    public final int f140624d;

    private C53577bj(int i) {
        this.f140624d = i;
    }

    /* renamed from: a */
    public static C53577bj m86874a(int i) {
        if (i == 0) {
            return PRIORITY_UNKNOWN;
        }
        if (i == 1) {
            return PRIORITY_LOW;
        }
        if (i != 2) {
            return null;
        }
        return PRIORITY_HIGH;
    }

    /* renamed from: b */
    public static C62959cf m86875b() {
        return C53576bi.f140619a;
    }

    public final int getNumber() {
        return this.f140624d;
    }

    public final String toString() {
        return Integer.toString(this.f140624d);
    }
}
