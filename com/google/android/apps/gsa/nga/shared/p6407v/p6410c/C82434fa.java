package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fa */
/* compiled from: PG */
public final class C82434fa extends C82663nn {

    /* renamed from: a */
    private final String f225238a = "NGA_SPEECH_NOT_RECOGNIZED2";

    /* renamed from: b */
    private final String f225239b;

    /* renamed from: c */
    private final String f225240c;

    /* renamed from: d */
    private final String f225241d;

    public C82434fa(String str, String str2, String str3, String str4) {
        this.f225239b = str2;
        this.f225240c = str3;
        this.f225241d = str4;
    }

    /* renamed from: b */
    public final String mo76204b() {
        return this.f225240c;
    }

    /* renamed from: c */
    public final String mo76205c() {
        return this.f225239b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225238a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82663nn) {
            C82663nn nnVar = (C82663nn) obj;
            return this.f225238a.equals(nnVar.mo75583d()) && this.f225239b.equals(nnVar.mo76205c()) && this.f225240c.equals(nnVar.mo76204b()) && this.f225241d.equals(nnVar.mo76207f());
        }
    }

    /* renamed from: f */
    public final String mo76207f() {
        return this.f225241d;
    }

    public final int hashCode() {
        return ((((((this.f225238a.hashCode() ^ 1000003) * 1000003) ^ this.f225239b.hashCode()) * 1000003) ^ this.f225240c.hashCode()) * 1000003) ^ this.f225241d.hashCode();
    }

    public final String toString() {
        String str = this.f225238a;
        String str2 = this.f225239b;
        String str3 = this.f225240c;
        String str4 = this.f225241d;
        return "NgaSpeechNotRecognizedEvent{token=" + str + ", speechRecognizer=" + str2 + ", lifecycleStateOnInvocation=" + str3 + ", timeoutType=" + str4 + "}";
    }
}
