package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.zm */
/* compiled from: PG */
public enum C60697zm implements C62957cd {
    DEVICE_TYPE_TIER_UNKNOWN(0),
    DEVICE_TYPE_TIER1(1),
    DEVICE_TYPE_TIER1_EXPANSION(2),
    DEVICE_TYPE_TIER2(3);
    

    /* renamed from: e */
    public final int f164687e;

    private C60697zm(int i) {
        this.f164687e = i;
    }

    /* renamed from: a */
    public static C60697zm m92634a(int i) {
        if (i == 0) {
            return DEVICE_TYPE_TIER_UNKNOWN;
        }
        if (i == 1) {
            return DEVICE_TYPE_TIER1;
        }
        if (i == 2) {
            return DEVICE_TYPE_TIER1_EXPANSION;
        }
        if (i != 3) {
            return null;
        }
        return DEVICE_TYPE_TIER2;
    }

    /* renamed from: b */
    public static C62959cf m92635b() {
        return C60696zl.f164681a;
    }

    public final int getNumber() {
        return this.f164687e;
    }

    public final String toString() {
        return Integer.toString(this.f164687e);
    }
}
