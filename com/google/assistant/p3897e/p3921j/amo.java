package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.amo */
/* compiled from: PG */
public enum amo implements C62957cd {
    UNKNOWN(0),
    TRUSTED(1),
    UNTRUSTED(2);
    

    /* renamed from: d */
    public final int f135383d;

    private amo(int i) {
        this.f135383d = i;
    }

    /* renamed from: a */
    public static amo m86343a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return TRUSTED;
        }
        if (i != 2) {
            return null;
        }
        return UNTRUSTED;
    }

    /* renamed from: b */
    public static C62959cf m86344b() {
        return amn.f135378a;
    }

    public final int getNumber() {
        return this.f135383d;
    }

    public final String toString() {
        return Integer.toString(this.f135383d);
    }
}
