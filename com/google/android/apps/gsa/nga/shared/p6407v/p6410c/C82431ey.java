package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ey */
/* compiled from: PG */
final class C82431ey extends C82661nl {

    /* renamed from: a */
    private final String f225228a;

    /* renamed from: b */
    private final Double f225229b;

    /* renamed from: c */
    private final String f225230c;

    public C82431ey(String str, Double d, String str2) {
        this.f225228a = str;
        this.f225229b = d;
        this.f225230c = str2;
    }

    /* renamed from: b */
    public final Double mo76191b() {
        return this.f225229b;
    }

    /* renamed from: c */
    public final String mo76192c() {
        return this.f225230c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225228a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82661nl) {
            C82661nl nlVar = (C82661nl) obj;
            return this.f225228a.equals(nlVar.mo75583d()) && this.f225229b.equals(nlVar.mo76191b()) && this.f225230c.equals(nlVar.mo76192c());
        }
    }

    public final int hashCode() {
        return ((((this.f225228a.hashCode() ^ 1000003) * 1000003) ^ this.f225229b.hashCode()) * 1000003) ^ this.f225230c.hashCode();
    }

    public final String toString() {
        String str = this.f225228a;
        Double d = this.f225229b;
        String str2 = this.f225230c;
        return "NgaSpeechBiasingContextLatencyEvent{token=" + str + ", value=" + d + ", contextPart=" + str2 + "}";
    }
}
