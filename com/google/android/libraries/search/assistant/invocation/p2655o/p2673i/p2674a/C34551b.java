package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.b */
/* compiled from: PG */
public final class C34551b {

    /* renamed from: a */
    public final Instant f91803a;

    /* renamed from: b */
    public final C34564c f91804b;

    public C34551b(Instant instant, C34564c cVar) {
        C69664n.m101061g(instant, "timestamp");
        this.f91803a = instant;
        this.f91804b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34551b)) {
            return false;
        }
        C34551b bVar = (C34551b) obj;
        return C69664n.m101066l(this.f91803a, bVar.f91803a) && C69664n.m101066l(this.f91804b, bVar.f91804b);
    }

    public final int hashCode() {
        return (this.f91803a.hashCode() * 31) + this.f91804b.hashCode();
    }

    public final String toString() {
        Instant instant = this.f91803a;
        C34564c cVar = this.f91804b;
        return "EventRecord(timestamp=" + instant + ", state=" + cVar + ")";
    }
}
