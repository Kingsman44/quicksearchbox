package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9607d;

import p3186j$.time.Duration;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.d.d */
/* compiled from: PG */
public final class C127523d {

    /* renamed from: a */
    public final Duration f351156a;

    /* renamed from: b */
    public final int f351157b;

    /* renamed from: c */
    public final Duration f351158c;

    public C127523d(Duration duration, int i, Duration duration2) {
        C69664n.m101061g(duration, "sysUiElapsedRealtime");
        C69664n.m101061g(duration2, "invocationElapsedRealtime");
        this.f351156a = duration;
        this.f351157b = i;
        this.f351158c = duration2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C127523d)) {
            return false;
        }
        C127523d dVar = (C127523d) obj;
        return C69664n.m101066l(this.f351156a, dVar.f351156a) && this.f351157b == dVar.f351157b && C69664n.m101066l(this.f351158c, dVar.f351158c);
    }

    public final int hashCode() {
        return (((this.f351156a.hashCode() * 31) + this.f351157b) * 31) + this.f351158c.hashCode();
    }

    public final String toString() {
        long millis = this.f351156a.toMillis();
        int i = this.f351157b;
        long millis2 = this.f351158c.toMillis();
        return C69540x.m100851ag(C69540x.m100947e("sysUiElapsedRealtimeMillis:" + millis, "opaTriggerType:" + i, "invocationElapsedRealtimeMillis:" + millis2), ",", "{", "}", (C69626l) null, 56);
    }
}
