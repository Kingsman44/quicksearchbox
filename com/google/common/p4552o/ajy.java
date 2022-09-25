package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.ajy */
/* compiled from: PG */
public enum ajy implements C62957cd {
    GCM(0),
    CLIENT_OP(1),
    REMINDER(2),
    CLIENT_SYNC(3),
    CLIENT_GENERATED(4);
    

    /* renamed from: f */
    public final int f158927f;

    private ajy(int i) {
        this.f158927f = i;
    }

    /* renamed from: a */
    public static ajy m92417a(int i) {
        if (i == 0) {
            return GCM;
        }
        if (i == 1) {
            return CLIENT_OP;
        }
        if (i == 2) {
            return REMINDER;
        }
        if (i == 3) {
            return CLIENT_SYNC;
        }
        if (i != 4) {
            return null;
        }
        return CLIENT_GENERATED;
    }

    /* renamed from: b */
    public static C62959cf m92418b() {
        return ajx.f158920a;
    }

    public final int getNumber() {
        return this.f158927f;
    }

    public final String toString() {
        return Integer.toString(this.f158927f);
    }
}
