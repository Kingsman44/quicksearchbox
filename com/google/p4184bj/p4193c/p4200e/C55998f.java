package com.google.p4184bj.p4193c.p4200e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bj.c.e.f */
/* compiled from: PG */
public enum C55998f implements C62957cd {
    UNKNOWN(0),
    INCOMPLETE(1),
    COMPLETED(2),
    CANCELED(3),
    NATIVE_IMPRESSION(4),
    WEB_IMPRESSION(5);
    

    /* renamed from: g */
    public final int f149132g;

    private C55998f(int i) {
        this.f149132g = i;
    }

    /* renamed from: a */
    public static C55998f m87878a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return INCOMPLETE;
        }
        if (i == 2) {
            return COMPLETED;
        }
        if (i == 3) {
            return CANCELED;
        }
        if (i == 4) {
            return NATIVE_IMPRESSION;
        }
        if (i != 5) {
            return null;
        }
        return WEB_IMPRESSION;
    }

    /* renamed from: b */
    public static C62959cf m87879b() {
        return C55997e.f149124a;
    }

    public final int getNumber() {
        return this.f149132g;
    }

    public final String toString() {
        return Integer.toString(this.f149132g);
    }
}
