package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.an.c.a.y */
/* compiled from: PG */
public enum C49348y implements C62957cd {
    PRIORITY_NONE(0),
    PRIORITIZED(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f127553d;

    private C49348y(int i) {
        this.f127553d = i;
    }

    /* renamed from: a */
    public static C49348y m85417a(int i) {
        if (i == 0) {
            return PRIORITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return PRIORITIZED;
    }

    /* renamed from: b */
    public static C62959cf m85418b() {
        return C49347x.f127548a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f127553d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
