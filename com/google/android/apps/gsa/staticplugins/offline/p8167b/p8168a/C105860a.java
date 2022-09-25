package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.a */
/* compiled from: PG */
final class C105860a extends C105870k {

    /* renamed from: a */
    private final String f295465a;

    /* renamed from: b */
    private final String f295466b;

    public C105860a(String str, String str2) {
        this.f295465a = str;
        this.f295466b = str2;
    }

    /* renamed from: a */
    public final String mo95111a() {
        return this.f295466b;
    }

    /* renamed from: b */
    public final String mo95112b() {
        return this.f295465a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C105870k) {
            C105870k kVar = (C105870k) obj;
            return this.f295465a.equals(kVar.mo95112b()) && this.f295466b.equals(kVar.mo95111a());
        }
    }

    public final int hashCode() {
        return ((this.f295465a.hashCode() ^ 1000003) * 1000003) ^ this.f295466b.hashCode();
    }

    public final String toString() {
        String str = this.f295465a;
        String str2 = this.f295466b;
        return "LicenseResource{metadataPath=" + str + ", licenseTextPath=" + str2 + "}";
    }
}
