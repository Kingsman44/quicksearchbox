package com.google.android.libraries.lens.view.filters.translation.languagepicker;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.c */
/* compiled from: PG */
final class C26176c extends C26134ac {

    /* renamed from: a */
    private final int f71106a;

    /* renamed from: b */
    private final boolean f71107b;

    public C26176c(int i, boolean z) {
        this.f71106a = i;
        this.f71107b = z;
    }

    /* renamed from: a */
    public final int mo31353a() {
        return this.f71106a;
    }

    /* renamed from: b */
    public final boolean mo31354b() {
        return this.f71107b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26134ac) {
            C26134ac acVar = (C26134ac) obj;
            return this.f71106a == acVar.mo31353a() && this.f71107b == acVar.mo31354b();
        }
    }

    public final int hashCode() {
        return ((this.f71106a ^ 1000003) * 1000003) ^ (true != this.f71107b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f71106a;
        boolean z = this.f71107b;
        return "ListHeader{title=" + i + ", isFirst=" + z + "}";
    }
}
