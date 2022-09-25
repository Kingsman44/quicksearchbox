package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.common.p4522b.C58495hd;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.sources.completeserver.CompleteServerClientImpl$fetchSuggestions$1", mo61344c = "CompleteServerClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {78})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.i */
/* compiled from: PG */
final class C138479i extends C69572j implements C69630p {

    /* renamed from: a */
    int f376669a;

    /* renamed from: b */
    final /* synthetic */ C138490t f376670b;

    /* renamed from: c */
    final /* synthetic */ C138133o f376671c;

    /* renamed from: d */
    final /* synthetic */ C58495hd f376672d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138479i(C138490t tVar, C138133o oVar, C58495hd hdVar, C69577g gVar) {
        super(2, gVar);
        this.f376670b = tVar;
        this.f376671c = oVar;
        this.f376672d = hdVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138479i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f376669a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138490t tVar = this.f376670b;
            C138133o oVar = this.f376671c;
            C58495hd hdVar = this.f376672d;
            this.f376669a = 1;
            obj = tVar.mo114292c(oVar, hdVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138479i(this.f376670b, this.f376671c, this.f376672d, gVar);
    }
}
