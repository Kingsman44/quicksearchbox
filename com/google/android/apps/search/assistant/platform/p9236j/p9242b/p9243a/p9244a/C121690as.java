package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.as */
/* compiled from: PG */
final class C121690as {

    /* renamed from: a */
    public final String f337605a;

    /* renamed from: b */
    public final Instant f337606b;

    /* renamed from: c */
    public final Instant f337607c;

    public C121690as(String str, Instant instant, Instant instant2) {
        C69664n.m101061g(str, "resourceType");
        C69664n.m101061g(instant, "addedAt");
        this.f337605a = str;
        this.f337606b = instant;
        this.f337607c = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121690as)) {
            return false;
        }
        C121690as asVar = (C121690as) obj;
        return C69664n.m101066l(this.f337605a, asVar.f337605a) && C69664n.m101066l(this.f337606b, asVar.f337606b) && C69664n.m101066l(this.f337607c, asVar.f337607c);
    }

    public final int hashCode() {
        int hashCode = ((this.f337605a.hashCode() * 31) + this.f337606b.hashCode()) * 31;
        Instant instant = this.f337607c;
        return hashCode + (instant == null ? 0 : instant.hashCode());
    }

    public final String toString() {
        String str = this.f337605a;
        Instant instant = this.f337606b;
        Instant instant2 = this.f337607c;
        return "ResourceDebugData(resourceType=" + str + ", addedAt=" + instant + ", removedAt=" + instant2 + ")";
    }
}
