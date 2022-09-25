package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9605a;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127457e;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.c.a.b */
/* compiled from: PG */
public final class C127497b extends C127498c {

    /* renamed from: a */
    public final C127457e f351021a;

    /* renamed from: b */
    public final Duration f351022b;

    public C127497b(C127457e eVar, Duration duration) {
        C69664n.m101061g(eVar, "request");
        C69664n.m101061g(duration, "requestElapsedRealTime");
        this.f351021a = eVar;
        this.f351022b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C127497b)) {
            return false;
        }
        C127497b bVar = (C127497b) obj;
        return C69664n.m101066l(this.f351021a, bVar.f351021a) && C69664n.m101066l(this.f351022b, bVar.f351022b);
    }

    public final int hashCode() {
        return (this.f351021a.hashCode() * 31) + this.f351022b.hashCode();
    }

    public final String toString() {
        C127457e eVar = this.f351021a;
        Duration duration = this.f351022b;
        return "SelfTriggerRequestPayload(request=" + eVar + ", requestElapsedRealTime=" + duration + ")";
    }
}
