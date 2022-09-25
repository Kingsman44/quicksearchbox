package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.ah */
/* compiled from: PG */
public final class C34383ah {

    /* renamed from: a */
    public final String f91405a;

    /* renamed from: b */
    public final boolean f91406b;

    /* renamed from: c */
    public final Instant f91407c;

    public C34383ah(String str, boolean z, Instant instant) {
        C69664n.m101061g(instant, "timestamp");
        this.f91405a = str;
        this.f91406b = z;
        this.f91407c = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34383ah)) {
            return false;
        }
        C34383ah ahVar = (C34383ah) obj;
        return C69664n.m101066l(this.f91405a, ahVar.f91405a) && this.f91406b == ahVar.f91406b && C69664n.m101066l(this.f91407c, ahVar.f91407c);
    }

    public final int hashCode() {
        String str = this.f91405a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + (this.f91406b ? 1 : 0)) * 31) + this.f91407c.hashCode();
    }

    public final String toString() {
        String str = this.f91405a;
        boolean z = this.f91406b;
        Instant instant = this.f91407c;
        return "ConfigurationChangedEvent(snapshotId=" + str + ", subscription=" + z + ", timestamp=" + instant + ")";
    }
}
