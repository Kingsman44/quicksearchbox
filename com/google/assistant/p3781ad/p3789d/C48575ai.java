package com.google.assistant.p3781ad.p3789d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ad.d.ai */
/* compiled from: PG */
public enum C48575ai implements C62957cd {
    UNKNOWN(0),
    PUBLIC(1),
    PRIVATE(2);
    

    /* renamed from: d */
    public final int f125493d;

    private C48575ai(int i) {
        this.f125493d = i;
    }

    /* renamed from: a */
    public static C48575ai m85237a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PUBLIC;
        }
        if (i != 2) {
            return null;
        }
        return PRIVATE;
    }

    /* renamed from: b */
    public static C62959cf m85238b() {
        return C48574ah.f125488a;
    }

    public final int getNumber() {
        return this.f125493d;
    }

    public final String toString() {
        return Integer.toString(this.f125493d);
    }
}
