package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bj.c.c.j */
/* compiled from: PG */
public enum C55974j implements C62957cd {
    PROMOTABILITY_UNKNOWN(0),
    CAN_ASK_FOR_CONSENT(1),
    ALREADY_CONSENTED(2),
    CANNOT_CONSENT(3),
    CONSENT_DEPRECATED(4);
    

    /* renamed from: f */
    public final int f149061f;

    private C55974j(int i) {
        this.f149061f = i;
    }

    /* renamed from: a */
    public static C55974j m87872a(int i) {
        if (i == 0) {
            return PROMOTABILITY_UNKNOWN;
        }
        if (i == 1) {
            return CAN_ASK_FOR_CONSENT;
        }
        if (i == 2) {
            return ALREADY_CONSENTED;
        }
        if (i == 3) {
            return CANNOT_CONSENT;
        }
        if (i != 4) {
            return null;
        }
        return CONSENT_DEPRECATED;
    }

    /* renamed from: b */
    public static C62959cf m87873b() {
        return C55973i.f149054a;
    }

    public final int getNumber() {
        return this.f149061f;
    }

    public final String toString() {
        return Integer.toString(this.f149061f);
    }
}
