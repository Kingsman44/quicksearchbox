package com.google.nlp.p4735b.p4736a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.nlp.b.a.j */
/* compiled from: PG */
public enum C62843j implements C62957cd {
    UNKNOWN(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    FULL(4);
    

    /* renamed from: f */
    public final int f169719f;

    private C62843j(int i) {
        this.f169719f = i;
    }

    /* renamed from: a */
    public static C62843j m94949a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return LOW;
        }
        if (i == 2) {
            return MEDIUM;
        }
        if (i == 3) {
            return HIGH;
        }
        if (i != 4) {
            return null;
        }
        return FULL;
    }

    /* renamed from: b */
    public static C62959cf m94950b() {
        return C62842i.f169712a;
    }

    public final int getNumber() {
        return this.f169719f;
    }

    public final String toString() {
        return Integer.toString(this.f169719f);
    }
}
