package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.aa */
/* compiled from: PG */
public final class C82299aa extends C82527im {

    /* renamed from: a */
    private final String f224804a = "DID_TRANSCRIPTION_RESULT_COUNT";

    /* renamed from: b */
    private final String f224805b = "unknown";

    /* renamed from: c */
    private final String f224806c;

    /* renamed from: d */
    private final String f224807d;

    /* renamed from: e */
    private final String f224808e;

    public C82299aa(String str, String str2, String str3, String str4, String str5) {
        this.f224806c = str3;
        this.f224807d = str4;
        this.f224808e = str5;
    }

    /* renamed from: b */
    public final String mo75586b() {
        return this.f224806c;
    }

    /* renamed from: c */
    public final String mo75587c() {
        return this.f224807d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224804a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82527im) {
            C82527im imVar = (C82527im) obj;
            return this.f224804a.equals(imVar.mo75583d()) && this.f224805b.equals(imVar.mo75589f()) && this.f224806c.equals(imVar.mo75586b()) && this.f224807d.equals(imVar.mo75587c()) && this.f224808e.equals(imVar.mo75590g());
        }
    }

    /* renamed from: f */
    public final String mo75589f() {
        return this.f224805b;
    }

    /* renamed from: g */
    public final String mo75590g() {
        return this.f224808e;
    }

    public final int hashCode() {
        return ((((((((this.f224804a.hashCode() ^ 1000003) * 1000003) ^ this.f224805b.hashCode()) * 1000003) ^ this.f224806c.hashCode()) * 1000003) ^ this.f224807d.hashCode()) * 1000003) ^ this.f224808e.hashCode();
    }

    public final String toString() {
        String str = this.f224804a;
        String str2 = this.f224805b;
        String str3 = this.f224806c;
        String str4 = this.f224807d;
        String str5 = this.f224808e;
        return "DidTranscriptionResultCountEvent{token=" + str + ", modelVersion=" + str2 + ", languageCode=" + str3 + ", mode=" + str4 + ", reason=" + str5 + "}";
    }
}
