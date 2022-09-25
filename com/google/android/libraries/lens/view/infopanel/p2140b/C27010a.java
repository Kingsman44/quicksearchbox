package com.google.android.libraries.lens.view.infopanel.p2140b;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.a */
/* compiled from: PG */
public final class C27010a extends C27025m {

    /* renamed from: a */
    public final int f73639a;

    /* renamed from: b */
    private final int f73640b;

    public C27010a(int i, int i2) {
        this.f73639a = i;
        this.f73640b = i2;
    }

    /* renamed from: a */
    public final int mo32463a() {
        return this.f73640b;
    }

    /* renamed from: b */
    public final int mo32464b() {
        return this.f73639a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27025m) {
            C27025m mVar = (C27025m) obj;
            return this.f73639a == mVar.mo32464b() && this.f73640b == mVar.mo32463a();
        }
    }

    public final int hashCode() {
        return ((this.f73639a ^ 1000003) * 1000003) ^ this.f73640b;
    }

    public final String toString() {
        int i = this.f73639a;
        int i2 = this.f73640b;
        return "VeIdWithPosition{veId=" + i + ", position=" + i2 + "}";
    }
}
