package com.google.android.libraries.search.assistant.p2513e.p2515b;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.e.b.a */
/* compiled from: PG */
public final class C32575a implements C32591b {

    /* renamed from: a */
    private final Duration f87234a;

    public C32575a(Duration duration) {
        C69664n.m101061g(duration, "offset");
        this.f87234a = duration;
    }

    /* renamed from: a */
    public final Duration mo38153a() {
        return this.f87234a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32575a) && C69664n.m101066l(this.f87234a, ((C32575a) obj).f87234a);
    }

    public final int hashCode() {
        return this.f87234a.hashCode();
    }

    public final String toString() {
        Duration duration = this.f87234a;
        return "EndOfSpeech(offset=" + duration + ")";
    }
}
