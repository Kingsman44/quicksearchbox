package com.google.android.libraries.gsa.monet.shared.p1894d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.gsa.monet.shared.d.h */
/* compiled from: PG */
public enum C23105h implements C62957cd {
    UNINITIALIZED_BOOTSTRAPPABLE(0),
    INITIALIZED_BY_BOOTSTRAPPER(1),
    INITIALIZED_BY_CONTROLLER(2);
    

    /* renamed from: d */
    private final int f63461d;

    private C23105h(int i) {
        this.f63461d = i;
    }

    /* renamed from: a */
    public static C23105h m43285a(int i) {
        if (i == 0) {
            return UNINITIALIZED_BOOTSTRAPPABLE;
        }
        if (i == 1) {
            return INITIALIZED_BY_BOOTSTRAPPER;
        }
        if (i != 2) {
            return null;
        }
        return INITIALIZED_BY_CONTROLLER;
    }

    /* renamed from: b */
    public static C62959cf m43286b() {
        return C23104g.f63456a;
    }

    public final int getNumber() {
        return this.f63461d;
    }

    public final String toString() {
        return Integer.toString(this.f63461d);
    }
}
