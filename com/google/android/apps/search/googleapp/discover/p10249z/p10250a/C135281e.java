package com.google.android.apps.search.googleapp.discover.p10249z.p10250a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.a.e */
/* compiled from: PG */
public final class C135281e extends Exception {

    /* renamed from: a */
    public final C135280d f368528a;

    public C135281e(C135280d dVar) {
        this.f368528a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135281e) && C69664n.m101066l(this.f368528a, ((C135281e) obj).f368528a);
    }

    public final int hashCode() {
        return this.f368528a.hashCode();
    }

    public final String toString() {
        C135280d dVar = this.f368528a;
        return "DiscoverPrecheckException(precheckFailureReason=" + dVar + ")";
    }
}
