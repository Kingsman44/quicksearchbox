package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dd */
/* compiled from: PG */
public final class C82383dd extends C82612lq {

    /* renamed from: a */
    private final String f225077a = "NGA_LOCATION_API";

    /* renamed from: b */
    private final String f225078b;

    public C82383dd(String str, String str2) {
        this.f225078b = str2;
    }

    /* renamed from: b */
    public final String mo75963b() {
        return this.f225078b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225077a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82612lq) {
            C82612lq lqVar = (C82612lq) obj;
            return this.f225077a.equals(lqVar.mo75583d()) && this.f225078b.equals(lqVar.mo75963b());
        }
    }

    public final int hashCode() {
        return ((this.f225077a.hashCode() ^ 1000003) * 1000003) ^ this.f225078b.hashCode();
    }

    public final String toString() {
        String str = this.f225077a;
        String str2 = this.f225078b;
        return "NgaLocationApiEvent{token=" + str + ", callingComponentName=" + str2 + "}";
    }
}
