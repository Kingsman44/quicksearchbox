package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ff */
/* compiled from: PG */
final class C82439ff extends C82668ns {

    /* renamed from: a */
    private final String f225255a;

    /* renamed from: b */
    private final String f225256b;

    /* renamed from: c */
    private final String f225257c;

    /* renamed from: d */
    private final String f225258d;

    public C82439ff(String str, String str2, String str3, String str4) {
        this.f225255a = str;
        this.f225256b = str2;
        this.f225257c = str3;
        this.f225258d = str4;
    }

    /* renamed from: b */
    public final String mo76223b() {
        return this.f225257c;
    }

    /* renamed from: c */
    public final String mo76224c() {
        return this.f225256b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225255a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82668ns) {
            C82668ns nsVar = (C82668ns) obj;
            return this.f225255a.equals(nsVar.mo75583d()) && this.f225256b.equals(nsVar.mo76224c()) && this.f225257c.equals(nsVar.mo76223b()) && this.f225258d.equals(nsVar.mo76226f());
        }
    }

    /* renamed from: f */
    public final String mo76226f() {
        return this.f225258d;
    }

    public final int hashCode() {
        return ((((((this.f225255a.hashCode() ^ 1000003) * 1000003) ^ this.f225256b.hashCode()) * 1000003) ^ this.f225257c.hashCode()) * 1000003) ^ this.f225258d.hashCode();
    }

    public final String toString() {
        String str = this.f225255a;
        String str2 = this.f225256b;
        String str3 = this.f225257c;
        String str4 = this.f225258d;
        return "NgaTclibResourceErrors{token=" + str + ", model=" + str2 + ", fileId=" + str3 + ", status=" + str4 + "}";
    }
}
