package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.d */
/* compiled from: PG */
final class C121788d {

    /* renamed from: a */
    private final Instant f337966a;

    /* renamed from: b */
    private final String f337967b;

    /* renamed from: c */
    private final String f337968c;

    public C121788d(Instant instant, String str, String str2) {
        C69664n.m101061g(instant, "updatedAt");
        C69664n.m101061g(str2, "newRoute");
        this.f337966a = instant;
        this.f337967b = str;
        this.f337968c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121788d)) {
            return false;
        }
        C121788d dVar = (C121788d) obj;
        return C69664n.m101066l(this.f337966a, dVar.f337966a) && C69664n.m101066l(this.f337967b, dVar.f337967b) && C69664n.m101066l(this.f337968c, dVar.f337968c);
    }

    public final int hashCode() {
        return (((this.f337966a.hashCode() * 31) + this.f337967b.hashCode()) * 31) + this.f337968c.hashCode();
    }

    public final String toString() {
        Instant instant = this.f337966a;
        String str = this.f337967b;
        String str2 = this.f337968c;
        return "AudioRouteUpdate(updatedAt=" + instant + ", oldRoute=" + str + ", newRoute=" + str2 + ")";
    }
}
