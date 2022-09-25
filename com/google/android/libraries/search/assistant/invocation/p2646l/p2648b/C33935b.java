package com.google.android.libraries.search.assistant.invocation.p2646l.p2648b;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.l.b.b */
/* compiled from: PG */
public final class C33935b implements C33938e {

    /* renamed from: a */
    private final Instant f90509a;

    public C33935b(Instant instant) {
        C69664n.m101061g(instant, "timestamp");
        this.f90509a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33935b) && C69664n.m101066l(this.f90509a, ((C33935b) obj).f90509a);
    }

    public final int hashCode() {
        return this.f90509a.hashCode();
    }

    public final String toString() {
        Instant instant = this.f90509a;
        return "@" + instant + ": ACCESSED_NOT_AVAILABLE";
    }
}
