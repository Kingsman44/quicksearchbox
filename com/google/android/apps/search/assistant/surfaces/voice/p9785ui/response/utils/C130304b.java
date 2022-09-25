package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.utils.b */
/* compiled from: PG */
public final class C130304b implements C47388b {

    /* renamed from: a */
    public final C127170c f357176a;

    public C130304b(C127170c cVar) {
        this.f357176a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C130304b) && C69664n.m101066l(this.f357176a, ((C130304b) obj).f357176a);
    }

    public final int hashCode() {
        return this.f357176a.hashCode();
    }

    public final String toString() {
        C127170c cVar = this.f357176a;
        return "SetCurrentTranscriptionEvent(transcription=" + cVar + ")";
    }
}
