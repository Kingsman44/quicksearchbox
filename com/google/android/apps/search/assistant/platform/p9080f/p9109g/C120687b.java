package com.google.android.apps.search.assistant.platform.p9080f.p9109g;

import com.google.speech.p5218j.C67083kk;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.b */
/* compiled from: PG */
final class C120687b extends C120689d {

    /* renamed from: a */
    private final C67083kk f335671a;

    public C120687b(C67083kk kkVar) {
        this.f335671a = kkVar;
    }

    /* renamed from: a */
    public final C120699n mo104862a() {
        return C120699n.FINAL_RECOGNITION;
    }

    /* renamed from: b */
    public final C67083kk mo104891b() {
        return this.f335671a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C120700o) {
            C120700o oVar = (C120700o) obj;
            if (C120699n.FINAL_RECOGNITION != oVar.mo104862a() || !this.f335671a.equals(oVar.mo104891b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f335671a.hashCode();
    }

    public final String toString() {
        String obj = this.f335671a.toString();
        return "TranscriptionState{finalRecognition=" + obj + "}";
    }
}
