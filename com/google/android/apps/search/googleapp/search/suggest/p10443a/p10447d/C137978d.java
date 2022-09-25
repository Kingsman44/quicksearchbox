package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.dataservice.twiddlers.SuggestionsTwiddlersRunner$twiddleSuggestionsPreSuppressionFromJava$1", mo61344c = "SuggestionsTwiddlersRunner.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.d.d */
/* compiled from: PG */
public final class C137978d extends C69572j implements C69630p {

    /* renamed from: a */
    int f375387a;

    /* renamed from: b */
    final /* synthetic */ C137979e f375388b;

    /* renamed from: c */
    final /* synthetic */ C138133o f375389c;

    /* renamed from: d */
    final /* synthetic */ List f375390d;

    /* renamed from: e */
    final /* synthetic */ C138134p f375391e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137978d(C137979e eVar, C138133o oVar, List list, C138134p pVar, C69577g gVar) {
        super(2, gVar);
        this.f375388b = eVar;
        this.f375389c = oVar;
        this.f375390d = list;
        this.f375391e = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137978d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375387a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137979e eVar = this.f375388b;
            C138133o oVar = this.f375389c;
            List list = this.f375390d;
            C138134p pVar = this.f375391e;
            this.f375387a = 1;
            obj = eVar.mo114068a(oVar, list, pVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137978d(this.f375388b, this.f375389c, this.f375390d, this.f375391e, gVar);
    }
}
