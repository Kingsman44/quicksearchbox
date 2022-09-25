package com.google.android.libraries.search.assistant.invocation.p2650m;

import com.google.android.libraries.search.assistant.p2485a.C32243d;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.m.e */
/* compiled from: PG */
final class C33956e {

    /* renamed from: a */
    public final Set f90538a;

    /* renamed from: b */
    public final C32243d f90539b;

    public C33956e(C32243d dVar, Set set) {
        C69664n.m101061g(dVar, "subscription");
        C69664n.m101061g(set, "lifecycles");
        this.f90539b = dVar;
        this.f90538a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33956e)) {
            return false;
        }
        C33956e eVar = (C33956e) obj;
        return C69664n.m101066l(this.f90539b, eVar.f90539b) && C69664n.m101066l(this.f90538a, eVar.f90538a);
    }

    public final int hashCode() {
        return (this.f90539b.hashCode() * 31) + this.f90538a.hashCode();
    }

    public final String toString() {
        C32243d dVar = this.f90539b;
        Set set = this.f90538a;
        return "LifecyclesContext(subscription=" + dVar + ", lifecycles=" + set + ")";
    }
}
