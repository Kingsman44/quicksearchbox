package com.google.android.apps.search.assistant.platform.p9141h.p9146b.p9147a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.h.b.a.c */
/* compiled from: PG */
public enum C121001c implements C62957cd {
    UNSPECIFIED(0),
    OFF(1),
    ON(2);
    

    /* renamed from: d */
    public final int f336370d;

    private C121001c(int i) {
        this.f336370d = i;
    }

    /* renamed from: a */
    public static C121001c m200299a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return OFF;
        }
        if (i != 2) {
            return null;
        }
        return ON;
    }

    /* renamed from: b */
    public static C62959cf m200300b() {
        return C121000b.f336365a;
    }

    public final int getNumber() {
        return this.f336370d;
    }

    public final String toString() {
        return Integer.toString(this.f336370d);
    }
}
