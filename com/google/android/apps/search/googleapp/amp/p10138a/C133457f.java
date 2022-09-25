package com.google.android.apps.search.googleapp.amp.p10138a;

import android.net.Uri;

/* renamed from: com.google.android.apps.search.googleapp.amp.a.f */
/* compiled from: PG */
final class C133457f extends C133455d {

    /* renamed from: a */
    private final Uri f363653a;

    /* renamed from: b */
    private final boolean f363654b;

    /* renamed from: c */
    private final String f363655c;

    public C133457f(Uri uri, boolean z, String str) {
        if (uri != null) {
            this.f363653a = uri;
            this.f363654b = z;
            this.f363655c = str;
            return;
        }
        throw new NullPointerException("Null cacheUrl");
    }

    /* renamed from: a */
    public final Uri mo111157a() {
        return this.f363653a;
    }

    /* renamed from: b */
    public final String mo111158b() {
        return this.f363655c;
    }

    /* renamed from: c */
    public final boolean mo111159c() {
        return this.f363654b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C133455d) {
            C133455d dVar = (C133455d) obj;
            return this.f363653a.equals(dVar.mo111157a()) && this.f363654b == dVar.mo111159c() && this.f363655c.equals(dVar.mo111158b());
        }
    }

    public final int hashCode() {
        return ((((this.f363653a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f363654b ? 1237 : 1231)) * 1000003) ^ this.f363655c.hashCode();
    }

    public final String toString() {
        String obj = this.f363653a.toString();
        boolean z = this.f363654b;
        String str = this.f363655c;
        return "AmpCacheUrl{cacheUrl=" + obj + ", isHttps=" + z + ", ampUrlWithoutSchema=" + str + "}";
    }
}
