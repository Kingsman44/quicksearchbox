package com.google.android.gms.libs.p10830b.p10832b;

/* renamed from: com.google.android.gms.libs.b.b.a */
/* compiled from: PG */
public final class C144835a extends C144845f {

    /* renamed from: a */
    public final String f391673a;

    /* renamed from: b */
    public final String f391674b;

    /* renamed from: c */
    public final String f391675c;

    /* renamed from: d */
    public final String f391676d;

    /* renamed from: e */
    public final String f391677e;

    /* renamed from: f */
    public final String f391678f;

    /* renamed from: g */
    public final String f391679g;

    /* renamed from: h */
    public final Integer f391680h;

    public C144835a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num) {
        this.f391673a = str;
        this.f391674b = str2;
        this.f391675c = str3;
        this.f391676d = str4;
        this.f391677e = str5;
        this.f391678f = str6;
        this.f391679g = str7;
        this.f391680h = num;
    }

    /* renamed from: a */
    public final Integer mo120247a() {
        return this.f391680h;
    }

    /* renamed from: b */
    public final String mo120248b() {
        return this.f391679g;
    }

    /* renamed from: c */
    public final String mo120249c() {
        return this.f391674b;
    }

    /* renamed from: d */
    public final String mo120250d() {
        return this.f391676d;
    }

    /* renamed from: e */
    public final String mo120251e() {
        return this.f391673a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C144845f) {
            C144845f fVar = (C144845f) obj;
            return this.f391673a.equals(fVar.mo120251e()) && this.f391674b.equals(fVar.mo120249c()) && this.f391675c.equals(fVar.mo120255h()) && this.f391676d.equals(fVar.mo120250d()) && this.f391677e.equals(fVar.mo120254g()) && this.f391678f.equals(fVar.mo120253f()) && this.f391679g.equals(fVar.mo120248b()) && this.f391680h.equals(fVar.mo120247a());
        }
    }

    /* renamed from: f */
    public final String mo120253f() {
        return this.f391678f;
    }

    /* renamed from: g */
    public final String mo120254g() {
        return this.f391677e;
    }

    /* renamed from: h */
    public final String mo120255h() {
        return this.f391675c;
    }

    public final int hashCode() {
        return ((((((((((((((this.f391673a.hashCode() ^ 1000003) * 1000003) ^ this.f391674b.hashCode()) * 1000003) ^ this.f391675c.hashCode()) * 1000003) ^ this.f391676d.hashCode()) * 1000003) ^ this.f391677e.hashCode()) * 1000003) ^ this.f391678f.hashCode()) * 1000003) ^ this.f391679g.hashCode()) * 1000003) ^ this.f391680h.hashCode();
    }

    public final String toString() {
        String str = this.f391673a;
        String str2 = this.f391674b;
        String str3 = this.f391675c;
        String str4 = this.f391676d;
        String str5 = this.f391677e;
        String str6 = this.f391678f;
        String str7 = this.f391679g;
        Integer num = this.f391680h;
        return "BuildInfo{fingerprint=" + str + ", brand=" + str2 + ", product=" + str3 + ", device=" + str4 + ", model=" + str5 + ", manufacturer=" + str6 + ", baseOs=" + str7 + ", sdkInt=" + num + "}";
    }
}
