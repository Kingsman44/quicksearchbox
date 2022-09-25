package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.a */
/* compiled from: PG */
final class C40441a extends C40447g {

    /* renamed from: a */
    private final String f106150a;

    public C40441a(String str) {
        if (str != null) {
            this.f106150a = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: a */
    public final String mo42435a() {
        return this.f106150a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40447g) {
            return this.f106150a.equals(((C40447g) obj).mo42435a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f106150a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f106150a;
        return "HeaderKey{key=" + str + "}";
    }
}
