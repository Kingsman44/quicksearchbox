package com.google.assistant.p3897e.p3908d.p3909a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.d.a.k */
/* compiled from: PG */
public enum C51180k implements C62957cd {
    NO_OP(0),
    START_BBS(1),
    JOIN_BBS(2),
    SEND_RESPONSE(3),
    FINISH(4);
    

    /* renamed from: f */
    public final int f133220f;

    private C51180k(int i) {
        this.f133220f = i;
    }

    /* renamed from: a */
    public static C51180k m86072a(int i) {
        if (i == 0) {
            return NO_OP;
        }
        if (i == 1) {
            return START_BBS;
        }
        if (i == 2) {
            return JOIN_BBS;
        }
        if (i == 3) {
            return SEND_RESPONSE;
        }
        if (i != 4) {
            return null;
        }
        return FINISH;
    }

    /* renamed from: b */
    public static C62959cf m86073b() {
        return C51179j.f133213a;
    }

    public final int getNumber() {
        return this.f133220f;
    }

    public final String toString() {
        return Integer.toString(this.f133220f);
    }
}
