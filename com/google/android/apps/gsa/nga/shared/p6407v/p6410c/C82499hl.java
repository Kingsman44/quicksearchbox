package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hl */
/* compiled from: PG */
public final class C82499hl extends C82728py {

    /* renamed from: a */
    private final String f225415a = "TC_LIB_ANNOTATION_REQUEST_LATENCY";

    /* renamed from: b */
    private final Double f225416b;

    /* renamed from: c */
    private final int f225417c;

    /* renamed from: d */
    private final int f225418d;

    /* renamed from: e */
    private final int f225419e;

    /* renamed from: f */
    private final String f225420f;

    public C82499hl(String str, Double d, int i, int i2, int i3, String str2) {
        this.f225416b = d;
        this.f225417c = i;
        this.f225418d = i2;
        this.f225419e = i3;
        this.f225420f = str2;
    }

    /* renamed from: b */
    public final int mo76484b() {
        return this.f225417c;
    }

    /* renamed from: c */
    public final int mo76485c() {
        return this.f225419e;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225415a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82728py) {
            C82728py pyVar = (C82728py) obj;
            return this.f225415a.equals(pyVar.mo75583d()) && this.f225416b.equals(pyVar.mo76488g()) && this.f225417c == pyVar.mo76484b() && this.f225418d == pyVar.mo76487f() && this.f225419e == pyVar.mo76485c() && this.f225420f.equals(pyVar.mo76489h());
        }
    }

    /* renamed from: f */
    public final int mo76487f() {
        return this.f225418d;
    }

    /* renamed from: g */
    public final Double mo76488g() {
        return this.f225416b;
    }

    /* renamed from: h */
    public final String mo76489h() {
        return this.f225420f;
    }

    public final int hashCode() {
        return ((((((((((this.f225415a.hashCode() ^ 1000003) * 1000003) ^ this.f225416b.hashCode()) * 1000003) ^ this.f225417c) * 1000003) ^ this.f225418d) * 1000003) ^ this.f225419e) * 1000003) ^ this.f225420f.hashCode();
    }

    public final String toString() {
        String str = this.f225415a;
        Double d = this.f225416b;
        int i = this.f225417c;
        int i2 = this.f225418d;
        int i3 = this.f225419e;
        String str2 = this.f225420f;
        return "TcLibAnnotationRequestLatencyEvent{token=" + str + ", value=" + d + ", coreModelVersion=" + i + ", personNameModelVersion=" + i2 + ", neuralMatchingEncoderVersion=" + i3 + ", annotationTypes=" + str2 + "}";
    }
}
