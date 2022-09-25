package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import java.util.Map;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.aj */
/* compiled from: PG */
final class C34385aj {

    /* renamed from: a */
    public final Instant f91413a;

    /* renamed from: b */
    public final Map f91414b;

    public C34385aj(Instant instant, Map map) {
        C69664n.m101061g(instant, "timestamp");
        C69664n.m101061g(map, "subscriptions");
        this.f91413a = instant;
        this.f91414b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34385aj)) {
            return false;
        }
        C34385aj ajVar = (C34385aj) obj;
        return C69664n.m101066l(this.f91413a, ajVar.f91413a) && C69664n.m101066l(this.f91414b, ajVar.f91414b);
    }

    public final int hashCode() {
        return (this.f91413a.hashCode() * 31) + this.f91414b.hashCode();
    }

    public final String toString() {
        Instant instant = this.f91413a;
        Map map = this.f91414b;
        return "TriggeringConnectivityDebugData(timestamp=" + instant + ", subscriptions=" + map + ")";
    }
}
