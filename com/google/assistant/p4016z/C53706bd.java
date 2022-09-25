package com.google.assistant.p4016z;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.z.bd */
/* compiled from: PG */
public enum C53706bd implements C62957cd {
    UNKNOWN(0),
    CLOSE(1),
    MID(2),
    LONG(3);
    

    /* renamed from: e */
    public final int f140990e;

    private C53706bd(int i) {
        this.f140990e = i;
    }

    /* renamed from: a */
    public static C53706bd m86889a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CLOSE;
        }
        if (i == 2) {
            return MID;
        }
        if (i != 3) {
            return null;
        }
        return LONG;
    }

    /* renamed from: b */
    public static C62959cf m86890b() {
        return C53705bc.f140984a;
    }

    public final int getNumber() {
        return this.f140990e;
    }

    public final String toString() {
        return Integer.toString(this.f140990e);
    }
}
