package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.oj */
/* compiled from: PG */
public enum C88079oj implements C62957cd {
    UNKNOWN(0),
    RESUMED(1),
    PAUSED(2),
    STOPPED(3);
    

    /* renamed from: e */
    public final int f238145e;

    private C88079oj(int i) {
        this.f238145e = i;
    }

    /* renamed from: a */
    public static C88079oj m142780a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return RESUMED;
        }
        if (i == 2) {
            return PAUSED;
        }
        if (i != 3) {
            return null;
        }
        return STOPPED;
    }

    /* renamed from: b */
    public static C62959cf m142781b() {
        return C88078oi.f238139a;
    }

    public final int getNumber() {
        return this.f238145e;
    }

    public final String toString() {
        return Integer.toString(this.f238145e);
    }
}
