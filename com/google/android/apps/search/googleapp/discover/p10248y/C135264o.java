package com.google.android.apps.search.googleapp.discover.p10248y;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.o */
/* compiled from: PG */
public final class C135264o extends C135268s {

    /* renamed from: a */
    public final Instant f368493a;

    public C135264o(Instant instant) {
        C69664n.m101061g(instant, "lastSuccessfulFetchTime");
        this.f368493a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135264o) && C69664n.m101066l(this.f368493a, ((C135264o) obj).f368493a);
    }

    public final int hashCode() {
        return this.f368493a.hashCode();
    }

    public final String toString() {
        Instant instant = this.f368493a;
        return "NoConnectionErrorRenderableSlice(lastSuccessfulFetchTime=" + instant + ")";
    }
}
