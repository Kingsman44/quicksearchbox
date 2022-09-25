package com.google.android.apps.search.assistant.verticals.ambient.p10017u;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.b */
/* compiled from: PG */
final class C131830b extends C131836h {

    /* renamed from: a */
    private final boolean f360038a;

    /* renamed from: b */
    private final boolean f360039b;

    /* renamed from: c */
    private final boolean f360040c;

    public C131830b(boolean z, boolean z2, boolean z3) {
        this.f360038a = z;
        this.f360039b = z2;
        this.f360040c = z3;
    }

    /* renamed from: a */
    public final boolean mo110330a() {
        return this.f360040c;
    }

    /* renamed from: b */
    public final boolean mo110331b() {
        return this.f360039b;
    }

    /* renamed from: c */
    public final boolean mo110332c() {
        return this.f360038a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131836h) {
            C131836h hVar = (C131836h) obj;
            return this.f360038a == hVar.mo110332c() && this.f360039b == hVar.mo110331b() && this.f360040c == hVar.mo110330a();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f360038a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f360039b ? 1237 : 1231)) * 1000003;
        if (true == this.f360040c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f360038a;
        boolean z2 = this.f360039b;
        boolean z3 = this.f360040c;
        return "Capabilities{canStoreTraces=" + z + ", canShareFiles=" + z2 + ", allowsSlicingAdjustment=" + z3 + "}";
    }
}
