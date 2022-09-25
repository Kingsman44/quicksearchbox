package com.google.android.apps.search.assistant.surfaces.p9485e.p9487b;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b.d */
/* compiled from: PG */
public final class C126415d implements C126414c {

    /* renamed from: a */
    private final Duration f348170a;

    public C126415d(Duration duration) {
        C69664n.m101061g(duration, "offset");
        this.f348170a = duration;
    }

    /* renamed from: a */
    public final Duration mo107585a() {
        return this.f348170a;
    }

    /* renamed from: b */
    public final int mo107586b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C126415d) && C69664n.m101066l(this.f348170a, ((C126415d) obj).f348170a);
    }

    public final int hashCode() {
        return this.f348170a.hashCode();
    }

    public final String toString() {
        Duration duration = this.f348170a;
        return "NoSpeechDetected(offset=" + duration + ")";
    }
}
