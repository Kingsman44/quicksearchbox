package com.google.android.apps.gsa.shared.p6976ag.p6982e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.ag.e.k */
/* compiled from: PG */
public enum C89139k implements C62957cd {
    UNDEFINED(0),
    VOICE(1),
    TEXT(2);
    

    /* renamed from: d */
    private final int f241652d;

    private C89139k(int i) {
        this.f241652d = i;
    }

    /* renamed from: a */
    public static C89139k m145002a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return VOICE;
        }
        if (i != 2) {
            return null;
        }
        return TEXT;
    }

    /* renamed from: b */
    public static C62959cf m145003b() {
        return C89138j.f241647a;
    }

    public final int getNumber() {
        return this.f241652d;
    }

    public final String toString() {
        return Integer.toString(this.f241652d);
    }
}
