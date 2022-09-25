package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.opa.f.a.af */
/* compiled from: PG */
public enum C83617af implements C62957cd {
    UNKNOWN(0),
    INVALID_REQUEST(1);
    

    /* renamed from: c */
    public final int f227961c;

    private C83617af(int i) {
        this.f227961c = i;
    }

    /* renamed from: a */
    public static C83617af m133196a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return INVALID_REQUEST;
    }

    /* renamed from: b */
    public static C62959cf m133197b() {
        return C83616ae.f227957a;
    }

    public final int getNumber() {
        return this.f227961c;
    }

    public final String toString() {
        return Integer.toString(this.f227961c);
    }
}
