package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.az */
/* compiled from: PG */
public enum C54968az implements C62957cd {
    TELEPHONY(0),
    REAR_FACING_CAMERA(1),
    FRONT_FACING_CAMERA(2);
    

    /* renamed from: d */
    private final int f144588d;

    private C54968az(int i) {
        this.f144588d = i;
    }

    /* renamed from: a */
    public static C54968az m87548a(int i) {
        if (i == 0) {
            return TELEPHONY;
        }
        if (i == 1) {
            return REAR_FACING_CAMERA;
        }
        if (i != 2) {
            return null;
        }
        return FRONT_FACING_CAMERA;
    }

    /* renamed from: b */
    public static C62959cf m87549b() {
        return C54967ay.f144583a;
    }

    public final int getNumber() {
        return this.f144588d;
    }

    public final String toString() {
        return Integer.toString(this.f144588d);
    }
}
