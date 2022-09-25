package com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.e.b.a.b */
/* compiled from: PG */
public final class C32577b {

    /* renamed from: a */
    public final int f87236a = 16000;

    /* renamed from: b */
    public final Duration f87237b;

    /* renamed from: c */
    public final Duration f87238c;

    public C32577b(Duration duration, Duration duration2) {
        C69664n.m101061g(duration, "progressStepDuration");
        C69664n.m101061g(duration2, "debouncingDelay");
        this.f87237b = duration;
        this.f87238c = duration2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32577b)) {
            return false;
        }
        C32577b bVar = (C32577b) obj;
        int i = bVar.f87236a;
        return C69664n.m101066l(this.f87237b, bVar.f87237b) && C69664n.m101066l(this.f87238c, bVar.f87238c);
    }

    public final int hashCode() {
        return ((this.f87237b.hashCode() + 496000) * 31) + this.f87238c.hashCode();
    }

    public final String toString() {
        Duration duration = this.f87237b;
        Duration duration2 = this.f87238c;
        return "Config(sampleRate=16000, progressStepDuration=" + duration + ", debouncingDelay=" + duration2 + ")";
    }
}
