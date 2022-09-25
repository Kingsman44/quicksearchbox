package com.google.android.apps.search.googleapp.discover.p10248y;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.c */
/* compiled from: PG */
public final class C135252c extends C135268s {

    /* renamed from: a */
    public final Throwable f368454a;

    /* renamed from: b */
    private final Instant f368455b;

    public C135252c(Instant instant, Throwable th) {
        C69664n.m101061g(instant, "errorTime");
        this.f368455b = instant;
        this.f368454a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135252c)) {
            return false;
        }
        C135252c cVar = (C135252c) obj;
        return C69664n.m101066l(this.f368455b, cVar.f368455b) && C69664n.m101066l(this.f368454a, cVar.f368454a);
    }

    public final int hashCode() {
        int hashCode = this.f368455b.hashCode() * 31;
        Throwable th = this.f368454a;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        Instant instant = this.f368455b;
        Throwable th = this.f368454a;
        return "AuthenticationErrorRenderableSlice(errorTime=" + instant + ", cause=" + th + ")";
    }
}
