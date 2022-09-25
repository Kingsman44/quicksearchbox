package com.google.android.libraries.lens.view.filters.translation.languagepicker;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.f */
/* compiled from: PG */
final class C26179f extends C26137af {

    /* renamed from: a */
    private final String f71131a;

    public C26179f(String str) {
        this.f71131a = str;
    }

    /* renamed from: a */
    public final String mo31373a() {
        return this.f71131a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26137af) {
            return this.f71131a.equals(((C26137af) obj).mo31373a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f71131a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f71131a;
        return "NoResultCard{searchString=" + str + "}";
    }
}
