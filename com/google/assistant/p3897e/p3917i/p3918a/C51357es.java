package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.es */
/* compiled from: PG */
public enum C51357es implements C62957cd {
    UNKNOWN_SCREEN_STATE(0),
    ON(1),
    OFF(2);
    

    /* renamed from: d */
    public final int f133768d;

    private C51357es(int i) {
        this.f133768d = i;
    }

    /* renamed from: a */
    public static C51357es m86148a(int i) {
        if (i == 0) {
            return UNKNOWN_SCREEN_STATE;
        }
        if (i == 1) {
            return ON;
        }
        if (i != 2) {
            return null;
        }
        return OFF;
    }

    /* renamed from: b */
    public static C62959cf m86149b() {
        return C51356er.f133763a;
    }

    public final int getNumber() {
        return this.f133768d;
    }

    public final String toString() {
        return Integer.toString(this.f133768d);
    }
}
