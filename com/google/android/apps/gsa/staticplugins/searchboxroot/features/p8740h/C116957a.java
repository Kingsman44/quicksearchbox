package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.a */
/* compiled from: PG */
final class C116957a extends C116967k {

    /* renamed from: a */
    private final int f324696a;

    /* renamed from: b */
    private final String f324697b;

    /* renamed from: c */
    private final float f324698c;

    public C116957a(int i, String str, float f) {
        this.f324696a = i;
        if (str != null) {
            this.f324697b = str;
            this.f324698c = f;
            return;
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: a */
    public final float mo103067a() {
        return this.f324698c;
    }

    /* renamed from: b */
    public final int mo103068b() {
        return this.f324696a;
    }

    /* renamed from: c */
    public final String mo103069c() {
        return this.f324697b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C116967k) {
            C116967k kVar = (C116967k) obj;
            return this.f324696a == kVar.mo103068b() && this.f324697b.equals(kVar.mo103069c()) && Float.floatToIntBits(this.f324698c) == Float.floatToIntBits(kVar.mo103067a());
        }
    }

    public final int hashCode() {
        return ((((this.f324696a ^ 1000003) * 1000003) ^ this.f324697b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f324698c);
    }

    public final String toString() {
        int i = this.f324696a;
        String str = this.f324697b;
        float f = this.f324698c;
        return "Result{id=" + i + ", query=" + str + ", confidence=" + f + "}";
    }
}
