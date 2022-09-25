package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.c.c.c */
/* compiled from: PG */
public enum C50982c implements C62957cd {
    UNDEFINED(1),
    ON(2),
    OFF(3);
    

    /* renamed from: d */
    public final int f132731d;

    private C50982c(int i) {
        this.f132731d = i;
    }

    /* renamed from: a */
    public static C50982c m86000a(int i) {
        if (i == 1) {
            return UNDEFINED;
        }
        if (i == 2) {
            return ON;
        }
        if (i != 3) {
            return null;
        }
        return OFF;
    }

    /* renamed from: b */
    public static C62959cf m86001b() {
        return C50955b.f132655a;
    }

    public final int getNumber() {
        return this.f132731d;
    }

    public final String toString() {
        return Integer.toString(this.f132731d);
    }
}
