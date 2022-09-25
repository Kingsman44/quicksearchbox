package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gx */
/* compiled from: PG */
final class C82484gx extends C82714pk {

    /* renamed from: a */
    private final String f225381a;

    /* renamed from: b */
    private final String f225382b;

    /* renamed from: c */
    private final boolean f225383c;

    public C82484gx(String str, String str2, boolean z) {
        this.f225381a = str;
        this.f225382b = str2;
        this.f225383c = z;
    }

    /* renamed from: b */
    public final String mo76429b() {
        return this.f225382b;
    }

    /* renamed from: c */
    public final boolean mo76430c() {
        return this.f225383c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225381a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82714pk) {
            C82714pk pkVar = (C82714pk) obj;
            return this.f225381a.equals(pkVar.mo75583d()) && this.f225382b.equals(pkVar.mo76429b()) && this.f225383c == pkVar.mo76430c();
        }
    }

    public final int hashCode() {
        return ((((this.f225381a.hashCode() ^ 1000003) * 1000003) ^ this.f225382b.hashCode()) * 1000003) ^ (true != this.f225383c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225381a;
        String str2 = this.f225382b;
        boolean z = this.f225383c;
        return "PieMapsEducationUsecaseEvent{token=" + str + ", eventType=" + str2 + ", isCounterfactual=" + z + "}";
    }
}
