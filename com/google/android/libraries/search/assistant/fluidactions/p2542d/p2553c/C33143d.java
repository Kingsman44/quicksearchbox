package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.c.d */
/* compiled from: PG */
public final class C33143d extends C33141b {

    /* renamed from: a */
    private final String f88679a;

    /* renamed from: b */
    private final String f88680b;

    /* renamed from: c */
    private final String f88681c;

    /* renamed from: d */
    private final String f88682d;

    /* renamed from: e */
    private final String f88683e;

    public C33143d(String str, String str2, String str3, String str4, String str5) {
        this.f88679a = str;
        this.f88680b = str2;
        this.f88681c = str3;
        this.f88682d = str4;
        this.f88683e = str5;
    }

    /* renamed from: a */
    public final String mo38540a() {
        return this.f88680b;
    }

    /* renamed from: b */
    public final String mo38541b() {
        return this.f88683e;
    }

    /* renamed from: c */
    public final String mo38542c() {
        return this.f88682d;
    }

    /* renamed from: d */
    public final String mo38543d() {
        return this.f88681c;
    }

    /* renamed from: e */
    public final String mo38544e() {
        return this.f88679a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C33141b) {
            C33141b bVar = (C33141b) obj;
            return this.f88679a.equals(bVar.mo38544e()) && this.f88680b.equals(bVar.mo38540a()) && this.f88681c.equals(bVar.mo38543d()) && this.f88682d.equals(bVar.mo38542c()) && this.f88683e.equals(bVar.mo38541b());
        }
    }

    public final int hashCode() {
        return ((((((((this.f88679a.hashCode() ^ 1000003) * 1000003) ^ this.f88680b.hashCode()) * 1000003) ^ this.f88681c.hashCode()) * 1000003) ^ this.f88682d.hashCode()) * 1000003) ^ this.f88683e.hashCode();
    }

    public final String toString() {
        String str = this.f88679a;
        String str2 = this.f88680b;
        String str3 = this.f88681c;
        String str4 = this.f88682d;
        String str5 = this.f88683e;
        return "AumResult{sessionId=" + str + ", resolvedContactName=" + str2 + ", resolvedProvider=" + str3 + ", resolvedInstanceLabel=" + str4 + ", resolvedInstance=" + str5 + "}";
    }
}
