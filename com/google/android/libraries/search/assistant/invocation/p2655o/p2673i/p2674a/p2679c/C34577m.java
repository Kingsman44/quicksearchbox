package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c;

import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.c.m */
/* compiled from: PG */
public final class C34577m implements C71553dc {

    /* renamed from: a */
    private final C71553dc f91857a;

    public C34577m(C71553dc dcVar) {
        C69664n.m101061g(dcVar, "delegate");
        this.f91857a = dcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34577m) && C69664n.m101066l(this.f91857a, ((C34577m) obj).f91857a);
    }

    public final int hashCode() {
        return this.f91857a.hashCode();
    }

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        return this.f91857a.mo38165mp(oVar, gVar);
    }

    public final String toString() {
        C71553dc dcVar = this.f91857a;
        return "OnDeviceHotwordConsumerFlow(delegate=" + dcVar + ")";
    }
}
