package com.google.android.apps.search.podcasts.player;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.f */
/* compiled from: PG */
public final class C140788f {

    /* renamed from: a */
    public final C140789g f382287a;

    /* renamed from: b */
    public final Instant f382288b;

    public C140788f(C140789g gVar, Instant instant) {
        C69664n.m101061g(gVar, "type");
        C69664n.m101061g(instant, "endTime");
        this.f382287a = gVar;
        this.f382288b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140788f)) {
            return false;
        }
        C140788f fVar = (C140788f) obj;
        return this.f382287a == fVar.f382287a && C69664n.m101066l(this.f382288b, fVar.f382288b);
    }

    public final int hashCode() {
        return (this.f382287a.hashCode() * 31) + this.f382288b.hashCode();
    }

    public final String toString() {
        C140789g gVar = this.f382287a;
        Instant instant = this.f382288b;
        return "SleepTimerInfo(type=" + gVar + ", endTime=" + instant + ")";
    }
}
