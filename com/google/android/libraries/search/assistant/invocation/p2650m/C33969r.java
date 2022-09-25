package com.google.android.libraries.search.assistant.invocation.p2650m;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.m.r */
/* compiled from: PG */
final class C33969r {

    /* renamed from: a */
    public final C33968q f90583a;

    /* renamed from: b */
    public final Instant f90584b;

    public C33969r(C33968q qVar, Instant instant) {
        C69664n.m101061g(instant, "timestamp");
        this.f90583a = qVar;
        this.f90584b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33969r)) {
            return false;
        }
        C33969r rVar = (C33969r) obj;
        return C69664n.m101066l(this.f90583a, rVar.f90583a) && C69664n.m101066l(this.f90584b, rVar.f90584b);
    }

    public final int hashCode() {
        return (this.f90583a.hashCode() * 31) + this.f90584b.hashCode();
    }

    public final String toString() {
        C33968q qVar = this.f90583a;
        Instant instant = this.f90584b;
        return "DebugRecord(event=" + qVar + ", timestamp=" + instant + ")";
    }
}
