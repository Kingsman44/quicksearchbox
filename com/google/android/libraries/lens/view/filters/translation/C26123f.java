package com.google.android.libraries.lens.view.filters.translation;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.f */
/* compiled from: PG */
final class C26123f extends C26219t {

    /* renamed from: a */
    private final String f70988a;

    /* renamed from: b */
    private final int f70989b;

    public C26123f(String str, int i) {
        if (str != null) {
            this.f70988a = str;
            this.f70989b = i;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final int mo31324a() {
        return this.f70989b;
    }

    /* renamed from: b */
    public final String mo31325b() {
        return this.f70988a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26219t) {
            C26219t tVar = (C26219t) obj;
            return this.f70988a.equals(tVar.mo31325b()) && this.f70989b == tVar.mo31324a();
        }
    }

    public final int hashCode() {
        return ((this.f70988a.hashCode() ^ 1000003) * 1000003) ^ this.f70989b;
    }

    public final String toString() {
        String str = this.f70988a;
        int i = this.f70989b;
        return "SnackbarData{text=" + str + ", veId=" + i + "}";
    }
}
