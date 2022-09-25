package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bp */
/* compiled from: PG */
final class C32647bp {

    /* renamed from: a */
    public final Object f87508a;

    /* renamed from: b */
    public final int f87509b;

    /* renamed from: c */
    public final Duration f87510c;

    /* renamed from: d */
    public final boolean f87511d;

    public C32647bp(Object obj, int i, Duration duration, boolean z) {
        this.f87508a = obj;
        this.f87509b = i;
        this.f87510c = duration;
        this.f87511d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32647bp)) {
            return false;
        }
        C32647bp bpVar = (C32647bp) obj;
        return C69664n.m101066l(this.f87508a, bpVar.f87508a) && this.f87509b == bpVar.f87509b && C69664n.m101066l(this.f87510c, bpVar.f87510c) && this.f87511d == bpVar.f87511d;
    }

    public final int hashCode() {
        int hashCode = ((this.f87508a.hashCode() * 31) + this.f87509b) * 31;
        Duration duration = this.f87510c;
        return ((hashCode + (duration == null ? 0 : duration.hashCode())) * 31) + (this.f87511d ? 1 : 0);
    }

    public final String toString() {
        Object obj = this.f87508a;
        int i = this.f87509b;
        Duration duration = this.f87510c;
        boolean z = this.f87511d;
        return "CacheEntry(deferredContext=" + obj + ", estimatedSizeBytes=" + i + ", lastFetchTime=" + duration + ", isCachedIndefinitely=" + z + ")";
    }
}
