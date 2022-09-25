package com.google.android.apps.search.assistant.surfaces.p9485e.p9487b;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b.b */
/* compiled from: PG */
public final class C126413b {

    /* renamed from: a */
    public final Duration f348168a;

    /* renamed from: b */
    public final Duration f348169b;

    public C126413b(Duration duration, Duration duration2) {
        C69664n.m101061g(duration, "offlineTriggerDuration");
        C69664n.m101061g(duration2, "noSpeechDetectedTimeoutDuration");
        this.f348168a = duration;
        this.f348169b = duration2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C126413b)) {
            return false;
        }
        C126413b bVar = (C126413b) obj;
        return C69664n.m101066l(this.f348168a, bVar.f348168a) && C69664n.m101066l(this.f348169b, bVar.f348169b);
    }

    public final int hashCode() {
        return (this.f348168a.hashCode() * 31) + this.f348169b.hashCode();
    }

    public final String toString() {
        Duration duration = this.f348168a;
        Duration duration2 = this.f348169b;
        return "Config(offlineTriggerDuration=" + duration + ", noSpeechDetectedTimeoutDuration=" + duration2 + ")";
    }
}
