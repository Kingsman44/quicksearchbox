package com.google.android.libraries.search.assistant.p2513e.p2515b;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.e.b.c */
/* compiled from: PG */
public final class C32592c implements C32591b {

    /* renamed from: a */
    private final Duration f87288a;

    public C32592c(Duration duration) {
        C69664n.m101061g(duration, "offset");
        this.f87288a = duration;
    }

    /* renamed from: a */
    public final Duration mo38153a() {
        return this.f87288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32592c) && C69664n.m101066l(this.f87288a, ((C32592c) obj).f87288a);
    }

    public final int hashCode() {
        return this.f87288a.hashCode();
    }

    public final String toString() {
        Duration duration = this.f87288a;
        return "ProgressUpdate(offset=" + duration + ")";
    }
}
