package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.s.a.gk */
/* compiled from: PG */
public enum C53236gk implements C62957cd {
    UNKNOWN_PRECIPITATION_TYPE(0),
    RAIN_PRECIPITATION_TYPE(1),
    SNOW_PRECIPITATION_TYPE(2);
    

    /* renamed from: d */
    public final int f139534d;

    private C53236gk(int i) {
        this.f139534d = i;
    }

    /* renamed from: a */
    public static C53236gk m86793a(int i) {
        if (i == 0) {
            return UNKNOWN_PRECIPITATION_TYPE;
        }
        if (i == 1) {
            return RAIN_PRECIPITATION_TYPE;
        }
        if (i != 2) {
            return null;
        }
        return SNOW_PRECIPITATION_TYPE;
    }

    /* renamed from: b */
    public static C62959cf m86794b() {
        return C53235gj.f139529a;
    }

    public final int getNumber() {
        return this.f139534d;
    }

    public final String toString() {
        return Integer.toString(this.f139534d);
    }
}
