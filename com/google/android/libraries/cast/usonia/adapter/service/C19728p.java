package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.gms.tasks.C146021aq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.cast.usonia.adapter.service.DistributedServiceDiscoveryAdapter$addService$1", mo61344c = "DistributedServiceDiscoveryAdapter.kt", mo61345d = "invokeSuspend", mo61346e = {184})
/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.p */
/* compiled from: PG */
final class C19728p extends C69572j implements C69630p {

    /* renamed from: a */
    int f54775a;

    /* renamed from: b */
    final /* synthetic */ C19710ab f54776b;

    /* renamed from: c */
    final /* synthetic */ C71587n f54777c;

    /* renamed from: d */
    private /* synthetic */ Object f54778d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19728p(C19710ab abVar, C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f54776b = abVar;
        this.f54777c = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C19728p) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f54775a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f54778d;
            C59052c cVar = (C59052c) C19710ab.f54740a.mo56224b();
            cVar.mo56379ah(new C59094n(47920));
            cVar.mo56386p("addService() stream started");
            if (!this.f54776b.f54742c.mo122490i()) {
                C146021aq.m237852f(this.f54776b.f54742c);
            }
            C71587n b = C71486aq.m104308b(C71477ah.m104295b(this.f54777c, new C19725m(aoVar, (C69577g) null)), new C19726n((C69577g) null));
            C19727o oVar = new C19727o(this.f54776b);
            this.f54775a = 1;
            if (b.mo38165mp(oVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C19728p pVar = new C19728p(this.f54776b, this.f54777c, gVar);
        pVar.f54778d = obj;
        return pVar;
    }
}
