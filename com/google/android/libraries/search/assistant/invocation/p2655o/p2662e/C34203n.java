package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import java.util.Map;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.n */
/* compiled from: PG */
final class C34203n {

    /* renamed from: a */
    public final Instant f91025a;

    /* renamed from: b */
    public final Map f91026b;

    public C34203n(Instant instant, Map map) {
        C69664n.m101061g(instant, "timestamp");
        C69664n.m101061g(map, "routing");
        this.f91025a = instant;
        this.f91026b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34203n)) {
            return false;
        }
        C34203n nVar = (C34203n) obj;
        return C69664n.m101066l(this.f91025a, nVar.f91025a) && C69664n.m101066l(this.f91026b, nVar.f91026b);
    }

    public final int hashCode() {
        return (this.f91025a.hashCode() * 31) + this.f91026b.hashCode();
    }

    public final String toString() {
        Instant instant = this.f91025a;
        Map map = this.f91026b;
        return "RoutingDebugRecord(timestamp=" + instant + ", routing=" + map + ")";
    }
}
