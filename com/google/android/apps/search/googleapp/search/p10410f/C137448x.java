package com.google.android.apps.search.googleapp.search.p10410f;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.f.x */
/* compiled from: PG */
public final class C137448x {

    /* renamed from: a */
    public final Instant f373846a;

    /* renamed from: b */
    public final Object f373847b;

    public C137448x(Instant instant, Object obj) {
        C69664n.m101061g(instant, "timestamp");
        this.f373846a = instant;
        this.f373847b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137448x)) {
            return false;
        }
        C137448x xVar = (C137448x) obj;
        return C69664n.m101066l(this.f373846a, xVar.f373846a) && C69664n.m101066l(this.f373847b, xVar.f373847b);
    }

    public final int hashCode() {
        int hashCode = this.f373846a.hashCode() * 31;
        Object obj = this.f373847b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        Instant instant = this.f373846a;
        Object obj = this.f373847b;
        return "Timestamped(timestamp=" + instant + ", item=" + obj + ")";
    }
}
