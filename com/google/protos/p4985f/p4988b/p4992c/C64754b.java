package com.google.protos.p4985f.p4988b.p4992c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.f.b.c.b */
/* compiled from: PG */
public enum C64754b implements C62957cd {
    UNKNOWN_POCKET_SCOPE(0),
    POCKET_ENABLED(1),
    POCKET_DISABLED_FLAG(2),
    POCKET_DISABLED_DEVICE_MODEL(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f175536f;

    private C64754b(int i) {
        this.f175536f = i;
    }

    /* renamed from: a */
    public static C64754b m96454a(int i) {
        if (i == 0) {
            return UNKNOWN_POCKET_SCOPE;
        }
        if (i == 1) {
            return POCKET_ENABLED;
        }
        if (i == 2) {
            return POCKET_DISABLED_FLAG;
        }
        if (i != 3) {
            return null;
        }
        return POCKET_DISABLED_DEVICE_MODEL;
    }

    /* renamed from: b */
    public static C62959cf m96455b() {
        return C64753a.f175529a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f175536f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
