package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.cj */
/* compiled from: PG */
public enum C7583cj implements C62957cd {
    NONE(0),
    VTT(1),
    SUBRIP(2);
    

    /* renamed from: d */
    private final int f26199d;

    private C7583cj(int i) {
        this.f26199d = i;
    }

    /* renamed from: a */
    public static C7583cj m22785a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return VTT;
        }
        if (i != 2) {
            return null;
        }
        return SUBRIP;
    }

    /* renamed from: b */
    public static C62959cf m22786b() {
        return C7582ci.f26194a;
    }

    public final int getNumber() {
        return this.f26199d;
    }

    public final String toString() {
        return Integer.toString(this.f26199d);
    }
}
