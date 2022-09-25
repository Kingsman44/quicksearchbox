package com.google.android.apps.search.googleapp.search.suggest.sources.p10463c;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.sources.pixel.PixelSuggestSource$getSuggestions$1", mo61344c = "PixelSuggestSource.kt", mo61345d = "invokeSuspend", mo61346e = {64})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.c.c */
/* compiled from: PG */
final class C138502c extends C69572j implements C69630p {

    /* renamed from: a */
    int f376730a;

    /* renamed from: b */
    final /* synthetic */ C138506g f376731b;

    /* renamed from: c */
    final /* synthetic */ C138133o f376732c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138502c(C138506g gVar, C138133o oVar, C69577g gVar2) {
        super(2, gVar2);
        this.f376731b = gVar;
        this.f376732c = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138502c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f376730a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138506g gVar = this.f376731b;
            C138133o oVar = this.f376732c;
            this.f376730a = 1;
            obj = gVar.mo114295j(oVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138502c(this.f376731b, this.f376732c, gVar);
    }
}
