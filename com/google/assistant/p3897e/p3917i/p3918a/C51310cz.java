package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.cz */
/* compiled from: PG */
public enum C51310cz implements C62957cd {
    UNKNOWN_LOCKED_STATUS(0),
    DEVICE_LOCKED(1),
    DEVICE_UNLOCKED(2);
    

    /* renamed from: d */
    public final int f133578d;

    private C51310cz(int i) {
        this.f133578d = i;
    }

    /* renamed from: a */
    public static C51310cz m86121a(int i) {
        if (i == 0) {
            return UNKNOWN_LOCKED_STATUS;
        }
        if (i == 1) {
            return DEVICE_LOCKED;
        }
        if (i != 2) {
            return null;
        }
        return DEVICE_UNLOCKED;
    }

    /* renamed from: b */
    public static C62959cf m86122b() {
        return C51309cy.f133573a;
    }

    public final int getNumber() {
        return this.f133578d;
    }

    public final String toString() {
        return Integer.toString(this.f133578d);
    }
}
