package com.google.android.apps.search.googleapp.p10257g.p10258a;

import com.google.apps.tiktok.dataservice.C46688af;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.doodle.dataservice.DoodleDataSource$loadData$result$1", mo61344c = "DoodleDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {42})
/* renamed from: com.google.android.apps.search.googleapp.g.a.q */
/* compiled from: PG */
final class C135400q extends C69572j implements C69630p {

    /* renamed from: a */
    int f368893a;

    /* renamed from: b */
    final /* synthetic */ C135401r f368894b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135400q(C135401r rVar, C69577g gVar) {
        super(2, gVar);
        this.f368894b = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135400q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368893a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135388e eVar = this.f368894b.f368896b;
            this.f368893a = 1;
            obj = eVar.mo112305b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C135384a aVar2 = (C135384a) obj;
        C46688af b = aVar2 != null ? C46688af.m83205b(aVar2.f368861a, aVar2.f368862b) : null;
        return b == null ? C46688af.f121976a : b;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135400q(this.f368894b, gVar);
    }
}
