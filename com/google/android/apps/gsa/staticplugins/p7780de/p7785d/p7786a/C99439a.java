package com.google.android.apps.gsa.staticplugins.p7780de.p7785d.p7786a;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.d.a.a */
/* compiled from: PG */
public final class C99439a extends C99446h {

    /* renamed from: a */
    private final String f278251a;

    /* renamed from: b */
    private final Integer f278252b;

    /* renamed from: c */
    private final Integer f278253c;

    public C99439a(String str, Integer num, Integer num2) {
        if (str != null) {
            this.f278251a = str;
            this.f278252b = num;
            this.f278253c = num2;
            return;
        }
        throw new NullPointerException("Null language");
    }

    /* renamed from: a */
    public final Integer mo91450a() {
        return this.f278253c;
    }

    /* renamed from: b */
    public final Integer mo91451b() {
        return this.f278252b;
    }

    /* renamed from: c */
    public final String mo91452c() {
        return this.f278251a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C99446h) {
            C99446h hVar = (C99446h) obj;
            return this.f278251a.equals(hVar.mo91452c()) && this.f278252b.equals(hVar.mo91451b()) && this.f278253c.equals(hVar.mo91450a());
        }
    }

    public final int hashCode() {
        return ((((this.f278251a.hashCode() ^ 1000003) * 1000003) ^ this.f278252b.hashCode()) * 1000003) ^ this.f278253c.hashCode();
    }

    public final String toString() {
        String str = this.f278251a;
        Integer num = this.f278252b;
        Integer num2 = this.f278253c;
        return "LanguageViewData{language=" + str + ", textColor=" + num + ", bgColor=" + num2 + "}";
    }
}
