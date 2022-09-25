package com.google.common.p4522b;

import java.io.Serializable;
import java.util.EnumMap;

/* renamed from: com.google.common.b.gi */
/* compiled from: PG */
final class C58473gi implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final EnumMap f156100a;

    public C58473gi(EnumMap enumMap) {
        this.f156100a = enumMap;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return new C58474gj(this.f156100a);
    }
}
