package com.google.android.gms.libs.p10830b.p10832b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.gms.libs.b.b.b */
/* compiled from: PG */
final class C144841b extends C144846g {

    /* renamed from: a */
    private final String f391691a;

    /* renamed from: b */
    private final C58833ax f391692b;

    public C144841b(String str, C58833ax axVar) {
        if (str != null) {
            this.f391691a = str;
            this.f391692b = axVar;
            return;
        }
        throw new NullPointerException("Null appPackage");
    }

    /* renamed from: a */
    public final C58833ax mo120268a() {
        return this.f391692b;
    }

    /* renamed from: b */
    public final String mo120269b() {
        return this.f391691a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C144846g) {
            C144846g gVar = (C144846g) obj;
            return this.f391691a.equals(gVar.mo120269b()) && this.f391692b.equals(gVar.mo120268a());
        }
    }

    public final int hashCode() {
        return ((this.f391691a.hashCode() ^ 1000003) * 1000003) ^ this.f391692b.hashCode();
    }

    public final String toString() {
        String str = this.f391691a;
        String obj = this.f391692b.toString();
        return "CallerInfo{appPackage=" + str + ", appVersionCode=" + obj + "}";
    }
}
