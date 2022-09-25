package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.ed */
/* compiled from: PG */
public enum C37563ed implements C62957cd {
    UNKNOWN_OPENING_SUCCESS(0),
    OPENED(1),
    OPENED_SEAMLESSLY(2);
    

    /* renamed from: d */
    public final int f99809d;

    private C37563ed(int i) {
        this.f99809d = i;
    }

    /* renamed from: a */
    public static C37563ed m66571a(int i) {
        if (i == 0) {
            return UNKNOWN_OPENING_SUCCESS;
        }
        if (i == 1) {
            return OPENED;
        }
        if (i != 2) {
            return null;
        }
        return OPENED_SEAMLESSLY;
    }

    /* renamed from: b */
    public static C62959cf m66572b() {
        return C37562ec.f99804a;
    }

    public final int getNumber() {
        return this.f99809d;
    }

    public final String toString() {
        return Integer.toString(this.f99809d);
    }
}
