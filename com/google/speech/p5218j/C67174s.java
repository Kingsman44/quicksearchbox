package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.s */
/* compiled from: PG */
public enum C67174s implements C62957cd {
    INVALID(0),
    INT16(1),
    INT32(2),
    FLOAT32(3);
    

    /* renamed from: e */
    public final int f182587e;

    private C67174s(int i) {
        this.f182587e = i;
    }

    /* renamed from: a */
    public static C67174s m97431a(int i) {
        if (i == 0) {
            return INVALID;
        }
        if (i == 1) {
            return INT16;
        }
        if (i == 2) {
            return INT32;
        }
        if (i != 3) {
            return null;
        }
        return FLOAT32;
    }

    /* renamed from: b */
    public static C62959cf m97432b() {
        return C67173r.f182581a;
    }

    public final int getNumber() {
        return this.f182587e;
    }

    public final String toString() {
        return Integer.toString(this.f182587e);
    }
}
