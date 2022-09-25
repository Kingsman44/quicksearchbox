package com.google.android.libraries.p590as.p593b.p596b;

/* renamed from: com.google.android.libraries.as.b.b.c */
/* compiled from: PG */
final class C10847c extends C10872g {

    /* renamed from: a */
    private final String f35906a;

    /* renamed from: b */
    private final String f35907b;

    public C10847c(String str, String str2) {
        if (str != null) {
            this.f35906a = str;
            if (str2 != null) {
                this.f35907b = str2;
                return;
            }
            throw new NullPointerException("Null hashValueSha1");
        }
        throw new NullPointerException("Null downloadUrl");
    }

    /* renamed from: a */
    public final String mo19316a() {
        return this.f35906a;
    }

    /* renamed from: b */
    public final String mo19317b() {
        return this.f35907b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10872g) {
            C10872g gVar = (C10872g) obj;
            return this.f35906a.equals(gVar.mo19316a()) && this.f35907b.equals(gVar.mo19317b());
        }
    }

    public final int hashCode() {
        return ((this.f35906a.hashCode() ^ 1000003) * 1000003) ^ this.f35907b.hashCode();
    }

    public final String toString() {
        String str = this.f35906a;
        String str2 = this.f35907b;
        return "ZipfileParams{downloadUrl=" + str + ", hashValueSha1=" + str2 + "}";
    }
}
