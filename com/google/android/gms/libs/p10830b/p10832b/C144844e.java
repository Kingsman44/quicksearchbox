package com.google.android.gms.libs.p10830b.p10832b;

/* renamed from: com.google.android.gms.libs.b.b.e */
/* compiled from: PG */
final class C144844e extends C144851l {

    /* renamed from: a */
    private final String f391700a;

    /* renamed from: b */
    private final String f391701b;

    /* renamed from: c */
    private final Integer f391702c;

    public C144844e(String str, String str2, Integer num) {
        this.f391700a = str;
        this.f391701b = str2;
        this.f391702c = num;
    }

    /* renamed from: a */
    public final Integer mo120286a() {
        return this.f391702c;
    }

    /* renamed from: b */
    public final String mo120287b() {
        return this.f391701b;
    }

    /* renamed from: c */
    public final String mo120288c() {
        return this.f391700a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C144851l) {
            C144851l lVar = (C144851l) obj;
            return this.f391700a.equals(lVar.mo120288c()) && this.f391701b.equals(lVar.mo120287b()) && this.f391702c.equals(lVar.mo120286a());
        }
    }

    public final int hashCode() {
        return ((((this.f391700a.hashCode() ^ 1000003) * 1000003) ^ this.f391701b.hashCode()) * 1000003) ^ this.f391702c.hashCode();
    }

    public final String toString() {
        String str = this.f391700a;
        String str2 = this.f391701b;
        Integer num = this.f391702c;
        return "SystemPropertiesInfo{vendorBuildFingerprint=" + str + ", bootVerifiedBootState=" + str2 + ", bootFlashLocked=" + num + "}";
    }
}
