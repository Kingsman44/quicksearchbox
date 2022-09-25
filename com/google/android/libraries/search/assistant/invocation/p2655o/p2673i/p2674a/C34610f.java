package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f */
/* compiled from: PG */
public final class C34610f implements C71553dc {

    /* renamed from: a */
    private final C71553dc f91923a;

    public C34610f(C71553dc dcVar) {
        C69664n.m101061g(dcVar, "delegate");
        this.f91923a = dcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34610f) && C69664n.m101066l(this.f91923a, ((C34610f) obj).f91923a);
    }

    public final int hashCode() {
        return this.f91923a.hashCode();
    }

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        return this.f91923a.mo38165mp(oVar, gVar);
    }

    public final String toString() {
        C71553dc dcVar = this.f91923a;
        return "HotwordConfigurationFlow(delegate=" + dcVar + ")";
    }
}
