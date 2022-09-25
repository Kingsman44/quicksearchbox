package com.google.android.libraries.search.p2871b;

/* renamed from: com.google.android.libraries.search.b.f */
/* compiled from: PG */
final class C37235f extends C37316q {

    /* renamed from: a */
    private final String f98910a;

    /* renamed from: b */
    private final String f98911b;

    public C37235f(String str, String str2) {
        if (str != null) {
            this.f98910a = str;
            if (str2 != null) {
                this.f98911b = str2;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null tag");
    }

    /* renamed from: a */
    public final String mo40733a() {
        return this.f98910a;
    }

    /* renamed from: b */
    public final String mo40734b() {
        return this.f98911b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37316q) {
            C37316q qVar = (C37316q) obj;
            return this.f98910a.equals(qVar.mo40733a()) && this.f98911b.equals(qVar.mo40734b());
        }
    }

    public final int hashCode() {
        return ((this.f98910a.hashCode() ^ 1000003) * 1000003) ^ this.f98911b.hashCode();
    }

    public final String toString() {
        String str = this.f98910a;
        String str2 = this.f98911b;
        return "Tag{tag=" + str + ", value=" + str2 + "}";
    }
}
