package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.az */
/* compiled from: PG */
public final class C82324az extends C82554jm {

    /* renamed from: a */
    private final String f224891a = "NGA_AUDIO_FORMAT";

    /* renamed from: b */
    private final String f224892b;

    /* renamed from: c */
    private final int f224893c;

    /* renamed from: d */
    private final int f224894d;

    /* renamed from: e */
    private final int f224895e;

    /* renamed from: f */
    private final String f224896f;

    public C82324az(String str, String str2, int i, int i2, int i3, String str3) {
        this.f224892b = str2;
        this.f224893c = i;
        this.f224894d = i2;
        this.f224895e = i3;
        this.f224896f = str3;
    }

    /* renamed from: b */
    public final int mo75709b() {
        return this.f224893c;
    }

    /* renamed from: c */
    public final int mo75710c() {
        return this.f224894d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224891a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82554jm) {
            C82554jm jmVar = (C82554jm) obj;
            return this.f224891a.equals(jmVar.mo75583d()) && this.f224892b.equals(jmVar.mo75714h()) && this.f224893c == jmVar.mo75709b() && this.f224894d == jmVar.mo75710c() && this.f224895e == jmVar.mo75712f() && this.f224896f.equals(jmVar.mo75713g());
        }
    }

    /* renamed from: f */
    public final int mo75712f() {
        return this.f224895e;
    }

    /* renamed from: g */
    public final String mo75713g() {
        return this.f224896f;
    }

    /* renamed from: h */
    public final String mo75714h() {
        return this.f224892b;
    }

    public final int hashCode() {
        return ((((((((((this.f224891a.hashCode() ^ 1000003) * 1000003) ^ this.f224892b.hashCode()) * 1000003) ^ this.f224893c) * 1000003) ^ this.f224894d) * 1000003) ^ this.f224895e) * 1000003) ^ this.f224896f.hashCode();
    }

    public final String toString() {
        String str = this.f224891a;
        String str2 = this.f224892b;
        int i = this.f224893c;
        int i2 = this.f224894d;
        int i3 = this.f224895e;
        String str3 = this.f224896f;
        return "NgaAudioFormatEvent{token=" + str + ", sessionType=" + str2 + ", channelCount=" + i + ", encoding=" + i2 + ", sampleRate=" + i3 + ", engine=" + str3 + "}";
    }
}
