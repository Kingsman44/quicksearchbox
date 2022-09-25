package com.google.android.libraries.places.p2424a.p2425a;

/* renamed from: com.google.android.libraries.places.a.a.b */
/* compiled from: PG */
final class C31771b extends C31773d {

    /* renamed from: a */
    private final String f85382a;

    /* renamed from: b */
    private final int f85383b;

    /* renamed from: c */
    private final int f85384c;

    public C31771b(String str, int i, int i2) {
        this.f85382a = str;
        this.f85383b = i;
        this.f85384c = i2;
    }

    /* renamed from: a */
    public final int mo37373a() {
        return this.f85383b;
    }

    /* renamed from: b */
    public final String mo37374b() {
        return this.f85382a;
    }

    /* renamed from: c */
    public final int mo37375c() {
        return this.f85384c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31773d) {
            C31773d dVar = (C31773d) obj;
            return this.f85382a.equals(dVar.mo37374b()) && this.f85383b == dVar.mo37373a() && this.f85384c == dVar.mo37375c();
        }
    }

    public final int hashCode() {
        return ((((this.f85382a.hashCode() ^ 1000003) * 1000003) ^ this.f85383b) * 1000003) ^ this.f85384c;
    }

    public final String toString() {
        String str = this.f85382a;
        int i = this.f85383b;
        String str2 = this.f85384c != 1 ? "AUTOCOMPLETE_WIDGET" : "PROGRAMMATIC_API";
        return "ClientProfile{packageName=" + str + ", versionCode=" + i + ", requestSource=" + str2 + "}";
    }
}
