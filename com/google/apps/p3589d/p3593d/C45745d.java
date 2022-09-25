package com.google.apps.p3589d.p3593d;

/* renamed from: com.google.apps.d.d.d */
/* compiled from: PG */
public final class C45745d extends C45751j {

    /* renamed from: a */
    public final int f120265a;

    /* renamed from: b */
    public final int f120266b;

    public C45745d(int i, int i2) {
        this.f120265a = i;
        this.f120266b = i2;
    }

    /* renamed from: a */
    public final int mo49875a() {
        return this.f120266b;
    }

    /* renamed from: b */
    public final int mo49876b() {
        return this.f120265a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45751j) {
            C45751j jVar = (C45751j) obj;
            return this.f120265a == jVar.mo49876b() && this.f120266b == jVar.mo49875a();
        }
    }

    public final int hashCode() {
        return ((this.f120265a ^ 1000003) * 1000003) ^ this.f120266b;
    }

    public final String toString() {
        int i = this.f120265a;
        int i2 = this.f120266b;
        return "ListPositionRange{start=" + i + ", end=" + i2 + "}";
    }
}
