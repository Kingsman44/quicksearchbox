package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;
import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71808r;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69498ao;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.VisibleActivitiesTracker$onForegroundActivityUpdated$1", mo61344c = "VisibleActivitiesTracker.kt", mo61345d = "invokeSuspend", mo61346e = {133})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.do */
/* compiled from: PG */
final class C121642do extends C69572j implements C69630p {

    /* renamed from: a */
    int f337497a;

    /* renamed from: b */
    final /* synthetic */ C33884b f337498b;

    /* renamed from: c */
    final /* synthetic */ C121647dt f337499c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121642do(C33884b bVar, C121647dt dtVar, C69577g gVar) {
        super(2, gVar);
        this.f337498b = bVar;
        this.f337499c = dtVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121642do) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337497a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C121647dt.f337504a.mo56224b();
            String c = C33914a.m62568c(this.f337498b);
            cVar.mo56379ah(new C59094n(35906));
            cVar.mo56389s("#onForegroundActivityUpdated(%s)", c);
            C121647dt dtVar = this.f337499c;
            C33884b bVar = this.f337498b;
            this.f337497a = 1;
            C71808r rVar = new C71808r(C69555b.m100961b(this), 1);
            rVar.mo63041A();
            C71643cp d = C71594u.m104517d(C71536cm.m104384b(C71471ab.m104286a(C34743k.m63492c(new C121641dn(dtVar.f337511h, dtVar), C69498ao.f185920a)), new C121638dk(bVar, (C69577g) null)), dtVar.f337509f);
            rVar.mo63035f(new C121636di(d));
            d.mo62873s(new C121637dj(rVar));
            if (rVar.mo63043n() == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121642do(this.f337498b, this.f337499c, gVar);
    }
}
