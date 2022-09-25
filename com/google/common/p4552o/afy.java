package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.afy */
/* compiled from: PG */
public enum afy implements C62957cd {
    UNKNOWN(0),
    OK(1),
    FILTERED_ON_DEVICE_BLACKLIST(2),
    FILTERED_QUERY_REWRITER(3),
    FILTERED_UNDERSTANDING_FILTER(4),
    FILTERED_OTHER(5);
    

    /* renamed from: g */
    public final int f158593g;

    private afy(int i) {
        this.f158593g = i;
    }

    /* renamed from: a */
    public static afy m92393a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OK;
        }
        if (i == 2) {
            return FILTERED_ON_DEVICE_BLACKLIST;
        }
        if (i == 3) {
            return FILTERED_QUERY_REWRITER;
        }
        if (i == 4) {
            return FILTERED_UNDERSTANDING_FILTER;
        }
        if (i != 5) {
            return null;
        }
        return FILTERED_OTHER;
    }

    /* renamed from: b */
    public static C62959cf m92394b() {
        return afx.f158585a;
    }

    public final int getNumber() {
        return this.f158593g;
    }

    public final String toString() {
        return Integer.toString(this.f158593g);
    }
}
