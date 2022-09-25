package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.w */
/* compiled from: PG */
public enum C88473w implements C62957cd {
    UNKNOWN(0),
    PIET(2),
    SEARCH(3);
    

    /* renamed from: d */
    public final int f239171d;

    private C88473w(int i) {
        this.f239171d = i;
    }

    /* renamed from: a */
    public static C88473w m142819a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 2) {
            return PIET;
        }
        if (i != 3) {
            return null;
        }
        return SEARCH;
    }

    /* renamed from: b */
    public static C62959cf m142820b() {
        return C88472v.f239166a;
    }

    public final int getNumber() {
        return this.f239171d;
    }

    public final String toString() {
        return Integer.toString(this.f239171d);
    }
}
