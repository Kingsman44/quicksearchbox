package com.google.android.apps.search.googleapp.discover.p10248y;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.bf */
/* compiled from: PG */
public final class C135245bf extends C135268s {

    /* renamed from: a */
    public final Throwable f368433a;

    /* renamed from: b */
    private final Instant f368434b;

    public C135245bf(Instant instant, Throwable th) {
        C69664n.m101061g(instant, "errorTime");
        this.f368434b = instant;
        this.f368433a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135245bf)) {
            return false;
        }
        C135245bf bfVar = (C135245bf) obj;
        return C69664n.m101066l(this.f368434b, bfVar.f368434b) && C69664n.m101066l(this.f368433a, bfVar.f368433a);
    }

    public final int hashCode() {
        int hashCode = this.f368434b.hashCode() * 31;
        Throwable th = this.f368433a;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        Instant instant = this.f368434b;
        Throwable th = this.f368433a;
        return "ResponseErrorRenderableSlice(errorTime=" + instant + ", cause=" + th + ")";
    }
}
