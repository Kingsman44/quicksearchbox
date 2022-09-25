package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2864a;

import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.a.a */
/* compiled from: PG */
public final class C37086a {

    /* renamed from: a */
    public final Instant f96598a;

    /* renamed from: b */
    public final Duration f96599b;

    /* renamed from: c */
    public final String f96600c;

    /* renamed from: d */
    public final int f96601d;

    public C37086a(Instant instant, Duration duration, String str, int i) {
        this.f96598a = instant;
        this.f96599b = duration;
        this.f96600c = str;
        this.f96601d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37086a)) {
            return false;
        }
        C37086a aVar = (C37086a) obj;
        return C69664n.m101066l(this.f96598a, aVar.f96598a) && C69664n.m101066l(this.f96599b, aVar.f96599b) && C69664n.m101066l(this.f96600c, aVar.f96600c) && this.f96601d == aVar.f96601d;
    }

    public final int hashCode() {
        int hashCode = this.f96598a.hashCode() * 31;
        Duration duration = this.f96599b;
        return ((((hashCode + (duration == null ? 0 : duration.hashCode())) * 31) + this.f96600c.hashCode()) * 31) + this.f96601d;
    }

    public final String toString() {
        Instant instant = this.f96598a;
        Duration duration = this.f96599b;
        String str = this.f96600c;
        int i = this.f96601d;
        StringBuilder sb = new StringBuilder("Call(timestamp=");
        sb.append(instant);
        sb.append(", duration=");
        sb.append(duration);
        sb.append(", phoneNumber=");
        sb.append(str);
        sb.append(", type=");
        sb.append(i != 1 ? i != 2 ? "MISSED" : "OUTGOING" : "INCOMING");
        sb.append(")");
        return sb.toString();
    }
}
