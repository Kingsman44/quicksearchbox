package com.google.android.libraries.search.assistant.p2700k.p2702b;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.k.b.b */
/* compiled from: PG */
public final class C34763b implements C34764c {

    /* renamed from: a */
    public final C69626l f92247a;

    /* renamed from: b */
    private final boolean f92248b = false;

    public C34763b() {
        C34762a aVar = C34762a.f92246a;
        this.f92247a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34763b)) {
            return false;
        }
        C34763b bVar = (C34763b) obj;
        boolean z = bVar.f92248b;
        return C69664n.m101066l(this.f92247a, bVar.f92247a);
    }

    public final int hashCode() {
        return this.f92247a.hashCode();
    }

    public final String toString() {
        C69626l lVar = this.f92247a;
        return "MultiAccountRpcAuthAccountPolicy(withWorkProfile=false, predicate=" + lVar + ")";
    }
}
