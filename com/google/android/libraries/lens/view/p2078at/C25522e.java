package com.google.android.libraries.lens.view.p2078at;

/* renamed from: com.google.android.libraries.lens.view.at.e */
/* compiled from: PG */
public final class C25522e extends C25527j {

    /* renamed from: a */
    public final String f69500a;

    /* renamed from: b */
    public final int f69501b;

    /* renamed from: c */
    public final int f69502c;

    public C25522e(String str, int i, int i2) {
        if (str != null) {
            this.f69500a = str;
            this.f69502c = i;
            this.f69501b = i2;
            return;
        }
        throw new NullPointerException("Null chipId");
    }

    /* renamed from: a */
    public final int mo30563a() {
        return this.f69501b;
    }

    /* renamed from: b */
    public final String mo30564b() {
        return this.f69500a;
    }

    /* renamed from: c */
    public final int mo30565c() {
        return this.f69502c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25527j) {
            C25527j jVar = (C25527j) obj;
            return this.f69500a.equals(jVar.mo30564b()) && this.f69502c == jVar.mo30565c() && this.f69501b == jVar.mo30563a();
        }
    }

    public final int hashCode() {
        return ((((this.f69500a.hashCode() ^ 1000003) * 1000003) ^ this.f69502c) * 1000003) ^ this.f69501b;
    }

    public final String toString() {
        String str = this.f69500a;
        String str2 = this.f69502c != 1 ? "DISPLAY_LOADING" : "DISPLAY_NORMAL";
        int i = this.f69501b;
        return "ChipState{chipId=" + str + ", displayState=" + str2 + ", stateId=" + i + "}";
    }
}
