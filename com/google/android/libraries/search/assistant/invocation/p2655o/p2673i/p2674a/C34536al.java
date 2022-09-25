package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.al */
/* compiled from: PG */
final class C34536al implements C34564c {

    /* renamed from: a */
    private final C34646m f91773a;

    public C34536al(C34646m mVar) {
        this.f91773a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34536al) && C69664n.m101066l(this.f91773a, ((C34536al) obj).f91773a);
    }

    public final int hashCode() {
        C34646m mVar = this.f91773a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public final String toString() {
        C34646m mVar = this.f91773a;
        return "On frontend configuration change: " + mVar + ".";
    }
}
