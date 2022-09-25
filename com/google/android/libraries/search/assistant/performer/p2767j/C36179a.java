package com.google.android.libraries.search.assistant.performer.p2767j;

/* renamed from: com.google.android.libraries.search.assistant.performer.j.a */
/* compiled from: PG */
final class C36179a extends C36182d {

    /* renamed from: a */
    private final String f94542a;

    /* renamed from: b */
    private final String f94543b;

    public C36179a(String str, String str2) {
        this.f94542a = str;
        this.f94543b = str2;
    }

    /* renamed from: a */
    public final String mo39998a() {
        return this.f94542a;
    }

    /* renamed from: b */
    public final String mo39999b() {
        return this.f94543b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36182d) {
            C36182d dVar = (C36182d) obj;
            return this.f94542a.equals(dVar.mo39998a()) && this.f94543b.equals(dVar.mo39999b());
        }
    }

    public final int hashCode() {
        return ((this.f94542a.hashCode() ^ 1000003) * 1000003) ^ this.f94543b.hashCode();
    }

    public final String toString() {
        String str = this.f94542a;
        String str2 = this.f94543b;
        return "NameAndType{argName=" + str + ", argType=" + str2 + "}";
    }
}
