package com.google.apps.tiktok.coroutines.p3632a;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.apps.tiktok.coroutines.flow.CongestionControlOperatorsKt$networkOptimizedWindowing$1$1$1$subFlowCollectionJob$1", mo61344c = "CongestionControlOperators.kt", mo61345d = "invokeSuspend", mo61346e = {136})
/* renamed from: com.google.apps.tiktok.coroutines.a.m */
/* compiled from: PG */
final class C46635m extends C69572j implements C69630p {

    /* renamed from: a */
    int f121859a;

    /* renamed from: b */
    final /* synthetic */ C71587n f121860b;

    /* renamed from: c */
    final /* synthetic */ C71788b f121861c;

    /* renamed from: d */
    final /* synthetic */ C69648ae f121862d;

    /* renamed from: e */
    final /* synthetic */ C69631q f121863e;

    /* renamed from: f */
    final /* synthetic */ C69626l f121864f;

    /* renamed from: g */
    final /* synthetic */ List f121865g;

    /* renamed from: h */
    final /* synthetic */ C71361ao f121866h;

    /* renamed from: i */
    private /* synthetic */ Object f121867i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46635m(C71587n nVar, C71788b bVar, C69648ae aeVar, C69631q qVar, C69626l lVar, List list, C71361ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f121860b = nVar;
        this.f121861c = bVar;
        this.f121862d = aeVar;
        this.f121863e = qVar;
        this.f121864f = lVar;
        this.f121865g = list;
        this.f121866h = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C46635m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f121859a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69582l lVar = ((C71422aw) this.f121867i).mo5702lZ().get(C71643cp.f191083c);
            C69664n.m101058d(lVar);
            C71587n nVar = this.f121860b;
            C46634l lVar2 = new C46634l(this.f121861c, this.f121862d, this.f121863e, this.f121864f, this.f121865g, (C71643cp) lVar, this.f121866h);
            this.f121859a = 1;
            if (nVar.mo38165mp(lVar2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C46635m mVar = new C46635m(this.f121860b, this.f121861c, this.f121862d, this.f121863e, this.f121864f, this.f121865g, this.f121866h, gVar);
        mVar.f121867i = obj;
        return mVar;
    }
}
