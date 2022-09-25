package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.io */
/* compiled from: PG */
public enum C67033io implements C62957cd {
    GH_INTERVAL_GUEST(0),
    GH_INTERVAL_UNLIKELY_USER(1),
    GH_INTERVAL_USER(2),
    GH_INTERVAL_TRUSTED_USER(3);
    

    /* renamed from: e */
    public final int f182207e;

    private C67033io(int i) {
        this.f182207e = i;
    }

    /* renamed from: a */
    public static C67033io m97411a(int i) {
        if (i == 0) {
            return GH_INTERVAL_GUEST;
        }
        if (i == 1) {
            return GH_INTERVAL_UNLIKELY_USER;
        }
        if (i == 2) {
            return GH_INTERVAL_USER;
        }
        if (i != 3) {
            return null;
        }
        return GH_INTERVAL_TRUSTED_USER;
    }

    /* renamed from: b */
    public static C62959cf m97412b() {
        return C67032in.f182201a;
    }

    public final int getNumber() {
        return this.f182207e;
    }

    public final String toString() {
        return Integer.toString(this.f182207e);
    }
}
