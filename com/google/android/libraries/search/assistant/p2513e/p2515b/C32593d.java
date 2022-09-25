package com.google.android.libraries.search.assistant.p2513e.p2515b;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.e.b.d */
/* compiled from: PG */
public final class C32593d implements C32591b {

    /* renamed from: a */
    private final Duration f87289a;

    public C32593d(Duration duration) {
        C69664n.m101061g(duration, "offset");
        this.f87289a = duration;
    }

    /* renamed from: a */
    public final Duration mo38153a() {
        return this.f87289a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32593d) && C69664n.m101066l(this.f87289a, ((C32593d) obj).f87289a);
    }

    public final int hashCode() {
        return this.f87289a.hashCode();
    }

    public final String toString() {
        Duration duration = this.f87289a;
        return "StartOfSpeech(offset=" + duration + ")";
    }
}
