package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.nx */
/* compiled from: PG */
public enum C51605nx implements C62957cd {
    UNKNOWN(0),
    AGGREGATED(1),
    CALL(2),
    TEXT(3);
    

    /* renamed from: e */
    public final int f134496e;

    private C51605nx(int i) {
        this.f134496e = i;
    }

    /* renamed from: a */
    public static C51605nx m86246a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AGGREGATED;
        }
        if (i == 2) {
            return CALL;
        }
        if (i != 3) {
            return null;
        }
        return TEXT;
    }

    /* renamed from: b */
    public static C62959cf m86247b() {
        return C51604nw.f134490a;
    }

    public final int getNumber() {
        return this.f134496e;
    }

    public final String toString() {
        return Integer.toString(this.f134496e);
    }
}
