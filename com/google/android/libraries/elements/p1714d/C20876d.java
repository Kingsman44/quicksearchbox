package com.google.android.libraries.elements.p1714d;

/* renamed from: com.google.android.libraries.elements.d.d */
/* compiled from: PG */
final class C20876d extends C21070ef {

    /* renamed from: a */
    private final String f58544a;

    /* renamed from: b */
    private final int f58545b;

    public C20876d(String str, int i) {
        this.f58544a = str;
        this.f58545b = i;
    }

    /* renamed from: a */
    public final int mo26002a() {
        return this.f58545b;
    }

    /* renamed from: b */
    public final String mo26003b() {
        return this.f58544a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21070ef) {
            C21070ef efVar = (C21070ef) obj;
            return this.f58544a.equals(efVar.mo26003b()) && this.f58545b == efVar.mo26002a();
        }
    }

    public final int hashCode() {
        return ((this.f58544a.hashCode() ^ 1000003) * 1000003) ^ this.f58545b;
    }

    public final String toString() {
        String str = this.f58544a;
        int i = this.f58545b;
        return "LegacyFontKey{fontName=" + str + ", weightAdjustment=" + i + "}";
    }
}
