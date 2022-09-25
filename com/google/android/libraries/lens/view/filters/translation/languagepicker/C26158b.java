package com.google.android.libraries.lens.view.filters.translation.languagepicker;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.b */
/* compiled from: PG */
final class C26158b extends C26132aa {

    /* renamed from: a */
    private final int f71067a;

    /* renamed from: b */
    private final int f71068b;

    public C26158b(int i, int i2) {
        this.f71067a = i;
        this.f71068b = i2;
    }

    /* renamed from: a */
    public final int mo31351a() {
        return this.f71068b;
    }

    /* renamed from: b */
    public final int mo31352b() {
        return this.f71067a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26132aa) {
            C26132aa aaVar = (C26132aa) obj;
            return this.f71067a == aaVar.mo31352b() && this.f71068b == aaVar.mo31351a();
        }
    }

    public final int hashCode() {
        return ((this.f71067a ^ 1000003) * 1000003) ^ this.f71068b;
    }

    public final String toString() {
        int i = this.f71067a;
        int i2 = this.f71068b;
        return "HighlightInfo{start=" + i + ", length=" + i2 + "}";
    }
}
