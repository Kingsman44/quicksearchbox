package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.b */
/* compiled from: PG */
final class C101990b extends C102013h {

    /* renamed from: a */
    private final CharSequence f284563a;

    /* renamed from: b */
    private final CharSequence f284564b;

    public C101990b(CharSequence charSequence, CharSequence charSequence2) {
        this.f284563a = charSequence;
        this.f284564b = charSequence2;
    }

    /* renamed from: a */
    public final CharSequence mo92765a() {
        return this.f284564b;
    }

    /* renamed from: b */
    public final CharSequence mo92766b() {
        return this.f284563a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102013h) {
            C102013h hVar = (C102013h) obj;
            return this.f284563a.equals(hVar.mo92766b()) && this.f284564b.equals(hVar.mo92765a());
        }
    }

    public final int hashCode() {
        return ((this.f284563a.hashCode() ^ 1000003) * 1000003) ^ this.f284564b.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.f284563a;
        CharSequence charSequence2 = this.f284564b;
        return "ExampleQuery{title=" + ((String) charSequence) + ", subtitle=" + ((String) charSequence2) + "}";
    }
}
