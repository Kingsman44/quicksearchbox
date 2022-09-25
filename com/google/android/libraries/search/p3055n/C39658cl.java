package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.n.cl */
/* compiled from: PG */
public enum C39658cl implements C62957cd {
    DEFAULT_UNKNOWN(0),
    SUCCESS(1),
    COMPATIBILITY_CHECK_FAILED(2),
    INTERNAL_FAILURE(3);
    

    /* renamed from: e */
    public final int f104396e;

    private C39658cl(int i) {
        this.f104396e = i;
    }

    /* renamed from: a */
    public static C39658cl m69121a(int i) {
        if (i == 0) {
            return DEFAULT_UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return COMPATIBILITY_CHECK_FAILED;
        }
        if (i != 3) {
            return null;
        }
        return INTERNAL_FAILURE;
    }

    /* renamed from: b */
    public static C62959cf m69122b() {
        return C39657ck.f104390a;
    }

    public final int getNumber() {
        return this.f104396e;
    }

    public final String toString() {
        return Integer.toString(this.f104396e);
    }
}
