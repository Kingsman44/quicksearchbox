package com.google.apps.p3589d.p3593d;

/* renamed from: com.google.apps.d.d.b */
/* compiled from: PG */
public final class C45743b extends C45732a {

    /* renamed from: b */
    public final int f120260b;

    /* renamed from: c */
    public final int f120261c;

    /* renamed from: d */
    public final int f120262d;

    public C45743b(int i, int i2, int i3) {
        this.f120260b = i;
        this.f120261c = i2;
        this.f120262d = i3;
    }

    /* renamed from: a */
    public final int mo49858a() {
        return this.f120262d;
    }

    /* renamed from: b */
    public final int mo49859b() {
        return this.f120261c;
    }

    /* renamed from: c */
    public final int mo49860c() {
        return this.f120260b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45732a) {
            C45732a aVar = (C45732a) obj;
            return this.f120260b == aVar.mo49860c() && this.f120261c == aVar.mo49859b() && this.f120262d == aVar.mo49858a();
        }
    }

    public final int hashCode() {
        return ((((this.f120260b ^ 1000003) * 1000003) ^ this.f120261c) * 1000003) ^ this.f120262d;
    }

    public final String toString() {
        int i = this.f120260b;
        int i2 = this.f120261c;
        int i3 = this.f120262d;
        return "AtomPositionRange{start=" + i + ", nucleusEnd=" + i2 + ", end=" + i3 + "}";
    }
}
