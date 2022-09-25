package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gr */
/* compiled from: PG */
public final class C82478gr extends C82708pe {

    /* renamed from: a */
    private final String f225363a = "NGA_WINNING_SPEECH_RECOGNITION";

    /* renamed from: b */
    private final int f225364b;

    public C82478gr(String str, int i) {
        this.f225364b = i;
    }

    /* renamed from: b */
    public final int mo76403b() {
        return this.f225364b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225363a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82708pe) {
            C82708pe peVar = (C82708pe) obj;
            return this.f225363a.equals(peVar.mo75583d()) && this.f225364b == peVar.mo76403b();
        }
    }

    public final int hashCode() {
        return ((this.f225363a.hashCode() ^ 1000003) * 1000003) ^ this.f225364b;
    }

    public final String toString() {
        String str = this.f225363a;
        int i = this.f225364b;
        return "NgaWinningSpeechRecognitionEvent{token=" + str + ", speechRecognizer=" + i + "}";
    }
}
