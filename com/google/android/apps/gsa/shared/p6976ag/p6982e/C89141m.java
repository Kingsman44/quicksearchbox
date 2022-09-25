package com.google.android.apps.gsa.shared.p6976ag.p6982e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.ag.e.m */
/* compiled from: PG */
public enum C89141m implements C62957cd {
    NOTDEFINED(0),
    OPA_AGSA(1);
    

    /* renamed from: c */
    private final int f241657c;

    private C89141m(int i) {
        this.f241657c = i;
    }

    /* renamed from: a */
    public static C89141m m145004a(int i) {
        if (i == 0) {
            return NOTDEFINED;
        }
        if (i != 1) {
            return null;
        }
        return OPA_AGSA;
    }

    /* renamed from: b */
    public static C62959cf m145005b() {
        return C89140l.f241653a;
    }

    public final int getNumber() {
        return this.f241657c;
    }

    public final String toString() {
        return Integer.toString(this.f241657c);
    }
}
