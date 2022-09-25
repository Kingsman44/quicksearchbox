package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.ew */
/* compiled from: PG */
public enum C51361ew implements C62957cd {
    UNKNOWN(0),
    LIGHT_THEME(1),
    DARK_THEME(2);
    

    /* renamed from: d */
    public final int f133779d;

    private C51361ew(int i) {
        this.f133779d = i;
    }

    /* renamed from: a */
    public static C51361ew m86150a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return LIGHT_THEME;
        }
        if (i != 2) {
            return null;
        }
        return DARK_THEME;
    }

    /* renamed from: b */
    public static C62959cf m86151b() {
        return C51360ev.f133774a;
    }

    public final int getNumber() {
        return this.f133779d;
    }

    public final String toString() {
        return Integer.toString(this.f133779d);
    }
}
