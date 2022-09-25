package com.google.android.apps.gsa.smartspace;

/* renamed from: com.google.android.apps.gsa.smartspace.a */
/* compiled from: PG */
public final class C92018a extends C92034ad {

    /* renamed from: a */
    public final String f256544a;

    /* renamed from: b */
    public final String f256545b;

    /* renamed from: c */
    public final String f256546c;

    public C92018a(String str, String str2, String str3) {
        this.f256544a = str;
        this.f256545b = str2;
        this.f256546c = str3;
    }

    /* renamed from: a */
    public final String mo86675a() {
        return this.f256546c;
    }

    /* renamed from: b */
    public final String mo86676b() {
        return this.f256545b;
    }

    /* renamed from: c */
    public final String mo86677c() {
        return this.f256544a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C92034ad) {
            C92034ad adVar = (C92034ad) obj;
            return this.f256544a.equals(adVar.mo86677c()) && this.f256545b.equals(adVar.mo86676b()) && this.f256546c.equals(adVar.mo86675a());
        }
    }

    public final int hashCode() {
        return ((((this.f256544a.hashCode() ^ 1000003) * 1000003) ^ this.f256545b.hashCode()) * 1000003) ^ this.f256546c.hashCode();
    }

    public final String toString() {
        String str = this.f256544a;
        String str2 = this.f256545b;
        String str3 = this.f256546c;
        return "WeatherAlert{title=" + str + ", publisherName=" + str2 + ", actionUrl=" + str3 + "}";
    }
}
