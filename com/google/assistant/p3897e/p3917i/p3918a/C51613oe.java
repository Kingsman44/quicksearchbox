package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.oe */
/* compiled from: PG */
public enum C51613oe implements C62957cd {
    UNKNOWN_AUTH_MECHANISM(0),
    PASSWORD(1),
    FINGERPRINT(2);
    

    /* renamed from: d */
    public final int f134515d;

    private C51613oe(int i) {
        this.f134515d = i;
    }

    /* renamed from: a */
    public static C51613oe m86250a(int i) {
        if (i == 0) {
            return UNKNOWN_AUTH_MECHANISM;
        }
        if (i == 1) {
            return PASSWORD;
        }
        if (i != 2) {
            return null;
        }
        return FINGERPRINT;
    }

    /* renamed from: b */
    public static C62959cf m86251b() {
        return C51612od.f134510a;
    }

    public final int getNumber() {
        return this.f134515d;
    }

    public final String toString() {
        return Integer.toString(this.f134515d);
    }
}
