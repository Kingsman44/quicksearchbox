package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.o */
/* compiled from: PG */
public enum C88465o implements C62957cd {
    UNKNOWN_CLIENT(0),
    SPORTS_CLIENT(1),
    FINANCE_CLIENT(2);
    

    /* renamed from: d */
    public final int f239158d;

    private C88465o(int i) {
        this.f239158d = i;
    }

    /* renamed from: a */
    public static C88465o m142813a(int i) {
        if (i == 0) {
            return UNKNOWN_CLIENT;
        }
        if (i == 1) {
            return SPORTS_CLIENT;
        }
        if (i != 2) {
            return null;
        }
        return FINANCE_CLIENT;
    }

    /* renamed from: b */
    public static C62959cf m142814b() {
        return C88464n.f239153a;
    }

    public final int getNumber() {
        return this.f239158d;
    }

    public final String toString() {
        return Integer.toString(this.f239158d);
    }
}
