package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.b */
/* compiled from: PG */
final class C121695b {

    /* renamed from: a */
    public final Instant f337639a;

    /* renamed from: b */
    public final C121700g f337640b;

    public C121695b(Instant instant, C121700g gVar) {
        C69664n.m101061g(instant, "timestamp");
        C69664n.m101061g(gVar, "status");
        this.f337639a = instant;
        this.f337640b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121695b)) {
            return false;
        }
        C121695b bVar = (C121695b) obj;
        return C69664n.m101066l(this.f337639a, bVar.f337639a) && this.f337640b == bVar.f337640b;
    }

    public final int hashCode() {
        return (this.f337639a.hashCode() * 31) + this.f337640b.hashCode();
    }

    public final String toString() {
        Instant instant = this.f337639a;
        C121700g gVar = this.f337640b;
        return "StatusEvent(timestamp=" + instant + ", status=" + gVar + ")";
    }
}
