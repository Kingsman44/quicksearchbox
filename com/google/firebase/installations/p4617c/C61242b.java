package com.google.firebase.installations.p4617c;

/* renamed from: com.google.firebase.installations.c.b */
/* compiled from: PG */
final class C61242b extends C61247g {

    /* renamed from: a */
    private final String f165659a;

    /* renamed from: b */
    private final String f165660b;

    /* renamed from: c */
    private final String f165661c;

    /* renamed from: d */
    private final C61250j f165662d;

    /* renamed from: e */
    private final int f165663e;

    public C61242b(String str, String str2, String str3, C61250j jVar, int i) {
        this.f165659a = str;
        this.f165660b = str2;
        this.f165661c = str3;
        this.f165662d = jVar;
        this.f165663e = i;
    }

    /* renamed from: a */
    public final C61250j mo57840a() {
        return this.f165662d;
    }

    /* renamed from: b */
    public final String mo57841b() {
        return this.f165660b;
    }

    /* renamed from: c */
    public final String mo57842c() {
        return this.f165661c;
    }

    /* renamed from: d */
    public final String mo57843d() {
        return this.f165659a;
    }

    /* renamed from: e */
    public final int mo57844e() {
        return this.f165663e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61247g) {
            C61247g gVar = (C61247g) obj;
            String str = this.f165659a;
            if (str != null ? str.equals(gVar.mo57843d()) : gVar.mo57843d() == null) {
                String str2 = this.f165660b;
                if (str2 != null ? str2.equals(gVar.mo57841b()) : gVar.mo57841b() == null) {
                    String str3 = this.f165661c;
                    if (str3 != null ? str3.equals(gVar.mo57842c()) : gVar.mo57842c() == null) {
                        C61250j jVar = this.f165662d;
                        if (jVar != null ? jVar.equals(gVar.mo57840a()) : gVar.mo57840a() == null) {
                            int i = this.f165663e;
                            if (i != 0 ? i == gVar.mo57844e() : gVar.mo57844e() == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f165659a;
        String str2 = this.f165660b;
        String str3 = this.f165661c;
        String valueOf = String.valueOf(this.f165662d);
        int i = this.f165663e;
        String str4 = i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK";
        return "InstallationResponse{uri=" + str + ", fid=" + str2 + ", refreshToken=" + str3 + ", authToken=" + valueOf + ", responseCode=" + str4 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f165659a;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (i ^ 1000003) * 1000003;
        String str2 = this.f165660b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        String str3 = this.f165661c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        C61250j jVar = this.f165662d;
        int hashCode = (i7 ^ (jVar == null ? 0 : jVar.hashCode())) * 1000003;
        int i8 = this.f165663e;
        if (i8 != 0) {
            i4 = i8;
        }
        return hashCode ^ i4;
    }
}
