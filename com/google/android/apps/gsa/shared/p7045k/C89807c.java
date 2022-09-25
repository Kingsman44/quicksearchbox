package com.google.android.apps.gsa.shared.p7045k;

/* renamed from: com.google.android.apps.gsa.shared.k.c */
/* compiled from: PG */
public final class C89807c extends C89824t {

    /* renamed from: a */
    public final C89809e f243094a;

    /* renamed from: b */
    public final C89794ab f243095b;

    /* renamed from: c */
    private final C89830z f243096c;

    public C89807c(C89809e eVar, C89830z zVar, C89794ab abVar) {
        if (eVar != null) {
            this.f243094a = eVar;
            this.f243096c = zVar;
            this.f243095b = abVar;
            return;
        }
        throw new NullPointerException("Null castDeviceInfo");
    }

    /* renamed from: a */
    public final C89809e mo83663a() {
        return this.f243094a;
    }

    /* renamed from: b */
    public final C89830z mo83664b() {
        return this.f243096c;
    }

    /* renamed from: c */
    public final C89794ab mo83665c() {
        return this.f243095b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89824t) {
            C89824t tVar = (C89824t) obj;
            return this.f243094a.equals(tVar.mo83663a()) && this.f243096c.equals(tVar.mo83664b()) && this.f243095b.equals(tVar.mo83665c());
        }
    }

    public final int hashCode() {
        return ((((this.f243094a.hashCode() ^ 1000003) * 1000003) ^ this.f243096c.hashCode()) * 1000003) ^ this.f243095b.hashCode();
    }

    public final String toString() {
        String obj = this.f243094a.toString();
        String obj2 = this.f243096c.toString();
        String obj3 = this.f243095b.toString();
        return "CastDeviceLocalInfo{castDeviceInfo=" + obj + ", appDeviceIdResult=" + obj2 + ", eurekaInfoResult=" + obj3 + "}";
    }
}
