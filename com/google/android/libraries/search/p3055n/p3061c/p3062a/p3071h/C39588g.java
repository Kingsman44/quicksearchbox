package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

/* renamed from: com.google.android.libraries.search.n.c.a.h.g */
/* compiled from: PG */
final class C39588g extends C39536aa {

    /* renamed from: a */
    private final int f104214a;

    /* renamed from: b */
    private final int f104215b;

    /* renamed from: c */
    private final boolean f104216c;

    public C39588g(int i, int i2, boolean z) {
        this.f104214a = i;
        this.f104215b = i2;
        this.f104216c = z;
    }

    /* renamed from: a */
    public final int mo41882a() {
        return this.f104215b;
    }

    /* renamed from: b */
    public final int mo41883b() {
        return this.f104214a;
    }

    /* renamed from: c */
    public final boolean mo41884c() {
        return this.f104216c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39536aa) {
            C39536aa aaVar = (C39536aa) obj;
            return this.f104214a == aaVar.mo41883b() && this.f104215b == aaVar.mo41882a() && this.f104216c == aaVar.mo41884c();
        }
    }

    public final int hashCode() {
        return ((((this.f104214a ^ 1000003) * 1000003) ^ this.f104215b) * 1000003) ^ (true != this.f104216c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f104214a;
        int i2 = this.f104215b;
        boolean z = this.f104216c;
        return "SodaClientConfigParams{sampleRate=" + i + ", channelCount=" + i2 + ", isDspBased=" + z + "}";
    }
}
