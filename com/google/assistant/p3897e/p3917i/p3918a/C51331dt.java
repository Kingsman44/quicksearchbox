package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.dt */
/* compiled from: PG */
public enum C51331dt implements C62957cd {
    UNKNOWN_TRIGGER_TRUST_LEVEL(0),
    UNTRUSTED(1),
    TRUSTED(3),
    FULLY_TRUSTED(2);
    

    /* renamed from: e */
    public final int f133647e;

    private C51331dt(int i) {
        this.f133647e = i;
    }

    /* renamed from: a */
    public static C51331dt m86135a(int i) {
        if (i == 0) {
            return UNKNOWN_TRIGGER_TRUST_LEVEL;
        }
        if (i == 1) {
            return UNTRUSTED;
        }
        if (i == 2) {
            return FULLY_TRUSTED;
        }
        if (i != 3) {
            return null;
        }
        return TRUSTED;
    }

    /* renamed from: b */
    public static C62959cf m86136b() {
        return C51330ds.f133641a;
    }

    public final int getNumber() {
        return this.f133647e;
    }

    public final String toString() {
        return Integer.toString(this.f133647e);
    }
}
