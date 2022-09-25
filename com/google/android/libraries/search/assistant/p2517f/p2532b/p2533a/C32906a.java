package com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.b.a.a */
/* compiled from: PG */
final class C32906a {

    /* renamed from: a */
    public final Instant f88200a;

    /* renamed from: b */
    public final String f88201b;

    public C32906a(Instant instant, String str) {
        C69664n.m101061g(instant, "timeStamp");
        C69664n.m101061g(str, "snapshot");
        this.f88200a = instant;
        this.f88201b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32906a)) {
            return false;
        }
        C32906a aVar = (C32906a) obj;
        return C69664n.m101066l(this.f88200a, aVar.f88200a) && C69664n.m101066l(this.f88201b, aVar.f88201b);
    }

    public final int hashCode() {
        return (this.f88200a.hashCode() * 31) + this.f88201b.hashCode();
    }

    public final String toString() {
        Instant instant = this.f88200a;
        String str = this.f88201b;
        return "Snapshot(timeStamp=" + instant + ", snapshot=" + str + ")";
    }
}
