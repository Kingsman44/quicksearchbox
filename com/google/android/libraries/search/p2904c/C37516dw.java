package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.dw */
/* compiled from: PG */
public enum C37516dw implements C62957cd {
    UNKNOWN_CLOSING_SUCCESS(0),
    CLOSED(1),
    KEPT_OPEN_FOR_SEAMLESS_HANDOVER(2);
    

    /* renamed from: d */
    public final int f99638d;

    private C37516dw(int i) {
        this.f99638d = i;
    }

    /* renamed from: a */
    public static C37516dw m66521a(int i) {
        if (i == 0) {
            return UNKNOWN_CLOSING_SUCCESS;
        }
        if (i == 1) {
            return CLOSED;
        }
        if (i != 2) {
            return null;
        }
        return KEPT_OPEN_FOR_SEAMLESS_HANDOVER;
    }

    /* renamed from: b */
    public static C62959cf m66522b() {
        return C37515dv.f99633a;
    }

    public final int getNumber() {
        return this.f99638d;
    }

    public final String toString() {
        return Integer.toString(this.f99638d);
    }
}
