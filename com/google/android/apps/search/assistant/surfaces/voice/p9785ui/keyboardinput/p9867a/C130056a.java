package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.a */
/* compiled from: PG */
final class C130056a extends C130069n {

    /* renamed from: a */
    public final String f356636a = "tng-ma";

    /* renamed from: b */
    public final String f356637b;

    public C130056a(String str) {
        this.f356637b = str;
    }

    /* renamed from: a */
    public final String mo109472a() {
        return this.f356637b;
    }

    /* renamed from: b */
    public final String mo109473b() {
        return this.f356636a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130069n) {
            C130069n nVar = (C130069n) obj;
            return this.f356636a.equals(nVar.mo109473b()) && this.f356637b.equals(nVar.mo109472a());
        }
    }

    public final int hashCode() {
        return ((this.f356636a.hashCode() ^ 1000003) * 1000003) ^ this.f356637b.hashCode();
    }

    public final String toString() {
        String str = this.f356636a;
        String str2 = this.f356637b;
        return "CompleteServerRequestSettings{suggestClient=" + str + ", devicePixelRatioParameter=" + str2 + "}";
    }
}
