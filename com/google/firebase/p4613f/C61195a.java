package com.google.firebase.p4613f;

/* renamed from: com.google.firebase.f.a */
/* compiled from: PG */
final class C61195a extends C61199e {

    /* renamed from: a */
    private final String f165544a;

    /* renamed from: b */
    private final String f165545b;

    public C61195a(String str, String str2) {
        this.f165544a = str;
        if (str2 != null) {
            this.f165545b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    /* renamed from: a */
    public final String mo57759a() {
        return this.f165544a;
    }

    /* renamed from: b */
    public final String mo57760b() {
        return this.f165545b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61199e) {
            C61199e eVar = (C61199e) obj;
            return this.f165544a.equals(eVar.mo57759a()) && this.f165545b.equals(eVar.mo57760b());
        }
    }

    public final int hashCode() {
        return ((this.f165544a.hashCode() ^ 1000003) * 1000003) ^ this.f165545b.hashCode();
    }

    public final String toString() {
        String str = this.f165544a;
        String str2 = this.f165545b;
        return "LibraryVersion{libraryName=" + str + ", version=" + str2 + "}";
    }
}
