package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.t */
/* compiled from: PG */
public final class C34486t implements C71553dc {

    /* renamed from: a */
    private final C34489w f91644a;

    /* renamed from: b */
    private final /* synthetic */ C71553dc f91645b;

    public C34486t(C34489w wVar) {
        C69664n.m101061g(wVar, "delegate");
        this.f91644a = wVar;
        this.f91645b = wVar.f91656a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34486t) && C69664n.m101066l(this.f91644a, ((C34486t) obj).f91644a);
    }

    public final int hashCode() {
        return this.f91644a.hashCode();
    }

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        return this.f91645b.mo38165mp(oVar, gVar);
    }

    public final String toString() {
        C34489w wVar = this.f91644a;
        return "LegacyExternalHotwordConsumerConfigurationFlow(delegate=" + wVar + ")";
    }
}
