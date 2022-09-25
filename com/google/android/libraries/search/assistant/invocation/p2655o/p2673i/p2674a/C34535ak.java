package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.ak */
/* compiled from: PG */
final class C34535ak implements C34564c {

    /* renamed from: a */
    private final Throwable f91772a;

    public C34535ak(Throwable th) {
        C69664n.m101061g(th, "cause");
        this.f91772a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34535ak) && C69664n.m101066l(this.f91772a, ((C34535ak) obj).f91772a);
    }

    public final int hashCode() {
        return this.f91772a.hashCode();
    }

    public final String toString() {
        Throwable th = this.f91772a;
        return "On failure shutdown: " + th + "; will attempt to restart.";
    }
}
