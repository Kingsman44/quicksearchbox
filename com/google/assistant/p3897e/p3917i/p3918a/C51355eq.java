package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.eq */
/* compiled from: PG */
public enum C51355eq implements C62957cd {
    UNKNOWN(0),
    LANDSCAPE(1),
    PORTRAIT(2);
    

    /* renamed from: d */
    public final int f133762d;

    private C51355eq(int i) {
        this.f133762d = i;
    }

    /* renamed from: a */
    public static C51355eq m86146a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return LANDSCAPE;
        }
        if (i != 2) {
            return null;
        }
        return PORTRAIT;
    }

    /* renamed from: b */
    public static C62959cf m86147b() {
        return C51354ep.f133757a;
    }

    public final int getNumber() {
        return this.f133762d;
    }

    public final String toString() {
        return Integer.toString(this.f133762d);
    }
}
