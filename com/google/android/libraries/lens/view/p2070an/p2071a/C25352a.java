package com.google.android.libraries.lens.view.p2070an.p2071a;

/* renamed from: com.google.android.libraries.lens.view.an.a.a */
/* compiled from: PG */
final class C25352a extends C25353b {

    /* renamed from: a */
    public final String f69032a;

    /* renamed from: b */
    public final String f69033b;

    public C25352a(String str, String str2) {
        this.f69032a = str;
        this.f69033b = str2;
    }

    /* renamed from: a */
    public final String mo30389a() {
        return this.f69033b;
    }

    /* renamed from: b */
    public final String mo30390b() {
        return this.f69032a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25353b) {
            C25353b bVar = (C25353b) obj;
            return this.f69032a.equals(bVar.mo30390b()) && this.f69033b.equals(bVar.mo30389a());
        }
    }

    public final int hashCode() {
        return ((this.f69032a.hashCode() ^ 1000003) * 1000003) ^ this.f69033b.hashCode();
    }

    public final String toString() {
        String str = this.f69032a;
        String str2 = this.f69033b;
        return "IconURIs{uri=" + str + ", darkModeUri=" + str2 + "}";
    }
}
