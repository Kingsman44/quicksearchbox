package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ba */
/* compiled from: PG */
public final class C82326ba extends C82555jn {

    /* renamed from: a */
    private final String f224897a = "NGA_AUM_RESULTS";

    /* renamed from: b */
    private final String f224898b;

    /* renamed from: c */
    private final String f224899c;

    /* renamed from: d */
    private final String f224900d;

    public C82326ba(String str, String str2, String str3, String str4) {
        this.f224898b = str2;
        this.f224899c = str3;
        this.f224900d = str4;
    }

    /* renamed from: b */
    public final String mo75719b() {
        return this.f224899c;
    }

    /* renamed from: c */
    public final String mo75720c() {
        return this.f224898b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224897a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82555jn) {
            C82555jn jnVar = (C82555jn) obj;
            return this.f224897a.equals(jnVar.mo75583d()) && this.f224898b.equals(jnVar.mo75720c()) && this.f224899c.equals(jnVar.mo75719b()) && this.f224900d.equals(jnVar.mo75722f());
        }
    }

    /* renamed from: f */
    public final String mo75722f() {
        return this.f224900d;
    }

    public final int hashCode() {
        return ((((((this.f224897a.hashCode() ^ 1000003) * 1000003) ^ this.f224898b.hashCode()) * 1000003) ^ this.f224899c.hashCode()) * 1000003) ^ this.f224900d.hashCode();
    }

    public final String toString() {
        String str = this.f224897a;
        String str2 = this.f224898b;
        String str3 = this.f224899c;
        String str4 = this.f224900d;
        return "NgaAumResultsEvent{token=" + str + ", actionType=" + str2 + ", actionState=" + str3 + ", resultCount=" + str4 + "}";
    }
}
