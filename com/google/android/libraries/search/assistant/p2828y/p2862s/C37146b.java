package com.google.android.libraries.search.assistant.p2828y.p2862s;

/* renamed from: com.google.android.libraries.search.assistant.y.s.b */
/* compiled from: PG */
final class C37146b extends C37148d {

    /* renamed from: a */
    private final boolean f96739a;

    /* renamed from: b */
    private final boolean f96740b;

    public C37146b(boolean z, boolean z2) {
        this.f96739a = z;
        this.f96740b = z2;
    }

    /* renamed from: a */
    public final boolean mo40660a() {
        return this.f96739a;
    }

    /* renamed from: b */
    public final boolean mo40661b() {
        return this.f96740b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37148d) {
            C37148d dVar = (C37148d) obj;
            return this.f96739a == dVar.mo40660a() && this.f96740b == dVar.mo40661b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f96739a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f96740b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f96739a;
        boolean z2 = this.f96740b;
        return "TopContactParamsConfiguration{useCallLog=" + z + ", useSms=" + z2 + "}";
    }
}
