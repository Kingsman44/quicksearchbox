package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1494c;

/* renamed from: com.google.android.libraries.assistant.g.c.a.c.h */
/* compiled from: PG */
final class C18071h extends C18085v {

    /* renamed from: a */
    private final String f51546a;

    /* renamed from: b */
    private final String f51547b;

    public C18071h(String str, String str2) {
        this.f51546a = str;
        this.f51547b = str2;
    }

    /* renamed from: a */
    public final String mo23584a() {
        return this.f51547b;
    }

    /* renamed from: b */
    public final String mo23585b() {
        return this.f51546a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18085v) {
            C18085v vVar = (C18085v) obj;
            return this.f51546a.equals(vVar.mo23585b()) && this.f51547b.equals(vVar.mo23584a());
        }
    }

    public final int hashCode() {
        return ((this.f51546a.hashCode() ^ 1000003) * 1000003) ^ this.f51547b.hashCode();
    }

    public final String toString() {
        String str = this.f51546a;
        String str2 = this.f51547b;
        return "Arguments{recipient=" + str + ", content=" + str2 + "}";
    }
}
