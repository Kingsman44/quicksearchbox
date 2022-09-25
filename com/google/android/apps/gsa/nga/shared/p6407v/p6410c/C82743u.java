package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.u */
/* compiled from: PG */
final class C82743u extends C82521ig {

    /* renamed from: a */
    private final String f225493a;

    /* renamed from: b */
    private final String f225494b;

    public C82743u(String str, String str2) {
        this.f225493a = str;
        this.f225494b = str2;
    }

    /* renamed from: b */
    public final String mo76561b() {
        return this.f225494b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225493a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82521ig) {
            C82521ig igVar = (C82521ig) obj;
            return this.f225493a.equals(igVar.mo75583d()) && this.f225494b.equals(igVar.mo76561b());
        }
    }

    public final int hashCode() {
        return ((this.f225493a.hashCode() ^ 1000003) * 1000003) ^ this.f225494b.hashCode();
    }

    public final String toString() {
        String str = this.f225493a;
        String str2 = this.f225494b;
        return "DidQueryClassifierInferenceErrorCount{token=" + str + ", errorMessage=" + str2 + "}";
    }
}
