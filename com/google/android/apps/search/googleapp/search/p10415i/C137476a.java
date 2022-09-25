package com.google.android.apps.search.googleapp.search.p10415i;

/* renamed from: com.google.android.apps.search.googleapp.search.i.a */
/* compiled from: PG */
final class C137476a extends C137484ad {

    /* renamed from: a */
    private final String f373920a;

    /* renamed from: b */
    private final String f373921b;

    public C137476a(String str, String str2) {
        if (str != null) {
            this.f373920a = str;
            if (str2 != null) {
                this.f373921b = str2;
                return;
            }
            throw new NullPointerException("Null corpusType");
        }
        throw new NullPointerException("Null searchText");
    }

    /* renamed from: a */
    public final String mo113766a() {
        return this.f373921b;
    }

    /* renamed from: b */
    public final String mo113767b() {
        return this.f373920a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C137484ad) {
            C137484ad adVar = (C137484ad) obj;
            return this.f373920a.equals(adVar.mo113767b()) && this.f373921b.equals(adVar.mo113766a());
        }
    }

    public final int hashCode() {
        return ((this.f373920a.hashCode() ^ 1000003) * 1000003) ^ this.f373921b.hashCode();
    }

    public final String toString() {
        String str = this.f373920a;
        String str2 = this.f373921b;
        return "CacheKey{searchText=" + str + ", corpusType=" + str2 + "}";
    }
}
