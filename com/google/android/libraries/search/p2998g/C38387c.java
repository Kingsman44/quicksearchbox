package com.google.android.libraries.search.p2998g;

/* renamed from: com.google.android.libraries.search.g.c */
/* compiled from: PG */
public final class C38387c extends C38388d {

    /* renamed from: a */
    private final String f101633a;

    public C38387c(String str) {
        this.f101633a = str;
    }

    /* renamed from: a */
    public final int mo41397a() {
        return 3;
    }

    /* renamed from: c */
    public final String mo41405c() {
        return this.f101633a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C38392h) {
            C38392h hVar = (C38392h) obj;
            if (hVar.mo41397a() != 3 || !this.f101633a.equals(hVar.mo41405c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f101633a.hashCode();
    }

    public final String toString() {
        String str = this.f101633a;
        return "DeeplinkDestination{failure=" + str + "}";
    }
}
