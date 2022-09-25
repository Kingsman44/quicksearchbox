package com.google.protos.p5145v;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.protos.v.h */
/* compiled from: PG */
public enum C65904h implements C62957cd {
    UNKNOWN_FEATURE_TYPE(0),
    APP_OPEN(1),
    SEARCH(2);
    

    /* renamed from: d */
    public final int f179235d;

    private C65904h(int i) {
        this.f179235d = i;
    }

    /* renamed from: a */
    public static C65904h m96824a(int i) {
        if (i == 0) {
            return UNKNOWN_FEATURE_TYPE;
        }
        if (i == 1) {
            return APP_OPEN;
        }
        if (i != 2) {
            return null;
        }
        return SEARCH;
    }

    public final int getNumber() {
        return this.f179235d;
    }

    public final String toString() {
        return Integer.toString(this.f179235d);
    }
}
