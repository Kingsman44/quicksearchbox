package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fh */
/* compiled from: PG */
public final class C82441fh extends C82670nu {

    /* renamed from: a */
    private final String f225263a = "NGA_TISID_FOR_SPEECH_DURATION";

    /* renamed from: b */
    private final Double f225264b;

    /* renamed from: c */
    private final boolean f225265c;

    /* renamed from: d */
    private final String f225266d;

    public C82441fh(String str, Double d, boolean z, String str2) {
        this.f225264b = d;
        this.f225265c = z;
        this.f225266d = str2;
    }

    /* renamed from: b */
    public final Double mo76235b() {
        return this.f225264b;
    }

    /* renamed from: c */
    public final String mo76236c() {
        return this.f225266d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225263a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82670nu) {
            C82670nu nuVar = (C82670nu) obj;
            return this.f225263a.equals(nuVar.mo75583d()) && this.f225264b.equals(nuVar.mo76235b()) && this.f225265c == nuVar.mo76238f() && this.f225266d.equals(nuVar.mo76236c());
        }
    }

    /* renamed from: f */
    public final boolean mo76238f() {
        return this.f225265c;
    }

    public final int hashCode() {
        return ((((((this.f225263a.hashCode() ^ 1000003) * 1000003) ^ this.f225264b.hashCode()) * 1000003) ^ (true != this.f225265c ? 1237 : 1231)) * 1000003) ^ this.f225266d.hashCode();
    }

    public final String toString() {
        String str = this.f225263a;
        Double d = this.f225264b;
        boolean z = this.f225265c;
        String str2 = this.f225266d;
        return "NgaTisidForSpeechDurationEvent{token=" + str + ", value=" + d + ", allowed=" + z + ", confidence=" + str2 + "}";
    }
}
