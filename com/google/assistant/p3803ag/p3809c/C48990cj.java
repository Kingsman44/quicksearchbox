package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.c.cj */
/* compiled from: PG */
public enum C48990cj implements C62957cd {
    UNSPECIFIED(0),
    OFFLINE(1),
    ONLINE(2);
    

    /* renamed from: d */
    private final int f126735d;

    private C48990cj(int i) {
        this.f126735d = i;
    }

    /* renamed from: a */
    public static C48990cj m85334a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return OFFLINE;
        }
        if (i != 2) {
            return null;
        }
        return ONLINE;
    }

    /* renamed from: b */
    public static C62959cf m85335b() {
        return C48989ci.f126730a;
    }

    public final int getNumber() {
        return this.f126735d;
    }

    public final String toString() {
        return Integer.toString(this.f126735d);
    }
}
