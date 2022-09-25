package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import com.google.android.libraries.search.assistant.p2828y.p2862s.C37148d;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.topcontactparams.impl.TopContactParamsGellerFetcherImpl$getTopContacts$1", mo61344c = "TopContactParamsGellerFetcherImpl.kt", mo61345d = "invokeSuspend", mo61346e = {37})
/* renamed from: com.google.android.libraries.search.assistant.y.s.a.m */
/* compiled from: PG */
final class C37132m extends C69572j implements C69630p {

    /* renamed from: a */
    int f96722a;

    /* renamed from: b */
    final /* synthetic */ C37134o f96723b;

    /* renamed from: c */
    final /* synthetic */ C37148d f96724c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37132m(C37134o oVar, C37148d dVar, C69577g gVar) {
        super(2, gVar);
        this.f96723b = oVar;
        this.f96724c = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37132m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f96722a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C37134o oVar = this.f96723b;
            C37148d dVar = this.f96724c;
            this.f96722a = 1;
            obj = oVar.mo40649b(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C37132m(this.f96723b, this.f96724c, gVar);
    }
}
