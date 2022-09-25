package com.google.android.libraries.search.assistant.invocation.p2646l.p2648b;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.l.b.g */
/* compiled from: PG */
public final class C33940g implements C33938e {

    /* renamed from: a */
    private final Instant f90515a;

    public C33940g(Instant instant) {
        C69664n.m101061g(instant, "timestamp");
        this.f90515a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33940g) && C69664n.m101066l(this.f90515a, ((C33940g) obj).f90515a);
    }

    public final int hashCode() {
        return this.f90515a.hashCode();
    }

    public final String toString() {
        Instant instant = this.f90515a;
        return "@" + instant + ": RELEASED";
    }
}
