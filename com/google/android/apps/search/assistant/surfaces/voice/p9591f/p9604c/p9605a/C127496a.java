package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9605a;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127418e;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.c.a.a */
/* compiled from: PG */
public final class C127496a extends C127498c {

    /* renamed from: a */
    public final C127418e f351019a;

    /* renamed from: b */
    public final Duration f351020b;

    public C127496a(C127418e eVar, Duration duration) {
        C69664n.m101061g(eVar, "request");
        C69664n.m101061g(duration, "requestElapsedRealTime");
        this.f351019a = eVar;
        this.f351020b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C127496a)) {
            return false;
        }
        C127496a aVar = (C127496a) obj;
        return C69664n.m101066l(this.f351019a, aVar.f351019a) && C69664n.m101066l(this.f351020b, aVar.f351020b);
    }

    public final int hashCode() {
        return (this.f351019a.hashCode() * 31) + this.f351020b.hashCode();
    }

    public final String toString() {
        C127418e eVar = this.f351019a;
        Duration duration = this.f351020b;
        return "DeeplinkRequestPayload(request=" + eVar + ", requestElapsedRealTime=" + duration + ")";
    }
}
