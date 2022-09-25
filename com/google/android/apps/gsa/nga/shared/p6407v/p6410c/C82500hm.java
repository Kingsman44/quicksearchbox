package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hm */
/* compiled from: PG */
public final class C82500hm extends C82729pz {

    /* renamed from: a */
    private final String f225421a = "TC_LIB_PERSON_NAME_ANNOTATION_COUNT";

    /* renamed from: b */
    private final Double f225422b;

    /* renamed from: c */
    private final int f225423c;

    /* renamed from: d */
    private final int f225424d;

    /* renamed from: e */
    private final int f225425e;

    public C82500hm(String str, Double d, int i, int i2, int i3) {
        this.f225422b = d;
        this.f225423c = i;
        this.f225424d = i2;
        this.f225425e = i3;
    }

    /* renamed from: b */
    public final int mo76492b() {
        return this.f225423c;
    }

    /* renamed from: c */
    public final int mo76493c() {
        return this.f225425e;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225421a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82729pz) {
            C82729pz pzVar = (C82729pz) obj;
            return this.f225421a.equals(pzVar.mo75583d()) && this.f225422b.equals(pzVar.mo76496g()) && this.f225423c == pzVar.mo76492b() && this.f225424d == pzVar.mo76495f() && this.f225425e == pzVar.mo76493c();
        }
    }

    /* renamed from: f */
    public final int mo76495f() {
        return this.f225424d;
    }

    /* renamed from: g */
    public final Double mo76496g() {
        return this.f225422b;
    }

    public final int hashCode() {
        return ((((((((this.f225421a.hashCode() ^ 1000003) * 1000003) ^ this.f225422b.hashCode()) * 1000003) ^ this.f225423c) * 1000003) ^ this.f225424d) * 1000003) ^ this.f225425e;
    }

    public final String toString() {
        String str = this.f225421a;
        Double d = this.f225422b;
        int i = this.f225423c;
        int i2 = this.f225424d;
        int i3 = this.f225425e;
        return "TcLibPersonNameAnnotationCountEvent{token=" + str + ", value=" + d + ", coreModelVersion=" + i + ", personNameModelVersion=" + i2 + ", neuralMatchingEncoderVersion=" + i3 + "}";
    }
}
