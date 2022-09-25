package com.google.android.libraries.search.p3055n.p3085h;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.n.h.f */
/* compiled from: PG */
public enum C39773f implements C62957cd {
    RESOURCE_DEFAULT_UNKNOWN(0),
    RESOURCE_HOTWORD(1),
    RESOURCE_TDSID(2),
    RESOURCE_LP(3),
    RESOURCE_TISID(4),
    RESOURCE_HOTMATCH(5);
    

    /* renamed from: g */
    public final int f104620g;

    private C39773f(int i) {
        this.f104620g = i;
    }

    /* renamed from: a */
    public static C39773f m69198a(int i) {
        if (i == 0) {
            return RESOURCE_DEFAULT_UNKNOWN;
        }
        if (i == 1) {
            return RESOURCE_HOTWORD;
        }
        if (i == 2) {
            return RESOURCE_TDSID;
        }
        if (i == 3) {
            return RESOURCE_LP;
        }
        if (i == 4) {
            return RESOURCE_TISID;
        }
        if (i != 5) {
            return null;
        }
        return RESOURCE_HOTMATCH;
    }

    /* renamed from: b */
    public static C62959cf m69199b() {
        return C39772e.f104612a;
    }

    public final int getNumber() {
        return this.f104620g;
    }

    public final String toString() {
        return Integer.toString(this.f104620g);
    }
}
