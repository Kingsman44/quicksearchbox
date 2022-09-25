package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cv */
/* compiled from: PG */
final class C82374cv extends C82604li {

    /* renamed from: a */
    private final String f225043a;

    /* renamed from: b */
    private final Double f225044b;

    /* renamed from: c */
    private final String f225045c;

    /* renamed from: d */
    private final boolean f225046d;

    public C82374cv(String str, Double d, String str2, boolean z) {
        this.f225043a = str;
        this.f225044b = d;
        this.f225045c = str2;
        this.f225046d = z;
    }

    /* renamed from: b */
    public final Double mo75916b() {
        return this.f225044b;
    }

    /* renamed from: c */
    public final String mo75917c() {
        return this.f225045c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225043a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82604li) {
            C82604li liVar = (C82604li) obj;
            return this.f225043a.equals(liVar.mo75583d()) && this.f225044b.equals(liVar.mo75916b()) && this.f225045c.equals(liVar.mo75917c()) && this.f225046d == liVar.mo75919f();
        }
    }

    /* renamed from: f */
    public final boolean mo75919f() {
        return this.f225046d;
    }

    public final int hashCode() {
        return ((((((this.f225043a.hashCode() ^ 1000003) * 1000003) ^ this.f225044b.hashCode()) * 1000003) ^ this.f225045c.hashCode()) * 1000003) ^ (true != this.f225046d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225043a;
        Double d = this.f225044b;
        String str2 = this.f225045c;
        boolean z = this.f225046d;
        return "NgaInitialDownloaderButtonHeightEvent{token=" + str + ", value=" + d + ", button=" + str2 + ", attemptedBugFix=" + z + "}";
    }
}
