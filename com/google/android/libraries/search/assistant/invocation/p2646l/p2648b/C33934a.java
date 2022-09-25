package com.google.android.libraries.search.assistant.invocation.p2646l.p2648b;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.l.b.a */
/* compiled from: PG */
public final class C33934a implements C33938e {

    /* renamed from: a */
    private final Instant f90508a;

    public C33934a(Instant instant) {
        C69664n.m101061g(instant, "timestamp");
        this.f90508a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33934a) && C69664n.m101066l(this.f90508a, ((C33934a) obj).f90508a);
    }

    public final int hashCode() {
        return this.f90508a.hashCode();
    }

    public final String toString() {
        Instant instant = this.f90508a;
        return "@" + instant + ": ACCESSED";
    }
}
