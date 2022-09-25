package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.p */
/* compiled from: PG */
public final class C34518p implements C71553dc {

    /* renamed from: a */
    private final C34524v f91745a;

    /* renamed from: b */
    private final /* synthetic */ C71553dc f91746b;

    public C34518p(C34524v vVar) {
        C69664n.m101061g(vVar, "delegate");
        this.f91745a = vVar;
        this.f91746b = vVar.f91757d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34518p) && C69664n.m101066l(this.f91745a, ((C34518p) obj).f91745a);
    }

    public final int hashCode() {
        return this.f91745a.hashCode();
    }

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        return this.f91746b.mo38165mp(oVar, gVar);
    }

    public final String toString() {
        C34524v vVar = this.f91745a;
        return "LegacyHotwordConsumerAccountFlow(delegate=" + vVar + ")";
    }
}
