package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.rp */
/* compiled from: PG */
public enum C52434rp implements C62957cd {
    UNKNOWN(0),
    PERSONAL_READOUT(1),
    THIRD_PARTY_DISCLOSURE(2);
    

    /* renamed from: d */
    public final int f137643d;

    private C52434rp(int i) {
        this.f137643d = i;
    }

    /* renamed from: a */
    public static C52434rp m86630a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PERSONAL_READOUT;
        }
        if (i != 2) {
            return null;
        }
        return THIRD_PARTY_DISCLOSURE;
    }

    /* renamed from: b */
    public static C62959cf m86631b() {
        return C52433ro.f137638a;
    }

    public final int getNumber() {
        return this.f137643d;
    }

    public final String toString() {
        return Integer.toString(this.f137643d);
    }
}
