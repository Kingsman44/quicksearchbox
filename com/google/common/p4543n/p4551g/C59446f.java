package com.google.common.p4543n.p4551g;

import java.io.Serializable;

/* renamed from: com.google.common.n.g.f */
/* compiled from: PG */
public final class C59446f implements Serializable {

    /* renamed from: a */
    public final int f157698a;

    /* renamed from: b */
    public final int f157699b;

    /* renamed from: c */
    public final int f157700c = 0;

    /* renamed from: d */
    public final int f157701d = 1;

    public C59446f(int i, int i2) {
        this.f157698a = i;
        this.f157699b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59446f)) {
            return false;
        }
        C59446f fVar = (C59446f) obj;
        if (this.f157698a != fVar.f157698a || this.f157699b != fVar.f157699b) {
            return false;
        }
        int i = fVar.f157700c;
        int i2 = fVar.f157701d;
        return true;
    }

    public final int hashCode() {
        return ((((this.f157698a + 403) * 31) + this.f157699b) * 961) + 1;
    }
}
