package com.google.assistant.p3886c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.cp */
/* compiled from: PG */
public enum C50792cp implements C62957cd {
    PRIORITY_UNDEFINED(0),
    PRIMARY(1),
    SECONDARY(2),
    OTHER(3);
    

    /* renamed from: e */
    public final int f132174e;

    private C50792cp(int i) {
        this.f132174e = i;
    }

    /* renamed from: a */
    public static C50792cp m85936a(int i) {
        if (i == 0) {
            return PRIORITY_UNDEFINED;
        }
        if (i == 1) {
            return PRIMARY;
        }
        if (i == 2) {
            return SECONDARY;
        }
        if (i != 3) {
            return null;
        }
        return OTHER;
    }

    /* renamed from: b */
    public static C62959cf m85937b() {
        return C50791co.f132168a;
    }

    public final int getNumber() {
        return this.f132174e;
    }

    public final String toString() {
        return Integer.toString(this.f132174e);
    }
}
