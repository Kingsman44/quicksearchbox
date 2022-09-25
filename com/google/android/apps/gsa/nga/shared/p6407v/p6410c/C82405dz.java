package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dz */
/* compiled from: PG */
public final class C82405dz extends C82635mm {

    /* renamed from: a */
    private final String f225137a = "NGA_OPA_QUERY_FAILURES";

    /* renamed from: b */
    private final String f225138b;

    /* renamed from: c */
    private final String f225139c;

    public C82405dz(String str, String str2, String str3) {
        this.f225138b = str2;
        this.f225139c = str3;
    }

    /* renamed from: b */
    public final String mo76060b() {
        return this.f225138b;
    }

    /* renamed from: c */
    public final String mo76061c() {
        return this.f225139c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225137a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82635mm) {
            C82635mm mmVar = (C82635mm) obj;
            return this.f225137a.equals(mmVar.mo75583d()) && this.f225138b.equals(mmVar.mo76060b()) && this.f225139c.equals(mmVar.mo76061c());
        }
    }

    public final int hashCode() {
        return ((((this.f225137a.hashCode() ^ 1000003) * 1000003) ^ this.f225138b.hashCode()) * 1000003) ^ this.f225139c.hashCode();
    }

    public final String toString() {
        String str = this.f225137a;
        String str2 = this.f225138b;
        String str3 = this.f225139c;
        return "NgaOpaQueryFailuresEvent{token=" + str + ", locale=" + str2 + ", type=" + str3 + "}";
    }
}
