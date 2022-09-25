package com.google.android.apps.search.assistant.platform.p9141h.p9167j.p9168a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.h.j.a.c */
/* compiled from: PG */
public enum C121166c implements C62957cd {
    UNSPECIFIED(0),
    REJECTED(1),
    ACCEPTED(2),
    ACCEPTED_WITH_DONATION(3);
    

    /* renamed from: e */
    public final int f336659e;

    private C121166c(int i) {
        this.f336659e = i;
    }

    /* renamed from: a */
    public static C121166c m200459a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return REJECTED;
        }
        if (i == 2) {
            return ACCEPTED;
        }
        if (i != 3) {
            return null;
        }
        return ACCEPTED_WITH_DONATION;
    }

    /* renamed from: b */
    public static C62959cf m200460b() {
        return C121165b.f336653a;
    }

    public final int getNumber() {
        return this.f336659e;
    }

    public final String toString() {
        return Integer.toString(this.f336659e);
    }
}
