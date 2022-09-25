package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.e */
/* compiled from: PG */
public enum C106531e implements C62957cd {
    UNKNOWN(0),
    WIRED(1),
    GENERIC_BLUETOOTH(2),
    CAR_BLUETOOTH(3);
    

    /* renamed from: e */
    public final int f297077e;

    private C106531e(int i) {
        this.f297077e = i;
    }

    /* renamed from: a */
    public static C106531e m177306a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return WIRED;
        }
        if (i == 2) {
            return GENERIC_BLUETOOTH;
        }
        if (i != 3) {
            return null;
        }
        return CAR_BLUETOOTH;
    }

    /* renamed from: b */
    public static C62959cf m177307b() {
        return C106530d.f297071a;
    }

    public final int getNumber() {
        return this.f297077e;
    }

    public final String toString() {
        return Integer.toString(this.f297077e);
    }
}
