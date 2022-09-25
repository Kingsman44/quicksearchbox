package com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.c.a.l */
/* compiled from: PG */
public enum C99488l implements C62957cd {
    UNKNOWN(0),
    START_OOBE(2);
    

    /* renamed from: c */
    public final int f278407c;

    private C99488l(int i) {
        this.f278407c = i;
    }

    /* renamed from: a */
    public static C99488l m165015a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 2) {
            return null;
        }
        return START_OOBE;
    }

    /* renamed from: b */
    public static C62959cf m165016b() {
        return C99487k.f278403a;
    }

    public final int getNumber() {
        return this.f278407c;
    }

    public final String toString() {
        return Integer.toString(this.f278407c);
    }
}
