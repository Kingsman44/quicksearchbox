package com.google.android.gms.gmscompliance.p10800a.p10801a.p10802a;

/* renamed from: com.google.android.gms.gmscompliance.a.a.a.b */
/* compiled from: PG */
final class C144229b extends C144231d {

    /* renamed from: b */
    private final String f390671b;

    /* renamed from: c */
    private final int f390672c;

    /* renamed from: d */
    private final String f390673d;

    public C144229b(String str, int i, String str2) {
        this.f390671b = str;
        this.f390672c = i;
        this.f390673d = str2;
    }

    /* renamed from: a */
    public final int mo119775a() {
        return this.f390672c;
    }

    /* renamed from: b */
    public final String mo119776b() {
        return this.f390673d;
    }

    /* renamed from: c */
    public final String mo119777c() {
        return this.f390671b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C144231d) {
            C144231d dVar = (C144231d) obj;
            return this.f390671b.equals(dVar.mo119777c()) && this.f390672c == dVar.mo119775a() && this.f390673d.equals(dVar.mo119776b());
        }
    }

    public final int hashCode() {
        return ((((this.f390671b.hashCode() ^ 1000003) * 1000003) ^ this.f390672c) * 1000003) ^ this.f390673d.hashCode();
    }

    public final String toString() {
        String str = this.f390671b;
        int i = this.f390672c;
        String str2 = this.f390673d;
        return "UdevsSpec{hostName=" + str + ", hostPort=" + i + ", apiKey=" + str2 + "}";
    }
}
