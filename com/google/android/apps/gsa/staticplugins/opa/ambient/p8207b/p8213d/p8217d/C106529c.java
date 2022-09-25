package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.c */
/* compiled from: PG */
public enum C106529c implements C62957cd {
    UNSPECIFIED(0),
    CONNECTED(1),
    DISCONNECTED(2);
    

    /* renamed from: d */
    public final int f297070d;

    private C106529c(int i) {
        this.f297070d = i;
    }

    /* renamed from: a */
    public static C106529c m177304a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTED;
        }
        if (i != 2) {
            return null;
        }
        return DISCONNECTED;
    }

    /* renamed from: b */
    public static C62959cf m177305b() {
        return C106528b.f297065a;
    }

    public final int getNumber() {
        return this.f297070d;
    }

    public final String toString() {
        return Integer.toString(this.f297070d);
    }
}
