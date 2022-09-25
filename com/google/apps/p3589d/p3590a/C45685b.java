package com.google.apps.p3589d.p3590a;

/* renamed from: com.google.apps.d.a.b */
/* compiled from: PG */
public final class C45685b extends C45703t {

    /* renamed from: a */
    private final int f120169a;

    /* renamed from: b */
    private final int f120170b;

    public C45685b(int i, int i2) {
        this.f120169a = i;
        this.f120170b = i2;
    }

    /* renamed from: a */
    public final int mo49743a() {
        return this.f120170b;
    }

    /* renamed from: b */
    public final int mo49744b() {
        return this.f120169a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45703t) {
            C45703t tVar = (C45703t) obj;
            return this.f120169a == tVar.mo49744b() && this.f120170b == tVar.mo49743a();
        }
    }

    public final int hashCode() {
        return ((this.f120169a ^ 1000003) * 1000003) ^ this.f120170b;
    }

    public final String toString() {
        int i = this.f120169a;
        int i2 = this.f120170b;
        return "Selection{inactiveEnd=" + i + ", activeEnd=" + i2 + "}";
    }
}
