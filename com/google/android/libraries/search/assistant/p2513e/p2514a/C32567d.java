package com.google.android.libraries.search.assistant.p2513e.p2514a;

/* renamed from: com.google.android.libraries.search.assistant.e.a.d */
/* compiled from: PG */
public final class C32567d {

    /* renamed from: a */
    public final int f87209a;

    /* renamed from: b */
    public final int f87210b;

    /* renamed from: c */
    private final int f87211c = 24000;

    /* renamed from: d */
    private final int f87212d = 2048;

    /* renamed from: e */
    private final int f87213e = 1024;

    public C32567d(int i, int i2) {
        this.f87209a = i;
        this.f87210b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32567d)) {
            return false;
        }
        C32567d dVar = (C32567d) obj;
        if (this.f87209a != dVar.f87209a || this.f87210b != dVar.f87210b) {
            return false;
        }
        int i = dVar.f87211c;
        int i2 = dVar.f87212d;
        int i3 = dVar.f87213e;
        return true;
    }

    public final int hashCode() {
        return (((((((this.f87209a * 31) + this.f87210b) * 31) + 24000) * 31) + 2048) * 31) + 1024;
    }

    public final String toString() {
        int i = this.f87209a;
        int i2 = this.f87210b;
        return "Config(sampleRate=" + i + ", channelCount=" + i2 + ", outputBitRate=24000, inputChunkSize=2048, outputChunkSize=1024)";
    }
}
