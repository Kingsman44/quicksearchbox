package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.qi */
/* compiled from: PG */
public enum C52400qi implements C62957cd {
    TIME_FORMAT_UNKNOWN(0),
    TIME_FORMAT_12_HOUR(1),
    TIME_FORMAT_24_HOUR(2);
    

    /* renamed from: d */
    public final int f137507d;

    private C52400qi(int i) {
        this.f137507d = i;
    }

    /* renamed from: a */
    public static C52400qi m86612a(int i) {
        if (i == 0) {
            return TIME_FORMAT_UNKNOWN;
        }
        if (i == 1) {
            return TIME_FORMAT_12_HOUR;
        }
        if (i != 2) {
            return null;
        }
        return TIME_FORMAT_24_HOUR;
    }

    /* renamed from: b */
    public static C62959cf m86613b() {
        return C52399qh.f137502a;
    }

    public final int getNumber() {
        return this.f137507d;
    }

    public final String toString() {
        return Integer.toString(this.f137507d);
    }
}
