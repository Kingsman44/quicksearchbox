package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.c.ap */
/* compiled from: PG */
public enum C48942ap implements C62957cd {
    UNSPECIFIED(0),
    VEHICLE_INIT(1),
    PRE_DRIVE(2),
    DURING_DRIVE(3),
    POST_DRIVE(4);
    

    /* renamed from: f */
    private final int f126639f;

    private C48942ap(int i) {
        this.f126639f = i;
    }

    /* renamed from: a */
    public static C48942ap m85315a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return VEHICLE_INIT;
        }
        if (i == 2) {
            return PRE_DRIVE;
        }
        if (i == 3) {
            return DURING_DRIVE;
        }
        if (i != 4) {
            return null;
        }
        return POST_DRIVE;
    }

    /* renamed from: b */
    public static C62959cf m85316b() {
        return C48941ao.f126632a;
    }

    public final int getNumber() {
        return this.f126639f;
    }

    public final String toString() {
        return Integer.toString(this.f126639f);
    }
}
