package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bz */
/* compiled from: PG */
final class C82351bz extends C82581km {

    /* renamed from: a */
    private final String f224967a;

    /* renamed from: b */
    private final boolean f224968b;

    /* renamed from: c */
    private final String f224969c;

    /* renamed from: d */
    private final int f224970d;

    /* renamed from: e */
    private final String f224971e;

    /* renamed from: f */
    private final String f224972f;

    public C82351bz(String str, boolean z, String str2, int i, String str3, String str4) {
        this.f224967a = str;
        this.f224968b = z;
        this.f224969c = str2;
        this.f224970d = i;
        this.f224971e = str3;
        this.f224972f = str4;
    }

    /* renamed from: b */
    public final int mo75821b() {
        return this.f224970d;
    }

    /* renamed from: c */
    public final String mo75822c() {
        return this.f224972f;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224967a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82581km) {
            C82581km kmVar = (C82581km) obj;
            return this.f224967a.equals(kmVar.mo75583d()) && this.f224968b == kmVar.mo75826h() && this.f224969c.equals(kmVar.mo75825g()) && this.f224970d == kmVar.mo75821b() && this.f224971e.equals(kmVar.mo75824f()) && this.f224972f.equals(kmVar.mo75822c());
        }
    }

    /* renamed from: f */
    public final String mo75824f() {
        return this.f224971e;
    }

    /* renamed from: g */
    public final String mo75825g() {
        return this.f224969c;
    }

    /* renamed from: h */
    public final boolean mo75826h() {
        return this.f224968b;
    }

    public final int hashCode() {
        return ((((((((((this.f224967a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f224968b ? 1237 : 1231)) * 1000003) ^ this.f224969c.hashCode()) * 1000003) ^ this.f224970d) * 1000003) ^ this.f224971e.hashCode()) * 1000003) ^ this.f224972f.hashCode();
    }

    public final String toString() {
        String str = this.f224967a;
        boolean z = this.f224968b;
        String str2 = this.f224969c;
        int i = this.f224970d;
        String str3 = this.f224971e;
        String str4 = this.f224972f;
        return "NgaForegroundActivityEvent{token=" + str + ", foundApp=" + z + ", sourceApi=" + str2 + ", apiLevel=" + i + ", errorMessage=" + str3 + ", component=" + str4 + "}";
    }
}
