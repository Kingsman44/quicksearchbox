package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bi */
/* compiled from: PG */
public final class C82334bi extends C82563jv {

    /* renamed from: a */
    public final String f224921a = "NGA_DASHER_ACCOUNT_PRESENT";

    /* renamed from: b */
    private final String f224922b;

    public C82334bi(String str, String str2) {
        this.f224922b = str2;
    }

    /* renamed from: b */
    public final String mo75759b() {
        return this.f224922b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224921a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82563jv) {
            C82563jv jvVar = (C82563jv) obj;
            return this.f224921a.equals(jvVar.mo75583d()) && this.f224922b.equals(jvVar.mo75759b());
        }
    }

    public final int hashCode() {
        return ((this.f224921a.hashCode() ^ 1000003) * 1000003) ^ this.f224922b.hashCode();
    }

    public final String toString() {
        String str = this.f224921a;
        String str2 = this.f224922b;
        return "NgaDasherAccountPresentEvent{token=" + str + ", dasherAccountStatus=" + str2 + "}";
    }
}
