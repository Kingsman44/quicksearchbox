package com.google.android.apps.search.googleapp.discover.fullcoverage;

import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134751b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.fullcoverage.FullCoverageFragmentPeer$onDestroy$1", mo61344c = "FullCoverageFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {110})
/* renamed from: com.google.android.apps.search.googleapp.discover.fullcoverage.k */
/* compiled from: PG */
final class C134324k extends C69572j implements C69630p {

    /* renamed from: a */
    int f365868a;

    /* renamed from: b */
    final /* synthetic */ C134325l f365869b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134324k(C134325l lVar, C69577g gVar) {
        super(2, gVar);
        this.f365869b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134324k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365868a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134325l lVar = this.f365869b;
            C135200t tVar = lVar.f365877g;
            C57315dp dpVar = lVar.f365874d.f152330a;
            if (dpVar == null) {
                dpVar = C57315dp.f152986c;
            }
            C69664n.m101060f(dpVar, "openStoryData.token");
            C134751b bVar = new C134751b(dpVar);
            this.f365868a = 1;
            if (tVar.mo112155c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134324k(this.f365869b, gVar);
    }
}
