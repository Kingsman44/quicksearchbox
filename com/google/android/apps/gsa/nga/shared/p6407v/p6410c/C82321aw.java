package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.aw */
/* compiled from: PG */
public final class C82321aw extends C82551jj {

    /* renamed from: a */
    private final String f224876a = "NGA_ANNOTATION_REQUEST_UNCACHED_LATENCY";

    /* renamed from: b */
    private final Double f224877b;

    /* renamed from: c */
    private final int f224878c;

    /* renamed from: d */
    private final int f224879d;

    /* renamed from: e */
    private final int f224880e;

    /* renamed from: f */
    private final String f224881f;

    public C82321aw(String str, Double d, int i, int i2, int i3, String str2) {
        this.f224877b = d;
        this.f224878c = i;
        this.f224879d = i2;
        this.f224880e = i3;
        this.f224881f = str2;
    }

    /* renamed from: b */
    public final int mo75692b() {
        return this.f224878c;
    }

    /* renamed from: c */
    public final int mo75693c() {
        return this.f224880e;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224876a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82551jj) {
            C82551jj jjVar = (C82551jj) obj;
            return this.f224876a.equals(jjVar.mo75583d()) && this.f224877b.equals(jjVar.mo75696g()) && this.f224878c == jjVar.mo75692b() && this.f224879d == jjVar.mo75695f() && this.f224880e == jjVar.mo75693c() && this.f224881f.equals(jjVar.mo75697h());
        }
    }

    /* renamed from: f */
    public final int mo75695f() {
        return this.f224879d;
    }

    /* renamed from: g */
    public final Double mo75696g() {
        return this.f224877b;
    }

    /* renamed from: h */
    public final String mo75697h() {
        return this.f224881f;
    }

    public final int hashCode() {
        return ((((((((((this.f224876a.hashCode() ^ 1000003) * 1000003) ^ this.f224877b.hashCode()) * 1000003) ^ this.f224878c) * 1000003) ^ this.f224879d) * 1000003) ^ this.f224880e) * 1000003) ^ this.f224881f.hashCode();
    }

    public final String toString() {
        String str = this.f224876a;
        Double d = this.f224877b;
        int i = this.f224878c;
        int i2 = this.f224879d;
        int i3 = this.f224880e;
        String str2 = this.f224881f;
        return "NgaAnnotationRequestUncachedLatencyEvent{token=" + str + ", value=" + d + ", coreModelVersion=" + i + ", personNameModelVersion=" + i2 + ", neuralMatchingEncoderVersion=" + i3 + ", annotationTypes=" + str2 + "}";
    }
}
