package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.uo */
/* compiled from: PG */
public enum C8074uo implements C62957cd {
    CHECKED(1),
    NEUTRAL(2),
    UNCHECKED(3);
    

    /* renamed from: d */
    public final int f28417d;

    private C8074uo(int i) {
        this.f28417d = i;
    }

    /* renamed from: a */
    public static C8074uo m22931a(int i) {
        if (i == 1) {
            return CHECKED;
        }
        if (i == 2) {
            return NEUTRAL;
        }
        if (i != 3) {
            return null;
        }
        return UNCHECKED;
    }

    /* renamed from: b */
    public static C62959cf m22932b() {
        return C8073un.f28412a;
    }

    public final int getNumber() {
        return this.f28417d;
    }

    public final String toString() {
        return Integer.toString(this.f28417d);
    }
}
