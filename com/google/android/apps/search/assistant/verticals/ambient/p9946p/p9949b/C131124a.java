package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.a */
/* compiled from: PG */
final class C131124a extends C131140l {

    /* renamed from: a */
    public final int f358618a;

    /* renamed from: b */
    public final int f358619b;

    public C131124a(int i, int i2) {
        this.f358618a = i;
        this.f358619b = i2;
    }

    /* renamed from: a */
    public final int mo110084a() {
        return this.f358618a;
    }

    /* renamed from: b */
    public final int mo110085b() {
        return this.f358619b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131140l) {
            C131140l lVar = (C131140l) obj;
            return this.f358618a == lVar.mo110084a() && this.f358619b == lVar.mo110085b();
        }
    }

    public final int hashCode() {
        return ((this.f358618a ^ 1000003) * 1000003) ^ this.f358619b;
    }

    public final String toString() {
        int i = this.f358618a;
        int i2 = this.f358619b;
        return "IndexAndOffset{index=" + i + ", offset=" + i2 + "}";
    }
}
