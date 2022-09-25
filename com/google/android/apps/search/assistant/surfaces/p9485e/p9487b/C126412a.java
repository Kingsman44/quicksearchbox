package com.google.android.apps.search.assistant.surfaces.p9485e.p9487b;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b.a */
/* compiled from: PG */
public final class C126412a implements C126414c {

    /* renamed from: a */
    private final Duration f348167a;

    public C126412a(Duration duration) {
        C69664n.m101061g(duration, "offset");
        this.f348167a = duration;
    }

    /* renamed from: a */
    public final Duration mo107585a() {
        return this.f348167a;
    }

    /* renamed from: b */
    public final int mo107586b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C126412a) && C69664n.m101066l(this.f348167a, ((C126412a) obj).f348167a);
    }

    public final int hashCode() {
        return this.f348167a.hashCode();
    }

    public final String toString() {
        Duration duration = this.f348167a;
        return "AudioFinishedEndOfSpeech(offset=" + duration + ")";
    }
}
