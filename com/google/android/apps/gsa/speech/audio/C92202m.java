package com.google.android.apps.gsa.speech.audio;

import android.net.Uri;
import com.google.protobuf.C63088z;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.apps.gsa.speech.audio.m */
/* compiled from: PG */
public final class C92202m extends C92199j {

    /* renamed from: a */
    public final Uri f257053a;

    /* renamed from: b */
    public final C63088z f257054b;

    /* renamed from: c */
    public final int f257055c;

    /* renamed from: d */
    public final int f257056d;

    /* renamed from: e */
    public final C67451at f257057e;

    public C92202m(Uri uri, C63088z zVar, int i, int i2, C67451at atVar) {
        this.f257053a = uri;
        this.f257054b = zVar;
        this.f257055c = i;
        this.f257056d = i2;
        this.f257057e = atVar;
    }

    /* renamed from: a */
    public final int mo86869a() {
        return this.f257055c;
    }

    /* renamed from: b */
    public final int mo86870b() {
        return this.f257056d;
    }

    /* renamed from: c */
    public final Uri mo86871c() {
        return this.f257053a;
    }

    /* renamed from: d */
    public final C63088z mo86872d() {
        return this.f257054b;
    }

    /* renamed from: e */
    public final C67451at mo86873e() {
        return this.f257057e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C92199j) {
            C92199j jVar = (C92199j) obj;
            return this.f257053a.equals(jVar.mo86871c()) && this.f257054b.equals(jVar.mo86872d()) && this.f257055c == jVar.mo86869a() && this.f257056d == jVar.mo86870b() && this.f257057e.equals(jVar.mo86873e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f257053a.hashCode() ^ 1000003) * 1000003) ^ this.f257054b.hashCode()) * 1000003) ^ this.f257055c) * 1000003) ^ this.f257056d) * 1000003) ^ this.f257057e.hashCode();
    }

    public final String toString() {
        String obj = this.f257053a.toString();
        String obj2 = this.f257054b.toString();
        int i = this.f257055c;
        int i2 = this.f257056d;
        String num = Integer.toString(this.f257057e.f183321p);
        return "AudioSliceInsertionResult{uri=" + obj + ", slicedAudioBytes=" + obj2 + ", durationMs=" + i + ", samplingRateHz=" + i2 + ", encoding=" + num + "}";
    }
}
