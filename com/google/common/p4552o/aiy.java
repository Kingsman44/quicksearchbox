package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.aiy */
/* compiled from: PG */
public enum aiy implements C62957cd {
    UNKNOWN(0),
    AUTO_MODE(1),
    MANUAL_MODE(2),
    KEYBOARD_MODE(3);
    

    /* renamed from: e */
    public final int f158856e;

    private aiy(int i) {
        this.f158856e = i;
    }

    /* renamed from: a */
    public static aiy m92405a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AUTO_MODE;
        }
        if (i == 2) {
            return MANUAL_MODE;
        }
        if (i != 3) {
            return null;
        }
        return KEYBOARD_MODE;
    }

    /* renamed from: b */
    public static C62959cf m92406b() {
        return aix.f158850a;
    }

    public final int getNumber() {
        return this.f158856e;
    }

    public final String toString() {
        return Integer.toString(this.f158856e);
    }
}
