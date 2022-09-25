package com.google.android.apps.search.p8936a.p8937a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.a.a.c */
/* compiled from: PG */
public enum C119167c implements C62957cd {
    DEFAULT(0),
    AGSA(1),
    WEB(2);
    

    /* renamed from: d */
    public final int f332347d;

    private C119167c(int i) {
        this.f332347d = i;
    }

    /* renamed from: a */
    public static C119167c m197876a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return AGSA;
        }
        if (i != 2) {
            return null;
        }
        return WEB;
    }

    /* renamed from: b */
    public static C62959cf m197877b() {
        return C119166b.f332342a;
    }

    public final int getNumber() {
        return this.f332347d;
    }

    public final String toString() {
        return Integer.toString(this.f332347d);
    }
}
