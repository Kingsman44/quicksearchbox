package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ek */
/* compiled from: PG */
final class C82417ek extends C82646mx {

    /* renamed from: a */
    private final String f225173a;

    /* renamed from: b */
    private final String f225174b;

    public C82417ek(String str, String str2) {
        this.f225173a = str;
        this.f225174b = str2;
    }

    /* renamed from: b */
    public final String mo76118b() {
        return this.f225174b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225173a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82646mx) {
            C82646mx mxVar = (C82646mx) obj;
            return this.f225173a.equals(mxVar.mo75583d()) && this.f225174b.equals(mxVar.mo76118b());
        }
    }

    public final int hashCode() {
        return ((this.f225173a.hashCode() ^ 1000003) * 1000003) ^ this.f225174b.hashCode();
    }

    public final String toString() {
        String str = this.f225173a;
        String str2 = this.f225174b;
        return "NgaReliabilityLoggingEvent{token=" + str + ", loggingStatus=" + str2 + "}";
    }
}
