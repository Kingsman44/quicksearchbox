package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.he */
/* compiled from: PG */
public enum C66996he implements C62957cd {
    DEFAULT_OPTIMIZE_QUALITY(0),
    OPTIMIZE_LATENCY(1);
    

    /* renamed from: c */
    public final int f182097c;

    private C66996he(int i) {
        this.f182097c = i;
    }

    /* renamed from: a */
    public static C66996he m97404a(int i) {
        if (i == 0) {
            return DEFAULT_OPTIMIZE_QUALITY;
        }
        if (i != 1) {
            return null;
        }
        return OPTIMIZE_LATENCY;
    }

    /* renamed from: b */
    public static C62959cf m97405b() {
        return C66995hd.f182093a;
    }

    public final int getNumber() {
        return this.f182097c;
    }

    public final String toString() {
        return Integer.toString(this.f182097c);
    }
}
