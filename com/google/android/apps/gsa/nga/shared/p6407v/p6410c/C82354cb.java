package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cb */
/* compiled from: PG */
final class C82354cb extends C82583ko {

    /* renamed from: a */
    private final String f224978a;

    /* renamed from: b */
    private final boolean f224979b;

    /* renamed from: c */
    private final String f224980c;

    /* renamed from: d */
    private final String f224981d;

    public C82354cb(String str, boolean z, String str2, String str3) {
        this.f224978a = str;
        this.f224979b = z;
        this.f224980c = str2;
        this.f224981d = str3;
    }

    /* renamed from: b */
    public final String mo75834b() {
        return this.f224981d;
    }

    /* renamed from: c */
    public final String mo75835c() {
        return this.f224980c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224978a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82583ko) {
            C82583ko koVar = (C82583ko) obj;
            return this.f224978a.equals(koVar.mo75583d()) && this.f224979b == koVar.mo75837f() && this.f224980c.equals(koVar.mo75835c()) && this.f224981d.equals(koVar.mo75834b());
        }
    }

    /* renamed from: f */
    public final boolean mo75837f() {
        return this.f224979b;
    }

    public final int hashCode() {
        return ((((((this.f224978a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f224979b ? 1237 : 1231)) * 1000003) ^ this.f224980c.hashCode()) * 1000003) ^ this.f224981d.hashCode();
    }

    public final String toString() {
        String str = this.f224978a;
        boolean z = this.f224979b;
        String str2 = this.f224980c;
        String str3 = this.f224981d;
        return "NgaForegroundScreenContextEvent{token=" + str + ", weburiFound=" + z + ", errorMessage=" + str2 + ", component=" + str3 + "}";
    }
}
