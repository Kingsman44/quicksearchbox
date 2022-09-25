package com.google.android.libraries.lens.view.filters.p2099c;

/* renamed from: com.google.android.libraries.lens.view.filters.c.a */
/* compiled from: PG */
final class C25936a extends C25940e {

    /* renamed from: a */
    private final String f70471a;

    /* renamed from: b */
    private final String f70472b;

    public C25936a(String str, String str2) {
        if (str != null) {
            this.f70471a = str;
            if (str2 != null) {
                this.f70472b = str2;
                return;
            }
            throw new NullPointerException("Null frozenGuidance");
        }
        throw new NullPointerException("Null lvfGuidance");
    }

    /* renamed from: a */
    public final String mo31103a() {
        return this.f70472b;
    }

    /* renamed from: b */
    public final String mo31104b() {
        return this.f70471a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25940e) {
            C25940e eVar = (C25940e) obj;
            return this.f70471a.equals(eVar.mo31104b()) && this.f70472b.equals(eVar.mo31103a());
        }
    }

    public final int hashCode() {
        return ((this.f70471a.hashCode() ^ 1000003) * 1000003) ^ this.f70472b.hashCode();
    }

    public final String toString() {
        String str = this.f70471a;
        String str2 = this.f70472b;
        return "Guidance{lvfGuidance=" + str + ", frozenGuidance=" + str2 + "}";
    }
}
