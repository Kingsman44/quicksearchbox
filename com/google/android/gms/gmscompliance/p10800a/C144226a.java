package com.google.android.gms.gmscompliance.p10800a;

/* renamed from: com.google.android.gms.gmscompliance.a.a */
/* compiled from: PG */
public final class C144226a extends C144263c {

    /* renamed from: a */
    private final String f390662a;

    /* renamed from: b */
    private final String f390663b;

    /* renamed from: c */
    private final int f390664c;

    public C144226a(String str, String str2, int i) {
        this.f390662a = str;
        this.f390663b = str2;
        this.f390664c = i;
    }

    /* renamed from: a */
    public final int mo119764a() {
        return this.f390664c;
    }

    /* renamed from: b */
    public final String mo119765b() {
        return this.f390662a;
    }

    /* renamed from: c */
    public final String mo119766c() {
        return this.f390663b;
    }

    /* renamed from: d */
    public final boolean mo119767d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo119768e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C144263c) {
            C144263c cVar = (C144263c) obj;
            return !cVar.mo119767d() && !cVar.mo119768e() && this.f390662a.equals(cVar.mo119765b()) && this.f390663b.equals(cVar.mo119766c()) && this.f390664c == cVar.mo119764a();
        }
    }

    public final int hashCode() {
        return ((((this.f390662a.hashCode() ^ -58804091) * 1000003) ^ this.f390663b.hashCode()) * 1000003) ^ this.f390664c;
    }

    public final String toString() {
        String str = this.f390662a;
        String str2 = this.f390663b;
        int i = this.f390664c;
        return "GmsComplianceConfig{enableUdevsFallback=false, writeResponseUuidToLogcat=false, udevsApiKey=" + str + ", udevsHostName=" + str2 + ", udevsHostPort=" + i + "}";
    }
}
