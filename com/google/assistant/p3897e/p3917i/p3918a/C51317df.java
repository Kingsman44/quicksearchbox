package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.df */
/* compiled from: PG */
public enum C51317df implements C62957cd {
    UNKNOWN_KEYGUARD_LOCKED_STATUS(0),
    KEYGUARD_LOCKED(1),
    KEYGUARD_UNLOCKED(2);
    

    /* renamed from: d */
    public final int f133611d;

    private C51317df(int i) {
        this.f133611d = i;
    }

    /* renamed from: a */
    public static C51317df m86125a(int i) {
        if (i == 0) {
            return UNKNOWN_KEYGUARD_LOCKED_STATUS;
        }
        if (i == 1) {
            return KEYGUARD_LOCKED;
        }
        if (i != 2) {
            return null;
        }
        return KEYGUARD_UNLOCKED;
    }

    /* renamed from: b */
    public static C62959cf m86126b() {
        return C51316de.f133606a;
    }

    public final int getNumber() {
        return this.f133611d;
    }

    public final String toString() {
        return Integer.toString(this.f133611d);
    }
}
