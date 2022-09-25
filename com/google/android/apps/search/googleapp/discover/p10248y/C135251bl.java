package com.google.android.apps.search.googleapp.discover.p10248y;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.bl */
/* compiled from: PG */
public final class C135251bl extends C135268s {

    /* renamed from: a */
    public final Throwable f368452a;

    /* renamed from: b */
    private final Instant f368453b;

    public C135251bl(Instant instant, Throwable th) {
        C69664n.m101061g(instant, "errorTime");
        this.f368453b = instant;
        this.f368452a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135251bl)) {
            return false;
        }
        C135251bl blVar = (C135251bl) obj;
        return C69664n.m101066l(this.f368453b, blVar.f368453b) && C69664n.m101066l(this.f368452a, blVar.f368452a);
    }

    public final int hashCode() {
        int hashCode = this.f368453b.hashCode() * 31;
        Throwable th = this.f368452a;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        Instant instant = this.f368453b;
        Throwable th = this.f368452a;
        return "UnexpectedErrorRenderableSlice(errorTime=" + instant + ", cause=" + th + ")";
    }
}
