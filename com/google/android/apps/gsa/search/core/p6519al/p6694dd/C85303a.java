package com.google.android.apps.gsa.search.core.p6519al.p6694dd;

/* renamed from: com.google.android.apps.gsa.search.core.al.dd.a */
/* compiled from: PG */
public final class C85303a extends C85322b {

    /* renamed from: a */
    private final String f231066a;

    /* renamed from: b */
    private final String f231067b;

    /* renamed from: c */
    private final boolean f231068c;

    /* renamed from: d */
    private final String f231069d;

    public C85303a(String str, String str2, boolean z, String str3) {
        if (str != null) {
            this.f231066a = str;
            if (str2 != null) {
                this.f231067b = str2;
                this.f231068c = z;
                if (str3 != null) {
                    this.f231069d = str3;
                    return;
                }
                throw new NullPointerException("Null contentLanguage");
            }
            throw new NullPointerException("Null publisher");
        }
        throw new NullPointerException("Null title");
    }

    /* renamed from: a */
    public final String mo78857a() {
        return this.f231069d;
    }

    /* renamed from: b */
    public final String mo78858b() {
        return this.f231067b;
    }

    /* renamed from: c */
    public final String mo78859c() {
        return this.f231066a;
    }

    /* renamed from: d */
    public final boolean mo78860d() {
        return this.f231068c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C85322b) {
            C85322b bVar = (C85322b) obj;
            return this.f231066a.equals(bVar.mo78859c()) && this.f231067b.equals(bVar.mo78858b()) && this.f231068c == bVar.mo78860d() && this.f231069d.equals(bVar.mo78857a());
        }
    }

    public final int hashCode() {
        return ((((((this.f231066a.hashCode() ^ 1000003) * 1000003) ^ this.f231067b.hashCode()) * 1000003) ^ (true != this.f231068c ? 1237 : 1231)) * 1000003) ^ this.f231069d.hashCode();
    }

    public final String toString() {
        String str = this.f231066a;
        String str2 = this.f231067b;
        boolean z = this.f231068c;
        String str3 = this.f231069d;
        return "DisplayMetadata{title=" + str + ", publisher=" + str2 + ", timepointsSupported=" + z + ", contentLanguage=" + str3 + "}";
    }
}
