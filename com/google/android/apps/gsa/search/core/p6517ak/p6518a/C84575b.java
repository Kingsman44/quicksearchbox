package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.b */
/* compiled from: PG */
final class C84575b extends C84577d {

    /* renamed from: a */
    private final String f230163a;

    public C84575b(String str) {
        this.f230163a = str;
    }

    /* renamed from: b */
    public final C84573ad mo78324b() {
        return C84573ad.STRING;
    }

    /* renamed from: c */
    public final String mo78330c() {
        return this.f230163a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C84574ae) {
            C84574ae aeVar = (C84574ae) obj;
            if (C84573ad.STRING != aeVar.mo78324b() || !this.f230163a.equals(aeVar.mo78330c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f230163a.hashCode();
    }

    public final String toString() {
        String str = this.f230163a;
        return "Utterance{string=" + str + "}";
    }
}
