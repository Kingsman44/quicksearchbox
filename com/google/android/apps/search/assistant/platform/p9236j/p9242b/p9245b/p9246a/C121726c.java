package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.a.c */
/* compiled from: PG */
final class C121726c {

    /* renamed from: a */
    public final Instant f337769a;

    /* renamed from: b */
    public final C121728e f337770b;

    public C121726c(Instant instant, C121728e eVar) {
        C69664n.m101061g(instant, "timestamp");
        C69664n.m101061g(eVar, "assistDataEvent");
        this.f337769a = instant;
        this.f337770b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121726c)) {
            return false;
        }
        C121726c cVar = (C121726c) obj;
        return C69664n.m101066l(this.f337769a, cVar.f337769a) && C69664n.m101066l(this.f337770b, cVar.f337770b);
    }

    public final int hashCode() {
        return (this.f337769a.hashCode() * 31) + this.f337770b.hashCode();
    }

    public final String toString() {
        Instant instant = this.f337769a;
        C121728e eVar = this.f337770b;
        return "Event(timestamp=" + instant + ", assistDataEvent=" + eVar + ")";
    }
}
