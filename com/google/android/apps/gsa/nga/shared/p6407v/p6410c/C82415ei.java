package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ei */
/* compiled from: PG */
public final class C82415ei extends C82644mv {

    /* renamed from: a */
    private final String f225167a = "NGA_RECOGNITION_CONTEXT_PROVIDED";

    /* renamed from: b */
    private final Double f225168b;

    /* renamed from: c */
    private final String f225169c;

    /* renamed from: d */
    private final String f225170d;

    public C82415ei(String str, Double d, String str2, String str3) {
        this.f225168b = d;
        this.f225169c = str2;
        this.f225170d = str3;
    }

    /* renamed from: b */
    public final Double mo76111b() {
        return this.f225168b;
    }

    /* renamed from: c */
    public final String mo76112c() {
        return this.f225170d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225167a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82644mv) {
            C82644mv mvVar = (C82644mv) obj;
            return this.f225167a.equals(mvVar.mo75583d()) && this.f225168b.equals(mvVar.mo76111b()) && this.f225169c.equals(mvVar.mo76114f()) && this.f225170d.equals(mvVar.mo76112c());
        }
    }

    /* renamed from: f */
    public final String mo76114f() {
        return this.f225169c;
    }

    public final int hashCode() {
        return ((((((this.f225167a.hashCode() ^ 1000003) * 1000003) ^ this.f225168b.hashCode()) * 1000003) ^ this.f225169c.hashCode()) * 1000003) ^ this.f225170d.hashCode();
    }

    public final String toString() {
        String str = this.f225167a;
        Double d = this.f225168b;
        String str2 = this.f225169c;
        String str3 = this.f225170d;
        return "NgaRecognitionContextProvidedEvent{token=" + str + ", value=" + d + ", recognitionEngine=" + str2 + ", contextName=" + str3 + "}";
    }
}
