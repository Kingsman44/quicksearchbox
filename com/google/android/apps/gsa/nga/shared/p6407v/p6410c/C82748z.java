package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.z */
/* compiled from: PG */
public final class C82748z extends C82526il {

    /* renamed from: a */
    private final String f225512a = "DID_RESULT_SCORE";

    /* renamed from: b */
    private final Double f225513b;

    /* renamed from: c */
    private final String f225514c;

    /* renamed from: d */
    private final String f225515d;

    /* renamed from: e */
    private final String f225516e;

    public C82748z(String str, Double d, String str2, String str3, String str4) {
        this.f225513b = d;
        this.f225514c = "unknown";
        this.f225515d = str3;
        this.f225516e = str4;
    }

    /* renamed from: b */
    public final Double mo76574b() {
        return this.f225513b;
    }

    /* renamed from: c */
    public final String mo76575c() {
        return this.f225515d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225512a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82526il) {
            C82526il ilVar = (C82526il) obj;
            return this.f225512a.equals(ilVar.mo75583d()) && this.f225513b.equals(ilVar.mo76574b()) && this.f225514c.equals(ilVar.mo76577g()) && this.f225515d.equals(ilVar.mo76575c()) && this.f225516e.equals(ilVar.mo76576f());
        }
    }

    /* renamed from: f */
    public final String mo76576f() {
        return this.f225516e;
    }

    /* renamed from: g */
    public final String mo76577g() {
        return this.f225514c;
    }

    public final int hashCode() {
        return ((((((((this.f225512a.hashCode() ^ 1000003) * 1000003) ^ this.f225513b.hashCode()) * 1000003) ^ this.f225514c.hashCode()) * 1000003) ^ this.f225515d.hashCode()) * 1000003) ^ this.f225516e.hashCode();
    }

    public final String toString() {
        String str = this.f225512a;
        Double d = this.f225513b;
        String str2 = this.f225514c;
        String str3 = this.f225515d;
        String str4 = this.f225516e;
        return "DidResultScoreEvent{token=" + str + ", value=" + d + ", modelVersion=" + str2 + ", languageCode=" + str3 + ", mode=" + str4 + "}";
    }
}
