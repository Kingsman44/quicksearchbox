package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.c.ez */
/* compiled from: PG */
public enum C49060ez implements C62957cd {
    UNKNOWN(0),
    DISMISSED(1),
    TAPPED(2),
    DELIVERED(3);
    

    /* renamed from: e */
    public final int f126905e;

    private C49060ez(int i) {
        this.f126905e = i;
    }

    /* renamed from: a */
    public static C49060ez m85355a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return DISMISSED;
        }
        if (i == 2) {
            return TAPPED;
        }
        if (i != 3) {
            return null;
        }
        return DELIVERED;
    }

    /* renamed from: b */
    public static C62959cf m85356b() {
        return C49059ey.f126899a;
    }

    public final int getNumber() {
        return this.f126905e;
    }

    public final String toString() {
        return Integer.toString(this.f126905e);
    }
}
