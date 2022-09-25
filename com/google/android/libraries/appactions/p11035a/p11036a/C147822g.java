package com.google.android.libraries.appactions.p11035a.p11036a;

/* renamed from: com.google.android.libraries.appactions.a.a.g */
/* compiled from: PG */
public final class C147822g extends C147819d {

    /* renamed from: a */
    private final String f398817a;

    /* renamed from: b */
    private final String f398818b;

    public C147822g(String str, String str2) {
        if (str != null) {
            this.f398817a = str;
            if (str2 != null) {
                this.f398818b = str2;
                return;
            }
            throw new NullPointerException("Null param");
        }
        throw new NullPointerException("Null builtInIntent");
    }

    /* renamed from: a */
    public final String mo124486a() {
        return this.f398817a;
    }

    /* renamed from: b */
    public final String mo124487b() {
        return this.f398818b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147819d) {
            C147819d dVar = (C147819d) obj;
            return this.f398817a.equals(dVar.mo124486a()) && this.f398818b.equals(dVar.mo124487b());
        }
    }

    public final int hashCode() {
        return ((this.f398817a.hashCode() ^ 1000003) * 1000003) ^ this.f398818b.hashCode();
    }

    public final String toString() {
        String str = this.f398817a;
        String str2 = this.f398818b;
        return "ParameterAssociation{builtInIntent=" + str + ", param=" + str2 + "}";
    }
}
