package com.google.android.apps.search.googleapp.customtabs.p10151c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.s */
/* compiled from: PG */
public enum C133697s implements C62957cd {
    UNKNOWN(0),
    AVAILABLE(1),
    NOT_AVAILABLE_ACCOUNT_MISMATCH_TOAST_NOT_SUPPORTED(2),
    NOT_AVAILABLE_FIRST_RUN_NOT_DONE(3);
    

    /* renamed from: e */
    public final int f364171e;

    private C133697s(int i) {
        this.f364171e = i;
    }

    /* renamed from: a */
    public static C133697s m216929a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AVAILABLE;
        }
        if (i == 2) {
            return NOT_AVAILABLE_ACCOUNT_MISMATCH_TOAST_NOT_SUPPORTED;
        }
        if (i != 3) {
            return null;
        }
        return NOT_AVAILABLE_FIRST_RUN_NOT_DONE;
    }

    /* renamed from: b */
    public static C62959cf m216930b() {
        return C133696r.f364165a;
    }

    public final int getNumber() {
        return this.f364171e;
    }

    public final String toString() {
        return Integer.toString(this.f364171e);
    }
}
