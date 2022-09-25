package com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69552c;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69639a;
import p5462h.p5473f.p5475b.C69660j;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.b.l */
/* compiled from: PG */
final /* synthetic */ class C125282l implements C71588o, C69660j {

    /* renamed from: a */
    final /* synthetic */ C70862aj f345620a;

    public C125282l(C70862aj ajVar) {
        this.f345620a = ajVar;
    }

    /* renamed from: a */
    public final Object mo20883a(Object obj, C69577g gVar) {
        this.f345620a.mo20123c(obj);
        C69788q qVar = C69788q.f186170a;
        return qVar == C69554a.COROUTINE_SUSPENDED ? qVar : C69788q.f186170a;
    }

    /* renamed from: b */
    public final C69552c mo29011b() {
        return new C69639a(2, this.f345620a, C70862aj.class, "onNext", "onNext(Ljava/lang/Object;)V");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C71588o) || !(obj instanceof C69660j)) {
            return false;
        }
        return C69664n.m101066l(mo29011b(), ((C69660j) obj).mo29011b());
    }

    public final int hashCode() {
        return mo29011b().hashCode();
    }
}
