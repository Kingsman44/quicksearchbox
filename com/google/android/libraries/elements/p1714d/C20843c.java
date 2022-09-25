package com.google.android.libraries.elements.p1714d;

/* renamed from: com.google.android.libraries.elements.d.c */
/* compiled from: PG */
final class C20843c extends C21069ee {

    /* renamed from: a */
    private final String f58402a;

    /* renamed from: b */
    private final int f58403b;

    /* renamed from: c */
    private final boolean f58404c;

    public C20843c(String str, int i, boolean z) {
        this.f58402a = str;
        this.f58403b = i;
        this.f58404c = z;
    }

    /* renamed from: a */
    public final int mo25953a() {
        return this.f58403b;
    }

    /* renamed from: b */
    public final String mo25954b() {
        return this.f58402a;
    }

    /* renamed from: c */
    public final boolean mo25955c() {
        return this.f58404c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21069ee) {
            C21069ee eeVar = (C21069ee) obj;
            return this.f58402a.equals(eeVar.mo25954b()) && this.f58403b == eeVar.mo25953a() && this.f58404c == eeVar.mo25955c();
        }
    }

    public final int hashCode() {
        return ((((this.f58402a.hashCode() ^ 1000003) * 1000003) ^ this.f58403b) * 1000003) ^ (true != this.f58404c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f58402a;
        int i = this.f58403b;
        boolean z = this.f58404c;
        return "FontKey{fontName=" + str + ", weight=" + i + ", italic=" + z + "}";
    }
}
