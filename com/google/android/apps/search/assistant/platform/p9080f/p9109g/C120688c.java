package com.google.android.apps.search.assistant.platform.p9080f.p9109g;

import com.google.speech.p5218j.C67083kk;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.c */
/* compiled from: PG */
final class C120688c extends C120689d {

    /* renamed from: a */
    private final C67083kk f335672a;

    public C120688c(C67083kk kkVar) {
        this.f335672a = kkVar;
    }

    /* renamed from: a */
    public final C120699n mo104862a() {
        return C120699n.PARTIAL_RECOGNITION;
    }

    /* renamed from: c */
    public final C67083kk mo104895c() {
        return this.f335672a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C120700o) {
            C120700o oVar = (C120700o) obj;
            if (C120699n.PARTIAL_RECOGNITION != oVar.mo104862a() || !this.f335672a.equals(oVar.mo104895c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f335672a.hashCode();
    }

    public final String toString() {
        String obj = this.f335672a.toString();
        return "TranscriptionState{partialRecognition=" + obj + "}";
    }
}
