package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.c.al */
/* compiled from: PG */
public enum C48938al implements C62957cd {
    UNKNOWN_WIRED_HEADPHONE_STATUS(0),
    PLUGGED(1),
    UNPLUGGED(2);
    

    /* renamed from: d */
    public final int f126627d;

    private C48938al(int i) {
        this.f126627d = i;
    }

    /* renamed from: a */
    public static C48938al m85313a(int i) {
        if (i == 0) {
            return UNKNOWN_WIRED_HEADPHONE_STATUS;
        }
        if (i == 1) {
            return PLUGGED;
        }
        if (i != 2) {
            return null;
        }
        return UNPLUGGED;
    }

    /* renamed from: b */
    public static C62959cf m85314b() {
        return C48937ak.f126622a;
    }

    public final int getNumber() {
        return this.f126627d;
    }

    public final String toString() {
        return Integer.toString(this.f126627d);
    }
}
