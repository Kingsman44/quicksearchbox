package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cz */
/* compiled from: PG */
public final class C82378cz extends C82608lm {

    /* renamed from: a */
    private final String f225059a = "NGA_LANGUAGE_PACK_SIZE2";

    /* renamed from: b */
    private final Double f225060b;

    /* renamed from: c */
    private final int f225061c;

    /* renamed from: d */
    private final String f225062d;

    /* renamed from: e */
    private final String f225063e;

    public C82378cz(String str, Double d, int i, String str2, String str3) {
        this.f225060b = d;
        this.f225061c = i;
        this.f225062d = str2;
        this.f225063e = str3;
    }

    /* renamed from: b */
    public final int mo75940b() {
        return this.f225061c;
    }

    /* renamed from: c */
    public final Double mo75941c() {
        return this.f225060b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225059a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82608lm) {
            C82608lm lmVar = (C82608lm) obj;
            return this.f225059a.equals(lmVar.mo75583d()) && this.f225060b.equals(lmVar.mo75941c()) && this.f225061c == lmVar.mo75940b() && this.f225062d.equals(lmVar.mo75943f()) && this.f225063e.equals(lmVar.mo75944g());
        }
    }

    /* renamed from: f */
    public final String mo75943f() {
        return this.f225062d;
    }

    /* renamed from: g */
    public final String mo75944g() {
        return this.f225063e;
    }

    public final int hashCode() {
        return ((((((((this.f225059a.hashCode() ^ 1000003) * 1000003) ^ this.f225060b.hashCode()) * 1000003) ^ this.f225061c) * 1000003) ^ this.f225062d.hashCode()) * 1000003) ^ this.f225063e.hashCode();
    }

    public final String toString() {
        String str = this.f225059a;
        Double d = this.f225060b;
        int i = this.f225061c;
        String str2 = this.f225062d;
        String str3 = this.f225063e;
        return "NgaLanguagePackSizeEvent{token=" + str + ", value=" + d + ", lpVersion=" + i + ", assistantLocale=" + str2 + ", failureReason=" + str3 + "}";
    }
}
