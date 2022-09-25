package com.google.android.libraries.assistant.hotword.p1515a;

import android.media.AudioFormat;

/* renamed from: com.google.android.libraries.assistant.hotword.a.a */
/* compiled from: PG */
public final class C18326a extends C18327b {

    /* renamed from: a */
    public final long f51967a;

    /* renamed from: b */
    public final AudioFormat f51968b;

    /* renamed from: c */
    public final int f51969c;

    public C18326a(long j, AudioFormat audioFormat, int i) {
        this.f51967a = j;
        if (audioFormat != null) {
            this.f51968b = audioFormat;
            this.f51969c = i;
            return;
        }
        throw new NullPointerException("Null audioFormat");
    }

    /* renamed from: a */
    public final int mo23776a() {
        return this.f51969c;
    }

    /* renamed from: b */
    public final long mo23777b() {
        return this.f51967a;
    }

    /* renamed from: c */
    public final AudioFormat mo23778c() {
        return this.f51968b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18327b) {
            C18327b bVar = (C18327b) obj;
            return this.f51967a == bVar.mo23777b() && this.f51968b.equals(bVar.mo23778c()) && this.f51969c == bVar.mo23776a();
        }
    }

    public final int hashCode() {
        long j = this.f51967a;
        return this.f51969c ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f51968b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f51967a;
        String obj = this.f51968b.toString();
        int i = this.f51969c;
        return "DspAudioData{hotwordDetectedTimestamp=" + j + ", audioFormat=" + obj + ", captureSession=" + i + "}";
    }
}
