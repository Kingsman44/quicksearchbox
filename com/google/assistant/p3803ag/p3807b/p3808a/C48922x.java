package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.b.a.x */
/* compiled from: PG */
public enum C48922x implements C62957cd {
    UNKNOWN(0),
    NOT_ACTIVE(1),
    ACTIVE(2);
    

    /* renamed from: d */
    public final int f126599d;

    private C48922x(int i) {
        this.f126599d = i;
    }

    /* renamed from: a */
    public static C48922x m85306a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NOT_ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return ACTIVE;
    }

    /* renamed from: b */
    public static C62959cf m85307b() {
        return C48921w.f126594a;
    }

    public final int getNumber() {
        return this.f126599d;
    }

    public final String toString() {
        return Integer.toString(this.f126599d);
    }
}
