package com.google.android.apps.search.transcription.p10670f;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.transcription.f.h */
/* compiled from: PG */
final class C141914h extends C141860d {

    /* renamed from: a */
    private final Optional f385042a;

    /* renamed from: b */
    private final Optional f385043b;

    /* renamed from: c */
    private final int f385044c;

    /* renamed from: d */
    private final int f385045d;

    /* renamed from: e */
    private final int f385046e;

    /* renamed from: f */
    private final boolean f385047f;

    public C141914h(Optional optional, Optional optional2, int i, int i2, int i3, boolean z) {
        this.f385042a = optional;
        this.f385043b = optional2;
        this.f385044c = i;
        this.f385045d = i2;
        this.f385046e = i3;
        this.f385047f = z;
    }

    /* renamed from: a */
    public final int mo116854a() {
        return this.f385045d;
    }

    /* renamed from: b */
    public final int mo116855b() {
        return this.f385046e;
    }

    /* renamed from: c */
    public final int mo116856c() {
        return this.f385044c;
    }

    /* renamed from: e */
    public final Optional mo116857e() {
        return this.f385043b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C141860d) {
            C141860d dVar = (C141860d) obj;
            return this.f385042a.equals(dVar.mo116858f()) && this.f385043b.equals(dVar.mo116857e()) && this.f385044c == dVar.mo116856c() && this.f385045d == dVar.mo116854a() && this.f385046e == dVar.mo116855b() && this.f385047f == dVar.mo116859g();
        }
    }

    /* renamed from: f */
    public final Optional mo116858f() {
        return this.f385042a;
    }

    /* renamed from: g */
    public final boolean mo116859g() {
        return this.f385047f;
    }

    public final int hashCode() {
        return ((((((((((this.f385042a.hashCode() ^ 1000003) * 1000003) ^ this.f385043b.hashCode()) * 1000003) ^ this.f385044c) * 1000003) ^ this.f385045d) * 1000003) ^ this.f385046e) * 1000003) ^ (true != this.f385047f ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f385042a);
        String valueOf2 = String.valueOf(this.f385043b);
        int i = this.f385044c;
        int i2 = this.f385045d;
        int i3 = this.f385046e;
        boolean z = this.f385047f;
        return "AudioSourceParams{uri=" + valueOf + ", fileDescriptor=" + valueOf2 + ", samplingRate=" + i + ", channelCount=" + i2 + ", encoding=" + i3 + ", isFromMic=" + z + "}";
    }
}
