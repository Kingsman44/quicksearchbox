package com.google.p4184bj.p4204d.p4205a.p4209d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bj.d.a.d.b */
/* compiled from: PG */
public enum C56016b implements C62957cd {
    UNSPECIFIED_TEMPERATURE_UNIT(0),
    CELSIUS(1),
    FAHRENHEIT(2);
    

    /* renamed from: d */
    public final int f149184d;

    private C56016b(int i) {
        this.f149184d = i;
    }

    /* renamed from: a */
    public static C56016b m87883a(int i) {
        if (i == 0) {
            return UNSPECIFIED_TEMPERATURE_UNIT;
        }
        if (i == 1) {
            return CELSIUS;
        }
        if (i != 2) {
            return null;
        }
        return FAHRENHEIT;
    }

    /* renamed from: b */
    public static C62959cf m87884b() {
        return C56015a.f149179a;
    }

    public final int getNumber() {
        return this.f149184d;
    }

    public final String toString() {
        return Integer.toString(this.f149184d);
    }
}
