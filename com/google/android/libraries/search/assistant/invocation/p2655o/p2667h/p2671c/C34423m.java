package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.c.m */
/* compiled from: PG */
final class C34423m {

    /* renamed from: a */
    public final C34421k f91476a;

    /* renamed from: b */
    public final C34417g f91477b;

    public C34423m(C34421k kVar, C34417g gVar) {
        C69664n.m101061g(kVar, "feature");
        C69664n.m101061g(gVar, "context");
        this.f91476a = kVar;
        this.f91477b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34423m)) {
            return false;
        }
        C34423m mVar = (C34423m) obj;
        return C69664n.m101066l(this.f91476a, mVar.f91476a) && C69664n.m101066l(this.f91477b, mVar.f91477b);
    }

    public final int hashCode() {
        return (this.f91476a.hashCode() * 31) + this.f91477b.hashCode();
    }

    public final String toString() {
        C34421k kVar = this.f91476a;
        C34417g gVar = this.f91477b;
        return "ActiveLifecycleContext(feature=" + kVar + ", context=" + gVar + ")";
    }
}
