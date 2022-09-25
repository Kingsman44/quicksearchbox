package com.google.android.libraries.lens.ondevice.p2034k;

/* renamed from: com.google.android.libraries.lens.ondevice.k.e */
/* compiled from: PG */
final class C24643e extends C24631do {

    /* renamed from: a */
    private final boolean f67384a;

    /* renamed from: b */
    private final boolean f67385b;

    public C24643e(boolean z, boolean z2) {
        this.f67384a = z;
        this.f67385b = z2;
    }

    /* renamed from: a */
    public final boolean mo29971a() {
        return this.f67385b;
    }

    /* renamed from: b */
    public final boolean mo29972b() {
        return this.f67384a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24631do) {
            C24631do doVar = (C24631do) obj;
            return this.f67384a == doVar.mo29972b() && this.f67385b == doVar.mo29971a();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f67384a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f67385b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f67384a;
        boolean z2 = this.f67385b;
        return "Configuration{includePageLayout=" + z + ", createPageLayoutMutatorContext=" + z2 + "}";
    }
}
